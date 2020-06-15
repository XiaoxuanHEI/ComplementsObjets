package muscle;

import java.util.ArrayList;

public class OffreFlash{
	protected double rebais;
	protected ArrayList<Produit> listPro;
	public static ArrayList<OffreFlash> listFlash = new ArrayList<>();
	
	public OffreFlash(double rebais, ArrayList<Produit> listPro) {
		this.rebais = rebais;
		this.listPro = listPro;	
	}
	
	public static void ajouterFlash(OffreFlash of) {
		listFlash.add(of);
	}
	
	public static void deleteFlash(OffreFlash of) {
		listFlash.remove(of);
	}
	
	public double getOffre(Panier p) {
		boolean found;
		for(Produit p1 : listPro) {
			found = false;
			for(Produit p2 : p.listProduit) {
				if(p1.getClass()==p2.getClass()) {
					found = true;
					break;
				}
			}
			if(!found) return 0;
		}
		return rebais;
	}
}
