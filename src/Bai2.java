
import java.util.Scanner;
import java.lang.Math;

public class Bai2 {
// viết hàm giải phương trình bậc 2
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Nhap a = ");
		double a = in.nextDouble();
		System.out.println("Nhap b = ");
		double b = in.nextDouble();
		System.out.println("Nhap c = ");
		double c = in.nextDouble();
		//Bai1 b1 = new Bai1();
	    Bai2.giaiPTbac2(a, b, c);
	}
	
	public static void giaiPTbac2(double a, double b, double c){
		if(a==0) {
			if(b!=0){
				System.out.println("Phuong trinh co 1 nghiem: x = "+ (-c/b));
				}
			else System.out.println("Phuong trinh vo nghiem");
		}
		else {
			double D = Math.pow(b, 2)-4*a*c;
			if(D<0){
				System.out.println("Phuong trinh vo nghiem");
			} else if(D==0) {
				System.out.println("Phuong trinh co 1 nghiem: x = "+(-b/(2*a)));	
			} else {
				System.out.println("Phuong trinh co 2 nghiem: x1 = "+((-b+Math.sqrt(D))/(2*a)));
				System.out.println(" x2 = "+((-b-Math.sqrt(D))/(2*a)));
			}
		}
	}
}