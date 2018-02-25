package rabaty;

import konfiguracja.Konfiguracja;

public class ObliczCenePoRabacieProcentowym implements IObliczCenePoRabacie {

	double procentRabatu=Konfiguracja.getInstance().getProcentRabatu();
	@Override
	public double obliczCenePoRabacie(double cena) {
		return  cena - cena * this.procentRabatu/100;
	}

}
