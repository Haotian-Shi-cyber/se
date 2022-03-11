/* exception class */
package assess2;

public class Lopx extends Exception {
	private int max;
	
	public Lopx(int m)	{
		super("size limit exceeded");
		max = m;
	}
	
	public int getSize() { 
		return max; 
	}
}
