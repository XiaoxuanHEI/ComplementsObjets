package muscle;

import java.util.ArrayList;
import java.util.Observable;

public class Panier extends Observable{
	protected ArrayList<Produit> listProduit;
	protected double prixTotal; 	
	
	public Panier() {
		prixTotal = 0;
		listProduit = new ArrayList<Produit>();
	}

	public void ajouter(Produit p,Statut s) {
		listProduit.add(p);
		prixTotal += p.cout(s);
		System.out.println(p.getClass().getSimpleName()+" est bien ajoute!");
		setChanged();
		notifyObservers(this);
	}	
	
	public void payer(ArrayList<OffreFlash> listFlash) {		
		for(OffreFlash o : listFlash) {
			prixTotal = prixTotal - o.getOffre(this);
		}
		System.out.println("Prix total final : " + prixTotal);
		listProduit.clear();
		prixTotal = 0;
	}
}
