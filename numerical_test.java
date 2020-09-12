//Intro Computer Science II

import java.util.Scanner;

public class Answer_2_6 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print(“Enter a number between 0 and 1000: “);
		int number = input.nextInt();
		int process1 = number % 10;
		number /= 10;
		int process2 = number % 10;
		number /= 10;
		int process3 = number % 10;
		number /= 10;
		int sum = process3 + process2 + process1;

		System.out.println(“The sum of the digits is “ + sum);
	}
}


import java.util.Scanner;

public class Answer_2_12 {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        System.out.print("Enter speed and acceleration: ");
        double speed = in.nextDouble();
        double acceleration = in.nextDouble();

        double length = (speed * speed) / (2 * acceleration);
    
        System.out.printf("The minimum runway length for this airplane is %.2f\n", length);
    }

}

import java.util.Scanner;

public class Answer_2_15{
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);

        System.out.print("Enter x1 and y1: ");
        double x1 = in.nextDouble();
        double y1 = in.nextDouble();
        
        System.out.print("Enter x2 and y2: ");
        double x2 = in.nextDouble();
        double y2 = in.nextDouble();

        double process1 = Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2);
        double final = Math.pow(process1, 0.5);

        System.out.printf("The distance between two points is %f", final);

    }
}

import java.util.Scanner;

public class Answer_2_21 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter investment amount: ");
		double amount = input.nextDouble();
		System.out.print("Enter annual interest rate in percentage: ");
		double mir = input.nextDouble();
		mir /= 1200;
		System.out.print("Enter number of years: ");
		int time = input.nextInt();

		double fiv = 
			amount * Math.pow(1 + mir, time * 12);
		
		System.out.println("Accumulated value is $" + fiv);
	}
}
#2
Using the same code, In Python it would loop endlessly whereas in Java programming It can’t happen if you have overflow, since your calculations can be pushed out of range.


#3
Write a program which prints the following converted values:

(int)3.5;
(int)-3.5;
(int)Math.pow(2,50);
(int)-Math.pow(2,100);

Which of the above items is "way off"?  Can you say something
about Java's policy for converting doubles to ints?

Both of the power ones because the highest number it can go is 2^31, since that’s the way binary works. Java’s policy for converting doubles to ints rounds to the integer before the decimal and stops the power after a certain number.

#4
Write a program which divides an integer by (the integer) zero.  Then 
write a program which divides a double or float type by zero.  How do the
outcomes differ?

If you divide a double by 0 the outcome gives you infinity and if you divide an int by zero it crashes.

public class helper {
	public static void main(String[] args){
		//number 3:
		System.out.println((int)(3.5));
		System.out.println((int)(-3.5));
		System.out.println((int)(Math.pow(2,50)));
		System.out.println((int)(Math.pow(2,100)));
		//number 4:
		System.out.println(5.0/0);
		System.out.println(5/0);
	}
}
