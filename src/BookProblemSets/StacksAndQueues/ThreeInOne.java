package BookProblemSets.StacksAndQueues;

import DataStructures.Stack;

public class ThreeInOne {

    public static void main(String[] args)
    {

        int[] arr = {1, 2, 3, 4, 5};


        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        Stack<Integer> stack3 = new Stack<>();

        for (int i = 0; i < 3; i++)
        {

            for (int n = 0; n < arr.length; n++)
            {
                if (i == 0)
                {
                    stack1.push(arr[n]);
                }
                else if (i == 1)
                {
                    stack2.push(arr[n]);
                }
                else if (i == 2)
                {
                    stack3.push(arr[n]);
                }
                else {}
            }
        }

        System.out.println("Stack 1:");
        stack1.printStack();
        stack1.pop();
        System.out.println("Stack 1 with pop:");
        stack1.printStack();
        System.out.println("Stack 2:");
        stack2.printStack();
        System.out.println("Stack 3:");
        stack3.printStack();

    }
}
