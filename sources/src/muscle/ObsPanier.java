package muscle;

import java.util.Observable;
import java.util.Observer;

public abstract class ObsPanier implements Observer{	
	public abstract void update(Observable o, Object arg);
}
