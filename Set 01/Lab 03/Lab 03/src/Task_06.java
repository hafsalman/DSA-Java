//Hafsa Salman
//DSA Lab 03: Task no. 06

public class Task_06
{
    public static void main(String[] args)
    {
        System.out.println("Name: Hafsa Salman");
        System.out.println("DSA Lab 03: Task no. 06");
        System.out.println();

        int [] scores = {197, 98, 101, 189, 90, 202};

        System.out.println("Printing Original Scores: ");
        print(scores);

        System.out.println("\n\nSorting through Bubble Sort: ");
        bubbleSort(scores);
        print(scores);

        System.out.println("\n\nSorting through Insertion Sort: ");
        insertionSort(scores);
        print(scores);

        System.out.println("\n\nSorting through Selection Sort: ");
        selectionSort(scores);
        print(scores);
    }

    public static void bubbleSort(int [] scores)
    {
        for (int i=0; i<scores.length-1; i++)
        {
            for (int j=0; j<scores.length-i-1; j++)
            {
                if (scores[j] < scores[j+1])
                {
                    int temp = scores[j];
                    scores[j] = scores[j+1];
                    scores[j+1] = temp;
                }
            }
        }
    }

    public static void insertionSort(int [] scores)
    {
        for (int i=1; i<scores.length; i++)
        {
            int key = scores[i];
            int j = i-1;

            while (j >= 0 && scores[j] < key)
            {
                scores[j+1] = scores[j];
                j--;
            }

            scores[j+1] = key;
        }
    }

    public static void selectionSort(int [] scores)
    {
        for (int i=0; i<scores.length; i++)
        {
            int min = i;

            for (int j=i+1; j<scores.length; j++)
            {
                if (scores[j] > scores[min])
                {
                    min = j;
                }
            }

            int temp = scores[min];
            scores[min] = scores[i];
            scores[i] = temp;
        }
    }

    public static void print (int [] scores)
    {
        for (int i=0; i<scores.length; i++)
        {
            System.out.print(scores[i] + " ");
        }
    }
}