package at.ac.fhcampuswien;

import java.util.Scanner;

public class App {
Scanner scn = new Scanner(System.in);

    //todo Task 1
    public void largestNumber(){
        // input your solution here
        int count = 1;
        double n;
        double max = 0;
        do {
            System.out.print("Number " + count + ": ");
            n = scn.nextFloat();

            if (count == 1 && n <= 0) {
                System.out.println("No number entered.");
                break;
            }if (n > max) {
                max = n;
            }if (n <= 0) {

                System.out.printf("The largest number is " + "%.2f", max);
                System.out.println();
            }
            count++;
        }while (n > 0);
    }

    //todo Task 2
    public void stairs(){
        // input your solution here
        System.out.print("n: ");
        int n = scn.nextInt();
        if (n <= 0){
            System.out.println("Invalid number!");
            }else {
             int num = n;
             int count = 1;
             for(int i = 1; i <= num; i++){
                 for (int j = 0; j < i ; j++){
                     System.out.print(count + " ");
                     count++;
                 }
                 System.out.println();
             }
        }

    }

    //todo Task 3
    public void printPyramid(){
        // input your solution here
        int n = 6;
        for (int i = 1; i <= n; i++){
            for (int j = n - i; j > 0; j-- ){
                System.out.print(" ");
            }for (int k = 1; k <= (i*2)-1; k++){
                System.out.print("*");
            }
            System.out.println();
        }

    }

    //todo Task 4
    public void printRhombus(){
        // input your solution here
       // https://www.java-forum.org/thema/ascii-raute.179451///https://www.tutorialgateway.org/java-program-to-print-diamond-alphabets-pattern/
        System.out.print("h: ");
        int h = scn.nextInt();
        System.out.print("c: ");
        char c = scn.next().charAt(0);

        if(h%2==0) {
            System.out.println("Invalid number!");

        }else{

         for (int i = 1 ; i <= (h+1)/2; i++) {
            for (int j = h/2; j >= i; j--) {
                System.out.print(" ");
            }

            for (int k = i; k > 0; k--) {
                System.out.print((char) (c - k + 1));
            }

            for (int l = 1; l < i; l++) {
                System.out.print((char) (c - l));
            }
            System.out.println();
          }

         for (int i = h/2; i > 0; i--) {

             for (int j = h/2; j >= i; j--) {
                 System.out.print(" ");
             }
             for (int k = i; k > 0; k--) {
                 System.out.print((char) (c - k + 1));
             }
             for (int l = 1; l < i; l++) {
                 System.out.print((char) (c - l));
             }
             System.out.println();
         }

        }
    }





    //todo Task 5
    public void marks(){
        // input your solution here
       // https://www.javatpoint.com/program-to-print-the-average-of-n-numbers
        float marks;
        int count= 1;
        int negative = 0;
        float average,sum=0;
        boolean isInput = true;

        while (isInput) {
            System.out.print("Mark " + count + ": ");
            marks = scn.nextFloat();

           if (marks > 0 && marks <= 5) {
                sum = sum + marks;
                count++;
            }
            if (marks == 5) {
                negative++;
            } else if (marks < 0 || marks > 5) {
                System.out.println("Invalid mark!");
            }
            if (marks == 0) {
                if (count == 1) {
                    average = sum / count;
                } else {
                    average = sum / (count - 1);
                }
                System.out.printf("Average: " + "%.2f", average);
                System.out.println();
                System.out.println("Negative marks: " + negative);
                isInput = false;
            }
        }


    }



    //todo Task 6
    public void happyNumbers() {
            // input your solution here
            //https://www.efaculty.in/java-programs/happy-number-program-in-java/
            int n, r = 1, num, sum = 0;
            Scanner sc = new Scanner(System.in);
            System.out.print("n: ");
            n = sc.nextInt();
            num = n;
            while (num > 9) {
                while (num > 0) {
                    r = num % 10;
                    sum = sum + (r * r);
                    num = num / 10;
                }
                num = sum;
                sum = 0;
            }
            if (num == 1) {
                System.out.println("Happy number!");
            } else {
                System.out.println("Sad number!");
            }

    }


    public static void main(String[] args){
        App exercise2 = new App();

        System.out.println("Task 1: Largest Number");
        exercise2.largestNumber();

        System.out.println("\nTask 2: Stairs");
        exercise2.stairs();

        System.out.println("\nTask 3: Pyramide");
        exercise2.printPyramid();

        System.out.println("\nTask 4: Raute");
        exercise2.printRhombus();

        System.out.println("\nTask 5: Notendurchschnitt");
        exercise2.marks();

        System.out.println("\nTask 6: Fröhliche Zahlen");
        exercise2.happyNumbers();
    }
}