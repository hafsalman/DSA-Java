//Hafsa Salman
//DSA Lab 01: Task no. 03

import java.util.Scanner;

public class Task_03
{
    public static void main(String[] args)
    {
        System.out.println("Name: Hafsa Salman");
        System.out.println("DSA Lab 01: Task no. 03");
        System.out.println();

        Scanner s = new Scanner(System.in);

        System.out.print("Enter m: ");
        int m = s.nextInt();

        System.out.print("Enter n: ");
        int n = s.nextInt();

        int [][] arr1 = new  int[m][n];
        int [][] arr2 = new  int[m][n];

        System.out.println("Matrix 01: ");
        for (int i=0; i<m; i++)
        {
            for (int j=0; j<n; j++)
            {
                System.out.print("Element " + (i+1) + " x " + (j+1) + ": ");
                arr1[i][j]=s.nextInt();
            }
        }

        System.out.println("Matrix 02: ");
        for (int i=0; i<m; i++)
        {
            for (int j=0; j<n; j++)
            {
                System.out.print("Element " + (i+1) + " x " + (j+1) + ": ");
                arr2[i][j]=s.nextInt();
            }
        }

        int [][] arr3 =  new  int[m][n];

        for (int i=0; i<m; i++)
        {
            for (int j=0; j<n; j++)
            {
                arr3[i][j] = arr1[i][j] + arr2[i][j];
            }
        }

        System.out.println("Printing sum of Matrix 01 and 02: ");
        for (int i=0; i<m; i++)
        {
            for (int j=0; j<n; j++)
            {
                System.out.print(arr3[i][j] + " ");
            }

            System.out.println();
        }
    }
}