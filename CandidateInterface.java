
public interface CandidateInterface
{
    PartyInterface getParty();
    
    void setParty(PartyInterface party);
    
    String getName();

    /**
     * @return true if and only if the candidate is not associated with a party
     **/
    boolean isIndependent();
}
