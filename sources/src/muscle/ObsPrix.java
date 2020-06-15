package muscle;

import java.util.Observable;

public class ObsPrix extends ObsPanier {
	protected int prixObs;
	
	public ObsPrix(int prixObs) {
		this.prixObs = prixObs;
	}
	
	public void update(Observable o, Object arg) {
		Panier p = (Panier) arg;
		if(p.prixTotal >= prixObs) {
			System.out.println("Alert: Voua avez deja depasse " + prixObs + " euro!");
		}
	}
}
