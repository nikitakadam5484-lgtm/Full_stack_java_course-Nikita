/**
10 Basic Digit Extraction Java Programs (with Test Cases)


1. Extract digits of a number
Input: 1234
Output: 1 2 3 4
Test Case: 987 -> 9 8 7


import java.util.Scanner;
class Demo{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter No. : ");
		int num = sc.nextInt();

		int rev = 0;

		while(num > 0){
			int rem = num % 10;
			rev = rev * 10 + rem;
			num = num / 10;
		}
	
		while(rev > 0){
			int rev_rem = rev % 10;
			System.out.print(rev_rem +" ");
			rev = rev / 10;
		}
	}
}

*/

/**
2. Count digits of a number
Input: 12345
Output: 5
Test Case: 900 -> 3


import java.util.Scanner;
class Demo{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter No. : ");
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
3. Sum of digits
Input: 1234
Output: 10
Test Case: 505 -> 10

import java.util.Scanner;
class Demo{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter No. : ");
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
4. Product of digits
Input: 234
Output: 24
Test Case: 505 -> 0


import java.util.Scanner;
class Demo{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter No. : ");
		int num = sc.nextInt();
		
		int multi = 1;
		
		while(num > 0){
			int rem = num % 10;
			multi = multi * rem;
			num = num / 10;
		}
		System.out.println(multi);
	}
}

*/

/**
5. Reverse number (no string)
Input: 1234
Output: 4321
Test Case: 900 -> 9


import java.util.Scanner;
class Demo{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter No. : ");
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
6. Check duck number
Input: 1023
Output: Duck Number
Test Case: 123 -> Not Duck


import java.util.Scanner;
class Demo{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter No. : ");
		int num = sc.nextInt();
		
		boolean is_found = false;
		
		while(num > 0){
			int rem = num % 10;
			if(rem == 0){
				is_found = true;
				break;
			}
			num = num / 10;
		}

		if(is_found){
			System.out.println("is Duck");
		}
		else{
			System.out.println("is Not Duck");
		}
	}
}

*/

/**
7. First & Last digit
Input: 5678
Output: First=5, Last=8
Test Case: 9001 -> First=9, Last=1


import java.util.Scanner;
class Demo{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter No. : ");
		int num = sc.nextInt();

		int count = 0;
		int rem = 0;
		int rev = 0;

		rem = num % 10;
		System.out.println("Last : " +rem);

		while(num > 0){
			int rem1 = num % 10;
			count ++;
			rev = rev * 10 + rem1;
			num = num / 10;
		}
		
		if(count == 1){
			System.out.println("First : " +rem);	
		}
		else{
			rev = rev % 10;
			System.out.println("First : " +rev);
		}
	}
}

*/


/**
8. Middle digits
Input: 12345
Output: 234
Test Case: 9876 -> 87


import java.util.Scanner;
class Demo{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter No. : ");
		int num = sc.nextInt();

		int rev = 0;
		int rev_num = 0;

		num = num / 10;
		
		while(num > 0){
			int rem = num % 10;
			rev = rev * 10 + rem;
			num = num / 10;
		}
		
		rev = rev / 10;
		
		while(rev > 0){
			int rev_rem = rev % 10;
			rev_num = rev_num * 10 + rev_rem;
			rev = rev / 10;
		}
		System.out.println(rev_num);	
	}
}

*/

/**
9. Palindrome number
Input: 121
Output: Palindrome
Test Case: 123 -> Not Palindrome


import java.util.Scanner;
class Demo{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter No. : ");
		int num = sc.nextInt();
	
		num1 = num;
		int rev = 0;

		while(num > 0){
			int rem = num % 10;
			rev = rev * 10 + rem;
			num = num / 10;
		}
		
		if(num1 == rev){
			System.out.println("Palindrome");
		}
		else{
			System.out.println("Not Palindrome");
		}	
	}
}

*/


/**
10. Largest digit
Input: 4839
Output: 9
Test Case: 250 -> 5


import java.util.Scanner;
class Demo{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter No. : ");
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
10 Basic Array Questions (with Test Cases)


1. Take array from user & print elements
Input: n=5, arr= [1 2 3 4 5]
Output: 1 2 3 4 5


class Demo{
	public static void main(String[]args){
		
		int[] arr = new int[5];

		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 5;

		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i] + " ");
		}
	}
}

*/


/**
2. Find largest element
Input: 10 20 5 7
Output: 20
Test Case: 3 9 2 -> 9


class Demo{
	public static void main(String[]args){
		
		int[] arr = {10,20,5,7};
		int max = 0;

		for(int i = 0; i < arr.length; i++){
			if(max < arr[i]){
				max = arr[i];
			}
		}
		
		System.out.println(max);
	}
}

*/


/**
3. Find smallest element
Input: 10 20 5 7
Output: 5
Test Case: 3 9 2 -> 2

class Demo{
	public static void main(String[]args){
		
		int[] arr = {10,20,5,7};
		int min = arr[0];
		
		for(int i = 0; i < arr.length; i++){
			if(arr[i] < min){
				min = arr[i];
			}
		}
		
		System.out.println(min);
	}
}

*/

/**
4. Sum of array elements
Input: 1 2 3 4
Output: 10
Test Case: 10 10 -> 20


class Demo{
	public static void main(String[]args){
		
		int[] arr = {1,2,3,4};
		int sum = 0;
		
		for(int i = 0; i < arr.length; i++){
			sum = sum + arr[i];
		}
		
		System.out.println(sum);
	}
}

*/

/**
5. Count even & odd
Input: 1 2 3 4 5
Output: Even=2 Odd=3
Test Case: 2 4 6 -> Even=3 Odd=0

class Demo{
	public static void main(String[]args){
		
		int[] arr = {2,4,6};
		int even = 0;
		int odd = 0;
		
		for(int i = 0; i < arr.length; i++){
			if(arr[i] % 2 == 0){
				even ++;
			}
			else{
				odd ++;
			}
		}
		
		System.out.println("even : " + even);
		System.out.println("odd : " + odd);
	}
}

*/

/**
6. Reverse array
Input: 1 2 3 4
Output: 4 3 2 1
Test Case: 5 6 -> 6 5


class Demo{
	public static void main(String[]args){
		
		int[] arr = {5,6};
		
		for(int i = arr.length-1; i >= 0; i--){
			System.out.print(arr[i] + " ");
		}
	}
}

*/

/**
7. Linear search
Array: 10 20 30 40
Search: 30
Output: Found
Test Case: Search 50 -> Not Found
*/


import java.util.Scanner;
class Demo{
	public static void main(String[]args){
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Search No. : ");
		int search = sc.nextInt();

		int[] arr = {10,20,30,40};
		boolean is_found = false;
		
		for(int i = 0; i < arr.length; i++){
			if(search == arr[i]){
				is_found = true;
				break;
			}
		}
		
		if(is_found){
				System.out.println("Found");
		}
		else{
				System.out.println("Not Found");
		}
	}
}




