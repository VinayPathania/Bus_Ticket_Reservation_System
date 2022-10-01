package com.busAppUseCases;

import com.BusReservationApp.customerDaoImpl;

import java.util.Scanner;

public class TicketCancellation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Do you want to cancel ticket ? \n Enter Yes or No");
        String s = sc.next();

        System.out.println("Enter first name");
        String fn = sc.next();

        System.out.println("Enter last name");
        String ln = sc.next();
        customerDaoImpl dao = new customerDaoImpl();

        String result ;
        if(s.equals("Yes")){
             result = dao.cancelTicket(fn,ln);
        }
        else{
            result = "Ticket not canceled";
        }
        System.out.println(result);
    }
}
