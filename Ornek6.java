import java.util.Scanner;

public class Ornek6 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		System.out.println("Birinci sayıyı giriniz");
		int sayı1 = sc.nextInt();
		
		System.out.println("İkinci sayıyı giriniz:");
		int sayı2 = sc.nextInt();
		
		int carpım=sayı1*sayı2;
		
		System.out.println("Çarpım = " + carpım);
        if(carpım < 0)
        	System.out.println("Negatif sayı...");
        else if (0<= carpım && carpım <100) //0 <= çarpım <100
        	System.out.println("Sonuç 100'den küçüktür...");
        else if (100 <=carpım && carpım <200)
        	System.out.println("Sonuç 100'den büyüktür...");
        else
        	System.out.println("Sonuç 200'den büyüktür...");
	}

}
