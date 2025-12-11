/**=== Set 1 ===

1. Write a program that accepts an integer from the user and prints it.
Input Format: A single integer.
Output: The same integer.
Example: Input: 11 → Output: 11

import java.util.Scanner;
class Demo{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter integer :");
		int num = sc.nextInt();
		System.out.println("Integer :"+num); 
	}
}

*/


/**
2. Write a program that accepts an integer from the user and prints the sum of all numbers up to that
number.
Input Format: A single integer n.
Output: Sum from 1 to n.
Example: Input: 10 → Output: 55

import java.util.Scanner;
class Demo{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter No. :");
		int num = sc.nextInt();
		int sum = 0;
		for(int i = 1; i <= num; i++){
			sum = sum + i;
		}
		System.out.println("Sum from 1 to n :"+sum); 
	}
}

*/

/**
3. Write a program that accepts an integer from the user and prints whether it is odd or even.
Example: Input: 2 → Output: 2 is an Even Number.

import java.util.Scanner;
class Demo{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a No. :");
		int num = sc.nextInt();
		if(num % 2 == 0){
			System.out.println(num +" is an even number");
		}
		else{
			System.out.println(num +" is an odd number"); 
		}
	}
}

*/

/**
4. Write a program to accept 10 integers and print the sum and average.
Example Input: 1 2 3 4 5 6 7 8 9 10 → Sum = 55, Avg = 5.5

import java.util.Scanner;
class Demo{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter No. :");
		int num = sc.nextInt();
		int sum = 0;
		float avg = 0f;
		float count = 0f;
		for(int i = 1; i <= num; i++){
			sum = sum + i;
			count ++;
		}
		avg = sum / count;
		System.out.println("Sum from 1 to n :"+sum);
		System.out.println("Avg of 1 to n :"+avg); 
	}
}

*/


/**
5. Print the pattern:
0000
1111
0000
1111

class Demo{
	public static void main(String[]args){
		for(int i = 1; i <= 4; i++){
			for(int j = 1; j<=4; j++){
				if(i % 2 == 0){
					System.out.print("1 ");
				}
				else{
					System.out.print("0 ");
				}
			}
			System.out.println();
		}
	}
}

*/


/**
=== Set 2 ===

1. Print squares of first 10 numbers.
Example:
Square of 1: 1
Square of 2: 4
...

import java.util.Scanner;
class Demo{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter No. :");
		int num = sc.nextInt();
		int square = 0;
		square = num * num;
		System.out.println("Square of n :"+square); 
	}
}

*/

/**
2. Print cubes of first 20 numbers.
Example:
Cube of 1: 1
Cube of 2: 8
...

import java.util.Scanner;
class Demo{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter No. :");
		int num = sc.nextInt();
		int cube = 0;
		cube = num * num * num;
		System.out.println("Cube of n :"+cube); 
	}
}

*/

/**
3. Print table of 2.
Output: 2 4 6 8 10 12 14 16 18 20

class Demo{
	public static void main(String[]args){
		int num = 2;
		int table = 0;
		for(int i = 1; i <= 10; i++){
			table = num * i;
			System.out.print(table +" " );
		}
	}
}

*/

/**
4. Accept a number and print its table.
Example Input: 4 → 4 8 12 16 20 24 28 32 36 40

import java.util.Scanner;
class Demo{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter No. :");
		int num = sc.nextInt();
		int table = 0;
		for(int i = 1; i <= 10; i++){
			table = num * i;
			System.out.print(table +" " );
		}
 
	}
}

*/

/**
5. Pattern:
0
0 0
0 0 0

class Demo{
	public static void main(String[]args){
		for(int i = 1; i <= 3; i++){
			for(int j = 1; j<=i; j++){
				System.out.print("0 ");
			}
			System.out.println();
		}
	}
}

*/

/**
=== Set 3 ===


1. Accept two integers and print their addition and subtraction (subtract using greater number).
Example Input: 10 20 → Addition: 30, Subtraction: 10

import java.util.Scanner;
class Demo{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter No.1 :");
		int num1 = sc.nextInt();
		System.out.println("Enter No.2 :");
		int num2 = sc.nextInt();
		int sum = 0;
		int sub = 0;
		sum = num1 + num2;
		System.out.println("Addition :"+sum);
		if(num1 > num2){
			sub = num1 - num2;
		}
		else{
			sub = num2 - num1;
		}
		System.out.println("Subtraction :"+sub);	
	}
}

*/

