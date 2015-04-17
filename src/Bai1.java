import java.util.Scanner;

public class Bai1 {
	//viết một hàm, có 2 đối số, trả về số lớn nhất trong 2 số truyền vào
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Nhap a = ");
		double a1 = in.nextDouble();
		System.out.println("Nhap b = ");
		double b1 = in.nextDouble();
		soLonNhat(a1, b1);
	}
	
	public static void soLonNhat(double a, double b){
		System.out.println("MAX = " + Math.max(a,b));
	}
}

