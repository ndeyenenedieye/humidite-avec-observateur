package humide;

import java.util.ArrayList;

public class Barometre extends Abstraithumide {
        private int hum;
	public Barometre() {
		super();
		this.hum =hum;
		super.setListeObs(new ArrayList<IObservateur>());
		
	}
    public int gethum() {
    	return hum;
    }
    
	public void sethum( int hum) {
		this.hum =hum;
		super.notify();
	}
	
}
