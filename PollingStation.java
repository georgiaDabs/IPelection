import java.util.Set;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Collection;
public class PollingStation implements PollingStationInterface{
    
    private Set<VoterInterface> voters=new HashSet<VoterInterface>();
    private String address;
    private String name;
    private HashMap<VoterInterface,VoteInterface> votes=new HashMap<VoterInterface, VoteInterface>();
    public PollingStation(String address, String name){
        this.name=name;
        this.address=address;
    }
    public Set<VoteInterface> getVotes(){
        Set<VoteInterface> v=new HashSet<VoteInterface>(votes.values());
        return v;
    }
    public boolean canVote(VoterInterface voter){
        if(voters.contains(voter)){
            return true;
        }else{
            return false;
        }
    }
    public void setName(String name){
        this.name=name;
    }
    public void vote(VoteInterface vote, VoterInterface voter){
        if(canVote(voter)){
            votes.put(voter,vote);
            System.out.println("voted");
        }else{
            System.out.println("voter can't vote");
        }
    }
    public Set<VoterInterface> getVoters(){
        return voters;
    }
    public void addVoter(VoterInterface voter){
        voters.add(voter);
    }
    public String getAddress(){
        return address;
    
    }
    public void setAddress(String address){
        this.address=address;
    }
    public String getName(){
        return name;
    }
    public void setName(){
        this.name=name;
    }
    public int voteCount(CandidateInterface candidate){
        int voteCount=0;
        for(VoteInterface vote: votes.values()){
            if (!vote.isSpoiled()){
                if(vote.getCandidate()==candidate){
                    voteCount++;
                }
            }
        }
        return voteCount;
    }
}
