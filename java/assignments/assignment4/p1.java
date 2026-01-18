/**
Programming Practice Questions (35) Patterns,
Single Loop & Digit Extraction With Test Cases &
Output

Section 1: Pattern Problems (1–10)
*/

/**
1. Solid Star Box
Input: N = 4
Output:

****
****
****
****


import java.util.Scanner;
class Demo{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter input : ");
		int n = sc.nextInt();
		for(int i = 1; i <= n; i++){
			for(int j = 1; j <= n; j++){
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}

*/


/**
2. Hollow Star Box
Input: N = 5
Output:
*****
* *
* *
* *
*****


import java.util.Scanner;
class Demo{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter input : ");
		int n = sc.nextInt();
		for(int i = 1; i <= n; i++){
			for(int j = 1; j <= n; j++){
				if(i == 1 || i == 5 || j == 1 || j == 2){
					System.out.print("* ");

	     			}
			}
			System.out.println();
		}
	}
}

*/


/**
3. Right Angled Triangle
Input: N = 5
Output:
*
* *
* * *
* * * *
* * * * *

import java.util.Scanner;
class Demo{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter input : ");
		int n = sc.nextInt();
		for(int i = 1; i <= n; i++){
			for(int j = 1; j <= i; j++){
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}

*/


/**

4. Inverted Right Angled Triangle
Input: N = 4
Output:
* * * *
* * *
* *
*

import java.util.Scanner;
class Demo{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter input : ");
		int n = sc.nextInt();
		for(int i = n; i >= 1; i--){
			for(int j = 1; j <= i; j++){
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}

*/


/**

5. Number Triangle
Input: N = 4
Output:
1
1 2
1 2 3
1 2 3 4


import java.util.Scanner;
class Demo{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter input : ");
		int n = sc.nextInt();
		for(int i = 1; i <= n; i++){
			for(int j = 1; j <= i; j++){
				System.out.print(j);
			}
			System.out.println();
		}
	}
}

*/


/**
6. Row Number Triangle
Input: N = 4
Output:
1
2 2
3 3 3
4 4 4 4


import java.util.Scanner;
class Demo{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter input : ");
		int n = sc.nextInt();
		for(int i = 1; i <= n; i++){
			for(int j = 1; j <= i; j++){
				System.out.print(i);
			}
			System.out.println();
		}
	}
}
*/


/**
7. Character Triangle
Input: N = 4
Output:
A
A B
A B C
A B C D


import java.util.Scanner;
class Demo{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter input : ");
		int n = sc.nextInt();
		char ch = 65;
		for(int i = 1; i <= n; i++){
			for(int j = 1; j <= i; j++){
				System.out.print(ch + " ");
				ch++;
			}
			ch = 65;
			System.out.println();
		}
	}
}
*/


/**
8. Centered Pyramid
Input: N = 4
Output:
*
* *
* * *
* * * *

import java.util.Scanner;
class Demo{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter input : ");
		int n = sc.nextInt();
		for(int i = 1; i <= n; i++){
			for(int j = 1; j <= i; j++){
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
*/


/**
9. Inverted Pyramid
Input: N = 4
Output:
* * * *
* * *
* *
*

import java.util.Scanner;
class Demo{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter input : ");
		int n = sc.nextInt();
		for(int i = n; i >= 1; i--){
			for(int j = 1; j <= i; j++){
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
*/


/**
10. 0-1 Triangle
Input: N = 4
Output:
1
0 1
1 0 1
0 1 0 1

import java.util.Scanner;
class Demo{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter input : ");
		int n = sc.nextInt();
		for(int i = 1; i <= n; i++){
			for(int j = 1; j <= i; j++){
				if((i+j) %2 == 0 ){
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
Section 2: Single For Loop Questions (11–20)

11. Print numbers from 1 to N
Input: N = 5
Output:
1 2 3 4 5

import java.util.Scanner;
class Demo{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter input : ");
		int n = sc.nextInt();
		for(int i = 1; i <= n; i++){
			System.out.print(i + " ");
		}
	}
}
*/


/**
12. Print numbers from N to 1
Input: N = 5
Output:
5 4 3 2 1

import java.util.Scanner;
class Demo{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter input : ");
		int n = sc.nextInt();
		for(int i = n; i >= 1; i--){
			System.out.print(i + " ");
		}
	}
}
*/


