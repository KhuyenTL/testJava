import java.util.Scanner;

public class Bai7{

	public static void main(String[] args) {
		// chuẩn hóa Tên: delete redundant spaces and correct upper/lower
		Scanner str = new Scanner(System.in);
		System.out.println("Input name: ");
		String name = str.nextLine();
		System.out.println("Correct name: ");
		correctName(name);
	}
	public static void correctName(String name){
		name = name.trim();
		name = name.replaceAll("\\s+", " ");	
		int maxlength = name.length();
		
		//Chuyen chu hoa dau tu
		String upperStr = name.toUpperCase();
		String lowerStr = name.toLowerCase();
		char result[] = new char[maxlength];
		result[0] = upperStr.charAt(0);
		for (int i = 0; i < maxlength-1; i++){
			if (name.charAt(i) == ' ' && name.charAt(i+1) != ' '){
				result[i+1] = upperStr.charAt(i+1);
			} else result[i+1] = lowerStr.charAt(i+1);
		}
		System.out.println(result);
	}
}
