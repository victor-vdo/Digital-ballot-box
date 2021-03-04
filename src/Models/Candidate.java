package Models;

public class Candidate 
{
	protected String Name;
	protected String CandidateParty;
	protected static long numVotes=0;
	
	public Candidate(String name, String candidateParty) 
	{
		this.Name = name;
		this.CandidateParty = candidateParty;
	}

	public void increaseVote() 
	{
		numVotes = numVotes++;
	}
	
	public String getName()
	{
		return Name;
	}
	
	public void setName(String name)
	{
		this.Name = name;
	}
	public String getCandidateParty()
	{
		return CandidateParty;
	}
	public void setCandidateParty(String candidateParty) 
	{
		this.CandidateParty = candidateParty;
	}
	public static long getNumVotes()
	{
		return numVotes;
	}
	public void setNumVotes(int numVotes)
	{
		Candidate.numVotes = numVotes;
	}

	public int getCandidateNumber() {
		// TODO Auto-generated method stub
		return 0;
	}
}