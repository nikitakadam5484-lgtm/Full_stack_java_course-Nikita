/**
Arrays in java :-

jar aplyla 5 roll num print karyche astil tar apan 5 variable madhe kahitari value store karun te print karto jase ki 

class Demo{
	public static void main(String[]args){
		int rollNo1 = 10;
		int rollNo2 = 20;
		int rollNo3 = 30;
		int rollNo4 = 40;
		int rollNo5 = 50;
		System.out.println(rollNo1);
		System.out.println(rollNo2);
		System.out.println(rollNo3);
		System.out.println(rollNo4);
		System.out.println(rollNo5);
	}
}


ase karyla lagat hote jar multiple value print karyche astil ekatr tar ase karta yet navte i.e


class Demo{
	public static void main(String[]args){
		int rollNo = 1,2,3,4;
		System.out.println(rollNo1);
	}
}
error: <identifier> expected
                int rollNo = 1,2,3,4;


*/


/**
Syntax of Array :-

int[] arr = {10,20,30,40,50};   OR     int arr[] = {10,20,30,40,50};

ethe int cha ek array create hoto tyamdhe tya data type che or tychya peksha kami size che value apan store karu shakto.
and array la apan call tychya index ne karto . i.e a[0]= 10 ase . ani array chi length hi array elements/value/data yevdi aste [i.e arr.length = 5]. and for indexing [arr.length - 1 = 4 pashi end hote mhanje last number chi ti index aste.]



Array is [Advanced datatype] coz we can add multiple values in this array. this is came coz in primitive datatype we can add one value in one variable at a time so that's why arrays are come .

String is not primitive datatype.

*/

/**
class Demo{
	public static void main(String[]args){
		int[] arr = {10,20,30};
		System.out.println(arr);
		System.out.println(arr[0]);
	}
}

it gives [[I@2f92e0f4 10].arr print kele fakt tar address dete te. 
*/

/**
class Demo{
	public static void main(String[]args){
		int[] arr = {10,20,30};
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);

		arr[1] = 40;
		System.out.println(arr[1]);
	}
}

it gives [10 20 30 40]. ethe apan already 10,20,30 varti print kele ani parat reintialize kele ani te parat print kele.
*/

/**
class Demo{
	public static void main(String[]args){
		int[] arr = {10,20,30,10.5};
	}
}
 error: incompatible types: possible lossy conversion from double to int
                int[] arr = {10,20,30,10.5};
*/


/**
class Demo{
	public static void main(String[]args){
		int[] arr = {10,20,30,a};
	}
}
error: cannot find symbol
                int[] arr = {10,20,30,a};
                                      ^
  symbol:   variable a
  location: class Demo
*/

/**
class Demo{
	public static void main(String[]args){
		int[] arr = {10,20,30,'a'};
		System.out.println(arr[3]);
	}
}

it gives [97]
*/

/**
class Demo{
	public static void main(String[]args){
		int[] arr = {10,20,30,'A'};
		System.out.println(arr[3]);
	}
}
it gives [65]
*/

/**
class Demo{
	public static void main(String[]args){
		int[] arr = {10,20,30};
		System.out.println(arr[3]);
	}
}
JVM error deto

Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
        at Demo.main(array.java:131)
*/


/**
class Demo{
	public static void main(String[]args){
		int[] arr = {10,20,30,40};
		for(int i = 0; i < 4; i++){
			System.out.println(arr[i]);
		}
	}
}

it gives [10 20 30 40]
*/

/**
class Demo{
	public static void main(String[]args){
		int[] arr = {10,20,30,40};
		for(int i = 1; i <= 4; i++){
			System.out.println(arr[i]);
		}
	}
}

20
30
40
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4
        at Demo.main(array.java:159)
*/


/**
class Demo{
	public static void main(String[]args){
		int[] arr = {10,20,30,40};
		System.out.println(arr.length);
	}
}

it gives [4]
*/

