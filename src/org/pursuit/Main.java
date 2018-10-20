package org.pursuit;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println(elide("yhi this"));
        //subStrAfterChars("hi, this is a test", 'i');

//        System.out.println(XO("xooX"));
        //System.out.println(reverseString("hi"));
        //System.out.println(countTheVowels("longer string with more vowels"));
        //System.out.println(stringToIntConverter("ji"));
        //endsly("ably");
        // System.out.println(countCode("codexxcode"));

//        Scanner myScanner = new Scanner(System.in);
//        System.out.println("Enter a food: ");
//        String HipposFood;
//
//        while (true) {
//            HipposFood = myScanner.nextLine();
//
//            if (HipposFood.charAt(0) == 'h' || HipposFood.charAt(0) == 'H') {
//                System.out.println("Yum!");
//                break;
//            } else {
//                System.out.println("Yuck!");
//                System.out.println("Enter a food:");
//            }
//        }

        //System.out.println(endsly("ably"));
    }

    //        public static boolean XO (String xoWord){
//            String arrayA = "";
//            String arrayB = "";
//            boolean equal = true;
//            for (int i = xoWord.length() - 1; i >= 0; i--) {
//                if (xoWord.charAt(i) == 'x' || xoWord.charAt(i) == 'X') {
//                    arrayA += xoWord.charAt(i);
//                }
//                if (xoWord.charAt(i) == 'o' || xoWord.charAt(i) == 'O') {
//                    arrayB += xoWord.charAt(i);
//                }
//            }
//            if (arrayA.length() == arrayB.length()) {
//                equal = true;
//            } else {
//                equal = false;
//            }
//            return equal;
//        }
//
//    }
//
//    public static Boolean endsly(String lyWord) {
//
//
//        //for (int i = lyWord.length() - 2; i >= 0; i++) {
//
//
//            if (lyWord.charAt(lyWord.length() - 2 ) == 'l' && lyWord.charAt(lyWord.length() - 1 ) == 'y') {
//                return true;
//            }
//
//
//        return false;
//
//    }


    //    ////
//    public static void subStrAfterChars(String word, char charWord) {
//        String newWord = "";
//        for (int i = 0; i < word.length(); i++) {
//            if (word.charAt(i) == charWord) {
//                newWord = word.substring(word.indexOf(charWord)+1);
//            }
//        }
//        System.out.println(newWord);
//    }




//    public static String elide(String elideW) {
//        String newString = "";
//
//        return newString;
//    }
//}
//
//    }
//
//
//    public static int stringToIntConverter(String input) {
//            return Integer.parseInt(input);
//        }
//        //return int value of number passed as string
//
//    public static int countCode(String input) {
//       int count = 0;
//
//       for (int i = 0; i <= input.length()-3; i++) {
//            if (input.indexOf(i) == 'c' && input.indexOf(i+1) == 'o' && input.indexOf(i+2)  == 'e') {
//                count++;
//            }
//        }
//
//        return count;
//    }

    public static String elide(String word) {

        String newString = "";

        for (int i = 0; i < word.length(); i++)
            if (word.length() <= 6) {
                return word;

            } else {
                newString += word.substring(0, 3) + "..." + word.charAt(word.length() -1);

                break;
            }
        return newString;

    }
}










