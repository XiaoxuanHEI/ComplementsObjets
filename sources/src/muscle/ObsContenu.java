package muscle;

import java.util.ArrayList;
import java.util.Observable;

public class ObsContenu extends ObsPanier{
	protected ArrayList<Produit> proObs;
	
	public ObsContenu(ArrayList<Produit> proObs) {
		this.proObs = proObs;
	}
	
	public void update(Observable o, Object arg) {
		Panier p = (Panier) arg;
		boolean found;
		for(Produit p1 : proObs) {
			found = false;
			for(Produit p2 : p.listProduit) {
				if(p1.getClass()==p2.getClass()) {
					found = true;
					break;
				}
			}
			if(!found) return;
		}
		System.out.print("Alert: Vous avez deja ajoute");
		for(Produit p1 : proObs) {
			System.out.print(" 1 " + p1.getClass().getSimpleName());
		}
		System.out.println("!");
	}
}
