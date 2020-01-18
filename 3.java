package menghitungkata;

import java.util.Scanner;

public class hitungkata {
private static String kata[] = new String[1000];
private static String newkata[] = new String[1000];
	//method untuk cek kata yg SAMA
	public static boolean cekKata(int n, String x) {
		//	inisial
		boolean ketemu=false;
		for (int i=0; i<n; i++) {
			//	bila ketemu kata sama
			if	(kata[i].equalsIgnoreCase(x)) {
				ketemu=true;
				break;
			}
		}
		return ketemu;	
	}
	
	public static void main (String args[]) {
		//array
		int jumkata[] = new int [1000];
		int index[] = new int [1000];
		
		//	inisial
		String teks, temp="";
		boolean ketemu=false;
		int a, k, n, m, count=0, jum;
		
		//	input
		System.out.print("Masukkan kalimat= ");
		Scanner obj = new Scanner(System.in);
		teks = obj.nextLine();
		
		//	menentukan kata
		for (int i=0; i<teks.length(); i++) {
			//	jika ditemukan spasi
			if	(teks.charAt(i)==' ') {
				count+=1;
				temp="";
			}
			else {
				temp = temp + teks.charAt(i);
				kata [count] = temp;
			}
		}
		
		n=count+1; //banyaknya kata dlm suatu kalimat
		
		//eliminasi kata yang sama
		k= 0; a= 0;
		for (int i=0; i<n; i++) {
			if (!cekKata(a, kata[i])) {
				
				//bentuk kata baru dalam array
				newkata [k]= kata[i];
				k++;
			}
			a++;
		}
		m=k; //banyaknya kata yang tereliminasi
		
		//penghitungan kata
		for (int i=0; i<m; i++) {
			jum=0;
			for (int j=0; j<n; j++) {
				if (newkata[i].equalsIgnoreCase(kata[j]))
				jum++;
			}
				System.out.println("kata= "+newkata[i]+ "jumlahnya "+jum);
		}
	}
}
