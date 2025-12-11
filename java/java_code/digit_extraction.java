/**1] Reverse Number :-


class Demo{
	public static void main(String[]args){
		int num = 123;
		while(num > 0){
			int rem = num % 10;
			System.out.println(rem);
			num = num / 10;
		}
	}
}

it gives [3 2 1]. in vertical order.but if we want in horizontal the use only[print].now firstly we just declare a variable with value 123 and give the conditin if num is greater than 0 the go to this loop after entering this loop we take one variable that is rem in which we perform the expression taht is num % 10 now how it works if the num is 123%10 it gives 3 i.e it gives remainder after we divide this num by 10 it symbol called as [mod / modulas].now it gives 3 then after num/10 i.e 123/10 we get 12.3 but it is int so we take only 12 the all expression is complete then we here last re-intialise the num value the num value is now 12.then again [12%10=2] and [12/10=1]then again 1 is greater than 0 [1%10=1] and [1/10=0] then 0>0 condition false then loop is terminated . 

							OR



class Demo{
	public static void main(String[]args){
		int num = 1234;
		int rev = 0;
		while(num > 0){
			int rem = num % 10;
			rev = rev * 10 + rem;
			num = num / 10;
		}
		System.out.println(rev);
	}
}

it gives [4321]. ata hite pan reverse hote but adhi jase separate out no. bhetat hote i.e separate out [4 3 2 1] tase nahi bhetat hithe 1 number full jase ki [four thousand three hundred and twenty one] asa no. bhetto reverse cha ha farak ahe ani ata he work hote ase ki adhi ek variable declare kela rev cha then while chya loop madhe enter hote then adhi rem bhtto je ki 4 ashnar then expression rev che je ki [0*10+4 = 4] rev chya box madhe 4 store hote ata then number is 123. [4*10+3 = 43] rev chya box madhe 43 store hote ata then number is 12. [43*10+2 = 432] rev chya box madhe 432 store hote ata then number is 1. [432*10+1 = 4321] rev chya box madhe 4321 store hote ata then number is 0. ata 0 zale mg condition false and loop chya baher ani then mg sop madhe rev chya box madhil value print honar.

*/


//2] Number Length Count :-
+
class Demo{
	public static void main(String[]args){
		int num = 123;
		int count = 0;
		while (num>0){
			int rem = num % 10;
			count ++;
			num = num / 10;
		}
		System.
	}
}
