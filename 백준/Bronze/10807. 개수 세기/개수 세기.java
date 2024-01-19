import java.util.Scanner;

class Main {
	// 10807번 개수 세기
	public static void main(String[] args) {
		
	
	// 스캐너 객체 생성
	Scanner input = new Scanner(System.in);
	
	// N
	int N = input.nextInt();
	
	// 배열 생성
	int[] intArray = new int[N]; // 배열의 길이 N 설정
	
	for(int i=0; i<intArray.length; i++) {
		intArray[i]=input.nextInt();	// 배열에 입력을 받겠다.
		}
	
	// v
	int v = input.nextInt();
	
	// v가 몇개인지 저장할 변수
	int ans = 0;
	for(int i=0; i<intArray.length; i++) {
		if (intArray[i] == v)
			ans += 1;
		}
	System.out.println(ans);

}
}