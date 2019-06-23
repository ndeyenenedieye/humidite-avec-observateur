package humide;

import java.util.ArrayList;

public abstract class Abstraithumide {
	private ArrayList<IObservateur> ListeObs1;
	public ArrayList<IObservateur> getListeObs(){
		   return ListeObs1;	   
	}
   public void abonner(IObservateur io) {
	   ListeObs1.add(io);
   }
   public void desabonner(IObservateur io) {
	   if(io!=null)
	   ListeObs1.remove(io);
   }
   public void notifier(IObservateur io) {
	   for(IObservateur obs :this.getListeObs());
	   IObservateur obs = null;
	obs.update();
   }
public void setListeObs(ArrayList<IObservateur> arrayList) {
	// TODO Auto-generated method stub
	this.ListeObs1 = ListeObs1;
	
}
     
   
}