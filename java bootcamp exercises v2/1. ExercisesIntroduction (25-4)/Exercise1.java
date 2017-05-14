public class Exercise1{
	public static void main(String[] argv){

	int[] pinax=new int[9];

			for (int j=1;j<=9;j++){
				for (int i=0;i<9;i++){
			pinax[i]=j;
				}

					for (int i=0;i<9-j;i++){
			pinax[i]=0;}
				for (int i=0;i<9;i++){
				System.out.print(pinax[i]);}
				System.out.print("\n");	}


	}}
