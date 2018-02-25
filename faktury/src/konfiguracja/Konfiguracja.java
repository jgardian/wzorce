package konfiguracja;

import rabaty.IObliczCenePoRabacie;
import rabaty.ObliczCenePoRabacieKwotowym;

public class Konfiguracja {
	private static Konfiguracja instance = null;
	
	private Konfiguracja ()
	{}
	public static Konfiguracja getInstance()
	{
		if(instance==null)
			instance=new Konfiguracja();
		
		return instance;
	
	}
	
	public IObliczCenePoRabacie getLiczarkaRabat()
	{
		return new ObliczCenePoRabacieKwotowym();
	}

	public double getKwotaRabatu()
	{
		return 1.0;
	}
	
	public double getProcentRabatu()
	{
		return 10.0;
	}
}
