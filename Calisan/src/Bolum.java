
public enum Bolum {
	
	MUHASEBE(0,"Muhasebe"),
	SANTÝYE(1,"Þantiye"),
	YONETIM(2,"Yönetim"),
	INSANKAYNAKLARI(3,"Ýnsan Kaynaklarý"),
	BURO(4,"Büro");
	
	
	private int indeks;
	private String aciklama;
	
		
	private Bolum(int indeks, String aciklama) {
		this.indeks = indeks;
		this.aciklama = aciklama;
	}


	public int getIndeks() {
		return indeks;
	}


	public String getAciklama() {
		return aciklama;
	}
	
	
	
	

}
