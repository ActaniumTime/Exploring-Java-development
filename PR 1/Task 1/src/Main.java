import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sizeOfArray = scanner.nextInt() ;
        int[] arr = new int[sizeOfArray];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
        }
        boolean result = Function1(arr);
        System.out.println("result of operation is : " + result);

        fizzBuzz();
    }

    public static boolean Function1(int[] arr2){
        for (int i = 0; i < arr2.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(arr2[i]);
        }
        System.out.println("]");

        for(int i = 1; i < arr2.length; i++){
            if(arr2[i] < arr2[i-1]){
                return false;
            }
        }
        return true;
    }

    public static void fizzBuzz() {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            }
            else if (i % 3 == 0) {
                System.out.println("Fizz");
            }
            else if (i % 5 == 0) {
                System.out.println("Buzz");
            }
            else {
                System.out.println(i);
            }
        }
    }
}