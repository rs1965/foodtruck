package com.soda.foodtruck.resource;

import org.springframework.web.bind.annotation.PathVariable;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/api")
public class SmsResource {
    @GetMapping("/sms/{id}")
    public ResponseEntity<String> getSms(@PathVariable String id) {
        var ResponseBody="";
        try {
            // Create an HttpClient
            CloseableHttpClient httpClient = HttpClients.createDefault();

            // Define the URL you want to send the GET request to
            String apiUrl = "http://127.0.0.1:5000/" + id; // Replace with your API endpoint

            // Create an HTTP GET request
            HttpGet httpGet = new HttpGet(apiUrl);

            // Execute the GET request
            HttpResponse response = httpClient.execute(httpGet);

            // Check the response status code
            int statusCode = response.getStatusLine().getStatusCode();

            if (statusCode == 200) {
                // Request was successful
                String responseBody = EntityUtils.toString(response.getEntity());
                System.out.println("Response Body:\n" + responseBody);
            } else {
                // Handle errors or unexpected status codes
                System.err.println("Request failed with status code: " + statusCode);
            }

            // Close the HttpClient
            httpClient.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ResponseEntity<>(ResponseBody,HttpStatus.OK);
    }
}
