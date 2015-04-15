import java.util.Scanner;

public class Bai4_1 {

	public static void main(String[] args) {
		// Cho một chuỗi. yêu cầu liệt kê số lần xuất hiện của tất cả các ký tự
		Scanner chuoi = new Scanner(System.in);
		System.out.println("Nhập chuỗi: ");
		String s = chuoi.nextLine();
		System.out.println("Số lần các ký tự xuất hiện trong chuỗi là: ");
		kiTuMax(s);
	}
	public static void kiTuMax(String str){
		int maxlength = str.length();
		char ch[] = new char[1000];
		int solan[]= new int[1000];
		char kitu = 'a';
		
		for(int i=0;i<maxlength;i++){
			kitu = str.charAt(i);
			solan[kitu-0]++;
			ch[kitu-0] = kitu;
		}
		int max =0;
		for (int j=0;j<1000;j++){
			if(solan[j]>0){
				System.out.println(ch[j]+" : "+ solan[j]);
			}
			if(max<solan[j]) max = solan[j];
		}
		System.out.println("Cac ky tu xuat hien nhieu nhat la: ");
		for(int k=0;k<1000;k++){
			if(solan[k]== max) System.out.println(ch[k]);
		}
		System.out.println("voi so lan xuat hien la: "+max);
	}
		
}