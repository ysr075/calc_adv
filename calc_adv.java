package com.company;

import java.util.Scanner;

class plus {
    public static void StaticMethod() {
        Scanner input = new Scanner(System.in);
        int num1;
        System.out.print("\nnum1: ");
        num1 = input.nextInt();
        int num2;
        System.out.print("\nnum2: ");
        num2 = input.nextInt();
        int total = num1 + num2;
        System.out.print("\n" + num1 + " + " + num2 + " = " + total + "\n");
    }
}

class minus {
    public static void StaticMethod() {
        Scanner input = new Scanner(System.in);
        int num1;
        System.out.print("\nnum1: ");
        num1 = input.nextInt();
        int num2;
        System.out.print("\nnum2: ");
        num2 = input.nextInt();
        int total = num1 - num2;
        System.out.print("\n" + num1 + " - " + num2 + " = " + total + "\n");
    }
}

class divide {
    public static void StaticMethod() {
        Scanner input = new Scanner(System.in);
        int num1;
        System.out.print("\nnum1: ");
        num1 = input.nextInt();
        int num2;
        System.out.print("\nnum2: ");
        num2 = input.nextInt();
        int total = num1 / num2;
        System.out.print("\n" + num1 + " / " + num2 + " = " + total + "\n");
    }
}

class multiply {
    public static void StaticMethod() {
        Scanner input = new Scanner(System.in);
        int num1;
        System.out.print("\nnum1: ");
        num1 = input.nextInt();
        int num2;
        System.out.print("\nnum2: ");
        num2 = input.nextInt();
        int total = num1 * num2;
        System.out.print("\n" + num1 + " * " + num2 + " = " + total + "\n");
    }
}


public class builds {
    public static void main(String []args) {
        Scanner input = new Scanner(System.in);
        do {
            int choose;
            System.out.print("\n1.plus or 2.minus or 3.divide or 4.multiply: ");
            choose = input.nextInt();
            if (choose == 1) {
                plus.StaticMethod();
            } else if (choose == 2) {
                minus.StaticMethod();
            } else if (choose == 3) {
                divide.StaticMethod();
            } else if (choose == 4) {
                multiply.StaticMethod();
            } else {
                System.exit(1);
            }
        } while(true);
    }
}
