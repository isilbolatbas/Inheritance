import java.util.Scanner;

public class Test {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		System.out.print("Hosgeldiniz cikolata için 1 icecek için 2ye basiniz= ");
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
				System.out.print("kac tane alacaksiniz?");
				Scanner s = new Scanner(System.in);
				int tane = s.nextInt();
				System.out.println("Toplam Bitter Fiyat =" + tane * bitterToplam);
				break;

			case 2:
				System.out.print("kac tane alacaksiniz");
				Scanner ss = new Scanner(System.in);
				int tanee = ss.nextInt();
				System.out.println("Toplam Sutlu Fiyat =" + tanee * sutluToplam);
				break;

			case 3:
				System.out.print("kac tane alacaksiniz");
				Scanner sss = new Scanner(System.in);
				int taneee = sss.nextInt();
				System.out.println("Toplam Kuvertur Fiyat =" + taneee * kuverturToplam);
				break;

			}

		} else if (secenek == 2) {
			System.out.print("soguk icecek fiyatlari:");
			SogukIcecek sogukIcecek = new SogukIcecek(7, 44.9, 8, 35.2, 8, 52.9);
			sogukIcecek.sogukGoruntule();
			System.out.print("sicak icecek fiyatlari");
			SicakIcecek sicakIcecek = new SicakIcecek(10, 3.1, 12, 3.4, 9, 32.5);
			sicakIcecek.sicakGoruntule();
			System.out.print("sicak icecek icin 1 soguk icecek icin 2ye basiniz");

			Scanner icecek = new Scanner(System.in);
			int secim = icecek.nextInt();

			switch (secim) {

			case 1:
				System.out.println("ne alacaksiniz");
				System.out.println("1-Filtre Kahve");
				System.out.println("2-Vanilyali Filtre Kahve");
				System.out.println("3-Elmaa Suyu");

				Scanner sc = new Scanner(System.in);
				int se = sc.nextInt();

				switch (se) {

				case 1:
					System.out.print("Kac tane alacaksiniz");
					Scanner s = new Scanner(System.in);
					int tane = s.nextInt();
					System.out.println("Filtre Kahve Fiyat =" + tane * sicakIcecek.filtreKahve);
					System.out.println("Toplam Kalori=" + tane * sicakIcecek.filtreKahveKalori);
					break;

				case 2:
					System.out.print("Kac tane alacaksiniz");
					Scanner ss = new Scanner(System.in);
					int tanee = ss.nextInt();
					System.out.println("Vanilyali Filtre Kahve Fiyat =" + tanee * sicakIcecek.vanilyaKahve);
					System.out.println("Toplam Kalori=" + tanee * sicakIcecek.vanilyaKahveKalori);
					break;

				case 3:

					System.out.print("Kac tane alacaksiniz");
					Scanner sss = new Scanner(System.in);
					int taneee = sss.nextInt();
					System.out.println("Vanilyali Filtre Kahve Fiyat =" + taneee * sicakIcecek.elmaaSuyu);
					System.out.println("Toplam Kalori=" + taneee * sicakIcecek.elmaaSuyuKalori);
					break;

				}

			case 2:
				System.out.println("ne alacaksiniz");
				System.out.println("1-Portakal Suyu");
				System.out.println("2-Elma Suyu");
				System.out.println("3-Nar Suyu");

				Scanner sx = new Scanner(System.in);
				int scan = sx.nextInt();

				switch (scan) {

				case 1:
					System.out.print("Kac tane alacaksiniz");
					Scanner ss = new Scanner(System.in);
					int tanee = ss.nextInt();
					System.out.println("Portakal Suyu Fiyat =" + tanee * sogukIcecek.portakalSuyuFiyat);
					System.out.println("Toplam Kalori=" + tanee * sogukIcecek.portakalKalori);
					break;

				case 2:
					System.out.print("Kac tane alacaksiniz");
					Scanner s = new Scanner(System.in);
					int tane = s.nextInt();
					System.out.println("Elma Suyu Fiyat =" + tane * sogukIcecek.elmaSuyuFiyat);
					System.out.println("Toplam Kalori=" + tane * sogukIcecek.elmaSuyuKalori);
					break;

				case 3:

					System.out.print("Kac tane alacaksiniz");
					Scanner sss = new Scanner(System.in);
					int taneee = sss.nextInt();
					System.out.println("Nar Suyu Fiyat =" + taneee * sogukIcecek.narSuyuFiyat);
					System.out.println("Toplam Kalori=" + taneee * sogukIcecek.narSuyuKalori);
					break;

				}

			}

		}

	}

}
