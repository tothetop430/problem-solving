package practiceproblems.week6.arrays;

import java.util.Scanner;

public class SumOfTheArray {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int sum = 0;
        for(int i=0; i<n; i++) {
            sum += scan.nextInt();
        }
        System.out.println(sum);
    }

}
