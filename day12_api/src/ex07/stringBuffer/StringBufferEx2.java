package ex07.stringBuffer;

public class StringBufferEx2 {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("This");
		System.out.println(sb);

		sb.append(" is pencil");
		System.out.println(sb);
		
		sb.insert(7, " my");
		System.out.println(sb);
		
		sb.setLength(5);
		System.out.print(sb);
		System.out.println(sb.length());
		
		sb.setLength(20);
		System.out.print(sb);
		System.out.println(sb.length());
	}
}
