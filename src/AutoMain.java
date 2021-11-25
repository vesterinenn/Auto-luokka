
public class AutoMain {

	public static void main(String[] args) {
		
		Auto auto1 = new Auto();
		auto1.merkki = "BMW";
		auto1.malli = "116i";
		auto1.bensanMaara = 40;
		
		auto1.naytaTiedot();
		auto1.kiihdyta();
		auto1.naytaTiedot();

	}

} //AutoMain loppuu

class Auto{
	
	public String merkki, malli;
	public int bensanMaara;
	
	public void jarruta()
	{
		System.out.println("Auto jarruttaa");
	}
	
	public void kiihdyta()
	{
		bensanMaara--;
		System.out.println("Auto kiihtyy");
	}
	
	public void naytaTiedot()
	{
		System.out.println("Merkki: " + merkki);
		System.out.println("Malli: " + malli);
		System.out.println("Bensan m‰‰r‰: " + bensanMaara);
	}
	
} //Auto-luokka loppuu
