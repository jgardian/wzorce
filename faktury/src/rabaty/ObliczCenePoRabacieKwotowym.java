package rabaty;

import konfiguracja.Konfiguracja;

public class ObliczCenePoRabacieKwotowym implements IObliczCenePoRabacie {

	double KwotaRabatu=Konfiguracja.getInstance().getKwotaRabatu();
	@Override
	public double obliczCenePoRabacie(double cena) {
		return -10;
	}

}
