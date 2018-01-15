import java.util.Set;
import java.util.HashSet;
import java.util.HashMap;
public class Constituency implements ConstituencyInterface{
    private Set<CandidateInterface> candidates=new HashSet<CandidateInterface>();
    private Set<PollingStationInterface> pollingStations=new HashSet<PollingStationInterface>();
    private String name;
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
        for(PollingStationInterface ps:pollingStations){
            voteCount+=ps.voteCount(candidate);
        }
        return voteCount;
    }

    public CandidateInterface winner(){
        CandidateInterface winner=null;
        int highest=0;
        if(candidates.isEmpty()){
            return null;
        }else{
            for(CandidateInterface c:candidates){
                if(voteCount(c)>highest){
                    winner=c;
                    highest=voteCount(c);
                }
            }
            return winner;
        }
    }

    public void addPollingStation(PollingStationInterface pollingStation){
        pollingStations.add(pollingStation);
    }
}