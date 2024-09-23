import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Random random = new Random();


        //Task 1 (1.1 and 1.2)
//        int sizeArr = in.nextInt();
//        float Arr[] = new float[sizeArr];
//        for (int i = 0; i < sizeArr; i++) {
//            Arr[i] = -10 + random.nextFloat() * 20;
//        }
//
//        float Min = Arr[0];
//        for (int i = 1; i < Arr.length; i++) {
//            if (Arr[i] < Min) {
//                Min = Arr[i];
//                continue;
//            } else
//                continue;
//        }
//
//        int i1 = -1, i2 = -1;
//        for (int i = 0; i < Arr.length; i++) {
//            if (Arr[i] > 0) {
//                i1 = i;
//                break;
//            }
//        }
//
//        for (int i = Arr.length - 1; i >= 0; i--) {
//            if (Arr[i] > 0) {
//                i2 = i;
//                break;
//            }
//        }
//
//        float sum = 0;
//        if (i1 != -1 && i2 != -1 && i1 < i2) {
//            for (int i = i1; i < i2; i++)
//                sum += Arr[i];
//            System.out.println("Sum of all elements beetween elements is " + sum);
//        } else {
//            System.out.println("Some thing os gone wrong");
//        }

//        //task 2 (2.1 and 2.2)
//        int mat[][] = new int[5][5];
//        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j < 5; j++) {
//                mat[i][j] = -10 + random.nextInt(21);
//            }
//        }
//
//        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j < 5; j++) {
//                System.out.println(mat[i][j] + "\t");
//            }
//            System.out.println();
//        }
//
//        //sum of all decreased elements in line
//        for (int i = 0; i < 5; i++) {
//            boolean hasNegative = false;
//            int sum = 0;
//            for (int j = 0; j < 5; j++) {
//                if (mat[i][j] < 0)
//                    hasNegative = true;
//                sum += mat[i][j];
//            }
//
//            if (hasNegative)
//                System.out.println("Summary of all decreased elements is " + sum);
//        }
//
//        int minEl = Integer.MAX_VALUE;
//        ArrayList<Integer> minCol = new ArrayList<>();
//
//        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j < 5; j++) {
//                if (mat[i][j] < minEl)
//                    minEl = mat[i][j];
//            }
//        }
//
//        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j < 5; j++) {
//                if (mat[i][j] == minEl)
//                    minCol.add(j);
//                break;
//            }
//        }
//
//        System.out.println("Number of all columns with minimal elements");
//        for (int col : minCol)
//            System.out.println(col + "");
    }
}