package com.soda.foodtruck.resource;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public class SMSManager {

    public static void main(String[] args) {
        try {
            // Construct data
            String apiKey = "apikey=" + "Mzg2ZDM4NjUzMjYyNmM1NzQ2MzY3NTc5NWEzNDc2NTc=";
            String message = "&message=" + "Greetings from Simplifying Tech! Have a nice day!";
            //String sender = "&sender=" + "TXTLCL";
            String numbers = "&numbers=" + "+918247688220";

            // Send data
            HttpURLConnection conn = (HttpURLConnection) new URL("https://api.textlocal.in/send/?").openConnection();
            String data = apiKey + numbers + message;
            conn.setDoOutput(true);
            conn.setRequestMethod("POST");
            conn.setRequestProperty("Content-Length", Integer.toString(data.length()));
            conn.getOutputStream().write(data.getBytes(StandardCharsets.UTF_8));

            BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            StringBuffer stringBuffer = new StringBuffer();
            String line;
            while ((line = rd.readLine()) != null) {
                stringBuffer.append(line).append("\n");
            }
            System.out.println(stringBuffer);
            rd.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
