package Models;

import Enums.ECandidate;

public class Congressman extends Candidate
{
	int number;
	private static int limite = 1111;
	
	public Congressman(String nome, String partido, int num, ECandidate ecandidate)
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
		if(numero >= limite && numero <= 9999) 
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
