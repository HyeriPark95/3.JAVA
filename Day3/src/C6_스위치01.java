import java.util.Scanner;

public class C6_스위치01 {

	public static void main(String[] args) {
		
		int menu =2;  //1.등록, 2.조회, 3.변경, 4.삭제
		//메뉴만들기
		System.out.println("메뉴를 선택해주세요 1.등록, 2.조회, 3.변경, 4.삭제");
		Scanner sc = new Scanner(System.in);
		menu=sc.nextInt();
		
		
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
			System.out.println("잘못된 메뉴입니다.");
			//break 안넣어줘도 됨
		}
		
	}

}
