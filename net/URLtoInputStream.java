/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.at.shegda;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;



public class URLReader {
    public static void main(String[] args) throws Exception {

        URL oracle = new URL("http://shegda.at.ua/");
        BufferedReader in = new BufferedReader(
        new InputStreamReader(oracle.openStream()));

        String inputLine;
        while ((inputLine = in.readLine()) != null)
            if ( (!(inputLine.startsWith("<!--"))) && (!(inputLine.endsWith("-->"))) ) 
            {
                System.out.println(inputLine);
            }
       
        in.close();
    }
}
