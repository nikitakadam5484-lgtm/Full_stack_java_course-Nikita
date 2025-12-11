/**1] Arithmetic Operators : (Binary Operators) karan don operand varti kam karte so tymule.
	i)+
	ii)-
	iii)*
	iv)/
	v)% it is known as modulus i.e jar 5/2 ethe remainder or baki 1 rahte to mhanje modulus


int a = 10;
int b =20;
int c = a + b;

ethe a and b he operand zale i.e 10+10 ethe 10 he operand zale.

*/

/**class Demo{
	public static void main(String[]args){
		System.out.println(10+20);
		System.out.println(10-20);
		System.out.println(10*20);
		System.out.println(10/2);
		System.out.println(123%2);
	}
}

it gives [30 -10 200 5 1]
*/

/**class Demo{
	public static void main(String[]args){
		int a = 10;
		int b = 20;
		System.out.println(a+b);	
	}
}

class Demo{
	public static void main(String[]args){
		int a = 10;
		int b = 20;
		int c = a+b;
		System.out.println(c);	
	}
}
*/

/**2]Unary Operators = he fakt eka operand varti kam karte.
e.g  int a = 10;
      ++a; ase mg ethe [a] ha ekach operand use kela ahe.

++(increment operator)
--(decrement operator)
-(unary operator)


int a = 10;

++a                 a++
pre-increment       post-increment
*/


/**class Demo{
	public static void main(String[]args){
		int a = 10;
		System.out.println(++a);	
	}
}

it gives [11]
ethe first a cha box banto tymadhe 10 value store hote and then function la call jato and a variable che pre increment hote then a chi value 11 hote that is 1 ne increment hote ani ji a chya box madhe value store ahe ti print hote i.e 11
*/

/**class Demo{
	public static void main(String[]args){
		int a = 10;
		System.out.println(a++);	
	}
}

it gives [10]
ethe first a cha box banto tymadhe 10 value store hote and then function la call jato and ek variable declare hote ani tycha box tayar hoto and tymadhe a chi value store hote i.e temp chya box madhe a chi value store hote and the a che post increment hote then that is 1 ne increment hote ani a chya box madhe 11 store hote but return temp chi value hote .
that is if they ask for a then answer is 11 but if they ask for only a++ then it gives the intialise value of a. 

*/


/**class Demo{
	public static void main(String[]args){
		int a = 5;
		int b = ++a;
		System.out.println(a);
		System.out.println(b);		
	}
}

it gives [6 6]
adhi a chya box madhe 5 store hote then b cha box hoto ani ithe a chi pre increment dili ahe so function la call javun a chi pre increment i.e a chi directly increment hote so a chya box madhe 6 valu store hote tymule a chi value doni thikani print hoti
*/


/**class Demo{
	public static void main(String[]args){
		int a = 5;
		int b = a++;
		System.out.println(a);
		System.out.println(b);		
	}
}
 
it gives [6 5]
*/


/**class Demo{
	public static void main(String[]args){
		int a = 5;
		int b = ++a + ++a;
		System.out.println(a);
		System.out.println(b);		
	}
}
it gives [7 13]
firstly a chya box madhe 5 hote then pre increment hovun 6 zale then a chya box madhe 6 ahe then parat pre increment hovun 7 zale then 6+7 he 13 b chya box madhe store hote.
*/ 


/**class Demo{
	public static void main(String[]args){
		int a = 5;
		int b = a++ + a++;
		System.out.println(a);
		System.out.println(b);		
	}
}
it gives [7 11]
firstly a chya box madhe 5 value store ahe then b cha box tayar hoto then a chi post increment hoti je ki return temp value karte i.e 5 but achya box madhe 6 store hote the parat a chi post increment hoti the 5+6=11 then b adhe 11 value store hote
*/

/**class Demo{
	public static void main(String[]args){
		int a = 5;
		int b = ++a + a++;
		System.out.println(a);
		System.out.println(b);		
	}
}
it gives [7 12]
*/

/**class Demo{
	public static void main(String[]args){
		int a = 5;
		int b = a-- + --a;
		System.out.println(a);
		System.out.println(b);		
	}
}
it gives [3 8]
*/


/**class Demo{
	public static void main(String[]args){
		int a = 5;
		int b =-a;
		System.out.println(-(-b));		
	}
}
it gives [-5]
*/

 
//RELATIONAL OPERATORS :-

