package algorithm20220603;


public class Baekjoon_4673 {

	static int d(int n) {
		
		int sum = n;	//ex 35
		
		while(n !=0) {
			sum = sum + (n%10);	//	일의자리..	ex 5.. 35+5
			n = n/10;	// 일의자리 0으로 바꾸기		ex 3
		}
		return sum;	//리턴된수는 셀프넘버가 아니다
	}
	
	public static void main(String[] args) {
		// 백준 5-2 4683번
		int[] arr = new int[10001];
		
		for(int i=1;i<=10000;i++) {
			int number = d(i);
			if(number<10001) {
				arr[number] = 1;
			}
		}
		for(int i=1;i<10001;i++) {
			if(arr[i]==0) {
				System.out.println(i);
			}
		}

	}

}
