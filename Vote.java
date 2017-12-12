import java.util.ArrayList;
public class Vote implements VoteInterface{
    ArrayList<CandidateInterface> candidates=new ArrayList<CandidateInterface>();
    public void addCandidate(CandidateInterface candidate){
        candidates.add(candidate);
    }
    public boolean isSpoiled(){
        if(candidates.size()>1){
            return true;
        }else{
            return false;
        }
    }
    public CandidateInterface getCandidate(){
        return candidates.get(0);
    }
    
}
