
public class C3_while_break2 {

	public static void main(String[] args) {
		
		//๐ด์๋ ๋ธ๋ ์ดํฌ๋ ์์ ์ด ์ํ ๋ฐ๋ณต๋ฌธ๋ง ๋น ์ ธ๋์ด
		//ํ์ง๋ง ์ด๋ฆ์ ๋ถ์ฌ์ ๊ทธ break ์ด๋ฆ ์ ํธ์ถํ๋ฉด 
		//๊ทธ ๋ฐ๋ณต๋ฌธ์ด ๋ฐ๊นฅ ๋ฐ๋ณต๋ฌธ์ด๋ผ๋ ํด๋น ๋ฐ๋ณต๋ฌธ์ ๋น ์ ธ๋์ด
		loop: for(int i=1; i<=5;i++) {
			for(int j=1;j<=3;j++) {
				System.out.print(j);
				
				if(i==3)break loop;
			}
			System.out.println();  //๋ผ์ธ๊ฐํ, ์ค๋ฐ๊พธ๊ธฐ
//			if(i==3)break;
		}
	}

}
