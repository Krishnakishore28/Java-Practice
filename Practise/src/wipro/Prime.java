package wipro;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean flag=true;
		int i=Integer.parseInt(args[0]);
		for(int j=2;j<i/2+1;j++) {
			if(i%j==0) {
				flag=false;
				break;
			}
		}
		if (flag){
			System.out.println("Prime");
		}
		else {
			System.out.println("Not Prime");
		}
	}

}
