package methods;

public class Main {

	public static void main(String[] args) {
		sayiBulmaca();
		sayiBulmaca();
		sayiBulmaca();  //farklı ekranlara yazdırma
		sayiBulmaca();
		sayiBulmaca();

		//Kod tekrarı yapmamak için fonksiyonlar oluşturuyoruz
	}
	//camelCasing
	public static void sayiBulmaca() {
		int[] sayilar = new int[] { 1, 2, 5, 7, 9 };
		int aranacak = 5;
		boolean varMi = false;

		for (int sayi : sayilar) {
			if (sayi == aranacak) {
				varMi = true;
				break;
			}
		}
		
		String mesaj = "";
		if (varMi) {
			mesaj = "Sayı mevcuttur:" +aranacak;
			mesajVer(mesaj);
		} else {
			mesajVer("Sayı mevcut değildir:" +aranacak);
		}
	}
	public static void mesajVer(String mesaj) {
		System.out.println(mesaj);
	}

}
