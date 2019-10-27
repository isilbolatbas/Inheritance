
public class  Bitter extends Cikolata {

	public Bitter(double kakaoOrani, double suttozu, double kakaoYagi, double diger, double gram) {
	
		super(kakaoOrani,suttozu,kakaoYagi, diger, gram);
		
	}
	
	public double bitterHesapla() {
		
		double bitterGramFiyat = ((kakaoOrani*0.3) + (suttozu*0.05) + (kakaoYagi*0.2) + (diger*0.01))*gram;
		System.out.println("bitter gram fiyat=" + bitterGramFiyat);
		return bitterGramFiyat;
		
	}
}
