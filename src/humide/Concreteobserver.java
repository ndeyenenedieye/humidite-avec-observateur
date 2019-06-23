package humide;

public class Concreteobserver implements IObservateur{
	public void update() {	
		System.out.println("mettre a jour la liste des observateurs");
	}

	@Override
	public void remove() {
		// TODO Auto-generated method stub
		System.out.println("supprimer un observateur de la liste desabonner");
		
	}

	@Override
	public void add() {
		// TODO Auto-generated method stub
		System.out.println("ajouter un observateur dans la liste d'abonner");
	}

}
