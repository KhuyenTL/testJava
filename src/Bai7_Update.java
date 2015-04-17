import java.util.Scanner;
import java.util.StringTokenizer;

public class Bai7_Update{

	public static void main(String[] args) {
		// chuẩn hóa Tên: delete redundant spaces and correct upper/lower
		Scanner str = new Scanner(System.in);
		System.out.println("Input name: ");
		String name = str.nextLine();
		System.out.println("Correct name: ");
		correctName(name);
	}
	
	public static void correctName(String name){
		//Tach cac tu trong chuoi
		StringTokenizer st = new StringTokenizer(name);
		int tk = st.countTokens();
		String result = ""; 
		
		for (int i = 0; i < tk -1; i++) {
			result = result + upCase(st.nextToken()) + " ";
		} 
		result = result + upCase(st.nextToken());
		System.out.println(result);
	}

//Chuan hoa ki tu hoa thuong
public static String upCase(String s){
	s = s.toLowerCase();
	char kq[] = s.toCharArray();
	String strUpper = s.toUpperCase();
	kq[0] = strUpper.charAt(0);
	s = String.valueOf(kq);
	return s;
	}
}
