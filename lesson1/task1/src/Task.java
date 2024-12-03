import java.util.Scanner;

public class Task {

    // string to int (binary to decimal)
    public static int binToDec(String binary) {
        if (binary.isEmpty()) { // base case, if the string is empty, return 0
            return 0;
        }
        // extract first digit and the remaining substring
        int firstnum = Character.getNumericValue(binary.charAt(0));
        String remaining = binary.substring(1);

        // recursive step: calculate the decimal value
        return firstnum * (int) Math.pow(2, binary.length() - 1) + binToDec(remaining);
        //btw i used a friend's help for this bit because i didn't know how to calculate decimal values
        }


        //int to string (decimal to binary)
        public static String decToBin(int decimal) {
            if (decimal == 0) { //base case, if number is 0, return an empty string
                return ""; // empty string to stop the recursion since it's a binary not numerical value
            }

            // recursive: divide number by 2 and calculate the remainder
            return decToBin(decimal / 2) + (decimal % 2);
        }

        public static void main(String[] args) {
        // code testing: I just print out a bunch of string and decimal to see if it converts it to the opposite/ remainder

            // made the test print out the opposite of each other so that it corresponds to the binary to decimal switch

            // test for binary to decimal
            System.out.println("Binary to Decimal:");
            System.out.println(binToDec("1101")); //output is decimal 13
            System.out.println(binToDec("1010")); //output is decimal 10
            System.out.println(binToDec("11111")); //output is decimal 31

            // test for decimal to binary
            System.out.println("");
            System.out.println("Decimal to Binary:");
            System.out.println(decToBin(13)); //output is string 1101
            System.out.println(decToBin(10)); //output is string 1010
            System.out.println(decToBin(31)); //output is string 11111
        }

}