
public class AutoMain {

	public static void main(String[] args) {
		
//		Auto auto1 = new Auto();
//		auto1.merkki = "BMW";
//		auto1.malli = "116i";
//		auto1.bensanMaara = 40;
		
//		auto1.naytaTiedot();
//		auto1.kiihdyta();
//		auto1.naytaTiedot();
//		auto1.tankkaa(5);
		
		Auto auto2 = new Auto("Porsche", "Panamera", 10);
		auto2.kiihdyta();
		auto2.jarruta();
		auto2.naytaTiedot();
		auto2.tankkaa(40);

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
		System.out.println("Tankissa bensaa tankkauksen j?lkeen: " + bensanMaara);
	}
	
	public void naytaTiedot()
	{
		System.out.println("Merkki: " + merkki);
		System.out.println("Malli: " + malli);
		System.out.println("Bensan m??r?: " + bensanMaara);
	}
	
	//Oletuskonstruktori
	public Auto()
	{
		merkki = "";
		malli = "";
		bensanMaara = 0;
		naytaTiedot();
	}
	
	//Parametrinen konstruktori
	public Auto(String merkki, String malli, int bensanMaara)
	{
		this.merkki = merkki;
		this.malli = malli;;
		this.bensanMaara = bensanMaara;
		naytaTiedot();
	}
	
} //Auto-luokka loppuu
