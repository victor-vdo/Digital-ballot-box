package Models;

import Enums.ECandidate;

public class Candidate 
{
	protected String Name;
	protected String CandidateParty;
	protected int Number;
	protected ECandidate ECandidate;
	protected static long numVotes=0;
	
	public Candidate(String name, String candidateParty,int number, ECandidate ecandidate) 
	{
		this.Name = name;
		this.CandidateParty = candidateParty;
		this.Number = number;
		this.ECandidate = ecandidate;
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