package muscle;

public class ErreurClient extends Exception{	
    public ErreurClient() {
    	super();
    }

    public ErreurClient(String msg) {
    	super(msg);
    }
}
