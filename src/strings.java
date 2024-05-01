
public class strings {

	public static void main(String[] args) {
		String s1 = "A B C";
		String s2 = "A B C";
		System.out.println(s1);
		System.out.println(s2);
		//String length
		System.out.println("S1 Length:"+s1.length());
		System.out.println("S2 Length:"+s2.length());
		
		String[] s3 = s1.split(" ");
		System.out.println(s3[0]);
		System.out.println(s3[1]);
		System.out.println(s3[2]);
		//String split
		String[] s4 = s2.split("B");
		System.out.println(s4[0]);
		System.out.println(s4[1]);
		//String trim
		System.out.println(s4[1].trim());
	}

}
