package ge.edu.btu;

public class StationSquare {
    public static void main(String[] args) {
        Passenger gio=new Passenger("gio",true);
        Passenger nika=new Passenger("nika",false);
        Passenger ana=new Passenger("ana",true);
        Train train=new Train();
        train.AddPassenger(gio);
        train.AddPassenger(nika);
        train.AddPassenger(ana);
        for (Passenger passenger:train.getPassengerList()) {
            System.out.println(passenger.getName());

        }
    }
}
