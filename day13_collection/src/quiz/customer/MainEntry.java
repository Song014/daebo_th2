package quiz.customer;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainEntry {
	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc = new Scanner(System.in);
		List<Customer> customer = new ArrayList<>();

		boolean flag = true;
		System.out.println("===========고객 관리 프로그램을 시작합니다.============");
		while (flag) {
			System.out.println("1.고객추가 2.삭제 3.고객리스트 4.수정 5.종료 번호를 입력해주세요.");
			int key = sc.nextInt();
			switch (key) {
			case 1: // 고객 추가
				customerRegist(customer, sc);
				line();
				break;
			case 2: // 삭제
				customerDelete(customer, sc);
				line();
				break;
			case 3: // 고객 리스트
				customerList(customer);
				line();
				break;
			case 4: // 수정
				customerUpdate(customer, sc);
				line();
				break;
			case 5: // 종료
				System.out.println("프로그램을 종료하겠습니다.");
				flag = false;
				break;
			default:
				System.out.println("다시 입력해주세요");
				break;
			}
		}
		sc.close();
	}

	private static void customerUpdate(List<Customer> customer, Scanner sc) {
		System.out.println("수정하실 고객번호를 입력하세요. 0 입력시 뒤로갑니다.");
		Customer user;
		int n;
		do {
			n = sc.nextInt();
			if (n == 0)
				return;
			user = customer.get(n - 1);
		} while (n < 1);

		sc.nextLine();
		System.out.println("수정할 주소를 입력해주세요. 공백을 입력하실 경우 기본값으로 저장됩니다.");
		String addr = sc.nextLine();
		if (!addr.trim().isEmpty())
			user.setAddress(addr);

		System.out.println("수정할 전화번호를 입력해주세요. 공백을 입력하실 경우 기본값으로 저장됩니다.");
		String tel = sc.nextLine();
		if (!tel.trim().isEmpty())
			user.setTel(tel);
	}

	private static void customerList(List<Customer> customer) {
		int i = 1;
		if (!customer.isEmpty()) {
			for (Customer c : customer) {
				System.out.printf("%d번\t%s님 주소: %s 번호: %s\n", i, c.getName(), c.getAddress(), c.getTel());
				i++;
			}
		} else {
			System.out.println("고객이 없습니다.");
		}
	}

	private static void customerDelete(List<Customer> customer, Scanner sc) {
		int bno;
		System.out.println("삭제하실 고객의 번호를 입력해주세요. 0입력시 돌아갑니다");
		bno = sc.nextInt();
		if (bno == 0)
			return;
		customer.remove(bno - 1);
	}

	private static void customerRegist(List<Customer> customer, Scanner sc) {
		sc.nextLine();
		Customer c = new Customer();
		System.out.println("이름을 입력해주세요");
		String name = sc.nextLine();
		System.out.println("주소를 입력해주세요");
		String addr = sc.nextLine();
		System.out.println("전화번호를 입력해주세요");
		String tel = sc.nextLine();
		customer.add(new Customer(name, addr, tel));
	}

	private static void line() {
		System.out.println("========================================================");
	}
}
