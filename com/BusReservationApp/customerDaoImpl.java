package com.BusReservationApp;

import com.DataBaseUtil.DButil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class customerDaoImpl implements customerDao {
    @Override
    public String registerCustomer(String fName, String lName, String currLoc, String destination, String date) {
        String message = "data not inserted";
        try(Connection con = DButil.provideConnection()){
            PreparedStatement ps = con.prepareStatement("insert into customer values(?,?,?,?,?)");

            ps.setString(1,fName);
            ps.setString(2,lName);
            ps.setString(3,currLoc);
            ps.setString(4,destination);
            ps.setString(5,date);

            int x = ps.executeUpdate();
            if(x>0){
                message = "Customer data added";
            }

        }catch (SQLException e){
            message = e.getMessage();
        }
        return message;
    }

    @Override
    public String bookTicket(String route, int noOfSeats) {
        String result = null;
        String message= null;
        try (Connection con = DButil.provideConnection()){
            PreparedStatement p = con.prepareStatement("update admin set seats = seats-noOfSeats where busRoute = route");

            int x = p.executeUpdate();
            if(x>0){
                message = "Customer data added";
            }
            PreparedStatement ps = con.prepareStatement("select * from admin where busRoute = ?");
            ps.setString(1,route);
            ResultSet rs =  ps.executeQuery();
            if(rs.next()){
                String b = rs.getString("busName");
                String r = rs.getString("busRoute");
                String t = rs.getString("busType");
                String ar = rs.getString("arTime");
                String dp = rs.getString("depTime");
                int s = rs.getInt("seats");
//                s = s-noOfSeats;

                result =  (" Bus Name: "+b+"\n Bus Route: "+r+"\n Bus type: "+t+"\n Arrival Time: "+ar+"\n Departure Time: "+dp+"\n Seats after booking: "+s);
            }

        }catch (SQLException e){
            result = e.getMessage();
            message = e.getMessage();
        }
        return message + "\n" +result;

    }

    @Override
    public String cancelTicket( String fn, String ln) {
        String message = "Ticket canceled";
        try(Connection con = DButil.provideConnection()){
            PreparedStatement p = con.prepareStatement("delete from customer where fname = fn && lname = ln");

           p.executeUpdate();

        }catch (SQLException e){
            message = e.getMessage();
        }
        return message;
    }


}
