
public class Sutlu extends Cikolata  {
	public Sutlu(double kakaoOrani, double suttozu, double kakaoYagi, double diger, double gram) {
		
		super(kakaoOrani,suttozu,kakaoYagi, diger, gram);
		
	}
	
	
	public double sutluHesapla() {
		
		double sutluGramFiyat = ((kakaoOrani*0.3) + (suttozu*0.05) + (kakaoYagi*0.2) + (diger*0.01))*gram;
		System.out.println("sutlu gram fiyat=" + sutluGramFiyat);
		return sutluGramFiyat;
		
	}

}
