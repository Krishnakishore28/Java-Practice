package wipro;

public class ArrayIsNumPresent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,4,34,54,7};
		int key=8;
		boolean flag=false;
		for(int i=0;i<arr.length;i++) {
			if(key==arr[i]) {
				flag=true;
				System.out.println(i);
				break;
			}
		}
		if(!flag) {
			System.out.println(-1);
		}
	}

}
