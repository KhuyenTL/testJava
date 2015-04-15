import java.util.Scanner;

public class Bai1 {
	//viết một hàm, có 2 đối số, trả về số lớn nhất trong 2 số truyền vào
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Nhap a = ");
		double a = in.nextDouble();
		System.out.println("Nhap b = ");
		double b = in.nextDouble();
		//Bai1 b1 = new Bai1();
	    Bai1.soLonNhat(a, b);
	}
	
	public static void soLonNhat(double a, double b){
		double max;
		if(a>=b) {
			max = a;
		} else {
			max = b;
		}
		System.out.println(max);
	}
}

