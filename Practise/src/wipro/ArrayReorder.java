package wipro;

public class ArrayReorder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,0,1,0,1,0};
		int j=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				int temp=arr[j];
				arr[j]=arr[i];
				arr[i]=temp;
				j++;
			}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] +" ");
		}
	}

}
