/**
 *
 * Interface for a voter in an election. 
 *
 * You should provide a constructor with a String name parameter
 *
 * @author Steven Bradley
 * @version December 2017
 **/

public interface VoterInterface
{
    String getPostcode();
    
    void setPostcode(String postcode);
    
    String getName();
    
    void setName(String name);
}
