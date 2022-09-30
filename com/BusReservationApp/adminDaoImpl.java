package com.BusReservationApp;

import com.DataBaseUtil.DButil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class adminDaoImpl implements adminDao{
    public static void main(String[] args) {

    }

    @Override
    public String registerAdmin(String busName, String busRoute, String busType, String arTime, String depTime, int seats) {

        String message = "data not inserted";
        try(Connection con = DButil.provideConnection()){
            PreparedStatement ps = con.prepareStatement("insert into admin values(?,?,?,?,?,?)");

            ps.setString(1,busName);
            ps.setString(2,busRoute);
            ps.setString(3,busType);
            ps.setString(4,arTime);
            ps.setString(5,depTime);
            ps.setInt(6,seats);

            int x = ps.executeUpdate();
            if(x>0){
                message = "Bus data added";
            }

        }catch (SQLException e){
                message = e.getMessage();
        }
        return message;
    }
}
