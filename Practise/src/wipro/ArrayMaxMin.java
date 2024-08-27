package wipro;

public class ArrayMaxMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {5,3,7,2,9,2};
		int max=nums[0],min=nums[0];
		for(int i:nums) {
			if(i>max) {
				max=i;
			}
			if(i<min) {
				min=i;
			}
		}
		System.out.println("Maximum value is "+max);
		System.out.println("Minimum value is "+min);
	}

}
