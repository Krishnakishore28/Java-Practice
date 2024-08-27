package wipro;

public class SumOfAllDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String i=args[0];
		int result=0;
		for(int j=0;j<i.length();j++) {
			result+=Character.getNumericValue(i.charAt(j));
		}
		System.out.println(result);
		
	}

}
