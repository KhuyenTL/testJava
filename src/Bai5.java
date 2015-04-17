
public class Bai5 {

	public static void main(String[] args) {
		// Viết chương trình liệt kê 20 số Fibonacci đầu tiên trong dãy
		int a=0,b=1;
		System.out.println("List Fibonacci from 1st to 20th: ");
		System.out.println("F[0]=0");
		System.out.println("F[1]=1");
		for(int i=2;i<20;i++){
			int tong = a+b;
			System.out.println("F["+i+"]="+ tong);
			a=b;
			b=tong;
		}
	}
}