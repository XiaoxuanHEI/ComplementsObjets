package muscle;

 public abstract class Statut {
	public abstract Statut connecter(Client c,Statut s) throws ErreurClient;
	public abstract Statut deconnecter() throws ErreurClient;
	
}
