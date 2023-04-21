package quiz.video;

public interface VideoService {

	public void add(int bno, String title, String category);

	public void delete(int index);

	public void update(int index);

	public void view();
}
