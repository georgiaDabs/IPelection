import java.util.Set;
import java.util.HashSet;
public class Election implements ElectionInterface{
    private Set<ConstituencyInterface> constituencies=new HashSet<ConstituencyInterface>();
    private String name;
    private Set<PartyInterface> parties=new HashSet<PartyInterface>();
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
        int seatCount=0;
        for(ConstituencyInterface c: constituencies){
            if(!c.winner().isIndependent()){
                if(c.winner().getParty()==party){
                    seatCount++;
                }
            }
        }
        return seatCount;
    }
    public PartyInterface winner(){
        int highest=0;
        PartyInterface party=new Party();
        for(PartyInterface p:parties){
            if(seatCount(p)>highest){
                highest=seatCount(p);
                party=p;
            }
        }
        
        return party;
    }
    public CandidateInterface leader(){
        CandidateInterface leader=winner().getLeader();
        return leader;
    }
    public void result(){
        PartyInterface w=winner();
        float percent=((seatCount(w))/constituencies.size())*100;
        if(percent>50){
            System.out.println(w+" won the majority");
        }else{
            System.out.println(w+" won but not by a majority");
        }
    }
   
    
}