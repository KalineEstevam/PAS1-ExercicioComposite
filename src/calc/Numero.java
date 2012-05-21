package calc;

public class Numero implements Iexpressao {
	private int n;
	
	public Numero(int n) {
		this.n = n;
	}
	
	public int avaliar() {
		return n;
	}

	@Override
	public void add(Iexpressao e) throws Exception {
		throw new Exception();
		
	}
}
