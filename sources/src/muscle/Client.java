package muscle;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Client {
	protected Statut statut;
	protected Panier panier;
	protected ArrayList<Statut> statutPossible;
	public static Map<Client,ArrayList<Statut>> clients = new  HashMap<Client,ArrayList<Statut>>();
	
	public Client(){
		statut = new Simple();
		panier = new Panier();
		statutPossible = new ArrayList<Statut>();
		statutPossible.add(statut);
	}

	public static void ajouterClient(Client c) {
		clients.put(c, c.statutPossible);
	}
	
	public void connecter(Statut s) throws ErreurClient{
		statut = statut.connecter(this,s);
	}
	
	public void deconnecter() throws ErreurClient{
		statut = statut.deconnecter();
	}
	
	public void ajouter(Produit p) {
		panier.ajouter(p,statut);
	}
	
	public void payer(ArrayList<OffreFlash> listFlash) {		
		panier.payer(listFlash);
	}
	
}
