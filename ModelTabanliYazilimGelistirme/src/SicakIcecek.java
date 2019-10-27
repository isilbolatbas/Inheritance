
public class SicakIcecek extends Icecek {
	
	double filtreKahve;
	double filtreKahveKalori;
	double vanilyaKahve;
	double vanilyaKahveKalori;
	double elmaaSuyu;
	double elmaaSuyuKalori;
	
	public SicakIcecek(double filtreKahve,
	double filtreKahveKalori,
	double vanilyaKahve,
	double vanilyaKahveKalori,
	double elmaaSuyu,
	double elmaaSuyuKalori) {
		
		this.filtreKahve=filtreKahve;
		this.filtreKahveKalori=filtreKahveKalori;
		this.vanilyaKahve=vanilyaKahve;
		this.vanilyaKahveKalori=vanilyaKahveKalori;
		this.elmaaSuyu=elmaaSuyu;
		this.elmaaSuyuKalori=elmaaSuyuKalori;
		
	}
	
	public void sicakGoruntule() {
		
		System.out.println("Filtre Kahve Fiyat= 8");
		System.out.println("Filtre Kahve Kalori = 44.9");
		System.out.println("Vanilyalý Kahve Fiyat = 8");
		System.out.println("Vanilyalý Kahve Kalori = 35.2");
		System.out.println("Elmaa Suyu Fiyat = 8");
		System.out.println("Elmaa Suyu Kalori = 52.9");
		
	}

}
