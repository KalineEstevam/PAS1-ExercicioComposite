package calc;

import java.util.ArrayList;
import java.util.List;

/**
** Jéssyca Ferreira
*/
public class Divisao implements Iexpressao {
	
	private List <Iexpressao> num = new ArrayList<Iexpressao>();
	
	public Divisao(){
		
		
	}
	
	public void add(Iexpressao n){
		num.add(n);
	}
	
	public int avaliar(){
		int result = 1;
		for(int i=0; i < num.size(); i++)
			result = num.get(i).avaliar()/result;
		return result;
	}
}