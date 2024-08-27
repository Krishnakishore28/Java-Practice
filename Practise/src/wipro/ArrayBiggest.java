package wipro;

public class ArrayBiggest {
	public static void main(String args[]) {
		int biggest,k=0;
		int[][] arr=new int[3][3];
		if(args.length==9) {
			biggest=arr[0][0];
			for(int i=0;i<3;i++) {
				for(int j=0;j<3;j++) {
					arr[i][j]=Integer.parseInt(args[k]);
					System.out.print(arr[i][j]+" ");
					if(biggest<arr[i][j]) {
						biggest=arr[i][j];
					}
					k++;
				}
				System.out.println();
			}
			System.out.println("The biggest number in given array is "+biggest);
		}
		else {
			System.out.println("please enter 9 Integer numbers");
		}
	}

}
