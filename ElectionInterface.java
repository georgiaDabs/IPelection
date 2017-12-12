import java.util.Set;

/**
 *
 * Interface for national Election. The country is divided into constituencies, also known as seats, which are separate geographical areas.
 *
 * You should provide a contructor which takes a String name as a parameter.
 *
 * @author Steven Bradley
 * @version December 2017
 */
public interface ElectionInterface
{
    Set<ConstituencyInterface> getConstituencies();
    
    void addConstituency(ConstituencyInterface constituency);
    
    String getName();

    /**
     * @return all the parties that have put up candidates for the election in any constituency.
     **/
    Set<PartyInterface> getParties();

    /** 
     * @return the number of seats (constituencies) won by the given party
     **/
    int seatCount(PartyInterface party);



    /**
     * @return the part with the most seats
     **/
    PartyInterface winner();

    /**
     * @return If the winning party has more than 50% of the seats then return that party's leader, otherwise return null
     **/
    CandidateInterface leader();
}
