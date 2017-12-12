public class Party implements PartyInterface{
    private CandidateInterface leader;
    private String name;
    
    public CandidateInterface getLeader(){
        return leader;
    }
    public void setLeader(CandidateInterface leader){
        this.leader=leader;
    }
    public String getName(){
        return name;
    }
}