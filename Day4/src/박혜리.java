import java.util.Scanner;

public class ๋ฐํ๋ฆฌ {

	public static void main(String[] args) {
		//๐ด๋ฌธ์ 1
		//1~10๊น์ง์ ํฉ ๊ตฌํ๊ธฐ
//		int sum=0;
//		for(int i=1;i<=10;i++) {
//			sum+=i;
//		}
//		System.out.println(sum);
		
		
		
		//๐ด๋ฌธ์ 2
		//์ฌ์ฉ์๋ก๋ถํฐ ์๋ฅผ ์๋ ฅ๋ฐ์, ์๋ ฅ๋ฐ์ ์๊น์ง์ ํฉ ๊ตฌํ๊ธฐ
//		Scanner sc = new Scanner(System.in);
//		
//		int max;
//		System.out.println("๋ช๊น์ง์ ํฉ์ ๊ตฌํ ๊น์?");
//		max=sc.nextInt();
//		
//		int sum=0;
//		for(int i=1;i<=max;i++) {
//			sum+=i;
//		}
//		System.out.println(max+"๊น์ง์ ํฉ๊ณ:"+sum);
		
		
		
		//๐ด๋ฌธ์ 3
		//๊ณ ๊ฐ์ ๋ณด(์ด๋ฆ, ์์ด๋, ๋์ด, ํค) ์๋ ฅ๋ฐ์์ ์ถ๋ ฅํ๊ธฐ
//		Scanner sc = new Scanner(System.in);
//		
//		String id;
//		String name;
//		int age;
//		double height;
//		
//		System.out.println("id๋ฅผ ์๋ ฅํด์ฃผ์ธ์");
//		id=sc.next();
//		System.out.println("์ด๋ฆ๋ฅผ ์๋ ฅํด์ฃผ์ธ์");
//		name=sc.next();
//		System.out.println("๋์ด๋ฅผ ์๋ ฅํด์ฃผ์ธ์");
//		age=sc.nextInt();
//		System.out.println("ํค๋ฅผ ์๋ ฅํด์ฃผ์ธ์");
//		height=sc.nextDouble();
//		
//		System.out.println("id:"+id);
//		System.out.println("name:"+name);
//		System.out.println("age:"+age);
//		System.out.println("height:"+height);
		
		
		
		//๐ด๋ฌธ์ 4
		//์ผ์ ๊ด๋ฆฌ ํ๋ก๊ทธ๋จ ๋ง๋ค๊ธฐ(1๋ฒ ๋ฐ๋ณต)
		//1.๋ฑ๋ก 2.์กฐํ 3.๋ณ๊ฒฝ 4.์ญ์ 
				
//		Scanner sc= new Scanner(System.in);
//		System.out.println("===์ผ์ ๊ด๋ฆฌ ํ๋ก๊ทธ๋จ===");
//		
//		int menu;
//		
//		System.out.println("๋ฉ๋ด๋ฅผ ์ ํํด์ฃผ์ธ์");
//		System.out.println("1.๋ฑ๋ก 2.์กฐํ 3.๋ณ๊ฒฝ 4.์ญ์ ");
//		
//		menu=sc.nextInt();
//		
//		switch(menu) {
//		case 1:
//			System.out.println("๋ฑ๋กํฉ๋๋ค.");
//			break;
//		case 2:
//			System.out.println("์กฐํํฉ๋๋ค.");
//			break;
//		case 3:
//			System.out.println("๋ณ๊ฒฝํฉ๋๋ค.");
//			break;
//		case 4:
//			System.out.println("์ญ์ ํฉ๋๋ค.");
//			break;
//		default: 
//			System.out.println("๋ค๋ฅธ ๋ฉ๋ด๋ฅผ ์๋ ฅํด์ฃผ์ธ์");
//			System.out.println("์ผ์ ๊ด๋ฆฌ ํ๋ก๊ทธ๋จ์ด ์ข๋ฃ๋ฉ๋๋ค.");
//		
//		}
		
		
		
		//๐ด๋ฌธ์ 5
		//์ผ์ ์ ๊ด๋ฆฌํ๋ ํ๋ก๊ทธ๋จ
		//0์ ๋๋ฅผ ๋๊น์ง ๋ฐ๋ณต
				
//		Scanner sc= new Scanner(System.in);
//		System.out.println("===์ผ์ ๊ด๋ฆฌ ํ๋ก๊ทธ๋จ===");
//		
//		int menu;
//		
//		while(true) {
//			System.out.println("๋ฉ๋ด๋ฅผ ์ ํํด์ฃผ์ธ์");
//			System.out.println("1.๋ฑ๋ก 2.์กฐํ 3.๋ณ๊ฒฝ 4.์ญ์ ");
//			menu=sc.nextInt();
//			
//			if(menu==0) {  //0์ ์ ํํ๋ฉด ๋ ์ด์ ์งํ ์ํจ
//				System.out.println("ํ๋ก๊ทธ๋จ์ ์ข๋ฃํฉ๋๋ค.");
//				break;
//			}  
//			
//			//์ผ์ ๊ด๋ฆฌ ํ๋ก๊ทธ๋จ
//			switch(menu) {
//			case 1:
//				System.out.println("๋ฑ๋กํฉ๋๋ค.");
//				break;
//			case 2:
//				System.out.println("์กฐํํฉ๋๋ค.");
//				break;
//			case 3:
//				System.out.println("๋ณ๊ฒฝํฉ๋๋ค.");
//				break;
//			case 4:
//				System.out.println("์ญ์ ํฉ๋๋ค.");
//				break;
//			default: 
//				System.out.println("๋ค๋ฅธ ๋ฉ๋ด๋ฅผ ์๋ ฅํด์ฃผ์ธ์");
//			}
//		}
		
		
		//๐ด๋ฌธ์ 6
		//์๋ฅผ ์๋ ฅ ๋ฐ์์ ์ง์์ ํฉ ๊ตฌํ๊ธฐ (10๊ฐ์ ์ ์๋ ฅ)
		
//		Scanner sc = new Scanner(System.in);
//		
//		int num;
//		int sum=0;
//		for(int i=1;i<=10;i++) {
//			num= sc.nextInt();
//			if(num%2==0) {
//				sum+=num;
//			}
//		}
//
//		System.out.println(sum);
		
		
		
		//๐ด๋ฌธ์ 7,8
//		//๋ณ ํ๋ ์ถ๋ ฅ
//		System.out.println("*");
//		
//		//๋ณ ์ธ๊ฐ์ฉ ์ธ์ถ ์ถ๋ ฅ
//		for(int i=1;i<=3;i++) {
//			System.out.println();
//			for(int n=1;n<=3;n++) {
//				System.out.print("*");
//			}
//		}
		
		
		//๐ด๋ฌธ์ 9
		//9-1๊ตฌ๊ตฌ๋จ ์ถ๋ ฅ
//		for(int i=1;i<=9;i++) {
//			System.out.println("<"+i+"๋จ>");
//			for(int j=1;j<=9;j++) {
//				System.out.println(i+"*"+j+"="+i*j);
//			}
//			
//		}
		
		//9-2์ํ๋ ๋จ ์ถ๋ ฅ
//		Scanner sc = new Scanner(System.in);
//		int num;
//		System.out.println("์ํ๋ ๋จ์ ์๋ ฅํ์ธ์");
//		num = sc.nextInt();
//		
//		for(int j=1;j<=9;j++) {
//			System.out.println(num+"*"+j+"="+num*j);
//		}
		
		
		//๐ด๋ฌธ์ 10
		//์ผ์ ๊ด๋ฆฌ ํ๋ก๊ทธ๋จ(๋ฑ๋ก ๋ฐ ์กฐํ)
		Scanner sc= new Scanner(System.in);
		System.out.println("===์ผ์ ๊ด๋ฆฌ ํ๋ก๊ทธ๋จ===");
		
		int menu;
		String contents="";
		
		while(true) {
			
			System.out.println("๋ฉ๋ด๋ฅผ ์ ํํด์ฃผ์ธ์");
			System.out.println("1.๋ฑ๋ก 2.์กฐํ 3.์ข๋ฃ");
			menu=sc.nextInt();
			
			if(menu==3)break;
			switch(menu) {
			case 1:
				System.out.println("๋ฑ๋กํ  ๋ด์ฉ์ ์๋ ฅํด์ฃผ์ธ์");
				contents = sc.next();
				System.out.println("๋ฑ๋ก๋์์ต๋๋ค.\n");
				break;
			case 2:
				System.out.println("์กฐํํฉ๋๋ค.");
				System.out.println("์กฐํ๋ด์ฉ:"+contents+"\n");
				break;
			default: 
				System.out.println("๋ฉ๋ด๋ฅผ ๋ค์ ์๋ ฅํด์ฃผ์ธ์.");
				break;
			
			}
		}
	}

}
