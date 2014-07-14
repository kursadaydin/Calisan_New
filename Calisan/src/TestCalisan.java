import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.Locale;


public class TestCalisan {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

	Calisan c1 = new Calisan("Ahmet", "Tanpýnar", new GregorianCalendar(1980,12,25), MedeniHal.BEKAR, Bolum.BURO, vatandaslikDurumu.TR,2500);
	Calisan c2 = new Calisan("Hakan", "Durhan", new GregorianCalendar(1977, 2, 8),  MedeniHal.EVLI, Bolum.INSANKAYNAKLARI, vatandaslikDurumu.DIGER,5400);
	Calisan c3 = new Calisan("Betül", "Ayhan", new GregorianCalendar(1982, 6, 14), MedeniHal.EVLI, Bolum.INSANKAYNAKLARI, vatandaslikDurumu.DIGER,1250.45);
	Calisan c4 = new Calisan("Nurgül", "Karadeniz", new GregorianCalendar(1965, 2, 20), MedeniHal.EVLI, Bolum.INSANKAYNAKLARI, vatandaslikDurumu.DIGER,3452.25);
	Calisan c5 = new Calisan("Tarkan", "Þan", new GregorianCalendar(1985, 8, 28),  MedeniHal.EVLI, Bolum.INSANKAYNAKLARI, vatandaslikDurumu.DIGER,1071.08);
	
	ArrayList<Calisan> calisanList = new ArrayList<Calisan>();
	calisanList.add(c1);calisanList.add(c2);calisanList.add(c3);calisanList.add(c4);calisanList.add(c5);
	
	
	File dosya = new File("F:\\ANDROÝD\\android_exercises\\Calisan\\bin\\calisan.txt");
	dosya.createNewFile();
	
	FileWriter fwriter = new FileWriter(dosya);
	BufferedWriter bwriter = new BufferedWriter(fwriter);
	
	Iterator it = calisanList.iterator();
	while (it.hasNext()) {
		Calisan temp = (Calisan) it.next();
		bwriter.write( "Adý Soyadý : " + temp.getAdCalisan() +" "+ temp.getSoyadCalisan() + " Maaþý : " +  temp.getAylikMaasCalisan() );
		bwriter.write(System.lineSeparator());
	}
	
	bwriter.close();
	
	
	BufferedReader bReader = new BufferedReader(new FileReader("F:\\ANDROÝD\\android_exercises\\Calisan\\bin\\calisan.txt"));
	BufferedWriter bwriter2 = new BufferedWriter(new FileWriter("F:\\ANDROÝD\\android_exercises\\Calisan\\bin\\calisanyazma.txt"));
	
	String line = null;
	while( (line= bReader.readLine())!= null)  {
		
		bwriter2.write(line);
		bwriter2.write(System.lineSeparator());
	}
	
	bwriter2.close();
	
	
	}

}
