package com.busAppUseCases;

import com.BusReservationApp.customerDaoImpl;

import java.util.Scanner;

public class registerCustomer {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter customer first name");
//        String fName = sc.nextLine();
//
//        System.out.println("Enter customer last name");
//        String lName = sc.nextLine();

        System.out.println("Enter customer current Loc");
        String currLoc = sc.nextLine();

        System.out.println("Enter customer destination");
        String destination = sc.nextLine();

//        System.out.println("Enter customer Departure date");
//        String date = sc.nextLine();

        System.out.println("Enter number of seats customer  to book");
        int seats = sc.nextInt();


        customerDaoImpl dao = new customerDaoImpl();

//        String result = dao.registerCustomer(fName,lName,currLoc,destination,date);
        String route = currLoc+" to "+destination;
        String ans = dao.bookTicket(route,seats);

//        System.out.println(result);
        System.out.println(ans);
    }
}
