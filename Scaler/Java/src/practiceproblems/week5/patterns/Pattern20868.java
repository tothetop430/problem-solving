package practiceproblems.week5.patterns;

import java.util.Scanner;

public class Pattern20868 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n-i+1; j++) {
                System.out.print("*");
            }
            for(int j=0; j<(i-1)*2; j++) {
                System.out.print(" ");
            }
            for(int j=1; j<=n-i+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
