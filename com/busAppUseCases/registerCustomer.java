package com.busAppUseCases;

import com.BusReservationApp.customerDaoImpl;

import java.util.Scanner;

public class registerCustomer {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);



        System.out.println("====================================================");

            customerDaoImpl dao = new customerDaoImpl();
            System.out.println("Enter customer first name");
            String fName = sc.nextLine();

            System.out.println("Enter customer last name");
            String lName = sc.nextLine();

            System.out.println("Enter customer current Loc");
            String currLoc = sc.nextLine();

            System.out.println("Enter customer destination");
            String destination = sc.nextLine();

            System.out.println("Enter customer Departure date");
            String date = sc.nextLine();


            String result = dao.registerCustomer(fName,lName,currLoc,destination,date);
            System.out.println(result);








    }
}
