
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ElectionTest
{
    /**
     * Default constructor for test class ElectionTest
     */
    public ElectionTest()
    {

        
    }
    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {

    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void test1()
    {
        Candidate c1=new Candidate("Jez");
        Party p1=new Party("Labour");
        c1.setParty(p1);
        p1.setLeader(c1);
        Constituency co1=new Constituency();
        Constituency co2=new Constituency();
        Constituency co3=new Constituency();
        Constituency co4=new Constituency();
        PollingStation ps11=new PollingStation("ve","igr");
        PollingStation ps12=new PollingStation("ve","igr");
        PollingStation ps13=new PollingStation("ve","igr");
        PollingStation ps14=new PollingStation("ve","igr");

        PollingStation ps21=new PollingStation("ve","igr");
        PollingStation ps22=new PollingStation("ve","igr");
        PollingStation ps23=new PollingStation("ve","igr");
        PollingStation ps24=new PollingStation("ve","igr");
        co1.addPollingStation(ps11);
        co1.addPollingStation(ps12);
        co1.addPollingStation(ps13);
        co1.addPollingStation(ps14);
        co2.addPollingStation(ps21);
        co2.addPollingStation(ps22);
        co2.addPollingStation(ps23);
        co2.addPollingStation(ps24);
        Election e1=new Election();
        Voter v1=new Voter("eca","wcdw");
        ps11.addVoter(v1);
        Voter v2=new Voter("eca","wcdw");
        Vote v=new Vote();
        v.addCandidate(c1);
        ps11.vote(v,v1);
        ps11.vote(v,v2);
        ps12.addVoter(v2);
        ps12.vote(v,v2);
        Election e=new Election();
        e.addConstituency(co1);
        e.addConstituency(co2);
        System.out.println("seats in election--->"+e.seatCount(p1));
        if(co1.winner()!=null){
            System.out.println("winnner of co1--->"+co1.winner().getName());
        }
        System.out.println("seats of jez in ps11 "+ps11.voteCount(c1));
        System.out.println("seats of jez in ps12 "+ps12.voteCount(c1));
    }

}

