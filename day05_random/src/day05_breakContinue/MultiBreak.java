package day05_breakContinue;

public class MultiBreak {
	public static void main(String[] args) {

		boolean flag = true;
		
		firust:{
			second:{
				third:{
					int k = 100;
					System.out.println("Before the break");
					if(flag) break second;
					System.out.println("this won't execute");
				} //end second
				
				System.out.println("asd asd zxc");
			} //end second
			System.out.println("this is after second break!!!");
		} // end firust
		System.out.println("123456");
	}
}


//식별자 : {
//	식별자2:{
//		
//	}
//}
