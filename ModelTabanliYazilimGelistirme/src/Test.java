import java.util.Scanner;

public class Test {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		System.out.println("Hosgeldiniz cikolata için 1 icecek için 2ye basiniz= ");
		Scanner scanner = new Scanner(System.in);
		int secenek = scanner.nextInt();

		if (secenek == 1) {

			System.out.println("cikolata gram fiyatlari:");
			Bitter bitter = new Bitter(0.7, 0.1, 0.1, 0.1, 5.9);
			double bitterToplam = bitter.bitterHesapla();
			Sutlu sutlu = new Sutlu(0.25, 0.14, 0.20, 0.41, 5.3);
			double sutluToplam = sutlu.sutluHesapla();
			Kuvertur kuvertur = new Kuvertur(0.338, 0.208, 0.362, 0.05, 1.5, 6.1);
			double kuverturToplam = kuvertur.kuverturHesapla();

			System.out.println("neli cikolata alacaksiniz:");
			System.out.println("1-bitter");
			System.out.println("2-sutlu");
			System.out.println("3-kuvertur");
			Scanner scan = new Scanner(System.in);
			int cikolata = scan.nextInt();

			switch (cikolata) {

			case 1:
				System.out.println("kac tane alacaksiniz?");
				Scanner s = new Scanner(System.in);
				int tane = s.nextInt();
				System.out.println("Toplam Bitter Fiyat =" + tane * bitterToplam);
				System.out.println("Toplam Kalori" );
				break;
				
			case 2:
				System.out.println("kac tane alacaksiniz");
				Scanner ss = new Scanner(System.in);
				int tanee = ss.nextInt();
				System.out.println("Toplam Bitter Fiyat =" + tanee * sutluToplam);
				break;
			
			case 3:
				System.out.println("kac tane alacaksiniz");
				Scanner sss = new Scanner(System.in);
				int taneee = sss.nextInt();
				System.out.println("Toplam Bitter Fiyat =" + taneee * kuverturToplam);
				break;

			}
			
		} else if (secenek == 2) {
			
			

		}

	}

}