/**
class Demo{
	public static void main(String[]args){
		int[] arr = {10,20,30,40};
		for(int i = 0; i < arr.length; i++){
			System.out.println(arr[i]);
		}
	}
}

it gives [10 20 30 40].
*/

/**
class Demo{
	public static void main(String[]args){
		int[] arr = {10,20,30,40,30};
		for(int i = 0; i < arr.length; i++){
			if(arr[i] == 30){
				System.out.println(i);
				
			}
		}
	}
}

 it gives [2 4]. que jar 30 no. cha index kadycha asel tar.

*/


/**
class Demo{
	public static void main(String[]args){
		int[] arr = {10,20,30,40,30};
		for(int i = 0; i < arr.length; i++){
			if(arr[i] == 30){
				System.out.println(i);
				break;	
			}
		}
	}
}

it gives [2]. break use kele tymulete sapadle ki directly for loop madhunch baher padte. pudhe check nahi karat.
*/

/**
class Demo{
	public static void main(String[]args){
		int[] arr = {40,10,50,80};
		for(int i = arr.length - 1; i >= 0; i--){
				System.out.println(arr[i]);
		}
	}
}
 reverse array kadycha asel tar. [80 50 10 40].
*/







/**
import java.util.*;
class Demo{
	public static void main(String[] args){
		int arr[] = {7,4,5,9,1};
		int arr1[] = new int [5]; 
	
		for(int i = 0; i < arr.length; i++){
			if(arr[i] % 2 != 0){
				arr1[i] = arr[i];
				System.out.println(arr[i]); // it gives 7,5,9,1
			} 
		} 
		System.out.println(Arrays.toString(arr1));//[7,0,5,9,1]

		for(int j = 0; j < arr1.length ; j++){
			System.out.println(arr1[j]);//7,0,5,9,1
		} 
	}
}
*/


/**
import java.util.*;
class Demo{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter len : ");
		int len = sc.nextInt();//eg,=4

		
		int arr[] = new int[len];//[0,0,0,0]

		int new_arr[] = new int[len];//[0,0,0,0]

		System.out.println("Enter Array Elements : ");
		for(int i = 0; i < len; i++){
			arr[i] = sc.nextInt();
			new_arr[i] = arr[i];	
		}

		System.out.println("Entered Array Elements : ");
		for(int j = 0; j < len; j++){
			System.out.println(arr[j]);//10,20,30,40
		}

		System.out.println(Arrays.toString(arr));//[10,20,30,40]

		
 		System.out.println(Arrays.toString(new_arr));//[10,20,30,40]
	}
}
*/


/**
import java.util.*;
class Demo{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter len : ");
		int len = sc.nextInt();

		
		int arr[] = new int[len];

		int new_arr[] = new int[len];

		System.out.println("Enter Array Elements : ");
		for(int i = 0; i < len; i++){
			arr[i] = sc.nextInt();
			new_arr[len - (i+1)] = arr[i];	
		}


		System.out.println(Arrays.toString(arr));//[10,20,30,40]

		
 		System.out.println(Arrays.toString(new_arr));//[40,30,20,10]

	}
}

								OR

import java.util.*;
class Demo{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter len : ");
		int len = sc.nextInt();

		
		int arr[] = new int[len];

		int new_arr[] = new int[len];

		System.out.println("Enter Array Elements : ");
		for(int i = 0; i < len; i++){
			arr[i] = sc.nextInt();
			new_arr[len - (i+1)] = arr[i];	
		}


		System.out.println(Arrays.toString(arr));//[10,20,30,40]

		
 		System.out.println(Arrays.toString(new_arr));//[40,30,20,10]

	}
}

*/

import java.util.*;
class Demo{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int arr[] = {1,2,3,4};
		int temp = 0;

		for(int i = 0; i < arr.length; i++){
			temp = arr[i];
			arr[i] = arr[arr.length - (i+1)];
			arr[arr.length - (i+1)] = temp;	
		}
		
		System.out.println(Arrays.toString(arr));

	}
}



