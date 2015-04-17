
public class Bai8 {

	public static void main(String[] args) {
//		Hai số tạo thành một cặp số thân thiết khi chúng tuân theo quy luật: Số này bằng tổng tất cả các ước của số kia (trừ chính số đó) và ngược lại
//		Ví dụ: 220 và 284
//		Số 220 ngoài bản thân nó ra, nó còn có 11 ước số là 1, 2, 4, 5, 10, 11, 20, 44, 55 và 110. 
//		Tổng của 11 ước số này vừa đúng bằng 284. 
//		Ngược lại, số 284 ngoài bản thân nó, nó còn 5 ước số khác là: 1, 2, 4, 71, 142, 
//		tổng của chúng cũng vừa đúng bằng 220
//		Viết chương trình liệt kê các cặp số thân thiết nhỏ hơn 10000
		System.out.println("List cac cap so than thiet la: ");
		Sothanthiet();
	}
	public static void Sothanthiet (){
		for (int i = 0; i < 10000 ; i++){
			int t = tongUoc(i);
			if (t > i ){
				if (tongUoc(t) == i){
					System.out.println(i + " and " + t);
				}
			}
		}
	}
	public static int tongUoc(int a){
		int tong =0;
		for (int j = 1; j<= a/2 ; j++){
			if (a%j == 0) {
				tong = tong + j;
			}
		}
		return tong;
	}
}
