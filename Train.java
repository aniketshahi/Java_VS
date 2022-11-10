
import java.net.*;
import java.io.*;
import java.sql.*;

public class Train {
    public static void main(String args[]) {
        String Query;
        ResultSet rs = null;
        String msg;
        int pnr = 0, trainnum = 0;
        String from = new String();
        String to = new String();
        String date = new String();
        String name = new String();
        try {
            try (ServerSocket ser = new ServerSocket(8000)) {
                System.out.println("Server Started...");
                Socket soc = null;
                soc = ser.accept();
                System.out.println("Received Connection:  " + soc.getInetAddress().getHostAddress());
                DataOutputStream out = new DataOutputStream(soc.getOutputStream());
                BufferedReader in = new BufferedReader(new InputStreamReader(soc.getInputStream()));
                try {
                    Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
                    Connection conn = DriverManager.getConnection("jdbc:odbc:mydb", "scott", "tiger");
                    Statement stmt = conn.createStatement();
                    msg = in.readLine();
                    pnr = Integer.parseInt(msg);
                    Query = "Select * from train where pnrno = " + pnr;
                    rs = stmt.executeQuery(Query);
                    if (rs.next()) {
                        pnr = Integer.parseInt(rs.getString(1));
                        from = rs.getString(2);
                        to = rs.getString(3);
                        date = rs.getString(4);
                        name = rs.getString(5);
                        trainnum = Integer.parseInt(rs.getString(6));
                    } else {
                        System.out.println("invalid PNRNO");
                    }
                } catch (SQLException e) {
                    System.out.println("Error Caught: " + e);
                }
                out.writeBytes(String.valueOf(pnr));
                out.write(10);
                out.writeBytes(from);
                out.write(10);
                out.writeBytes(to);
                out.write(10);
                out.writeBytes(date);
                out.write(10);
                out.writeBytes(name);
                out.write(10);
                out.writeBytes(String.valueOf(trainnum));
                out.write(10);
                soc.close();
            }
        } catch (Exception e) {
            System.out.println("Error Caught: " + e);
        }
    }
}