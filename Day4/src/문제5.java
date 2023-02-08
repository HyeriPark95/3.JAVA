import java.util.Scanner;

public class 문제5 {
	public static void main(String[] args) {
		
		//일정을 관리하는 프로그램
		//0을 누를 때까지 반복
		
		Scanner sc= new Scanner(System.in);
		System.out.println("===일정관리 프로그램===");
		
		int menu;
		
		while(true) {
			System.out.println("메뉴를 선택해주세요");
			System.out.println("1.등록 2.조회 3.변경 4.삭제");
			menu=sc.nextInt();
			
			if(menu==0) {  //0을 선택하면 더 이상 진행 안함
				System.out.println("프로그램을 종료합니다.");
				break;
			}  
			
			//일정관리 프로그램
			switch(menu) {
			case 1:
				System.out.println("등록합니다.");
				break;
			case 2:
				System.out.println("조회합니다.");
				break;
			case 3:
				System.out.println("변경합니다.");
				break;
			case 4:
				System.out.println("삭제합니다.");
				break;
			default: 
				System.out.println("다른 메뉴를 입력해주세요");
			
			}
			
		}
		
		
		//
		
		
		
		
		
		
		
		
		
	}
}
