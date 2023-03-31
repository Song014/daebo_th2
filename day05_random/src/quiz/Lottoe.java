package quiz;

public class Lottoe {
	public static int isSave(int bno) {
		
		return 0;
	}
	
	public static void main(String[] args) {
		
		int tmp=0;
		for(int i=0;i<5;i++) {
			for (int j = 0; j < 6; j++) {
				int bno = (int)(Math.random()*45)+1;
				System.out.print(bno+"\t");
			}
			System.out.println();
		}
		
	}
}


//1에서 45까지의 숫자 중에서 랜덤하게 하나를 선택합니다.
//선택한 숫자가 이전에 이미 선택된 숫자인지를 확인합니다.
//선택한 숫자가 이전에 이미 선택된 숫자라면, 다시 1번으로 돌아가서 다른 숫자를 선택합니다.
//선택한 숫자가 이전에 선택된 숫자가 아니라면, 해당 숫자를 선택된 숫자 목록에 추가합니다.
//선택된 숫자 목록의 크기가 6이 될 때까지 1~4번 과정을 반복합니다.