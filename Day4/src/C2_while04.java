import java.util.Scanner;

public class C2_while04 {

	public static void main(String[] args) {
		//메뉴입력 1.등록 2.조회 3.변경 4.삭제
		loop: while(true) {   //loop이라는 이름을 붙이고
			Scanner sc = new Scanner(System.in);
			System.out.println("메뉴를 선택하세요 1.등록 2.조회 3.변경 4.삭제");
			int menu =sc.nextInt();
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
			case 5: 
				System.out.println("종료합니다.");
				break loop;  //loop이라는 반복문에서 빠져나옴
			default:
				System.out.println("잘못된 메뉴입니다.");
			}
		}
	}

}
