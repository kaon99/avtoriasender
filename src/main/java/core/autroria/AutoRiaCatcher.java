package core.autroria;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import static core.Constants.AutoRiaConts.SEARCHURL;


public class AutoRiaCatcher {


    public  String sendGet()  {

try {
    String url = SEARCHURL;

    URL obj = new URL(url);

    HttpURLConnection con = (HttpURLConnection) obj.openConnection();

    con.setRequestMethod("GET");

    int responseCode = con.getResponseCode();
    System.out.println("\n Sending 'GET' request to URL : " + url);
    System.out.println("Response Code : " + responseCode);

    BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
    String inputLine;

    StringBuffer response = new StringBuffer();

    while ((inputLine = in.readLine()) != null) {
        response.append(inputLine);
    }
    in.close();
   // System.out.println(response.toString());
return response.toString();
}catch (Exception e){
    e.printStackTrace();
}
return null;
    }


}

