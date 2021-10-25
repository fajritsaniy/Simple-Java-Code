import java.util.Iterator;
import java.util.Scanner;

public class Ujian {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//SOAL NOMOR 7
		Scanner scan = new Scanner(System.in);
		System.out.println("Masukkan Input Maksimum: ");
		Integer maks = scan.nextInt();
		int f = 1;
        int f2 = 1;
        int fib = 1;
        System.out.print(f+" ");
        do {
            System.out.print(f2 + " ");
            fib = f + f2;
            f = f2;
            f2 = fib; 
        }while(f2<=maks);
		
        
        
        //SOAL NOMOR 6
		Scanner scan = new Scanner(System.in);
		System.out.println("Masukkan Input");
		Integer input = scan.nextInt();
		for (int i = 0; i <= input; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
	
	
	
	

}
