import java.util.ArrayList;
import java.util.Scanner;

public class javaAnasinif_1 {
	
	public static ArrayList<Integer> fonksiyon(ArrayList<Integer> bir_liste) {
		ArrayList<Integer> tekler = new ArrayList<>();	
		ArrayList<Integer> ciftler = new ArrayList<>();
		for (int i = 0 ; i < bir_liste.size() ; i ++) {
			if (i % 2 == 0) {
				ciftler.add((Integer) bir_liste.get(i));
			}
			else {
				tekler.add((Integer) bir_liste.get(i));
			}
		}
		int toplam = 0;
		for (int i : tekler) {
			while (i > 0) {
				int mod = i % 10;
				i /= 10;
				toplam += Math.pow(mod,2);
			}			
		}
		ciftler.add(toplam);
		System.out.println(ciftler);		
		return ciftler;		
	}
	public static void main(String[] args){ 
		ArrayList<Integer> sabit_liste = new ArrayList<>();
	    Scanner scanner = new Scanner(System.in);
	    System.out.println("Eleman sayisi : ");
	    int eleman_sayisi = scanner.nextInt();
	    
	    for (int i = 1 ; i <= eleman_sayisi ; i ++ ) {
	    	System.out.println("Bir sayi giriniz : ");
	    	int eleman = scanner.nextInt();
	    	sabit_liste.add(eleman);  	
	    }    
	    System.out.println("Sizin listeniz : " + sabit_liste);
	    ArrayList yeni_liste = fonksiyon(sabit_liste);
	    
	    while (sabit_liste.contains(yeni_liste.get(1))) {
	    	yeni_liste = fonksiyon(yeni_liste);
	    }
  }
}