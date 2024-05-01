
public class javaPractice {

	public static void main(String[] args) {
		//Variables
		System.out.println("Variable declaration!");
		int num = 5;
		String name = "Harish Yemireddy";
		double decimal =10.10;
		char character = 'h';
		boolean value = true;
		
		System.out.println("Value = "+num);
		System.out.println("Name= "+name);
		System.out.println("Decimal value="+decimal);
		System.out.println("Character="+character);
		System.out.println("Boolean Value="+value);
		//Arrays
		int[] arr = new int[5];
		arr[0]=1;
		arr[1]=2;
		arr[2]=3;
		arr[3]=4;
		arr[4]=5;
		System.out.println("First Value:"+arr[0]);
		int[] arr2 = {1,2};
		System.out.println("First Value:"+arr2[0]);
		for(int i=0; i<arr.length; i++) {
			System.out.println("Value:"+arr[i]);
		}
		for(int i=0; i<arr2.length; i++) {
			System.out.println("Value2:"+arr2[i]);
		}
		String[] names = {"Harish","Buddhesh"};
		for(int i=0; i<names.length;i++) {
			System.out.println(names[i]);
		}
		for(String n: names) {
			System.out.println("My name is:"+n);
		}
		int j = 5;
		System.out.println(j%2==0);
		System.out.println(j/2);
	}

}
