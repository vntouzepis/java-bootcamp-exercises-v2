package one_exerc2;
import java.util.Random;

public class Zari {

		int a;
		public Zari(){}
		public int roll(){
			Random num=new Random();
			a=num.nextInt(6)+1;
			return a;
		}

	}
