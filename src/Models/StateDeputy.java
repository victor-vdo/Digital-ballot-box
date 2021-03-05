package Models;
import Enums.ECandidate;

public class StateDeputy extends Candidate
{
	int number;
	private static int limite = 11111;
	
	public StateDeputy(String name, String politicalParty, int politicalNumber, ECandidate ecandidate)
	{
		super(name,politicalParty, politicalNumber, ecandidate);
		number = politicalNumber;
		setNumber(number);
	}
	
	@Override
	public int getCandidateNumber() {
		return number;
	}

	public void setNumber(int number)
	{
		if(number >= limite && number <= 99999) 
		{
		this.number = number;
		}
		else 
		{
			this.number = limite;
			limite--;
		}
	}

}
