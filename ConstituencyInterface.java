import java.util.Set;

/**
 *
 * Interface for constituency in an election. Each constituency has many polling stations where voters can vote.
 *
 * You should provide a constructor with a String name parameter
 *
 * @author Steven Bradley
 * @version December 2017
 **/
public interface ConstituencyInterface
{
    Set<CandidateInterface> getCandidates();
    
    void addCandidate(CandidateInterface candidate);
    
    Set<PollingStationInterface> getPollingStations();
    
    void addPollingStation(PollingStationInterface pollingStation);
    
    String getName();
    
    void setName(String name);

    /** 
     * @return the total number of votes cast for the given candidate in this constituency at any polling station
     **/
    int voteCount(CandidateInterface candidate);

    /**
     * @return the candidate with the most votes in this constituency
     */
    CandidateInterface winner();
}
