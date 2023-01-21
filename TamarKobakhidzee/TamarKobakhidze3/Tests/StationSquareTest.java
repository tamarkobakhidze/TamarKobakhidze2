import ge.edu.btu.Passenger;
import ge.edu.btu.Train;
import org.junit.Assert;
import org.junit.Test;
import org.hamcrest.MatcherAssert;
import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

public class StationSquareTest {
    @Test
    public void test(){
        Passenger gio=new Passenger("gio",true);
        Passenger nika=new Passenger("nika",false);
        Passenger ana=new Passenger("ana",true);
        Train train=new Train();
        train.AddPassenger(gio);
        train.AddPassenger(nika);
        train.AddPassenger(ana);
        Assert.assertThat(train.getPassengerList(),hasItem(gio));
        Assert.assertThat(train.getPassengerList(),not(hasItem(nika)));
        Assert.assertThat(train.getPassengerList(),hasItem(ana));


    }

}
