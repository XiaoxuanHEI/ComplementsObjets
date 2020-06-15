package muscle;

public class Simple extends Statut{
	public Statut connecter(Client c,Statut s) throws ErreurClient {
		for(Statut s1 : c.statutPossible)	{
			if(s.getClass() == s1.getClass()) {
				return s1;
			}
		}
		throw new ErreurClient("Vous n'avez pas ce statut!");
	}
	
	public Statut deconnecter() throws ErreurClient {
		throw new ErreurClient("Non connecte");
	}
}
