
public enum Bolum {
	
	MUHASEBE(0,"Muhasebe"),
	SANT�YE(1,"�antiye"),
	YONETIM(2,"Y�netim"),
	INSANKAYNAKLARI(3,"�nsan Kaynaklar�"),
	BURO(4,"B�ro");
	
	
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