/**
13. Print even numbers from 1 to N
Input: N = 10
Output:
2 4 6 8 10

import java.util.Scanner;
class Demo{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter input : ");
		int n = sc.nextInt();
		for(int i = 1; i <= n; i++){
			if(i % 2 == 0){
				System.out.print(i + " ");
			}
		}
	}
}
*/


/**
14. Sum of first N natural numbers
Input: N = 5
Output:
15

import java.util.Scanner;
class Demo{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter input : ");
		int n = sc.nextInt();
		int sum = 0;
		for(int i = 1; i <= n; i++){
			sum = sum + i;
		}
		System.out.print(sum);
	}
}
*/


/**
15. Multiplication table
Input: N = 3
Output:
3 x 1 = 3
3 x 2 = 6
3 x 3 = 9

import java.util.Scanner;
class Demo{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter input : ");
		int n = sc.nextInt();
		for(int i = 1; i <= n; i++){
			System.out.println(n + " x "+ i +" = " + (n * i));
		}	
	}
}
*/


/**
16. Factorial of a number
Input: N = 5
Output:
120

import java.util.Scanner;
class Demo{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter input : ");
		int n = sc.nextInt();
		int fact = 1;
		for(int i = 1; i <= n; i++){
			fact = fact * i;
		}
		System.out.print(fact);
	}
}
*/


/**
17. Print squares from 1 to N
Input: N = 4
Output:
1 4 9 16

import java.util.Scanner;
class Demo{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter input : ");
		int n = sc.nextInt();
		for(int i = 1; i <= n; i++){
			System.out.print((i*i) +" ");
		}	
	}
}
*/


/**
18. Print cubes from 1 to N
Input: N = 3
Output:
1 8 27

import java.util.Scanner;
class Demo{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter input : ");
		int n = sc.nextInt();
		for(int i = 1; i <= n; i++){
			System.out.print((i*i*i) +" ");
		}	
	}
}
*/


/**
19. Count numbers from 1 to N
Input: N = 7
Output:
7

import java.util.Scanner;
class Demo{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter input : ");
		int n = sc.nextInt();
		int count = 0;
		for(int i = 1; i <= n; i++){
			count ++;
		}
		System.out.print(count);
	}
}
*/


/**
20. Numbers divisible by 5
Input: N = 20
Output:
5 10 15 20

import java.util.Scanner;
class Demo{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter input : ");
		int n = sc.nextInt();
		for(int i = 1; i <= n; i++){
			if(i % 5 == 0){
				System.out.print(i + " ");
			}
		}
	}
}
*/



/**
Section 3: Digit Extraction Problems (21–35)

21. Print all digits of a number
Input: N = 1234
Output:
4
3
2
1

import java.util.Scanner;
class Demo{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter input : ");
		int num = sc.nextInt();
		while(num > 0){
			int rem = num % 10;
			System.out.println(rem);
			num = num / 10;
		}
	}
}
*/


/**
22. Count number of digits
Input: N = 98765
Output:
5

import java.util.Scanner;
class Demo{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter input : ");
		int num = sc.nextInt();
		int count = 0;
		while(num > 0){
			int rem = num % 10;
			count ++;
			num = num / 10;
		}
		System.out.println(count);
	}
}
*/


/**
23. Sum of digits
Input: N = 123
Output:
6

import java.util.Scanner;
class Demo{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter input : ");
		int num = sc.nextInt();
		int sum = 0;
		while(num > 0){
			int rem = num % 10;
			sum = sum + rem;
			num = num / 10;
		}
		System.out.println(sum);
	}
}
*/



/**
24. Reverse a number
Input: N = 456
Output:
654

import java.util.Scanner;
class Demo{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter input : ");
		int num = sc.nextInt();
		int rev = 0;
		while(num > 0){
			int rem = num % 10;
			rev = rev * 10 + rem;
			num = num / 10;
		}
		System.out.println(rev);
	}
}
*/



/**
25. Palindrome check
Input: N = 121
Output:
Palindrome

import java.util.Scanner;
class Demo{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter input : ");
		int num = sc.nextInt();
		int rev = 0;
		int n = num;
		while(num > 0){
			int rem = num % 10;
			rev = rev * 10 + rem;
			num = num / 10;
		}
		if(n == rev){
			System.out.println("Palindrome");
		}
		else{
			System.out.println("Not Palindrome");
		}
	}
}
*/


/**
26. Product of digits
Input: N = 234
Output:
24

import java.util.Scanner;
class Demo{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter input : ");
		int num = sc.nextInt();
		int product = 1;
		while(num > 0){
			int rem = num % 10;
			product = product * rem;
			num = num / 10;
		}
		System.out.println(product);
	}
}
*/


