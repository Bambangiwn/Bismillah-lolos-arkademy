package gambar;
import java.util.Scanner;
public class gambar {

	public static void main(String[] args) {
		int n,m= 0;
        Scanner input=new Scanner(System.in);
        System.out.print("Masukkan Nilai Lebar= "); n=input.nextInt();
        System.out.print("Masukkan Nilai Panjang= "); m=input.nextInt();
        
        // m variabel yg menampung nilai dari function gambar
        m= gambar(n,m);

	}
	
	public static int gambar(int n, int m){
        if (n % 2 != 0) {
        	if (m % 2 !=0) {
        		for (int i=1; i<=n; i++) {
                	for (int j=1; j<=m; j++) {
                		if	(m % j ==0) {
                			System.out.print("* ");
                		}
                		else {
                			System.out.print("= ");
                		}
                	}
                	System.out.println("");
                }
        	}
        	else {
        		System.out.println("Parameter harus angka dan ganjil!");
        	}
        }
        else {
        	System.out.println("Parameter harus angka dan ganjil!");
        }
		return m;
    }
}
