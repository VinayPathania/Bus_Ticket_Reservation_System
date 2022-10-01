package com.BusReservationApp;

public interface customerDao {
    public String registerCustomer(String fName, String lName, String currLoc, String destination, String date);

    public String bookTicket(String route, int noOfSeats);

    public String cancelTicket(String s);
}