/**
2. Accept two integers and print multiplication and division (division uses smaller number as divisor).
Example Input: 10 20 → Multiplication: 200, Division: 2

import java.util.Scanner;
class Demo{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter No.1 :");
		int num1 = sc.nextInt();
		System.out.println("Enter No.2 :");
		int num2 = sc.nextInt();
		int multi = 0;
		int div = 0;
		multi = num1 * num2;
		System.out.println("Multiplication :"+multi);
		if(num1 > num2){
			div = num1 / num2;
		}
		else{
			div = num2 / num1;
		}
		System.out.println("Division :"+div);	
	}
}

*/

/**
3. Accept two integers and print:
- Addition of their cubes- Subtraction of their squares
Example: 10 & 20 → Cubes: 9000, Squares: -300


import java.util.Scanner;
class Demo{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter No.1 :");
		int num1 = sc.nextInt();
		System.out.println("Enter No.2 :");
		int num2 = sc.nextInt();
		int cube = 0;
		cube = num1 * num1 * num1 + num2 * num2 * num2;
		System.out.println("Addition of their cubes :"+cube);
		int square = 0;
		square = num1 * num1 - num2 * num2;
		System.out.println("Subtraction of their squares :"+square); 
	}
}

*/

/**
4. Simple Calculator (accept operator +, -, *, /).


import java.util.Scanner;
class Demo{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter No.1 :");
		double num1 = sc.nextDouble();

		System.out.println("Select(+, -, *, /) :");
		char operator = sc.next().charAt(0);

		System.out.println("Enter No.2 :");
		double num2 = sc.nextDouble();  
		
		System.out.println("Answer :");
		if(operator == '+'){
			System.out.println(num1 + num2);	
		} 
		else if(operator == '-'){
			System.out.println(num1 - num2);
		} 
		else if(operator == '*'){
			System.out.println(num1 * num2);
		} 
		else if(operator == '/'){
			System.out.println(num1 / num2);
		} 
		else{
			System.out.println("invalid operator");
		}                                                                                                      	
	}
}

*/




/**
5. Pattern:
*
* *
* * *
* * * *


class Demo{
	public static void main(String[]args){
		for(int i = 1; i <= 4; i++){
			for(int j = 1; j<=i; j++){
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}

*/

/**
=== Set 4 ===


1. Pattern:

1
22
333
4444

class Demo{
	public static void main(String[]args){
		for(int i = 1; i <= 4; i++){
			for(int j = 1; j<=i; j++){
				System.out.print(i +" ");
			}
			System.out.println();
		}
	}
}

				OR

class Demo{
	public static void main(String[]args){
		int count = 1;
		for(int i = 1; i <= 4; i++){
			for(int j = 1; j<=i; j++){
				System.out.print(count +" ");
			}
			System.out.println();
			count ++;
		}
	}
}

*/


/**
2. Pattern:

1
2 3
4 5 6

class Demo{
	public static void main(String[]args){
		int count = 1;
		for(int i = 1; i <= 3; i++){
			for(int j = 1; j<=i; j++){
				System.out.print(count +" ");
				count ++;
			}
			System.out.println();
		}
	}
}

*/


/**
3. Pattern starting from 7:

7
8 9
10 11 12

class Demo{
	public static void main(String[]args){
		int count = 7;
		for(int i = 1; i <= 3; i++){
			for(int j = 1; j<=i; j++){
				System.out.print(count +" ");
				count ++;
			}
			System.out.println();
		}
	}
}

*/


/**
4. Asterisk pattern:

*
* *
* * *
* * * *

class Demo{
	public static void main(String[]args){
		for(int i = 1; i <= 4; i++){
			for(int j = 1; j<=i; j++){
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}

*/


/**
5. Factorial Program
Example: Input: 5 → 120

import java.util.Scanner;
class Demo{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter No. :");
		int num = sc.nextInt();
		int fact = 1;
		for(int i = 1; i <= num; i++){
			fact = fact * i;
		}
		System.out.println("Factorial of n :"+fact); 
	}
}

*/

