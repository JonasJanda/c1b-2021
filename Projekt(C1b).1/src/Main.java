
public class Main {

	public static void main(String[] args) {
		try {
			Osoba osubka = new Osoba("Karel", 17);
			System.out.println(osubka);
		} catch (Exception e) {
			System.out.println("Vek nemuze byt zaporny");
		}
	}

}
