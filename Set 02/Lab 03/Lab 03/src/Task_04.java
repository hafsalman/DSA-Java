//Hafsa Salman
//DSA Lab 03: Task no. 04

public class Task_04
{
    public static void main(String[] args)
    {
        System.out.println("Name: Hafsa Salman");
        System.out.println("DSA Lab 03: Task no. 04");
        System.out.println();

        String [] names = {"Ahmed", "Ali", "Basit", "Karim", "Rizwan", "Sarwar", "Tariq", "Taufiq", "Yasin", "Zulfiqar"};
        String[] targets = {"Aftab", "Rizwan", "Tariq"};

        System.out.println("Printing Array: ");
        print(names);

        System.out.println();

        for (String target : targets)
        {
            System.out.println("Searching for: " + target);

            int lCount = 0;
            int linearIndex = -1;

            for (int i = 0; i < names.length; i++)
            {
                lCount++;
                if (names[i].equals(target))
                {
                    linearIndex = i;
                    break;
                }
            }

            int bCount = 0;
            int low = 0, high = names.length - 1, binaryIndex = -1;

            while (low <= high)
            {
                bCount++;
                int mid = (low + high) / 2;
                int cmp = target.compareTo(names[mid]);

                if (cmp == 0)
                {
                    binaryIndex = mid;

                    break;
                }

                else if (cmp < 0)
                {
                    high = mid - 1;
                }

                else
                {
                    low = mid + 1;
                }
            }


            System.out.println("Linear Search:  " + (linearIndex >= 0 ? "Found at index " + linearIndex : "Not Found") + " | Steps: " + lCount);
            System.out.println("Binary Search:  " + (binaryIndex >= 0 ? "Found at index " + binaryIndex : "Not Found") + " | Steps: " + bCount);
            System.out.println();
        }
    }

    public static void print(String[] arr)
    {
        for (int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}