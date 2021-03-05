package Models;
import Enums.ECandidate;
import Models.Candidate;
import Models.President;

public class President extends Candidate
{
	int number;
	private static int limite = 11;
	
	public President(String nome, String partido, int num, ECandidate ecandidate)
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
		if(numero >= limite && numero <= 99) 
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