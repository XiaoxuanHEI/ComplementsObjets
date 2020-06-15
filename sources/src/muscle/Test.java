package muscle;

import java.util.ArrayList;

public class Test {
	
	static public void main (String[] args) throws Exception{
		//tous les clients
		Client c1 = new Client();
		Client c2 = new Client();
		Client c3 = new Client();
		
		Adherent a1 = new Adherent();	
		Membre m1 = new Membre();
		
		c2.statutPossible.add(a1);
		c2.statutPossible.add(m1);
		c3.statutPossible.add(m1);
		
		Client.ajouterClient(c1);
		Client.ajouterClient(c2);
		Client.ajouterClient(c3);
		
		// tous les produits
		DVD d1 = new DVD(20);
		DVD d2 = new DVD(30);
		
		CD cd1 = new CD(10);
		CD cd2 = new CD(15);

		HighTech h1 = new HighTech(200);
		HighTech h2 = new HighTech(400);
		
		//offres des produits
		OffrePro opFord1 = new OffrePro(d1,5);
		OffrePro opForcd2 = new OffrePro(cd2,5);
		OffreAdh oaForcd2 = new OffreAdh(cd2,5);
		OffreMem omForh2 = new OffreMem(h2,100);
		
		d1.listOffre.add(opFord1);
		cd2.listOffre.add(opForcd2);
		cd2.listOffre.add(oaForcd2);
		h2.listOffre.add(omForh2);
		
		ArrayList<Produit> ap1 = new ArrayList<>();
		ap1.add(d1);
		ap1.add(cd1);
		ap1.add(h1);
		ArrayList<Produit> ap2 = new ArrayList<>();
		ap2.add(cd1);
		ap2.add(h1);
		
		OffreFlash of1 = new OffreFlash(10,ap1);
		OffreFlash of2 = new OffreFlash(5,ap2);
		
		OffreFlash.listFlash.add(of1);
		OffreFlash.listFlash.add(of2);
		
		// tous les observateurs
		ObsPrix obp1 = new ObsPrix(150);
		ObsContenu obc1 = new ObsContenu(ap2);
		c1.panier.addObserver(obp1);
		c2.panier.addObserver(obp1);
		c3.panier.addObserver(obp1);
		c1.panier.addObserver(obc1);
		c2.panier.addObserver(obc1);
		c3.panier.addObserver(obc1);
		
		//Test de Client 1
//		System.out.println("C1 essaie de connecter comme adherent:");
//		c1.connecter(new Adherent());
		c1.panier.ajouter(d1, c1.statut);
		c1.panier.ajouter(cd2, c2.statut);
		c1.panier.ajouter(h1, c1.statut);
		
		System.out.println("Prix total avant payer: "+ c1.panier.prixTotal);		
	
		c1.panier.payer(OffreFlash.listFlash);
		System.out.println();
		
		//Test de Client 2 
		System.out.printf("C2 essaie de connecter comme adherent: ");
		c2.connecter(a1);
		System.out.println("OK!");
		
		System.out.printf("C2 deconnecte: ");
		c2.deconnecter();
		System.out.println("OK!");
		
		System.out.printf("C2 essaie de connecter comme membre: ");
		c2.connecter(m1);
		System.out.println("OK!");
		
		c2.panier.ajouter(cd2, c2.statut);
		c2.panier.ajouter(h1, c2.statut);
		System.out.println("Prix total avant payer: "+ c2.panier.prixTotal);
		c2.panier.payer(OffreFlash.listFlash);
		System.out.println();
		
		//Test de Client 3
		System.out.printf("C3 essaie de connecter comme membre: ");
		c3.connecter(m1);
		System.out.println("OK!");
		
		c3.panier.ajouter(h2, c3.statut);
		System.out.println("Prix total avant payer: "+ c3.panier.prixTotal);
		c3.panier.payer(OffreFlash.listFlash);

	}

}
