
public class C3_while_break2 {

	public static void main(String[] args) {
		
		//🔴원래 브레이크는 자신이 속한 반복문만 빠져나옴
		//하지만 이름을 붙여서 그 break 이름 을 호출하면 
		//그 반복문이 바깥 반복문이라도 해당 반복문을 빠져나옴
		loop: for(int i=1; i<=5;i++) {
			for(int j=1;j<=3;j++) {
				System.out.print(j);
				
				if(i==3)break loop;
			}
			System.out.println();  //라인개행, 줄바꾸기
//			if(i==3)break;
		}
	}

}
