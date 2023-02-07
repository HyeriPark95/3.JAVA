import java.util.Scanner;

public class C7_스위치02_박혜리 {

	public static void main(String[] args) {
		 
		//switch문 이용해서
		//메뉴선택, 수량 선택해서 주문내용 출력하는 프로그램
		//메뉴, 가격 임의로 정하기

		int menu;
		int price = 0;
		String menuname = null;
		int amount=0;
		
		System.out.println("주문하실 메뉴 선택 1.아아 2,000원  2.라떼 3,500원  3.주스 4,000원");
		Scanner sc=new Scanner(System.in);
		menu=sc.nextInt();

		switch(menu) {
		
		case 1:
			menuname="아이스 아메리카노";
			price = 2000;
			System.out.println("수량을 선택해주세요");
			amount=sc.nextInt();
			System.out.println(menuname+" "+amount+"개 주문하셨습니다.");
			System.out.println("가격은 "+price*amount+"입니다.");
			break;
			
		case 2: 
			menuname="라떼";
			price = 3500;
			System.out.println("수량을 선택해주세요");
			amount=sc.nextInt();
			System.out.println(menuname+" "+amount+"개 주문하셨습니다.");
			System.out.println("가격은 "+price*amount+"입니다.");
			break;
			
		case 3: 
			menuname="주스";
			price = 4000;
			System.out.println("수량을 선택해주세요");
			amount=sc.nextInt();
			System.out.println(menuname+" "+amount+"개 주문하셨습니다.");
			System.out.println("가격은 "+price*amount+"입니다.");
			break;
			
		default: 
			System.out.println("다시 주문해주세요");
		}
		
		
	}

}
