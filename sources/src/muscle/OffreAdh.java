package muscle;

public class OffreAdh extends OffreStatut{

	public OffreAdh(Produit pro, double rabais) {
		super(pro, rabais);
	}
	
	public double getOffre(Statut s) {
		if(s instanceof Adherent) {
			Adherent a = (Adherent) s;
			a.cf.cumuler(rabais);
			return a.cf.cheque;
		}
		else return 0;
	}
}
