import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        //task1

//        System.out.println("Input data : ");
//        String str1 = in.nextLine();
//        String[] ArrStr = str1.split(" ");
//        int i = 0;
//        while (i < ArrStr.length) {
//            String temp = ArrStr[i];
//            if (temp.length() == 4) {
//                System.out.println(temp);
//            }
//            i++;
//        }

        //task2

//        String str1 = in.nextLine();
//        StringBuilder result = new StringBuilder();
//        for (char ch : str1.toCharArray()) {
//            if (ch >= 'A' && ch <= 'Z')
//                result.append((char) ('A' + (ch - 'A')));
//            else if (ch >= 'a' && ch <= 'z')
//                result.append((char) ('a' + (ch - 'z')));
//            else
//                result.append(ch);
//        }
//
//        System.out.println("Word on russia : " + result);

        //task 3

//        int words = in.nextInt();
//        in.nextLine();
//        int latWord = 0;
//        System.out.println("Input words : ");
//        for (int i = 0; i < words; i++) {
//            String str1 = in.next();
//            if (str1.matches("[a-zA-Z]+"))
//                latWord++;
//
//        }
//        System.out.println("Count of latin words is : " + latWord);

        //task 4

//        int words = in.nextInt();
//        in.nextLine();
//        int numCount = 0;
//        System.out.println("Input words : ");
//        for (int i = 0; i < words; i++) {
//            String str1 = in.next();
//            if (str1.matches("[0-9]+"))
//                numCount++;
//        }
//
//        System.out.println("Count of words with number : " + numCount);

        //task 5

//        int numCount = in.nextInt();
//        in.nextLine();
//        System.out.println("Input words");
//        for(int i = 0; i < numCount; i++)
//        {
//            String word = in.next();
//            if(word.matches("[0-9]+") && isPalindrome(word))
//                System.out.println("Counter of polindroms : " + word);
//        }

    }

//    private static boolean isPalindrome(String word) {
//        int left = 0, right = word.length() - 1;
//        while (left < right) {
//            if (word.charAt(left) != word.charAt(right)) {       // Проверяем, совпадают ли символы с начала и конца
//                return false;
//            }
//            left++;
//            right--;
//        }
//        return true;
//    }

}