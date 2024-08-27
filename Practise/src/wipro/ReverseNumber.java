package wipro;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=Integer.parseInt(args[0]);
		int result=0;
		while(i>0) {
			result=result*10+i%10;
			i/=10;
		}
		System.out.println(result);
	}

}
