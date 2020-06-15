package muscle;

public class OffreMem extends OffreStatut{
	
	public OffreMem(Produit pro, double rabais) {
		super(pro, rabais);
	}
	
	public double getOffre(Statut s) {
		if(s instanceof Membre) {
			return rabais;
		}
		else return 0;
	}
	
}
