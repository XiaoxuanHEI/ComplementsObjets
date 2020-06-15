package muscle;

public class Membre extends Statut{	
	public Statut connecter(Client c,Statut s) throws ErreurClient{
		throw new ErreurClient("Deja connecte");
	};
	
	public Statut deconnecter() throws ErreurClient{
		return new Simple();
	}

}
