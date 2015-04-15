
public class Bai3 {

	public static void main(String[] args) {
		// viết chương trình in ra các số hoàn hảo từ 1-1000
		// Số hoàn hảo là số có tổng các ước nhỏ hơn nó bằng chính nó
		System.out.println("Cac so hoan hao tu 1 den 1000 la:");
		for (int so=1;so<=1000;so++)
		{
			if (tongCacUoc(so) == so) 
				System.out.println(so);
		}
		
	}
	public static int tongCacUoc(int n){
		int tong = 0;
		int j =1;
		int a[] = new int[n];
		
		for (int i=1; i<n; i++){
			if (n%i == 0) {
				a[j] = i;
				j++;
			}
		}
				
		for (int k=1; k<=j-1;k++){
			tong = tong + a[k];
		}	
		return tong;
	}
}
