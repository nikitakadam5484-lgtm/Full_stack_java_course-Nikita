/**
DailyFlash Programs
================================================

DailyFlash Set 1---------------


Program 1:
Write a Program to print all the numbers ranging between 1 to 100 that are divisible by 3 or 5.
Output: 3 5 6 9 10 ... 99 100.

class Demo{
	public static void main(String[]args){

		for(int i = 1; i <= 100; i++){
			if(i % 3 == 0 || i % 5 == 0){
				System.out.print(i + " ");
			}
		}	
	}
}

*/

/**
Program 2:
Write a Program to print all the numbers ranging between 1 to 100 that are divisible by 4 and 7.
Output: 28 56 84

class Demo{
	public static void main(String[]args){

		for(int i = 1; i <= 100; i++){
			if(i % 4 == 0 && i % 7 == 0){
				System.out.print(i + " ");
			}
		}	
	}
}

*/

/**
Program 3:
Write a Program to print Cubes and Squares of all Odd numbers ranges between given input number.
Input: 10
Output:
Cube of 1 : 1 and Square of 1 : 1
Cube of 3 : 27 and Square of 3 : 9
Cube of 5 : 125 and Square of 5 : 25
Cube of 7 : 343 and Square of 7 : 49
Cube of 9 : 729 and Square of 9 : 81

import java.util.Scanner;
class Demo{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter No. :");
		int num = sc.nextInt();

		for(int i = 1; i <= num; i++){
			if(i % 2 != 0){
				int cube = i * i * i;
				int square = i * i;
				System.out.println("Cube of " + i + " : " + cube + " and Square of " + i + " : " + square);
			}
		} 
	}
}

*/

/**
Program 4:
Pattern:

0
11
000
1111
00000

class Demo{
	public static void main(String[]args){

		for(int i = 1; i <= 5; i++){
			for(int j = 1; j <= i; j++){
				if(i % 2 == 0){
					System.out.print(1 + " ");
				}
				else{
					System.out.print(0 + " ");
				}
			}
			System.out.println();
		}
	}
}

*/


/**
Program 5:
Write a Program that accepts an integer from user and prints all of its perfect divisors.
Input: 24
Output: Perfect Divisors of 24 are: 2 3 4 6 8 12


import java.util.Scanner;
class Demo{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter No. :");
		int num = sc.nextInt();

		for(int i = 2; i < num; i++){
			if(num % i == 0){
				System.out.print( i +" ");
			}
		}
	}
}

*/

/**
================================================

DailyFlash Set 2---------------


Program 1:
Write a Program to print series of odd numbers ranging between two numbers entered by user.
Input: Min = 4, Max = 60
Output: 5, 7, 9, ... 59


import java.util.Scanner;
class Demo{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Min No. :");
		int min = sc.nextInt();

		System.out.println("Enter Max No. :");
		int max = sc.nextInt();
		
		if(min < max){
			for(int i = min; i <= max; i++){
				if(i % 2 != 0){
					System.out.print(i+","+ " ");
				}
			}
		}
	}
}

*/

/**
Program 2:
Write a Program which accepts two integers and swaps their order.
Input: 20 30

Output:
Before Swap: 20 30
After Swap : 30 20
*/

import java.util.Scanner;
class Demo{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter No.1 :");
		int num1 = sc.nextInt();

		System.out.println("Enter No.2 :");
		int num2 = sc.nextInt();

		System.out.println("Before Swap :" + num1 + " " + num2);
		
		int rev = num1;
		num1 = num2;
		num2 = rev;

		System.out.println("After Swap :" + num1 + " " + num2);		
	}
}


/**
Program 3:
Write a Program to print Cubes & Squares of all Even numbers ranging between given input number.
Input: 10
Output:
Cube of 2 : 8 and Square of 2 : 4
Cube of 4 : 64 and Square of 4 : 16
Cube of 6 : 216 and Square of 6 : 36
Cube of 8 : 512 and Square of 8 : 64
Cube of 10 : 1000 and Square of 10 : 100


import java.util.Scanner;
class Demo{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter No. :");
		int num = sc.nextInt();

		for(int i = 1; i <= num; i++){
			if(i % 2 == 0){
				int cube = i * i * i;
				int square = i * i;
				System.out.println("Cube of " + i + " : " + cube + " and Square of " + i + " : " + square);
			}
		} 
	}
}

*/

/**
Program 4:
Pattern:

a
AA
aaa
AAAA
aaaaa


class Demo{
	public static void main(String[]args){

		for(int i = 1; i <= 5; i++){
			for(int j = 1; j <= i; j++){
				if(i % 2 == 0){
					System.out.print('A' + " ");
				}
				else{
					System.out.print('a' + " ");
				}
			}
			System.out.println();
		}
	}
}

*/

/**
Program 5:
Write a Program that accepts two integers & prints maximum.
Input: 56 99
Output: Maximum = 99


import java.util.Scanner;
class Demo{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter No.1 :");
		int num1 = sc.nextInt();

		System.out.println("Enter No.2 :");
		int num2 = sc.nextInt();

		if(num1 > num2){
			System.out.println("Maximum = " +num1);
		} 
		else if(num1 < num2){
			System.out.println("Maximum = " +num2);
		}
		else{
			System.out.println("Both are same");
		}
	}
}

*/

