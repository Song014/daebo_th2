package ex04.set;
import java.util.*;
class HashSetEx2 {
	public static void main(String[] args) 	{
		Object[] objArr = {"1",new Integer(1),"3","3","4","2","2","4","4"};
		Set set = new LinkedHashSet();	//  LinkedHashSet순서를 유지한다..
		for(int i=0; i < objArr.length; i++) {
			set.add(objArr[i]);
		}
		System.out.println(set);
	}
}
// 링크드해쉬셋은 순서를 유지해서 중복일때 먼저 들어온게 유지됨