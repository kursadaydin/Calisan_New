import java.text.NumberFormat;
import java.util.Calendar;
import java.util.Currency;
import java.util.Locale;


public class Calisan {
	
	/*Çalýþan vatandaþlýk durumuna göre maaþ almaktadýr. AB vatandaþý ise Euro
	Türk vatandaþý ise TL almaktadýr.*/
	
	private String adCalisan;
	private String soyadCalisan;
	private Calendar dogumTarihiCalisan;
	private double aylikMaasCalisan;
	private MedeniHal medeniHal;
	private Bolum birimCalisan;
	private vatandaslikDurumu yerli_yabanciCalisan;
	
	
	
	Calisan(String adCalisan, String soyadCalisan,
			Calendar dogumTarihiCalisan, MedeniHal medeniHal, Bolum birimCalisan, vatandaslikDurumu yerli_yabanciCalisan, double aylikMaasCalisan) {
		super();
		this.adCalisan = adCalisan;
		this.soyadCalisan = soyadCalisan;
		this.dogumTarihiCalisan = dogumTarihiCalisan;
		this.medeniHal = medeniHal;
		this.birimCalisan= birimCalisan;
		this.yerli_yabanciCalisan=yerli_yabanciCalisan;
		this.aylikMaasCalisan=aylikMaasCalisan;
		
	}

	public String getAdCalisan() {
		return adCalisan;
	}

	public void setAdCalisan(String adCalisan) {
		this.adCalisan = adCalisan;
	}

	public String getSoyadCalisan() {
		return soyadCalisan;
	}

	public void setSoyadCalisan(String soyadCalisan) {
		this.soyadCalisan = soyadCalisan;
	}

	public Calendar getDogumTarihiCalisan() {
		return dogumTarihiCalisan;
	}

	public void setDogumTarihiCalisan(Calendar dogumTarihiCalisan) {
		this.dogumTarihiCalisan = dogumTarihiCalisan;
	}

		
	// Çalýþan kiþinin uyruk durumuna göre ödenen ücretin Euro yada TL olarak belirliyor.

	public String getAylikMaasCalisan() {
		if (yerli_yabanciCalisan == vatandaslikDurumu.DIGER) {
			
		return	maasAB(aylikMaasCalisan);
			
		}else {
			
		return	maasTR(aylikMaasCalisan);
		
		}
	}

	public void setAylikMaasCalisan(double aylikMaasCalisan) {
		this.aylikMaasCalisan=aylikMaasCalisan;
		
				
	}

	public MedeniHal isMedeniHal() {
		return medeniHal;
	}

	public void setMedeniHal(MedeniHal medeniHal) {
		this.medeniHal = medeniHal;
	}
	
	
	public static String maasAB (double maas){
		
		Locale abUyesi= Locale.FRANCE;
		
		NumberFormat frm = NumberFormat.getCurrencyInstance(abUyesi);
		String duzeltilmisMaas = frm.format(maas);
		
		return duzeltilmisMaas;
	}
	
	public static String maasTR (double maas){
		
				
		NumberFormat frm = NumberFormat.getCurrencyInstance();
		String duzeltilmisMaas = frm.format(maas);
		
		return duzeltilmisMaas;
	}

	
}
