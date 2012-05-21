package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import calc.Divisao;
import calc.Iexpressao;
import calc.Multiplicacao;
import calc.Numero;
import calc.Soma;
import calc.Subtracao;

/**
** Kaline Estevam
*/

public class CalcTest {

	@Test
	public void testAvaliacaoDoNumero() {
		Numero n = new Numero(10);
		assertEquals(10, n.avaliar());
	}
	
	@Test
	public void testAvaliacaoDaSoma() {
		Numero n1 = new Numero(1);
		Numero n2 = new Numero(2);
		Soma s = new Soma();
		s.add(n1);
		s.add(n2);
		
		assertEquals(3, s.avaliar());
	}
	@Test
	public void testAvaliacaoDaSoma3() {
		Numero n1 = new Numero(1);
		Numero n2 = new Numero(2);
		Numero n3 = new Numero(5);
		Soma s = new Soma();
		s.add(n1);
		s.add(n2);
		s.add(n3);
		
		assertEquals(8, s.avaliar());
	}
	@Test
	public void testAvaliacaoSomaAvancada() throws Exception{
		Iexpressao n1 = new Numero(1);
		Iexpressao n2 = new Numero(2);
		Iexpressao n3 = new Numero(5);
		Iexpressao s= new Soma();
		s.add(n1);
		s.add(n2);
		Iexpressao s2= new Soma();
	    s2.add(n3);
	    s2.add(s);
		assertEquals(8,s2.avaliar());
		
	}
	
	@Test
	public void testAvaliacaoMult() throws Exception{
			Iexpressao mult = new Multiplicacao();
			Iexpressao n2 = new Numero(2);
			Iexpressao n3 = new Numero(5);
			mult.add(n2);
			mult.add(n3);
			assertEquals(10,mult.avaliar());
	}
	
	@Test
	public void testAvaliacaoMultSoma() throws Exception{
		Iexpressao mult = new Multiplicacao();
		Iexpressao soma=new Soma();
		Iexpressao n2 = new Numero(2);
		Iexpressao n3 = new Numero(5);
		Iexpressao n4 = new Numero(3);
		Iexpressao n5 = new Numero(7);
		mult.add(n2);
		mult.add(n3);
		soma.add(mult);
		soma.add(n5);
		soma.add(n4);
		assertEquals(20,soma.avaliar());
	}
	
	/**
	** Kaline Estevam
	*/
	
	@Test
	public void testAvaliacaoSub() throws Exception{
			Iexpressao sub = new Subtracao();
			Iexpressao s = new Numero(3);
			Iexpressao s1 = new Numero(7);
			sub.add(s);
			sub.add(s1);
			assertEquals(4, sub.avaliar());
	}
	
	@Test
	public void testAvaliacaoDiv() throws Exception{
			Iexpressao div = new Divisao();
			Iexpressao n2 = new Numero(12);
			Iexpressao n3 = new Numero(144);
			div.add(n2);
			div.add(n3);
			assertEquals(12,div.avaliar());
	}
	
	@Test
	public void testAvaliacaoDivSub() throws Exception{
		Iexpressao div = new Divisao();
		Iexpressao sub = new Subtracao();
		Iexpressao n2 = new Numero(2);
		Iexpressao n3 = new Numero(20);
		Iexpressao n4 = new Numero(5);
		Iexpressao n5 = new Numero(5);
		div.add(n2);
		div.add(n3);
		sub.add(div);
		sub.add(n5);
		sub.add(n4);
		assertEquals(0,sub.avaliar());
	}


}
