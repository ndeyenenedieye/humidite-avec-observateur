package humide;

public class Test {
	private static final String bar = null;
	Abstraithumide t =new thermometre();  
	Barometre b = new Barometre();
	int i=0;
	ConsoleTemp cons = new ConsoleTemp((thermometre)t);
	ConsoleHum consHum= new ConsoleHum(bar);
	journal jour = new journal((designPull.thermometre)
	t.abonner(cons);
	t.abonner(jour);
	bar.abonner(consHum);
	bar.abonner(jour);
	  while(true){
		i++;
		((designPull.thermometre)t).setTemperature(i);
		bar.setHumidite(2+i);
		if(i>=25000)
		 t.desabonner(cons);
	}
	
}	

}
