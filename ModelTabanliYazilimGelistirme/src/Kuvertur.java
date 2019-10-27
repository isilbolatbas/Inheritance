
public class Kuvertur extends Cikolata {
	
	public double findik;
	
	public Kuvertur(double kakaoOrani, double suttozu, double kakaoYagi, double diger, double gram, double findik) {
		
		super(kakaoOrani,suttozu,kakaoYagi, diger, gram);
		this.findik=findik;
		
	}
	
	public double kuverturHesapla() {
		
		double kuverturGramFiyat = ((kakaoOrani*0.3) + (suttozu*0.05) +  (diger*0.05)+ (findik*0.3)+1.5)*gram;
		System.out.println("kuvertur gram fiyat=" + kuverturGramFiyat);
		return kuverturGramFiyat;
		
	}

}
