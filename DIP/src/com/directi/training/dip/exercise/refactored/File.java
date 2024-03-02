package com.directi.training.dip.exercise.refactored;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Base64;

public class File implements Reader,Writer{
private  String path;

public File(String input_path){
    this.path = input_path;
   
}
    

    public int write(String content) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(path));
            writer.write(Base64.getEncoder().encodeToString(content.getBytes()));
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return 1;

    }

    public String read() {
        StringBuilder inputString = new StringBuilder();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(path));    
            String aLine;
            while ((aLine = reader.readLine()) != null) {
                inputString.append(aLine);
            }
            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return inputString.toString();
    }
}

