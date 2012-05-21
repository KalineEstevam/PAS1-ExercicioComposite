package calc;

import java.util.ArrayList;
import java.util.List;

public class Multiplicacao implements Iexpressao {
	
	private List <Iexpressao> num = new ArrayList<Iexpressao>();
	
	public Multiplicacao(){
		
		
	}
	
	public void add(Iexpressao n){
		num.add(n);
	}
	
	public int avaliar(){
		int result = 1;
		for(int i=0; i < num.size(); i++)
			result *= num.get(i).avaliar();
		return result;
	}
	 
}
