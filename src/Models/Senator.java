package Models;
import Enums.ECandidate;

public class Senator extends Candidate
{
	int number;
	private static int limite = 111;
	
	public Senator(String nome, String partido, int num, ECandidate ecandidate)
	{
		super(nome, partido, num, ecandidate);
		number = num;
		setNumero(number);
	}
	
	@Override
	public int getCandidateNumber() {
		return number;
	}

	public void setNumero(int numero)
	{
		if(numero >= limite && numero <= 999) 
		{
		this.number = numero;
		}
		else 
		{
			this.number = limite;
			limite--;
		}
	}

}
