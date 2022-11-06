package ineuron.assignments;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

/*
By: Binu Thankachan

Assignment number: 2

1. WAP to find the duplicates present in an array.
2. WAP to sort an array using Quick Sort Algorithm.
3. WAP to sort an array using Bubble Sort Algorithm.
4. WAP to sort an array using Merge Sort Algorithm.
5. WAP to sort an array using Selection Sort Algorithm.
6. WAP to check whether an array is a subset of another array.

 */
public class Assignment2 {

    public static void main(String[] args) {

        Assignment2 assignment2 = new Assignment2();

        assignment2.task1();

        assignment2.task2();

        assignment2.task3();

        assignment2.task4();

        assignment2.task5();

        assignment2.task6();


    }
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public void task1() {
    //
    // 1. WAP to find the duplicates present in an array.
    //
        System.out.println("Task #1:");
        System.out.println();
        System.out.println("************************************************************************************");
        System.out.println("*******************   Find the duplicates present in an array.   *******************");
        System.out.println("************************************************************************************");

        System.out.println();
        Scanner sc = new Scanner(System.in);
        String[] ar = new String[100];
        int count = 0;
        int dupe_count = 0;
        String input;
        do {
            System.out.println("Enter a value or 'QUIT' to quit");
            input = sc.next();
            ar[count] = input;
            count++;
            if (count >= 100) {
                System.out.println("Array is full.  Exiting input entry");
            }
        } while(!input.equals("QUIT") && count < 100);

        // don't include "QUIT" in the count
        count--;

        System.out.println();
        System.out.print("Array: ");
        printArray(ar, count);
        System.out.println();
        System.out.println();
        System.out.println("Finding duplicates...");
        // sort the array in ascending order
        Arrays.sort(ar,0,count);
        System.out.print("============> Duplicates: ");
        String previous_dupe = "";
        if (count > 1) {
            for(int i=1; i < count; i++){
                if (ar[i-1].equals(ar[i]) && !ar[i].equals(previous_dupe)) {
                    System.out.print(ar[i] + " ");
                    previous_dupe = ar[i];
                    dupe_count++;
                }
            }
            if (dupe_count==0) {
                System.out.print("No duplicates found");
            }
        } else {
            System.out.print("No duplicates found");
        }
        printBlankLines(4);

    }
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public void task2(){

    //
    // 2. WAP to sort an array using Quick Sort Algorithm.
    //

        System.out.println("Task #2:");
        System.out.println();
        System.out.println("***********************************************************************************************");
        System.out.println("************************   Sort an array using Quick Sort Algorithm.   ************************");
        System.out.println("***********************************************************************************************");

        System.out.println();
        Scanner sc = new Scanner(System.in);
        String[] ar = new String[100];
        int count = 0;
        String input;
        do {
            System.out.println("Enter a value or 'QUIT' to quit");
            input = sc.next();
            ar[count] = input;
            count++;
            if (count >= 100) {
                System.out.println("Array is full.  Exiting input entry");
            }
        } while(!input.equals("QUIT") && count < 100);

        // don't include "QUIT" in the count
        count--;

        System.out.println();
        System.out.print("Unsorted array: ");
        printArray(ar, count);
        System.out.println();
        quickSort(ar, 0, count-1);
        System.out.print("Quick sorted array: ");
        printArray(ar, count);
        System.out.println();


        printBlankLines(4);
    }
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public void task3(){

    //
    // 3. WAP to sort an array using Bubble Sort Algorithm.
    //

        System.out.println("Task #3:");
        System.out.println();
        System.out.println("**************************************************************************************");
        System.out.println("*******************   Sort an array using Bubble Sort Algorithm.   *******************");
        System.out.println("**************************************************************************************");

        System.out.println();
        Scanner sc = new Scanner(System.in);
        String[] ar = new String[100];
        int count = 0;
        int dupe_count = 0;
        String input;
        do {
            System.out.println("Enter a value or 'QUIT' to quit");
            input = sc.next();
            ar[count] = input;
            count++;
            if (count >= 100) {
                System.out.println("Array is full.  Exiting input entry");
            }
        } while(!input.equals("QUIT") && count < 100);

        // don't include "QUIT" in the count
        count--;

        System.out.println();
        System.out.print("Unsorted array: ");
        printArray(ar, count);
        System.out.println();
        bubbleSort(ar, count);
        System.out.print("Bubble sorted array: ");
        printArray(ar, count);
        System.out.println();

        printBlankLines(4);

    }
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public void task4(){

    //
    // 4. WAP to sort an array using Merge Sort Algorithm.
    //

        System.out.println("Task #4:");
        System.out.println();
        System.out.println("**************************************************************************************");
        System.out.println("*******************   Sort an array using Merge Sort Algorithm.   *******************");
        System.out.println("**************************************************************************************");

        System.out.println();
        Scanner sc = new Scanner(System.in);
        String[] ar = new String[100];
        int count = 0;
        int dupe_count = 0;
        String input;
        do {
            System.out.println("Enter a value or 'QUIT' to quit");
            input = sc.next();
            ar[count] = input;
            count++;
            if (count >= 100) {
                System.out.println("Array is full.  Exiting input entry");
            }
        } while(!input.equals("QUIT") && count < 100);

        // don't include "QUIT" in the count
        count--;

        System.out.println();
        System.out.print("Unsorted array: ");
        printArray(ar, count);
        System.out.println();
        mergeSort(ar, count);
        System.out.print("Merge sorted array: ");
        printArray(ar, count);
        System.out.println();

        printBlankLines(4);

    }
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public void task5(){

    //
    // 5. WAP to sort an array using Selection Sort Algorithm.
    //

        System.out.println("Task #5:");
        System.out.println();
        System.out.println("*****************************************************************************************");
        System.out.println("*******************   Sort an array using Selection Sort Algorithm.   *******************");
        System.out.println("*****************************************************************************************");

        System.out.println();
        Scanner sc = new Scanner(System.in);
        String[] ar = new String[100];
        int count = 0;
        int dupe_count = 0;
        String input;
        do {
            System.out.println("Enter a value or 'QUIT' to quit");
            input = sc.next();
            ar[count] = input;
            count++;
            if (count >= 100) {
                System.out.println("Array is full.  Exiting input entry");
            }
        } while(!input.equals("QUIT") && count < 100);

        // don't include "QUIT" in the count
        count--;

        System.out.println();
        System.out.print("Unsorted array: ");
        printArray(ar, count);
        System.out.println();
        selectionSort(ar, count);
        System.out.print("Selection sorted array: ");
        printArray(ar, count);
        System.out.println();

        printBlankLines(4);

    }
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public void task6() {
    //
    // 6. WAP to check whether an array is a subset of another array.
    //
        System.out.println("Task #6:");
        System.out.println();
        System.out.println("************************************************************************************************");
        System.out.println("*******************   Check whether an array is a subset of another array.   *******************");
        System.out.println("************************************************************************************************");

        System.out.println();
        Scanner sc = new Scanner(System.in);
        String[] ar1 = new String[100];
        String[] ar2 = new String[100];

        int count_ar1 = 0;
        int count_ar2 = 0;

        String input = "";
        do {
            System.out.println("Enter a value for array 1 or 'QUIT' to quit");
            input = sc.next();
            ar1[count_ar1] = input;
            count_ar1++;
            if (count_ar1 >= 100) {
                System.out.println("Array 1 is full.  Exiting input entry");
            }
        } while(!input.equals("QUIT") && count_ar1 < 100);

        // don't include "QUIT" in the count
        count_ar1--;

        // sort the array in ascending order
        Arrays.sort(ar1,0,count_ar1);

        input = "";
        do {
            System.out.println("Enter a value for array 2 or 'QUIT' to quit");
            input = sc.next();
            ar2[count_ar2] = input;
            count_ar2++;
            if (count_ar2 >= 100) {
                System.out.println("Array 2 is full.  Exiting input entry");
            }
        } while(!input.equals("QUIT") && count_ar2 < 100);

        // don't include "QUIT" in the count
        count_ar2--;

        // sort the array in ascending order
        Arrays.sort(ar2,0,count_ar2);

        if (count_ar2 > count_ar1) {
            System.out.println("Array 2 is larger than Array 1 and therefore not a subset of Array 1.");
        } else if(count_ar1 == 0) {
            System.out.println("Array 1 has no elements and therefore Array 2 is not a subset of Array 1.");
        } else if(count_ar2 == 0) {
            System.out.println("Array 2 has no elements and therefore Array 2 is not a subset of Array 1.");
        } else {

            HashMap<String,Integer> ar1_hashmap = new HashMap<>();
            HashMap<String,Integer> ar2_hashmap = new HashMap<>();

            // loop through array 1 and create a hash map holding the occurrences for each of its elements
            for(int i=0; i<count_ar1; i++){
                if (ar1_hashmap.containsKey(ar1[i])) {
                    int cnt = ar1_hashmap.get(ar1[i]);
                    cnt++;
                    ar1_hashmap.put(ar1[i],cnt);
                } else{
                    ar1_hashmap.put(ar1[i],1);
                }
            }

            // loop through array 2 and create a hash map holding the occurrences for each of its elements
            for(int i=0; i<count_ar2; i++){
                if (ar2_hashmap.containsKey(ar2[i])) {
                    int cnt = ar2_hashmap.get(ar2[i]);
                    cnt++;
                    ar2_hashmap.put(ar2[i],cnt);
                } else{
                    ar2_hashmap.put(ar2[i],1);
                }
            }

            // loop through array 2 and see if all of its elements are found in array 1 for the same number of occurrences
            boolean isSubset = true;
            for(int i=0; i < count_ar2; i++) {
                if (ar1_hashmap.containsKey(ar2[i])) {
                    int ar1_elem_cnt = ar1_hashmap.get(ar2[i]);
                    int ar2_elem_cnt = ar2_hashmap.get(ar2[i]);
                    if (ar2_elem_cnt > ar1_elem_cnt) {
                        isSubset = false;
                        break;
                    }
                } else {
                    isSubset = false;
                    break;
                }
            }
            System.out.println();
            System.out.print("Array 1: ");
            printArray(ar1, count_ar1);
            System.out.println();
            System.out.print("Array 2: ");
            printArray(ar2, count_ar2);
            System.out.println();
            System.out.println();
            System.out.println("HashMap of Array 1: " + ar1_hashmap);
            System.out.println("HashMap of Array 2: " + ar2_hashmap);
            System.out.println();
            if (isSubset) {
                System.out.println("============> Array 2 is a subset of Array 1");
            } else {
                System.out.println("============> Array 2 is NOT a subset of Array 1");
            }
            printBlankLines(4);
        }

    }


    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public void printArray(String[] arr, int cnt) {
        for(int i=0; i < cnt; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void printBlankLines(int cnt) {
        for(int i=0; i < cnt; i++) {
            System.out.println();
        }
    }


    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    private static void quickSort(String[] arr, int start, int end) {
        // index for the "left-to-right scan"
        int i = start;
        // index for the "right-to-left scan"
        int j = end;

        // only examine arrays of 2 or more elements.
        if (j - i >= 1) {
        // The pivot point of the sort method is arbitrarily set to the first element int the array.
            String pivot = arr[i];
        // only scan between the two indexes, until they meet.
            while (j > i) {
                // from the left, if the current element is lexicographically less than the (original)
                // first element in the String array, move on. Stop advancing the counter when we reach
                // the right or an element that is lexicographically greater than the pivot String.
                while (arr[i].compareTo(pivot) <= 0 && i < end && j > i){
                    i++;
                }
                // from the right, if the current element is lexicographically greater than the (original)
                // first element in the String array, move on. Stop advancing the counter when we reach
                // the left or an element that is lexicographically less than the pivot String.
                while (arr[j].compareTo(pivot) >= 0 && j > start && j >= i){
                    j--;
                }
                // check the two elements in the center, the last comparison before the scans cross.
                if (j > i)
                    swap(arr, i, j);
            }
            // At this point, the two scans have crossed each other in the center of the array and stop.
            // The left partition and right partition contain the right groups of numbers but are not
            // sorted themselves. The following recursive code sorts the left and right partitions.

            // Swap the pivot point with the last element of the left partition.
            swap(arr, start, j);
            // sort left partition
            quickSort(arr, start, j - 1);
            // sort right partition
            quickSort(arr, j + 1, end);
        }
    }

    //This method provides quickSort the ability to swap two elements.
    private static void swap(String[] arr, int i, int j) {
        String temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public void bubbleSort(String[] arr, int element_cnt) {

        int cnt = element_cnt;

        //System.out.println("cnt=" + cnt);
        for (int i=0; i < cnt - 1; i++) {
            for (int j=0; j <= cnt - 1 - 1; j++) {
                if (arr[j].compareTo(arr[j+1]) > 0) {
                    String temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

    }
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public void mergeSort(String[] arr, int length) {

        if (length < 2) {
            return;
        }
        int mid = length / 2;
        String[] l = new String[mid];
        String[] r = new String[length - mid];

        for (int i = 0; i < mid; i++) {
            l[i] = arr[i];
        }
        for (int i = mid; i < length; i++) {
            r[i - mid] = arr[i];
        }
        mergeSort(l, mid);
        mergeSort(r, length - mid);

        merge(arr, l, r, mid, length - mid);


    }

    public void merge(
            String[] arr, String[] l, String[] r, int left, int right) {

        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (l[i].compareTo(r[j]) <= 0) {
                arr[k++] = l[i++];
            }
            else {
                arr[k++] = r[j++];
            }
        }
        while (i < left) {
            arr[k++] = l[i++];
        }
        while (j < right) {
            arr[k++] = r[j++];
        }
    }
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public void selectionSort(String[] arr, int length) {

        int n = length;

        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n-1; i++)
        {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (arr[j].compareTo(arr[min_idx]) < 0 )
                    min_idx = j;

            // Swap the found minimum element with the first
            // element
            String temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }

    }

}
