package ex03.collection.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapEx {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();

		map.put("thd", "123");
		map.put("qkr", "123");
		map.put("dl", "123");
		map.put("wls", "123");
		map.put("wls", "12"); // key값은 중복이 안되기때문에 나중에 들어온게 덮어씀

		System.out.println("요소 개수" + map.size());
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("id와 password를 입력해주세요.");
			System.out.println("id : ");
			String id = sc.nextLine().trim();
			System.out.println("pwd :");
			String pwd = sc.nextLine().trim();
			
			if(!map.containsKey(id)) {
				System.out.println("입력하신 id는 존재하지 않습니다. 다시 입력해주세요.");
			} else {
				if(!map.get(id).equals(pwd)) {
					System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세요");
				} else {
					System.out.println("아이디와 비밀번호가 일치합니다.");
					break;
				}
				
			}
		}

	}
}
