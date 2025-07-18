//Hafsa Salman
//DSA Lab 03: Task no. 04

import java.util.Scanner;

public class Task_04
{
    public static void main(String[] args)
    {
        System.out.println("Name: Hafsa Salman");
        System.out.println("DSA Lab 03: Task no. 04");
        System.out.println();

        Scanner s = new Scanner(System.in);

        System.out.print("Enter the number of toys: ");
        int toys = s.nextInt();

        int [] arr = new int[toys];

        System.out.println("Enter prices of the toys: ");
        for (int i = 0; i < toys; i++)
        {
            System.out.print("Price of toy " + (i+1) + ": ");
            arr[i] = s.nextInt();
        }

        sort(toys, arr);

        System.out.print("\nEnter Money you have: ");
        int amount = s.nextInt();

        System.out.println("Total number of toys you can buy: " + buy(toys, arr, amount));
    }

    public static void sort (int toys, int [] arr)
    {
        for (int i=0; i<toys-1; i++)
        {
            for (int j=0; j<toys-i-1; j++)
            {
                if (arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static int buy (int toys, int[] arr, int amount)
    {
        int meow = 0, count = 0;

        for (int i = 0; i<toys; i++)
        {
            if (meow + arr[i] <= amount)
            {
                meow += arr[i];
                count++;
            }

        }

        return count;
    }
}
//Given an array arr[ ] of length N consisting cost of N toys and an integer K the amount with
//you. The task is to find maximum number of toys you can buy with K amount.
//Example 1:
//Input:
//N = 7
//K = 50
//arr[] = {1, 12, 5, 111, 200, 1000, 10}
//Output: 4
//Explanation: The costs of the toys
//you can buy are 1, 12, 5 and 10.
//Example 2:
//Input:
//N = 3
//K = 100
//arr[] = {20, 30, 50}
//Output: 3
//Explanation: You can buy all toys