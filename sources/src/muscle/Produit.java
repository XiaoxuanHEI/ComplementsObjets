package muscle;

import java.util.ArrayList;

public class Produit {
	protected double prix;
	protected ArrayList<OffreD1Produit> listOffre;	
	
	public Produit(double prix) {
		this.prix = prix;
		listOffre = new ArrayList<>();	
	}



	public double cout(Statut s) {
		for(OffreD1Produit o : listOffre) {
			prix = prix - o.getOffre(s);
		}
		return prix;
	}
	
}
