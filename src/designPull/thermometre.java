package designPull;

import java.util.ArrayList;

import humide.Abstraithumide;
import humide.IObservateur;

public class thermometre extends Abstraithumide {
    private int ther;
public thermometre() {
	super();
	this.ther =ther;
	super.setListeObs(new ArrayList<IObservateur>());
	
}
public int gether() {
	return ther;
}

public void sethum( int hum) {
	this.ther =ther;
	super.notify();
}

}

