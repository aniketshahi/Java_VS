import java.io.*;
import java.net.*;

public class Client {
    public static void main(String args[]) {
        Socket objclient = null;
        BufferedReader br = null, in = null;
        DataOutputStream out = null;
        int pnr = 0;
        try {
            objclient = new Socket("Localhost", 8000);
            in = new BufferedReader(new InputStreamReader(objclient.getInputStream()));
            br = new BufferedReader(new InputStreamReader(System.in));
            out = new DataOutputStream(objclient.getOutputStream());
            System.out.println("Enter the PNR NO: ");
            pnr = Integer.parseInt(br.readLine());
            out.flush();
            out.writeBytes(String.valueOf(pnr));
            out.write(10);
            System.out.println("PNRNo: " + in.readLine());
            System.out.println("SOURCE : " + in.readLine());
            System.out.println("DESTINATION: " + in.readLine());
            System.out.println("JOURNEY DATE: " + in.readLine());
            System.out.println("CUSTOMER NAME: " + in.readLine());
            System.out.println("TRAIN NO: " + in.readLine());
            objclient.close();
        } catch (Exception e) {
            System.out.println("Error Caught: " + e);
        }
    }
}