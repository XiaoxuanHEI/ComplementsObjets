package muscle;

public class CarteFidelite {
	protected double point;
	static final int seuil = 10;
	protected int cheque;
	
	public CarteFidelite() {
		this.point = 0;
		this.cheque = 0;
	}
	
	public void cumuler(double p) {
		point += p;
		if(point >= seuil) {
			cheque += (int)point / seuil;
			point = point % seuil;
		}
	}
	
}
