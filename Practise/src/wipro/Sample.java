package wipro;

public class Sample {
	
	public void m1(int x) {
		System.out.println("Double");
	}
	public void m1(Integer x) {
		System.out.println("Long");
	}
	public static void main(String args[]) {
		Sample s1=new Sample();
		Integer x=10;
		int y=10;
		System.out.println(x==y);
		
	}

}
