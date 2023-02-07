import java.util.Scanner;

public class C6_Scanner {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String menu;
		int price;
		double sugar;
		
		menu = sc.next();  //문자열입력
		price = sc.nextInt();  //정수입력
		sugar = sc.nextDouble();  //실수입력
		
		System.out.println(menu);
		System.out.println(price);
		System.out.println(sugar);
		
	}

}
