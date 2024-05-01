import java.util.ArrayList;

public class arrayList {

	public static void main(String[] args) {
		System.out.println("Array List Practice!");
			ArrayList<String> list = new ArrayList<String>();
			//Adding manually
			for(int i=1;i<=10;i++) {
				list.add(String.valueOf(i));
			}
			System.out.println(list);
			for(String s:list) {
				System.out.println(s);
			}
			for(int i=0;i<list.size();i++) {
				System.out.println(list.get(i));
			}
	}

}
