
public class Voter implements VoterInterface{
    private String postcode;
    private String name;
    private VoteInterface vote;
    public String getPostcode(){
        return postcode;
    }
    public void setPostcode(String postcode){
        this.postcode=postcode;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public Voter(String name, String postcode){
        this.name=name;
        this.postcode=postcode;
    }
    
    
}
