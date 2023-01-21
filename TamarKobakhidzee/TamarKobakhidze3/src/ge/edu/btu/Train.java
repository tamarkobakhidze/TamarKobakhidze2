package ge.edu.btu;

import java.util.ArrayList;
import java.util.List;



public class Train {
    List<Passenger>passengerList;

    public Train() {
        passengerList=new ArrayList<>();
    }

    public void AddPassenger(Passenger passenger){
        if(passenger.haveTicket()){
            passengerList.add(passenger);
        }
    }

    public List<Passenger> getPassengerList() {
        return passengerList;
    }
}
