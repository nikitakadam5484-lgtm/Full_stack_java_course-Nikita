/**class Demo{
	public static void main(String[]args){
		System.out.println("hello");
	}

}

javac p1.java
java Demo = for running this code this are the 2 commmand.
*/

/**class Demo{
}

 Error: Main method not found in class Demo, please define the main method as:
   public static void main(String[] args)
ani ha error [jvm deto] compile hote he.


*/



/**class Demo{
	public static void main(String[]args){
		System.out.println("hello");
	}

}

here main is method name and demo is class.   and if we want to call main method we give command like [Demo.main();].
class that contains methods which are static and non-static.
*/


/**class Demo{
	 static void main(String[]args){
		System.out.println("hello");
	}
}


Error: Main method not found in class Demo, please define the main method as:
   public static void main(String[] args)

here we use public to show the main method or any code to jvm. 
i.e jar ekhadi main method jar show karychi asel tar ti jvm la disavi ti kothe ahe coz method eka bajula ani jvm eka bajula aste tymule mhanje apan public lihle tar lagech sapdel ani disel so tymule public use kele jate.
ani ha error [jvm deto] compile hote he.

  
*/


/**class Demo{
	 public void main(String[]args){
		System.out.println("hello");
	}
}

Error: Main method is not static in class Demo, please define the main method as:
   public static void main(String[] args)

ata jar class madhe enter karyche asel tar to open karava lagel tasech static he class chya main method  la open karyche kam karte tymule static pan lihave lagte. ani ha error [jvm deto] compile hote he.
*/


/**class Demo{
	static public void main(String[]args){
		System.out.println("Hello");
	}
}

ase pan chalu shakte coz open karun show kele ase pan chalte
*/


/**class Demo{
	public static void main(String[]args){
		System.out.println("Hello");
		Demo.fun();
	}
	public static void fun(){
		System.out.println("in fun");
	}
}


it gives hello and in fun .
hi static mathod ahe so apan class che name and direct method la call karto i.e demo.fun();
*/

/**class Demo{
	public static void main(String[]args){
		System.out.println("Hello");
		Demo.fun();
	}
	public  void fun(){
		System.out.println("in fun");
	}
}


error: non-static method fun() cannot be referenced from a static context
                Demo.fun();
                    ^
1 error

coz hi non static method ahe ani ti jar call karychi asel tar chavi karyla lagte aplyla class chi then mg apan call karu shakto.ani ha error compiler dete.
coz aplyla open karyche asel ghar tar chavi lagte na 
*/



/**class Demo{
	public static void main(String[]args){
		System.out.println("Hello");
		Demo.fun();
	}
	static void fun(){
		System.out.println("in fun");
	}
}


it gives hello and in fun .
coz demo class ahe ani tymadhe 2 method ahet ek main method ani ek apan lihleli je ki static ahe but apan user method la public nahi kele tari output yete.
coz gharatil gosht hi gharat ch aste ani ti shodhavi nahi lagat jase apan main method la public kele ahe mg lagech fun method pan sapdel karan te ekach class madhe ahe.karan main eka bajula ani jvm eka bajula aste tymule apan main method la call karto [demo.main();]mg tasech he sapadle tar te pan tithech shejari aste tya class madhe.

*/



/**class Demo{
	public static void main(String[]args){
		System.out.println("Hello");
		Demo.fun();
	}
	
}


 error: cannot find symbol
                Demo.fun();
                    ^
  symbol:   method fun()
  location: class Demo
1 error

jar method la call karyche asel tar ti method pan present pahije
imp= ha error compiler dete
*/


/**class Demo{
	public static void main(String[]args){
		System.out.println("Hello");
		
	}
	public static void fun(){
		System.out.println("in fun");
	}
}


It gives only[hello].
coz apan dusrya method la call nahi kele tymule but he compile hote.
*/



