
public class AutoMain {

	public static void main(String[] args) {
		
		Auto auto1 = new Auto();
		auto1.merkki = "BMW";
		auto1.malli = "116i";
		auto1.bensanMaara = 40;
		
		auto1.naytaTiedot();
		auto1.kiihdyta();
		auto1.naytaTiedot();
		auto1.tankkaa(5);

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
		if(bensanMaara > 0)
		{
			System.out.println("Auto kiihtyy");
		}
		else {}
	}
	
	public void tankkaa(int t)
	{
		System.out.println("Tankissa bensaa: " + bensanMaara);
		System.out.println("Tankkaus: " + t);
		bensanMaara = bensanMaara + t;
		System.out.println("Tankissa bensaa tankkauksen jälkeen: " + bensanMaara);
	}
	
	public void naytaTiedot()
	{
		System.out.println("Merkki: " + merkki);
		System.out.println("Malli: " + malli);
		System.out.println("Bensan määrä: " + bensanMaara);
	}
	
} //Auto-luokka loppuu
