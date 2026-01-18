/**
Strings :-
	String is an a group of a character.
	String is an advanced datatype . It is an also a class and a datatype.  i.e.  A class can be a datatype.
	There ar two ways of writing Strings as = 1] as a normal string   2]as a new string syntax.

*/

/**
1st way :-

class Demo{
	public static void main(String[]args){
		String s = "abcd";
		System.out.println(s);
	} 
}

In this firstly it create a class file then it goes to the class loader subsystem it check our class file that it has any issue or any suspicious data in out if is not it go to the method area here it seperate out the class and methods.then main method la call kela jato then ti method java stack varti aste then one by one command complete hoat jatat, and it is the String in method area there is SCP is present where our strings are stored.then it return the value or answer. 
*/

/**
2nd way :-

class Demo{
	public static void main(String[]args){
		String s = new String("abcd");
		System.out.println(s);
	} 
}

In this firstly it create a class file then it goes to the class loader subsystem it check our class file that it has any issue or any suspicious data in out if is not it go to the method area here it seperate out the class and methods.then main method la call jato ani tyanantar java stack varti one by one command complete hoat jatat ani jar "new" ne kahi pan jar asel tar te heap varti jate ani heap varti je box astat tyacha sarvancha address vegla asto. 
*/


/**
class Demo{
	public static void main(String[]args){
		String s = "shubham";
		System.out.println(System.identityHashCode(s));// 798154996
		System.out.println(s); //shubham
		s = "Abhi";
		System.out.println(System.identityHashCode(s)); //681842940
		System.out.println(s); //Abhi	
	} 
}

ethe adhi s madhe ek value store keli ani normal string ahe tymule scp varti jate ani tyacha kahitari address tyla bhetto to pan temporary asto then parat s la reintialize kele but string madhe value replace hoat nahi tyacha new box banto tyachya variable chya name ne jar store kele asel tar tyala address pan bhetto. ani jar variable madhil jar content same asel tar address same dete SCP madhe. that means memory management sathi scp better ahe. 
*/


/**
class Demo{
	public static void main(String[]args){
		String s = new String("shubham");
		System.out.println(System.identityHashCode(s));   // 798154996
		System.out.println(s); //shubham
		String s1 = "shubham";
		System.out.println(System.identityHashCode(s1)); //681842940
		System.out.println(s1);	//shubham
	} 
}
*/


/**
class Demo{
	public static void main(String[]args){
		String s = "shubham";
		System.out.println(System.identityHashCode(s));// 798154996
		System.out.println(s); //shubham
		String s1 = "shubham";
		System.out.println(System.identityHashCode(s)); //798154996
		System.out.println(s); //shubham	
	} 
}

scp madhe content check karatat tar jo same asel tar tyla same address assign kela jato but boxeses vegle astat tymadhe doni pan tyachya respective variable name ne but address same dila jato tynna. he memory management sathi sufficient ahe coz memory vachat ahe new address assign hoat nahie. 

*/


/**

String Comparison :-


class Demo{
	public static void main(String[]args){
		String s = "shubham";
		String s1 = "shubham";
		if (s == s1){
			System.out.println("both are same");
 		}
		else{
			System.out.println("both are not same");
		}	
	} 
}

both are same.

ethe compare hoatana address compare hoto. ani he noraml string ahe ani te scp varti aste ani check karte content same ahe ka same asel tar ekach address dete te.  
*/


/**


class Demo{
	public static void main(String[]args){
		String s = "shubham";
		String s1 = "viraj";
		if (s == s1){
			System.out.println("both are same");
 		}
		else{
			System.out.println("both are not same");
		}	
	} 
}

both are not same

address vegla ashnar coz content pan vegla ahe.
*/



/**
class Demo{
	public static void main(String[]args){
		String s = new String("shubham");
		String s1 = new String("shubham");

		if (s == s1){
			System.out.println("both are same");
 		}
		else{
			System.out.println("both are not same");
		}	
	} 
}

both are not same

new string ahe tymule te sarv kahi new that is sarv address vegle assign hoatat tynna ani te heap varti jate coz new ahe tymule.

*/


/**
String Immutability :-
*/

class Demo{
	public static void main(String[]args){
		String s = "disha";
		System.out.println(System.identityHashCode(s));   // 798154996
		
		s = "innovation";
		System.out.println(System.identityHashCode(s)); //681842940
		
	} 
}