/**
================================================


DailyFlash Set 3---------------

Program 1:
Write a Program to print series of Even numbers between two inputs.
Input: Min = 4, Max = 60
Output: 4, 6, 8, ... 60


import java.util.Scanner;
class Demo{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Min No. :");
		int min = sc.nextInt();

		System.out.println("Enter Max No. :");
		int max = sc.nextInt();
		
		if(min < max){
			for(int i = min; i <= max; i++){
				if(i % 2 == 0){
					System.out.print(i+"," + " ");
				}
			}
		}
	}
}

*/

/**
Program 2:
Program to print minimum of two numbers.
Input: 56 99
Output: Minimum = 56

import java.util.Scanner;
class Demo{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter No.1 :");
		int num1 = sc.nextInt();

		System.out.println("Enter No.2 :");
		int num2 = sc.nextInt();

		if(num1 < num2){
			System.out.println("Minimum = " +num1);
		} 
		else if(num1 > num2){
			System.out.println("Minimum = " +num2);
		}
		else{
			System.out.println("Both are same");
		}

	}
}

*/


/**
Program 3:
Write a Program to calculate Velocity = Distance / Time.
Input: Distance = 100m, Time = 20 sec
Output: Velocity = 5 m/s


import java.util.Scanner;
class Demo{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Distance :");
		double distance = sc.nextDouble();

		System.out.println("Enter Time :");
		double time = sc.nextDouble();

		double velocity = 0;
		velocity = distance / time;
		System.out.println("Velocity = "+ velocity + " m/s");
	}
}

*/

/**
Program 4:
Pattern:

1
4 9
16 25 36
49 64 81 100


class Demo{
	public static void main(String[]args){

		int count = 1;
		int sq = 0;
		for(int i = 1; i <= 4; i++){
			for(int j = 1; j <= i; j++){
				sq = count * count;
				System.out.print(sq +" ");
				count ++;
			}
			System.out.println();
		}
	}
}


*/

/**
Program 5:
Write a Program to accept three integers & print maximum.
Input: 56 7 99
Output: Maximum = 99

import java.util.Scanner;
class Demo{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter No.1 :");
		int num1 = sc.nextInt();

		System.out.println("Enter No.2 :");
		int num2 = sc.nextInt();

		System.out.println("Enter No.3 :");
		int num3 = sc.nextInt();

		int max = num1;
		if(num2 > max){
			max = num2;
		} 
		if(num3 > max){
			max = num3;
		}
		System.out.println("Maximum = " + max);
	}
}

*/


/**
================================================


DailyFlash Set 4---------------


Program 1:
Check Perfect Number.
Input: 6
Output: 6 is a Perfect number.


import java.util.Scanner;
class Demo{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter No. :");
		int num = sc.nextInt();

		int sum = 0;
		for(int i = 1; i < num; i++){
			if(num % i == 0){
				sum = sum + i;
			}
		}
		if(num == sum){
			System.out.println(num +" is a Perfect number.");
		}
		else{
			System.out.println(num +" is not a Perfect number.");
		}
	}
}

					OR 

import java.util.Scanner;
class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int num = sc.nextInt();

        int i = 1, 
	int sum = 0;

        while (i < num) {
            if (num % i == 0) {
                sum += i;
            }
            i++;
        }

        if (sum == num) {
            System.out.println(num + " is a Perfect number.");
        } 
	else {
            System.out.println(num + " is not a Perfect number.");
        }
    }
}


*/


/**
Program 2:
Print factorial of all numbers between two inputs.
Input: 1 to 5
Output:
1! = 1
2! = 2
3! = 6
4! = 24
5! = 120


import java.util.Scanner;
class Demo{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter No.1 :");
		int num1 = sc.nextInt();

		System.out.println("Enter No.2 :");
		int num2 = sc.nextInt();
		
		int fact = 1;
		for(int i = num1; i <= num2; i++){
			fact = fact * i;
			System.out.println(i +"! = " + fact);
		}	
	}
}


					OR		
				
import java.util.Scanner;
class Demo{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter No.1 :");
		int num1 = sc.nextInt();

		System.out.println("Enter No.2 :");
		int num2 = sc.nextInt();
		
		int fact = 1;
		int i = 1;
		while(i <= num2){
			fact = fact * i;
			System.out.println(i +"! = " + fact);	
			i ++;
		}	
	}
}

*/


/**
Program 3:
Implement Ohm’s Law. V = I * R
Input: I = 10 amp, R = 5
Output: Voltage = 50

import java.util.Scanner;
class Demo{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Current (I) :");
		double current = sc.nextDouble();

		System.out.println("Enter Resistance (R) :");
		double resistance = sc.nextDouble();

		double voltage = 0;	
		voltage = current * resistance;
		System.out.println("Voltage = "+ voltage + " Volts");
	}
}

*/


/**
Program 4:
Pattern:

1
8 27
64 125 216
343 512 729 1000


class Demo{
	public static void main(String[]args){

		int count = 1;
		int cube = 0;
		for(int i = 1; i <= 4; i++){
			for(int j = 1; j <= i; j++){
				cube = count * count * count;
				System.out.print(cube +" ");
				count ++;
			}
			System.out.println();
		}
	}
}

*/


/**
Program 5:
Print minimum of three numbers.
Input: 56 7 99
Output: Minimum = 7

import java.util.Scanner;
class Demo{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter No.1 :");
		int num1 = sc.nextInt();

		System.out.println("Enter No.2 :");
		int num2 = sc.nextInt();

		System.out.println("Enter No.3 :");
		int num3 = sc.nextInt();

		int min = num1;
		if(num2 < min){
			min = num2;
		} 
		if(num3 < min){
			min = num3;
		}
		System.out.println("Minimum = " + min);
	}
}

*/




