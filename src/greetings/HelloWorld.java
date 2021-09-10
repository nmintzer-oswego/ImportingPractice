//Lab 1 CS1
package greetings;

public class HelloWorld {
    public static void main(String[] args) {
/*
        for(int k=0;k<5;k++) {
            for (int i = 5; k<i; i--) {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int k=0;k<5;k++){
            for(int i=0; i<=k;i++) {
                System.out.print("*");
            }
            System.out.println();
            }
        */

        for (int k = 0; k < 5; k++) {
            for (int i = 5; k < i; i--) {
                System.out.print(" ");
            }
                for (int y = 0; y <= k; y++) {
                    System.out.print("*");
                }
            System.out.println();
        }

        for(int k=0;k<5;k++){
            for(int i=0; i<=k;i++) {
                System.out.print(" ");
            }
            for(int x = 5; k<x; x--){
                System.out.print("*");
            }
            System.out.println();
        }
//test
        //test22
    }
}
