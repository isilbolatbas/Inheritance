
public class SogukIcecek extends Icecek {
	
	double portakalSuyuFiyat;
	double portakalKalori;
	double elmaSuyuFiyat;
	double elmaSuyuKalori;
	double narSuyuFiyat;
	double narSuyuKalori;

	public SogukIcecek(double portakalSuyuFiyat,double portakalKalori,	double elmaSuyuFiyat,double elmaSuyuKalori,double narSuyuFiyat,double narSuyuKalori) {
		// TODO Auto-generated constructor stub
		
		this.portakalSuyuFiyat=portakalSuyuFiyat;
		this.portakalKalori=portakalKalori;
		this.elmaSuyuFiyat=elmaSuyuFiyat;
		this.elmaSuyuKalori=elmaSuyuKalori;
		this.narSuyuFiyat=narSuyuFiyat;
		this.narSuyuKalori=narSuyuKalori;
	}
	
	public void sogukGoruntule() {
		
		System.out.println("Portakal Suyu Fiyat= 8");
		System.out.println("Portakal Suyu Kalori = 44.9");
		System.out.println("Elma Suyu Fiyat = 8");
		System.out.println("Elma Suyu Kalori = 35.2");
		System.out.println("Nar Suyu Fiyat = 8");
		System.out.println("Nar Suyu Kalori = 52.9");
		
	}

}