/**class Demo{
	public static void main(String[]args){
		System.out.println("Hello");
		Demo chavi = new Demo();
		chavi.fun();
		
	}
	void fun(){
		System.out.println("in fun");
	}
}


it gives hello and infun.
ata hi method static navti tymule apan yachi chavi banavli ani chvi banvli ki apan kiti pan vela call karu shakto ani open or access karu shakto ti method.
*/


/**class Demo{
	public static void main(String[]args){
		System.out.println("Hello");
		Demo chavi = new Demo();
		chavi.fun();
		Demo.gun();
		
	}
	void fun(){
		System.out.println("in fun");
	}
	static void gun(){
		System.out.println("in gun");
	}
}

it gives hello, in fun and in gun .
ethe pahili main method ,dusri non-static method jychi chavi keli , ani tisri static method jila class name.method name ne call karu shakto.
*/


/**class Demo{
	public static void main(String[]args){
		System.out.println("Hello");
		Demo chavi = new Demo();
		chavi.fun();
		Demo.gun();
		chavi.fun();
		
	}
	void fun(){
		System.out.println("in fun");
	}
	static void gun(){
		System.out.println("in gun");
	}
}


it gives [ hello in fun in gun in fun].
ata ekda chavi keli ki apan kiti pan vela call akru shakto.
*/


/**class Demo{
	public static void main(String[]args){
		System.out.println("Hello");
		Demo chavi = new Demo();
		chavi.fun();
		Demo.gun();
		chavi.fun();
		chavi.gun();
		
	}
	void fun(){
		System.out.println("in fun");
	}
	static void gun(){
		System.out.println("in gun");
	}
}


it gives [Hello in fun in gun in fun in gun].
ethe chavi hi apan class chi banvto method chi nahi tymule chavi keli ki apan kontya pan method la call karu shakto gharachi chavi ekach aste ti apan kiti pan vela use karu shakto.so ithe in gun pan print zale jari te static asle tari coz apan class chi chavi keli ahe . apan class madhil light ,fan ani ajun kahi pan access karu shakto call kele ki
*/


/**class Demo{
	public static void main(String[]args){
		System.out.println("Hello");
		Demo chavi = new Demo();
		chavi.fun();
		Demo chavi1 = new Demo();
		chavi1.fun();
		
		
	}
	void fun(){
		System.out.println("in fun");
	}
	static void gun(){
		System.out.println("in gun");
	}
}

it gives [ hello in fun in fun].
apan kiti pan chavi banvu shakto ani call karu shato class madhil method la karan chavi hi open karyla use karto tymule i.e call karyla.
ani hithe apan tisre function call nahi kele so te anhi disle .
*/


/**class Codex{
	public static void main(String[]args){
		System.out.println("Hello");
		Codex chavi = new Codex();
		chavi.fan();
		Codex.projector();
				
		
	}
	void fan(){
		System.out.println("fan started");
	}
	static void projector(){
		System.out.println("projector started");
	}
}
it gives [ hello fan started projector started].
in this fan is non-static method and projector is static method and the main method is present in this file so apan hithe ekdach public lihle ahe karan he eakch file madhe ani lagech sapdu shakte.coz he ekach class madhe ahe.
*/


/**class Demo{
	public static void main(String[]args){
		System.out.println("Hello");
		Codex.fun();	
	}
}
class Codex{
	static void fun(){
		System.out.println("in fun");
	}
}
	
it gives [Hello in fun].
ata hithe don class ahet vegle ani tari apan tyla call demo madhe kele tari print kase jale in fun tar jvm ha folder to folder interact/access karto that is communiacte ani ethe he eakch folder madhe ahe he tymule he doni class ekach folder madhe kothetari astil tymule print zale.
*/


class Demo{
	public static void main(String[]args){
		System.out.println("Hello");
		Codex.fun();	
	}
}
class Codex{
	static void fun(){
		System.out.println("in fun");
	}
}














  





    










