package muscle;

public class Adherent extends Statut{
	protected CarteFidelite cf;

	public Statut connecter(Client c,Statut s) throws ErreurClient{
		throw new ErreurClient("Deja connecte");
	};
	
	public Statut deconnecter() throws ErreurClient{
		return new Simple();
	}
}
