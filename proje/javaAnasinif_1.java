import java.util.Scanner;
public class javaAnasinif_1 {
	public static void main(String[] args){ 
		Scanner scanner = new Scanner(System.in);
		System.out.println("Number : ");
		int number = scanner.nextInt();
		int geri_adim = number - 1;
		int ileri_adim = number + 1;
		
		while(geri_adim > 1 && !asal(geri_adim)) {
			geri_adim--;
		}
		while (!asal(ileri_adim)) {
			ileri_adim++;		
		}
		if (geri_adim > 1) {
			if (number - geri_adim < ileri_adim - number) {
				System.out.println(geri_adim);
			}
			else if (number - geri_adim == geri_adim - number) {
				System.out.println(ileri_adim + "\n" + geri_adim);
			}
			else {
				System.out.println(ileri_adim);
			}
				
		}
		else {
			System.out.println(ileri_adim);
		}
		}
			
	public static boolean asal(int deger) {
		if (deger < 2) {
			return false;			
		}
		for (int i = 2 ; i <= Math.sqrt(deger); i++) {
			if (deger % i == 0 ) {
				return false;
				}	
		}
		return true;
		
	}
}