package Models;


public class Senator extends Candidate
{
	int numero;
	private static int limite = 111;
	
	public Senator(String nome, String partido, int numero)
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
		if(numero >= limite && numero <= 999) 
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
