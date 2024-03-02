package com.directi.training.dip.exercise.refactored;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;


public class Network implements Reader{
    private String _url;
    public Network(String url){
        _url=url;
    }

    public String read() {
        StringBuilder inputString1 = new StringBuilder();

        try{
        URL url;
        url = new URL(_url);
        InputStream in;
        in = url.openStream();
        InputStreamReader reader = new InputStreamReader(in);
        int c;
        c = reader.read();
        while (c != -1) {
            inputString1.append((char) c);
            c = reader.read();
        }
       }
        catch(Exception e){
            e.printStackTrace();    
    }
    return inputString1.toString();



    }
    
}
