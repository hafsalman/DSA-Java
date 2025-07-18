//Hafsa Salman
//DSA Lab 03: Task no. 05

import java.util.Scanner;

public class Task_05
{
    public static void main(String[] args)
    {
        System.out.println("Name: Hafsa Salman");
        System.out.println("DSA Lab 03: Task no. 05");
        System.out.println();

        Scanner s = new Scanner(System.in);

        System.out.print("Enter total number of containers: ");
        int n = s.nextInt();

        int [] arr = new int[n];

        System.out.println("Enter containers: ");
        for (int i=0; i<n; i++)
        {
            System.out.print("Container " + (i+1) + ": ");
            arr[i] = s.nextInt();
        }

        System.out.println("\nPrinting Original Placement of Containers: ");
        print(n, arr);

        sort(n, arr);

        System.out.println("\nPrinting Sorted Containers: ");
        print(n, arr);
    }

    public static void sort (int n, int [] arr)
    {
        for (int i=0; i<n-1; i++)
        {
            for (int j=0; j<n-i-1; j++)
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

    public static void print(int n, int [] arr)
    {
        for (int i=0; i<n; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}