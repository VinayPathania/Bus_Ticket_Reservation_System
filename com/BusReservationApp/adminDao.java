package com.BusReservationApp;

public interface adminDao {
        public String registerAdmin(String busName, String busRoute, String busType, String arTime, String depTime, int seats);
}
