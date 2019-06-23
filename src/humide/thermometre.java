package humide;

import java.util.ArrayList;

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

	 public void sethum( int ther) {
	 	this.ther =ther;
	 	super.notify();
	 }
}
