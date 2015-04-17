
import java.util.Scanner;

public class Bai6 {

	public static void main(String[] args) {
		// Viết chương trình đổi ngược các chữ cái viết thường thành viết hoa
		// và viết hoa thành viết thường trong chuỗi
		Scanner chuoi = new Scanner(System.in);
		System.out.println("Input string: ");
		String s = chuoi.nextLine();
		System.out.println("Convert result string: ");
		convert(s);
	}
	public static void convert(String str){
		int maxlength = str.length();
		String upperStr = str.toUpperCase();
		String lowerStr = str.toLowerCase();
		char result[] = new char[maxlength];
		for (int i = 0; i < maxlength; i++){
			if(Character.isUpperCase(str.charAt(i))) {
				result[i] = lowerStr.charAt(i);
			} 
			else if(Character.isLowerCase(str.charAt(i))) {
				result[i] = upperStr.charAt(i);
			} else {
				result[i] = str.charAt(i);
			}
		}
		//convert result to String.
		String str1 = String.valueOf(result);
		System.out.println(str1);		
	}
}
