import java.util.Set;
import java.util.HashMap;
public class Constituency implements ConstituencyInterface{
    private Set<CandidateInterface> candidates;
    private Set<PollingStationInterface> pollingStations;
    private String name;
    private Set<Voter> registeredVoters;
    public Set<CandidateInterface> getCandidates(){
        return candidates;
    }
    public void addCandidate(CandidateInterface candidate){
        candidates.add(candidate);
    }
    public Set<PollingStationInterface> getPollingStations(){
        return pollingStations;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public int voteCount(CandidateInterface candidate){
        int voteCount=0;
        for(Voter voter: registeredVoters){
            if(!voter.getVote().isSpoiled()){
                if(voter.getVote().getCandidate()==candidate){
                    voteCount++;
                }
            }
        }
        return voteCount;
    }
    public CandidateInterface winner(){
        CandidateInterface winner=null;
        int highest=0;
        for(CandidateInterface c:candidates){
            if(voteCount(c)>highest){
                winner=c;
                highest=voteCount(c);
            }
        }
        return winner;
    }
    public void addPollingStation(PollingStationInterface pollingStation){
        pollingStations.add(pollingStation);
    }
}