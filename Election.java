import java.util.Set;
public class Election implements ElectionInterface{
    private Set<ConstituencyInterface> constituencies;
    private String name;
    private Set<PartyInterface> parties;
    public Set<ConstituencyInterface> getConstituencies(){
        return constituencies;
    }
    public void addConstituency(ConstituencyInterface constituency){
        constituencies.add(constituency);
    }
    public String getName(){
        return name;
    }
    public Set<PartyInterface> getParties(){
        return parties;
        
    }
    public int seatCount(PartyInterface party){
        //code to compile
        int seatCount=0;
        return seatCount;
    }
    public PartyInterface winner(){
        //code to compile
        Party party=new Party();
        return party;
    }
    public CandidateInterface leader(){
        CandidateInterface leader=winner().getLeader();
        return leader;
    }
}