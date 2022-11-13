package ineuron.assignments;

/*
By: Binu Thankachan

Assignment number: 4 - String programming

1. WAP to remove duplicates from a String.
2. WAP to print duplicate characters from a String.
3. WAP to check if "2552" is a palindrome or not.
4. WAP to count the number of consonants, vowels and special characters in a String.
5. WAP to implement Anagram checking using the least inbuilt methods.
6. WAP to implement Pangram checking using the least inbuilt methods.
7. WAP to find if a String contains all unique characters.
8. WAP to find the maximum occurring character in a String.

*/

import java.util.Arrays;
import java.util.Scanner;

public class Assignment4 {

    public static void main(String[] args) {

        Assignment4 assignment4 = new Assignment4();

        assignment4.task1();

        assignment4.task2();

        assignment4.task3();

        assignment4.task4();

        assignment4.task5();

        assignment4.task6();

        assignment4.task7();

        assignment4.task8();

    }


    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public void task1() {
        //
        // 1. WAP to remove duplicates from a String.
        //
        System.out.println("Task #1:");
        System.out.println();
        System.out.println("************************************************************************************");
        System.out.println("*******************   WAP to remove duplicates from a String.    *******************");
        System.out.println("************************************************************************************");

        System.out.println("Enter a string");
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        char[] input_to_chararray = input.toCharArray();

        char[] chars_used = new char[input.length()];
        String string_with_dupes_removed = "";

        //System.out.println("input_to_chararray=" + input_to_chararray + "   length=" + input_to_chararray.length);
        //System.out.println("chars_used=" + chars_used + "    length=" + chars_used.length);

        int next_slot = 0;
        boolean isDupe = false;

        for (int i=0; i < input_to_chararray.length; i++) {

            // scan the chars_used array to see if the current character is already present there and if yes don't include it in the output String
            for (int j=0; j < chars_used.length; j++) {
                //System.out.println("Hello in the inner for loop with next_slot=" + next_slot);
                //System.out.println("i=" + i + "  j=" + j + "    next_slot=" + next_slot + "   input_to_chararray[i]=" + input_to_chararray[i] + "   chars_used[j]=" + chars_used[j]);
                if (input_to_chararray[i] == chars_used[j]) {
                    isDupe = true;
                    break;
                }
            }
            if (!isDupe) {
                string_with_dupes_removed+= ""+input_to_chararray[i];
            }
            chars_used[next_slot++] = input_to_chararray[i];
            isDupe = false;


        }


        System.out.println("The string with duplicate characters removed is: " + string_with_dupes_removed);
        System.out.println();
        System.out.println();
        System.out.println();


    }


    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public void task2() {
        //
        // 2. WAP to print duplicate characters from a String.
        //
        System.out.println("Task #2:");
        System.out.println();
        System.out.println("*********************************************************************************************");
        System.out.println("*******************   WAP to print duplicate characters from a String.    *******************");
        System.out.println("*********************************************************************************************");

        System.out.println("Enter a string");
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        char[] input_to_chararray = input.toCharArray();
        Arrays.sort(input_to_chararray);


        char current_char = input_to_chararray[0];
        char last_printed_char = ' ';


        if (input_to_chararray.length > 1) {
            System.out.println("Duplicate characters in the string are: ");
            for (int i=1; i < input_to_chararray.length; i++) {

                if (input_to_chararray[i] == current_char && input_to_chararray[i] != last_printed_char ){
                    System.out.println(input_to_chararray[i]);
                    last_printed_char = input_to_chararray[i];
                }
                current_char = input_to_chararray[i];
            }
        } else {
            System.out.println("No duplicate characters in the string since the string length is 1.");
        }


        System.out.println();
        System.out.println();
        System.out.println();

    }


    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public void task3() {
        //
        // 3. WAP to check if "2552" is a palindrome or not.
        //
        System.out.println("Task #3:");
        System.out.println();
        System.out.println("*********************************************************************************************");
        System.out.println("*******************   WAP to check if \"2552\" is a palindrome or not.    *******************");
        System.out.println("*********************************************************************************************");

        System.out.println("Enter a string");
        Scanner sc = new Scanner(System.in);

        String input = sc.next();
        char[] input_to_chararray = input.toCharArray();
        boolean isPalindrome = true;
        int j = input_to_chararray.length;

        for(int i=0; i < input_to_chararray.length; i++) {
            j--;
            System.out.println("i=" + i + "    j=" + j + "     Comparing input_to_chararray[i]=" + input_to_chararray[i] + "     to input_to_chararray[j]=" + input_to_chararray[j]);
            if (input_to_chararray[i] != input_to_chararray[j]) {
                isPalindrome = false;
                break;
            }

        }

        System.out.println("The string " + input +  ((isPalindrome) ? " is a "  : " is NOT a ") + "Palindrome");

        System.out.println();
        System.out.println();
        System.out.println();
    }


    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public void task4() {
        //
        // 4. WAP to count the number of constants, vowels and special characters in a String.
        //
        System.out.println("Task #4:");
        System.out.println();
        System.out.println("******************************************************************************************************************************");
        System.out.println("*******************   WAP to count the number of consonants, vowels and special characters in a String.    *******************");
        System.out.println("******************************************************************************************************************************");

        System.out.println("Enter a string");
        Scanner sc = new Scanner(System.in);

        String input_cased = sc.nextLine();
        String input = input_cased.toLowerCase();
        char[] input_to_char_array = input.toCharArray();

        char[] consonants = {'b','c','d','f','g','h','j','k','l','m','n','p','q','r','s','t','v','w','x','y','z'};
        char[] vowels = {'a','e','i','o','u'};
        char[] digits = {'0','1','2','3','4','5','6','7','8','9'};
        int cnt_of_consonants = 0;
        int cnt_of_vowels = 0;
        int cnt_of_digits = 0;
        int cnt_of_special_chars = 0;


        for(int i=0; i < input_to_char_array.length; i++) {
            if (Arrays.binarySearch(consonants, input_to_char_array[i]) >= 0 ) {
                System.out.println("i=" + i + "   input_to_char_array[i]=" + String.valueOf(input_to_char_array[i]) + "  is a consonant");
                cnt_of_consonants++;
            } else if (Arrays.binarySearch(vowels, input_to_char_array[i]) >= 0) {
                System.out.println("i=" + i + "   input_to_char_array[i]=" + String.valueOf(input_to_char_array[i]) + "  is a vowel");
                cnt_of_vowels++;
            } else if (Arrays.binarySearch(digits, input_to_char_array[i]) >= 0) {
                System.out.println("i=" + i + "   input_to_char_array[i]=" + String.valueOf(input_to_char_array[i]) + "  is a digit");
                cnt_of_digits++;
            } else if (input_to_char_array[i] == ' ') {
                System.out.println("i=" + i + "   input_to_char_array[i]=" + String.valueOf(input_to_char_array[i]) + "  is a blank space");
            } else {
                System.out.println("i=" + i + "   input_to_char_array[i]=" + String.valueOf(input_to_char_array[i]) + "  is a special character");
                cnt_of_special_chars++;
            }
        }

        System.out.println("The string '" + input_cased + "' contains   " + cnt_of_consonants + " consonants    " + cnt_of_vowels + " vowels     " + cnt_of_digits + " digits     " + cnt_of_special_chars + " special characters.");

        System.out.println();
        System.out.println();
        System.out.println();
    }


    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public void task5() {
        //
        // 5. WAP to implement Anagram checking using the least inbuilt methods.
        //
        System.out.println("Task #5:");
        System.out.println();
        System.out.println("**************************************************************************************************************");
        System.out.println("*******************   WAP to implement Anagram checking using the least inbuilt methods.    *******************");
        System.out.println("***************************************************************************************************************");

        // An anagram of a string is another string that contains the same characters, only the order of characters can be different.

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string #1: ");
        String input1_cased = sc.next();
        String input1 = input1_cased.toLowerCase();
        char[] input1_to_char_array = input1.toCharArray();
        Arrays.sort(input1_to_char_array);


        System.out.println("Enter string #2: ");
        String input2_cased = sc.next();
        String input2 = input2_cased.toLowerCase();
        char[] input2_to_char_array = input2.toCharArray();
        Arrays.sort(input2_to_char_array);

        boolean isAnagram = true;

        if (input1_to_char_array.length != input2_to_char_array.length) {
            isAnagram = false;
        } else {
            for (int i=0; i < input1_to_char_array.length; i++) {
                if (input1_to_char_array[i] != input2_to_char_array[i]) {
                    isAnagram = false;
                    break;
                }
            }
        }

        System.out.println("String 1 '" + input1_cased + "'   and string 2 '" + input2_cased + "'  " +  ((isAnagram) ? " ARE "  : " ARE NOT ") + "Anagrams.");


        System.out.println();
        System.out.println();
        System.out.println();
    }


    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public void task6() {
        //
        // 6. WAP to implement Pangram checking using the least inbuilt methods.
        //
        System.out.println("Task #6:");
        System.out.println();
        System.out.println("***************************************************************************************************************");
        System.out.println("*******************   WAP to implement Pangram checking using the least inbuilt methods.    *******************");
        System.out.println("***************************************************************************************************************");

        // A pangram is a sentence where every letter of the English alphabet appears at least once.


        System.out.println("Enter a string");
        Scanner sc = new Scanner(System.in);

        String input_cased = sc.nextLine();
        String input = input_cased.toLowerCase();

        char[] input_to_char_array = input.toCharArray();
        char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        boolean[] alphabet_used = new boolean[26];


        for (int i=0; i < input_to_char_array.length; i++) {

            for (int j=0; j < alphabet.length; j++) {
                if(input_to_char_array[i] == alphabet[j]) {
                    alphabet_used[j] = true;
                    break;
                }
            }
        }

        // now check that all alphabet characters were present
        boolean isPangram = true;
        for (int k=0; k < alphabet_used.length; k++) {
            if (!alphabet_used[k]) {
                isPangram = false;
                break;
            }
        }

        System.out.println("String  '" + input_cased + "'    " +  ((isPangram) ? " IS "  : " IS NOT ") + " a Pangram.");


        System.out.println();
        System.out.println();
        System.out.println();
    }


    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public void task7() {
        //
        // 7. WAP to find if a String contains all unique characters.
        //
        System.out.println("Task #7:");
        System.out.println();
        System.out.println("****************************************************************************************************");
        System.out.println("*******************   WAP to find if a String contains all unique characters.    *******************");
        System.out.println("****************************************************************************************************");

        System.out.println("Enter a string");
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        char[] input_to_char_array = input.toCharArray();

        Arrays.sort(input_to_char_array);

        boolean hasAllUniqueCharacters = true;
        if (input_to_char_array.length == 1) {
            hasAllUniqueCharacters = true;
        } else {
            for (int i=0; i < input_to_char_array.length - 1; i++) {
                if (input_to_char_array[i] == input_to_char_array[i+1] && input_to_char_array[i] != ' ') {
                    hasAllUniqueCharacters = false;
                    break;
                }
            }
        }

        System.out.println("String     '" + input + "'    " +  ((hasAllUniqueCharacters) ? " HAS "  : " DOES NOT HAVE ") + " all unique characters.");

        System.out.println();
        System.out.println();
        System.out.println();
    }


    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public void task8() {
        //
        // 8. WAP to find the maximum occurring character in a String.
        //
        System.out.println("Task #8:");
        System.out.println();
        System.out.println("*****************************************************************************************************");
        System.out.println("*******************   WAP to find the maximum occurring character in a String.    *******************");
        System.out.println("*****************************************************************************************************");

        System.out.println("Enter a string");
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        char[] input_to_char_array = input.toCharArray();
        char[] character_list = new char[input_to_char_array.length];
        int character_list_cnt = 0;
        int[] character_occurrences = new int[input_to_char_array.length];

        Arrays.sort(input_to_char_array);

        for (int i=0; i < input_to_char_array.length; i++) {
            // search for current character in character_list
            boolean char_found = false;
            for (int j=0; j < character_list_cnt; j++) {
                if (input_to_char_array[i] == character_list[j]) {
                    character_occurrences[j]++;
                    char_found = true;
                }
            }
            if (!char_found && input_to_char_array[i] != ' ') {

                character_list[character_list_cnt] = input_to_char_array[i];
                character_occurrences[character_list_cnt]++;
                character_list_cnt++;
            }
        }

        // now find the max occurrences for a character (there can be more than one)
        int max_occurrences = 0;
        for (int k=0; k < character_list_cnt; k++) {
            if (character_occurrences[k] > max_occurrences) {
                max_occurrences = character_occurrences[k];
            }
        }
        // now print out the maximum occurring characters
        System.out.println("The maximum occurring characters that appear  " + max_occurrences + "  times each are:");
        for (int k=0; k < character_list_cnt; k++) {
            if (character_occurrences[k] == max_occurrences) {
                System.out.println(character_list[k]);
            }

       }


        System.out.println();
        System.out.println();
        System.out.println();
    }








}