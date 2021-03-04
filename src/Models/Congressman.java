package Models;


public class Congressman extends Candidate
{
	int numero;
	private static int limite = 1111;
	
	public Congressman(String nome, String partido, int numero)
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
		if(numero >= limite && numero <= 9999) 
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
