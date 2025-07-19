//Hafsa Salman
//DSA Lab 02: Task no. 07

public class Task_07
{
    public static void main(String[] args)
    {
        System.out.println("Name: Hafsa Salman");
        System.out.println("DSA Lab 02: Task no. 07");
        System.out.println();

        String [] arr = {"zebra", "apple", "banana", "grape", "date", "cherry"};

        int n = arr.length;

        System.out.println("Printing Original Array: ");
        print(arr, n);

        bubbleSort(arr, n);

        System.out.println("\n\nPrinting Sorted Array: ");
        print(arr, n);
    }

    public static void bubbleSort(String[] arr, int n)
    {
        for (int i=0; i<n; i++)
        {
            for (int j=0; j<n-i-1; j++)
            {
                if (arr[j].compareTo(arr[j+1]) > 0)
                {
                    String temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public  static void print(String[] arr, int n)
    {
        for (int i=0; i<n; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}