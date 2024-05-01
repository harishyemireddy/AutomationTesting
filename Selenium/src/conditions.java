
public class conditions {
	
	public static void main(String[] args) {
		System.out.println("Conditions!!");
		int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
		System.out.println(arr.length);
		for(int i:arr) {
			if(i==0) {
				System.out.println("ZERO"+i);
			}
			else if(i%2==0){
				System.out.println("Multiple of 2:"+i);
			}
			else if(i%3==0){
				System.out.println("Multiple of 3:"+i);
			}
			else if(i%5==0){
				System.out.println("Multiple of 5:"+i);
			}
			else {
				System.out.println("Value="+i);
			}
		}
	}

}
