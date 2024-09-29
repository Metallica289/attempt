import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Armstrong {
		public static boolean Is_armstrong(int x) {
			String numb_str = String.valueOf(x);
			int exp = numb_str.length();
			int numb_2 = 0;
			for (char j : numb_str.toCharArray()) {
				numb_2 += Math.pow(Character.getNumericValue(j), exp);			
			}		
			
			return numb_2 == x;
		}
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int count = 0;
			Scanner scanner = new Scanner(System.in);
			System.out.println("Number : ");
			String numb = scanner.nextLine();
			List<Integer> combinations = new ArrayList<>();
			for (int i = 0 ; i <= numb.length()-3 ; i++) {
				combinations.add(Integer.parseInt(numb.substring(i, i+3)));
							
			}
			for (int i : combinations) {
				if (Is_armstrong(i)) {
					count++;
			}
		}
					
			System.out.println(combinations + " listindeki armstrong olan ededlerin sayi : " + count);
		}

	}
