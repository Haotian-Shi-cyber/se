public class Lopx extends Exception {
	private int max;
	
	public Lopx(int m)	{
		super("Lot size limit exceeded");
		max = m;
	}
	
	public int getSize() { return max; }
}
