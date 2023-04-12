package ex07.stringBuffer;

public class StringBufferEx1 {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer(); // 16 character 기본 공간

		System.out.println(sb.hashCode());
		System.out.printf("length\t/\tcapacity\n%d\t%d\n", sb.length(), sb.capacity());

		sb.append("deabo");
		System.out.printf("length\t/\tcapacity\n%d\t%d\n", sb.length(), sb.capacity());

		sb.append("happyvirus");
		System.out.printf("length\t/\tcapacity\n%d\t%d\n", sb.length(), sb.capacity());
		
		sb.append("12345 67890");
		System.out.printf("length\t/\tcapacity\n%d\t%d\n", sb.length(), sb.capacity()); // 32 + 2(null)
		
		sb.append("12345 67890");
		System.out.printf("length\t/\tcapacity\n%d\t%d\n", sb.length(), sb.capacity()); // 34 + 34 + 2(null)
		
		sb.trimToSize(); // 용량크기 조절 자기 용량만큼만 
		System.out.printf("length\t/\tcapacity\n%d\t%d\n", sb.length(), sb.capacity()); // 34 + 34 + 2(null)
		
//		System.out.println(sb.hashCode());
		
	}
}
