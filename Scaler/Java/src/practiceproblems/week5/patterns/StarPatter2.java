package practiceproblems.week5.patterns;

import java.util.Scanner;

public class StarPatter2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for(int i=1; i<=n; i++) {
            if(i==1 || i==n) {
                for(int j=i; j<=n; j++) {
                    System.out.print("*");
                }
            }
            else {
                System.out.print("*");
                for(int j=1; j<n-i; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