/**class Demo{
	public static void main(String[]args){
		System.out.println(10>5);
		System.out.println(10>=5);
		System.out.println(10<5);
		System.out.println(10<=5);
		System.out.println(10==5);
		System.out.println(10!=5);
	}
}
it gives [true true false false false true]
*/

/**class Demo{
	public static void main(String[]args){
		int a = 10 > 5;
		System.out.println(a);
	}
}

error: incompatible types: boolean cannot be converted to int
                int a = 10 > 5;
ethe a ha int ahe ani to boolean madhe nahi convert karu shakat. 
*/


/**
CONDITIONAL OPERATOR :-

and -> &&
or -> ||
not -> !

AND operator is work like
1 (true) * 0 (false) = 0 (false)
0 (false) * 1 (true) = 0 (false)
1 (true) * 1 (true) = 1 (true)
0 (false) * 0 (false) = 0 (false)

OR operator is work like 
1 (t) + 0 (f) = 1 (t)
0 (f) + 1 (t) = 1 (t)
1 (t) + 1 (t) = 1 (t)
0 (f) + 0 (f) = 0 (f)

NOT opeartor is work like
!true = false
!false = true
*/



/**class Demo{
	public static void main(String[]args){
		int a = 10 && 20;
		System.out.println(a);
	}
}

error: bad operand types for binary operator '&&'
                int a = 10 && 20;
                           ^
  first type:  int
  second type: int
karan int he boolean madhe nahi change karu shakat.ani 10 and 20 he int ahet tymule error ala.
*/


/**class Demo{
	public static void main(String[]args){
		int a = true && true;
		System.out.println(a);
	}
}

 error: incompatible types: boolean cannot be converted to int
                int a = true && true;
karan he int madhe lihle ahe tymule int he boolean madhe nahi change karu shakat.
*/


/**class Demo{
	public static void main(String[]args){
		int a = 5;
		int b = 7;
		boolean c = a<b && a>b;
		System.out.println(c);
	}
}
 It gives [false].karan first true ahe ani second false tymule te ans false ale.
*/


/**class Demo{
	public static void main(String[]args){
		int a = 5;
		int b = 7;
		boolean c = a<b || a>b;
		System.out.println(c);
	}
}
It gives [true].karan first true ahe ani second false tymule te ans false ale.



/**class Demo{
	public static void main(String[]args){
		int a = 5;
		int b = 7;
		boolean c = ++a<b++ && ++a>b++;
		System.out.println(c);
		System.out.println(a);
		System.out.println(b);
	}
}
it gives [false 7 9]. coz a chi first pre increment zali  tymule a chya box madhe 6 store zale ani b chi post increment zali  8 store zale b chya box madhe but temp value print hote tymule 7 dishnar and parat a cho pre increment zali then a chaya box madhe 7 store zale then b chi parat post increment zali then  b chaya box madhe 9 store zale ani temp value 8 dishnar.
6<7 && 7>8
*/



/**class Demo{
	public static void main(String[]args){
		int a = 5;
		int b = 7;
		boolean c = ++a>b++ && ++a>b++;
		System.out.println(c);
		System.out.println(a);
		System.out.println(b);
	}
}
it gives [false 6 8]. 
coz a chi first pre increment zali  tymule a chya box madhe 6 store zale ani b chi post increment zali  8 store zale b chya box madhe but temp value print hote tymule 7 dishnar. and 6>7 he first condition false zali tymule pudhe check karyla nahi gele coz and operator use kele ahe tymule.pudhe condition check karat nahi.
*/ 

/**class Demo{
	public static void main(String[]args){
		int a = 5;
		int b = 7;
		boolean c = ++a>b++ || ++a>b++;
		System.out.println(c);
		System.out.println(a);
		System.out.println(b);
	}
}
it gives [false 7 9]. doni condition false tymule ans false coz OR operator use kele ahe. 6>7 || 7>8 .
*/


/**class Demo{
	public static void main(String[]args){
		int a = 5;
		int b = 7;
		boolean c = ++a<b++ || ++a>b++;
		System.out.println(c);
		System.out.println(a);
		System.out.println(b);
	}
}
it gives [true 6 8].  6<7 || 7>8.
ethe first condition true zali but we use the OR opeartor so we not going for further checking coz we want both false condition.
*/



class Demo{
	public static void main(String[]args){
		System.out.println(!true);
		System.out.println(!false);
	}
}














/**class Demo{
	public static void main(String[] args){
		for(int i = 1; i < 5; i++){
			System.out.println("Hello World");
		}	
	}
}
*/



	