package quiz.video;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Map.Entry;

public class VideoM implements VideoService {
	private HashMap<Integer, Video> map = new HashMap<>();
	private Scanner sc = new Scanner(System.in);

	@Override
	public void add(int bno, String title, String category) {
		Video video = new Video(title, category);
		map.put(bno, video);
		System.out.printf("추가된 비디오는\n인덱스:%d\n타이틀 명:%s\n카테고리 명:%s\n", bno, video.getTitle(), video.getCategory());
	}

	@Override
	public void delete(int index) {
		map.remove(index);
		System.out.println("삭제되었습니다.");
	}

	@Override
	public void update(int index) {
		Video v = map.get(index);
		while (true) {
			System.out.println("1.타이틀 2.카테고리 3.대여 4.메뉴로 가기");

			int select = sc.nextInt();
			switch (select) {
			case 1:
				System.out.println("수정하실 타이틀명을 적어주세요.");
				v.setTitle(sc.nextLine());
				break;

			case 2:
				System.out.println("수정하실 카테고리명을 적어주세요. ");
				v.setCategory(sc.nextLine());
				break;

			case 3:
				System.out.println("대여 하시겠습니까? Y/N");
				sc.nextLine();
				char tf = sc.nextLine().charAt(0);
				if (tf == 'Y') {
					System.out.println("대여하시는분의 이름을 적어주세요.");
					String name = sc.nextLine().trim();
					if (!name.isEmpty() && name != null) {
						v.setLend(true);
						v.setLendName(name);
						v.setLendDate(new Date());
					} else {
						v.setLend(false);
					}
				} else {
					System.out.println("메뉴로 돌아값니다");
					break;
				}
				break;

			case 4:
				return;

			default:
				System.out.println("다시 입력하세요");
				break;
			}
		}
	}

	@Override
	public void view() {
		System.out.println("현재 등록된 비디오는");
		Set set = map.entrySet();
		Iterator it = set.iterator();

		while (it.hasNext()) {
			Map.Entry e = (Entry) it.next();
			System.out.println(e.getKey() + ": " + e.getValue());
		}
	}

}
