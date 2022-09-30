package com.busAppUseCases;

import com.BusReservationApp.adminDaoImpl;

import java.util.Scanner;

public class registerAdmin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String loginId = "admin";
        String password = "1234";

        System.out.println("Enter login Id");
        String login  = sc.next();

        System.out.println("Enter password");
        String pass = sc.next();

        if(loginId.equals(login) && password.equals(pass)){
            System.out.println("Admin login successfully");
            System.out.println("Enter bus name");
            String busName = sc.nextLine();

            System.out.println("Enter bus Route");
            String busRoute = sc.nextLine();

            System.out.println("Enter bus Type");
            String busType = sc.nextLine();

            System.out.println("Enter bus arrival date and time");
            String arTime = sc.nextLine();

            System.out.println("Enter bus Departure date and time");
            String depTime = sc.nextLine();

            System.out.println("Enter number of seats in bus");
            int seats = sc.nextInt();

            adminDaoImpl dao = new adminDaoImpl();

            String result = dao.registerAdmin(busName,busRoute,busType,arTime,depTime,seats);
            System.out.println(result);
        }
        else{
            System.out.println("Please enter a valid Id and Password to login-----");
        }





    }
}
