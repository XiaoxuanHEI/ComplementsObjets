package muscle;

public abstract class OffreD1Produit {
	protected Produit pro;
	protected double rabais;
	
	public OffreD1Produit(Produit pro, double rabais) {
		this.pro = pro;
		this.rabais = rabais;
	}
	public abstract double getOffre(Statut s);
}
