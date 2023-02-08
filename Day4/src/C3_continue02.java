import java.util.Scanner;

public class C3_continue02 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int menu=0;
		
		while(true) {
			System.out.print("(1)square");
			System.out.println("(2)square root");
			
			System.out.println("원하는 메뉴 1~2 선택하세요 종료:0");
			
			menu=sc.nextInt();
			
			if(menu==0) {
				System.out.println("프로그램 종료");
				break;
			}else if(!(1<=menu && menu<=2)) {
				System.out.println("메뉴를 잘못선택하셨습니다.");
				continue;
			}
			System.out.println("선택하신 메뉴는"+menu+"번 입니다");
			
			
		}
	}

}
