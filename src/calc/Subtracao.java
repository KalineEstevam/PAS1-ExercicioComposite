package calc;

import java.util.ArrayList;
import java.util.List;

/**
** Jéssyca Ferreira
*/

public class Subtracao implements Iexpressao{
	
	private List <Iexpressao> num = new ArrayList<Iexpressao>();
	
	public Subtracao(){
		
		
	}
	
	public void add(Iexpressao n){
		num.add(n);
	}
	
	public int avaliar(){
		int result = 0;
		
		for(int i=0; i < num.size(); i++)
			result = num.get(i).avaliar() - result;
		return result;
	}

}
