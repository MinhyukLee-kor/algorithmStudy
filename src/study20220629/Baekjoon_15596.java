package study20220629;

public class Baekjoon_15596 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		class Test{
			public long sum(int[] a) {
				long sum = 0;
				
				for(int i=0;i<a.length;i++) {
					sum = sum + a[i];
				}
				
				return sum;
			}
		}	
	}

}
