/**int a = 10;

now in this  where { a=variable name, int=datatype, 10=value}.
in which int is of [4 bytes]i.e 32 bits and [1byte=8bit].


char a = 'A';
it will compile and converted into binary but it shows output in number by showing his ASCII value i.e 65
for [capital = 65 to 96] and [for small = 97 to 122]

and if i did

char a = 65;
then it will give the char i.e A

mhanje jar int type dila tar int type che output show karte ani jar char type dila tar te char show karte.

*/



/**class Demo{
	public static void main(String[]args){
		int a = 10;
		System.out.println(a);
	}
}
yalach vaiable initialization mhanto apan.mahnje apan kahitari value takli ahe [declare karun tyla.i.e int a]
jar system cha s small lihla tar error yeto to javac dete i.e [package system does not exist system.out.println(a);]
and in this code it will give the output = 10
*/


/**class Demo{
	public static void main(String[]args){
		int a ;
		System.out.println(a);
	}
}


ethe compiler error deto ki jar tya variable madhe kahi nahi tar te print kay karnar jase variable he values print karte but apan hithe call dila but values nahit tar error yeto.

error: variable a might not have been initialized
                System.out.println(a);
*/


/**class Demo{
	public static void main(String[]args){
		int a ;
		 
	}
}

int a yalach variable declaration mhantat, ani he compile hote ani run pan but output nahi disat karan print/call nahi kele tymule.
ata fakt just declare kele ahe.
*/


/**class Demo{
	public static void main(String[]args){
		int a ;
		a = 10;
		System.out.println(a);
	}
}

int a ; = variable declaration
a = 10; = variable intialization
apan eka line madhe lihto declare karun intialize karto te fakt sepate lihle ahe.
it gives output 10
*/

/**class Demo{
	public static void main(String[]args){
		int a = 10;
		a = 20;
		System.out.println(a);
	}
}

yalach re-intialization mhantat mhanje adhi apan variable madhe value intialize keli a=10 but parat apan re-intialize keli a=20
manje a chya box madhe 10 hote but jithe a disal tithe 20 tak ase hote.
tymule yache output he 20 diste.
*/


/**class Demo{
	public static void main(String[]args){
		int a = 10;
		int a = 20;
		System.out.println(a);
	}
}

ethe error yeto coz konte a print karyche he samjatch nahi na tymule compiler error deto.
error: variable a is already defined in method main(String[])
                int a = 20;
*/


/**class Demo{
	public static void main(String[]args){
		int a = 10;
		int x = 20;
		System.out.println(a);
	}
}

ethe fakt 10 output disel coz only apan a la print / call kele tymule te tevdech disat ahe 10 jar apan x print kele tar mg 20 disel.
*/


/**class Demo{
	public static void main(String[]args){
		int a = 'A';
		System.out.println(a);
	}
}

answer / output he 65 dile karan int che output he int ch disnar and te tya size madhe pan basat ahe
*/


/**class Demo{
	public static void main(String[]args){
		char a = 65;
		System.out.println(a);
	}
}

answer / output he A dile karan char che output he char ch disnar and te tya size madhe pan basat ahe.
char he apan single coated comas madhe lihto ani only ekach character i.e letter chalu shakte.
*/


/**class Demo{
	public static void main(String[]args){
		char a = 65536;
		System.out.println(a);
	}
}

error: incompatible types: possible lossy conversion from int to char
                char a = 65536;
                         ^
ethe error yetoi ki karan char hi size only 2 byte i.e 16 bit ahe ani he size 17 bit hoat asel may be tymule error yeto.
so tymule main reason he ahe ki tychi size mothi ahe tymule error ala.
*/ 


/**class Demo{
	public static void main(String[]args){
		float a = 10.5;
		System.out.println(a);
	}
}

error: incompatible types: possible lossy conversion from double to float
                float a = 10.5;
ethe error ala karan by default ethe double select value hote.ani double he 8 byte che aste ani float he 4 byte che.
ani double chya [.6]ethe jase point nantar ek value lihli tase double 14 no.chalu shsktat ani float la 7 chaltat.
so tymule he double ahe ani tyla float madhe convert hotana size cha issue hoat asel tymule te error dete.
*/

/**class Demo{
	public static void main(String[]args){
		float a = 10.5f;
		System.out.println(a);
	}
}

it gives 10.5
jar aplyala float value dychi asel tar no nantar [f]lavyche mahanje float dete. ani point nantar 7 value chalu shaktat fakt float la.
*/

/**class Demo{
	public static void main(String[]args){
		String a = "shubham";
		System.out.println(a);
	}
}

it gives[shubham]
but ek condition ahe ki String cha [S] ha only capital chalto fakt.
string la kahi size size naste karan string hi kiti pan mothi asu shakte tymule
*/


/**class Demo{
	public static void main(String[]args){
		char a = "shubham";
		System.out.println(a);
	}
}

error: incompatible types: String cannot be converted to char
                char a = "shubham";
ethe error ala karan char madhe only one character chalte so tymule . ani hi string ahe tymadhe set of characters aste tymule.
*/


/**class Demo{
	public static void main(String[]args){
		int a = 65;
		char ch = a;
		System.out.println(a);
		System.out.println(ch);
	}
}

 error: incompatible types: possible lossy conversion from int to char
                char ch = a;
karan char he 2 byte aste ani int he 4 byte char madhe int nahi basu shakat coz size hi mothi hoat ahe tymule.
*/

/**class Demo{
	public static void main(String[]args){
		char a = 'A';
		int ch = a;
		System.out.println(a);
		System.out.println(ch);
	}
}
It gives [A 65]
karan char he 2byte che ahe ani int he 4 byte so char he tymadhe basu shkate.
ani output la int he int ch output dete ani char he charch output dete. 
*/

/**class Demo{
	public static void main(String[]args){
		boolean a = true;
		System.out.println(a);	
	}
}

it gives[true]
karan ethe apan boolean data type ghetla tynna fakt true ani false kalte.
ani ethe true cha [t]small asto jase ki python la capital asto.
*/

/**class Demo{
	public static void main(String[]args){
		boolean a = false;
		System.out.println(a);	
	}
}

it gives[false]
karan ethe apan boolean data type ghetla tynna fakt true ani false kalte.
ani ethe false cha [f]small asto jase ki python la capital asto.
*/

/**class Demo{
	public static void main(String[]args){
		boolean a = 0;
		System.out.println(a);	
	}
}

error: incompatible types: int cannot be converted to boolean
                boolean a = 0;
karan ethe apan boolean data type ghetla tynna fakt true ani false kalte.
ani [0] ha int ahe tymule error ala
*/ 


/**class Demo{
	public static void main(String[]args){
		int a = true;
		System.out.println(a);	
	}
}

error: incompatible types: boolean cannot be converted to int
                int a = true;
karan apan lihle ahe te int amdhe ani value hi boolean ahe so int/boolean convet nahi hoat boolean/int madhe.
*/


1]long
2]short
3]double
4]byte
5]int
6]char
7]float
8]boolean
9]String

are the datatypes in java. and it is also called the primitive datatypes.































