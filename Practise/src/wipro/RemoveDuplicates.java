package wipro;
import java.util.*;
public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {12,34,12,45,67,89};
		int n=arr.length;
		Set<Integer> set=new HashSet<Integer>();
		for(int j=0;j<n;j++) {
			if(!set.contains(arr[j])){
				set.add(arr[j]);
			}
		}
		int[] temp=new int[set.size()];
		for(int i:set) {
			System.out.println(i);
		}
	}

}
