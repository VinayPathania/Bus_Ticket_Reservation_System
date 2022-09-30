package com.DataBaseUtil;

import java.sql.Connection;

public class busApp {
    public static void main(String[] args) {
        Connection con = DButil.provideConnection();
    }
}
