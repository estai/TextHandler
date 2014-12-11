package com.epam.action;

import java.io.*;

/**
 * Created by User on 07.11.14.
 */
public class ReaderFile {
    private StringBuilder stringBuilder=new StringBuilder();
    private String path;
    private BufferedReader bf;

    public ReaderFile(String path) {
        try {
            this.path = path;
            bf=new BufferedReader(new FileReader(new File(this.path)));
        }
        catch (FileNotFoundException e){
            System.out.println(e);
        }



    }
    public String readText(){
        try {
            String s;
            while ((s=bf.readLine())!=null){
               stringBuilder.append(s);

            }
        }
        catch (IOException e){
            throw new RuntimeException(e);
        }
        return String.valueOf(stringBuilder);
    }
}
