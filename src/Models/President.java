package Models;
import Models.Candidate;
import Models.President;

public class President extends Candidate
{
	int numero;
	private static int limite = 11;
	
	public President(String nome, String partido, int numero)
	{
		super(nome,partido);
		setNumero(numero);
	}
	
	@Override
	public int getCandidateNumber() {
		return numero;
	}

	public void setNumero(int numero)
	{
		if(numero >= limite && numero <= 99) 
		{
		this.numero = numero;
		}
		else 
		{
			this.numero = limite;
			limite--;
		}
	}
}