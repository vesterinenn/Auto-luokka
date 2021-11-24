
public class AutoMain {

	public static void main(String[] args) {
		

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