/**
27. Largest digit
Input: N = 5893
Output:
9

import java.util.Scanner;
class Demo{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter input : ");
		int num = sc.nextInt();
		int max = 0;
		while(num > 0){
			int rem = num % 10;
			if(rem > max){
				max = rem;
			}
			num = num / 10;
		}
		System.out.println(max);
	}
}
*/


/**
28. Smallest digit
Input: N = 9421
Output:
1

import java.util.Scanner;
class Demo{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter input : ");
		int num = sc.nextInt();
		int min = 0;
		int rem = num % 10;
		min = rem;
		while(num > 0){
			int rem1 = num % 10;
			if(rem1 < min){
				min = rem1;
			}
			num = num / 10;
		}
		System.out.println(min);
	}
}
*/


/**
29. Count even and odd digits
Input: N = 12345
Output:
Even: 2
Odd: 3

import java.util.Scanner;
class Demo{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter input : ");
		int num = sc.nextInt();
		int even = 0;
		int odd = 0;
		while(num > 0){
			int rem = num % 10;
			if(rem % 2 == 0){
				even ++;
			}
			else{
				odd ++;
			}
			num = num / 10;
		}
		System.out.println("Even: "+ even);
		System.out.println("Odd: "+ odd);
	}
}
*/


/**
30. Harshad Number
Input: N = 18
Output:
Harshad Number

import java.util.Scanner;
class Demo{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter input : ");
		int num = sc.nextInt();
		int sum = 0;
		while(num > 0){
			int rem = num % 10;
			sum = sum + rem;
			num = num / 10;
		}
		if(sum % 3 == 0){
			System.out.println("Harshad Number");
		}
		else{
			System.out.println("Not Harshad Number");
		}
	}
}
*/

/**
31. Last digit of number
Input: N = 5789
Output:
9

import java.util.Scanner;
class Demo{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter input : ");
		int num = sc.nextInt();
		System.out.println(num % 10);
	}
}
*/



/**
32. First digit of number
Input: N = 5789
Output:
5

import java.util.Scanner;
class Demo{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter input : ");
		int num = sc.nextInt();
		int rev = 0;
		while(num > 0){
			int rem = num % 10;
			rev = rev * 10 + rem;
			num = num / 10;
		}
		int rev_rem = rev % 10;
		System.out.println(rev_rem); 
	}
}
*/


/**
33. First and Last digit
Input: N = 5789
Output:
First Digit: 5
Last Digit: 9

import java.util.Scanner;
class Demo{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter input : ");
		int num = sc.nextInt();
		int n = num;
		int rev = 0;
		while(num > 0){
			int rem = num % 10;
			rev = rev * 10 + rem;
			num = num / 10;
		}
		int rev_rem = rev % 10;
		System.out.println("First Digit: " + rev_rem);
		System.out.println("Last Digit: " +(n % 10));
	}
}
*/

/**
34. Middle digit (odd digits)
Input: N = 12345
Output:
3

import java.util.Scanner;
class Demo{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter input : ");
		int num = sc.nextInt();
		int count = 0;
		int mid = 0;
		int rev = num;
		while(num > 0){
			int rem = num % 10;
			count ++;
			num = num / 10;
		}
		mid = count / 2;
		while(mid > 0){
			rev = rev / 10;
			mid --;
		}
		int mid_digit = rev % 10;
		System.out.println(mid_digit);
	}
}
*/



/**
35. Two middle digits (even digits)
Input: N = 123456
Output:
34
*/

import java.util.Scanner;
class Demo{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter input : ");
		int num = sc.nextInt();
		int count = 0;
		int mid = 0;
		int rev = num;
		while(num > 0){
			int rem = num % 10;
			count ++;
			num = num / 10;
		}
		mid = count / 2;
		while(mid-1 > 0){
			rev = rev / 10;
			mid --;
		}
		mid = count / 2;
		int mid_dig = 0;
		while(mid-1 > 0){
			int rev_rem = rev % 10;
			mid_dig = mid_dig * 10 + rev_rem;
			rev = rev / 10;
			mid --;
		}
		int rev1 = 0;
		while(mid_dig > 0){
			int rem1 = mid_dig % 10;
			rev1 = rev1 *10 + rem1;
			mid_dig = mid_dig /10;
		}
		System.out.println(rev1);
	}
}



