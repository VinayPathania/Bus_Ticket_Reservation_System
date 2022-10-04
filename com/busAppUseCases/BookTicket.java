package com.busAppUseCases;

import com.BusReservationApp.customerDaoImpl;

import java.util.Scanner;

public class BookTicket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("For booking please enter the detail  below");
        customerDaoImpl dao = new customerDaoImpl();

        System.out.println("Enter customer First name");
        String f = sc.nextLine();
        System.out.println("Enter customer Last name");
        String l = sc.nextLine();

        System.out.println("Enter customer current Loc");
        String currLoc = sc.nextLine();

        System.out.println("Enter customer destination");
        String destination = sc.nextLine();

        System.out.println("Enter number of seats customer  to book");
        int seats = sc.nextInt();

        String route = currLoc+" to "+destination;
        String ans = dao.bookTicket(route,seats);
        System.out.println("========================");
        System.out.println("Booking confirmation");
        System.out.println("Customer name");
        System.out.println(f+" "+l);
        System.out.println("Bus detail");
        System.out.println(ans);
        System.out.println("========================");
    }
}
