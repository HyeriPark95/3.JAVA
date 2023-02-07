
public class C6_제어문01 {

	public static void main(String[] args) {
		
		//선택문, 분기문
		//if, switch
		
		int myAge = 25, yourAge = 27;
		
		//if(조건문){조건을 만족하면 수향할 명령문}
		//if단독으로도 사용 가능
		if(myAge > yourAge) {
			System.out.println("내가 형이야");
		}
		//
		
		if(myAge>yourAge) {
			System.out.println("내가 형이야");
		}else {
			System.out.println("친구거나 너가 형이야");
		}
		//
		
		if(myAge>yourAge) {
			System.out.println("내가 형이야");
		}else  if(myAge<yourAge) {
			System.out.println("너가 형이야");
		}else {
			System.out.println("우린 친구야");
		}
		
		
		
	}

}
