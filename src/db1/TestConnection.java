package db1;

import java.sql.*;

/**
 *
 * @author Hussein Muhammad
 */
public class TestConnection {

    public static void main(String[] args) {

        MysqlCon conTest = new MysqlCon();
        conTest.Connect();
    }
}
