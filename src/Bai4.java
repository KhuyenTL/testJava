import java.util.Scanner;

public class Bai4 {

	public static void main(String[] args) {
		//  cho một chuỗi. yêu cầu tìm ký tự xuất hiện nhiều nhất trong chuỗi
		Scanner chuoi = new Scanner(System.in);
		System.out.println("Nhap chuoi: ");
		String s = chuoi.nextLine();
		System.out.println("Ky tu xuat hien nhieu nhat trong chuoi la: ");
		kiTuMax(s);
	}
	public static void kiTuMax(String str){
		int maxlength = str.length();
		char chmax ='a',kitu = 'a';
		int max=0;
		int solan[]= new int [10000];
		
		for(int i=0;i<maxlength;i++){
			kitu = str.charAt(i);
			solan[kitu-0]++;
			if(max<solan[kitu-0]){
				max=solan[kitu-0];
				chmax = kitu;
			}
		}
		System.out.println(chmax);
	}
		
}