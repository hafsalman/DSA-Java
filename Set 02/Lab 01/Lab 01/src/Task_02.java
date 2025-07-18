//Hafsa Salman
//DSA Lab 01: Task no. 02

import java.util.Scanner;

public class Task_02
{
    public static void main(String[] args)
    {
        System.out.println("Name: Hafsa Salman");
        System.out.println("DSA Lab 01: Task no. 02");
        System.out.println();

        Scanner s = new Scanner(System.in);

        System.out.print("Enter number of steps (between 1 and 5): ");
        int steps = s.nextInt();

        int [] arr = {1, 2, 3, 4, 5};

        System.out.println("Printing Original Array: ");
        print(arr);

        rotation(steps, arr);

        System.out.println("\n\nPrinting Rotated Array: ");
        print(arr);
    }

    public static void rotation (int steps, int [] arr)
    {
        int n = arr.length, count = 1;

        while (count <= steps)
        {
            int last = arr[n-1];

            for (int i=n-1; i>0; i--)
            {
                arr[i] = arr[i-1];
            }

            arr[0] = last;

            count++;
        }
    }

    public static void print (int [] arr)
    {
        for (int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}