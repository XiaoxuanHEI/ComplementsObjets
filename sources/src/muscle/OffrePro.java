package muscle;

public class OffrePro extends OffreD1Produit{
	
	public OffrePro(Produit pro, double rabais) {
		super(pro, rabais);
	}
	
	public double getOffre(Statut s) {
		return rabais;
	}
}
