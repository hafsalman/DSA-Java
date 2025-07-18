//Hafsa Salman
//DSA Lab 03: Task no. 07

public class Task_07
{
    public static void main(String[] args)
    {
        System.out.println("Name: Hafsa Salman");
        System.out.println("DSA Lab 03: Task no. 07");
        System.out.println();

        int [] arr = {3, 89, 9056, 76, 45, 86, 109, 203, 87, 43, 23, 67};

        System.out.println("Printing Original Array: ");
        print(arr);

        modifiedBubbleSort(arr);

        System.out.println("\n\nPrinting Sorted Array: ");
        print(arr);
    }

    public static void modifiedBubbleSort(int[] arr)
    {
        boolean swapped;

        for (int i=0; i<arr.length - 1; i++)
        {
            swapped = false;

            for (int j=0; j<arr.length-i-1; j++)
            {
                if (arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                    swapped = true;
                }
            }

            if (!swapped)
            {
                break;
            }
        }
    }

    public static void print(int[] arr)
    {
        for (int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}