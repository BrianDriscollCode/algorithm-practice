package BookProblemSets.ArraysAndStrings;

public class RotateMatrix {

    public static void main(String[] args)
    {
        //int[][] matrix = new int[3][3];

        //

        int[][] matrix = {
                {1, 2, 3}, // 7 4 1
                {4, 5, 6}, // 8 5 2
                {7, 8, 9}  // 9 6 3
        };


        printMatrix(rotateMatrix(matrix));
    }

    public static int[][] rotateMatrix(int[][] matrix)
    {
        int n = matrix.length;

        for (int layer = 0; layer < n /2; layer++)
        {
            int first = layer;
            int last = n - 1 - layer;

            for (int i = first; i < last; i++)
            {
                int offset = i - first;
                int top = matrix[first][i];

                // left -> top
                matrix[first][i] = matrix[last-offset][first];

                // bottom -> left
                matrix[last-offset][first] = matrix[last][last - offset];

                // right -> bottom
                matrix[last][last - offset] = matrix[i][last];

                // top -> right
                matrix[i][last] = top;
            }
        }

        return matrix;

    }


    public static void printMatrix(int[][] matrix)
    {
        for (int[] i : matrix)
        {
            System.out.print("[");
            boolean firstPrint = true;

            for (int n : i)
            {
                if (firstPrint)
                {
                    System.out.print(n);
                    firstPrint = false;
                }
                else
                {
                    System.out.print("," + n);
                }

            }
            System.out.println("]");
        }
    }



}
