
public class Candidate implements CandidateInterface
{
    private PartyInterface party;
    private String name;
    public PartyInterface getParty(){
        return party;
    }
    public String getName(){
        return name;
    }
    public boolean isIndependent(){
        
        if(party==null){
            return true;
            
        }else{
            return false;
        }
    }
    public void setParty(PartyInterface party){
        this.party=party;
    }
    public Candidate(String name){
        this.name=name;
    }
}
