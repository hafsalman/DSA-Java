//Hafsa Salman
//DSA Lab 03: Task no. 03

public class Task_03
{
    public static void main(String[] args)
    {
        System.out.println("Name: Hafsa Salman");
        System.out.println("DSA Lab 03: Task no. 03");
        System.out.println();

        int [] arr = {2, 5, 1, 9, 19, 10};

        System.out.println("Printing Original Array: ");
        print(arr);

        insertionSort(arr);

        System.out.println("\nPrinting Sorted Array: ");
        print(arr);
    }

    public static void insertionSort (int [] arr)
    {
        for (int i=1; i<arr.length; i++)
        {
            int key = arr[i];
            int j = i-1;

            while (j >= 0 && arr[j] > key)
            {
                arr[j+1] = arr[j];
                j--;
            }

            arr[j+1] = key;
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