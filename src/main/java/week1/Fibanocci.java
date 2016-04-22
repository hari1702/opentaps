package week1;

public class Fibanocci {

	public static void main(String[] args) {
		int f1 = 1, f2 = 2, f3 ;
		System.out.println("Fibanocci series from 1 to 100");
		while(f1<=100){
			System.out.println(f1);
			f3 = f1+f2;
			f1 = f2;
			f2 = f3;			
		}		
	}

}
