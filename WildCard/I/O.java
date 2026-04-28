package code;

import java.util.*;
import java.io.*;
//input streamReader--> read character one by one
//OutputStreamWriter --> its print character one by one on screen
public class fstream {
    public static void main(String[] args) throws IOException{
       InputStreamReader r = new InputStreamReader(System.in);
       //System.in enable the keyboard
       System.out.println("Enter your name");
       //Deepak
       // you have to print your name on screen
       //with help of InputstreamReader we read our name
       //we will read the character one by one from console
       int ch;
       String name=" ";
       //r.read() --> read each characteronr by one
       //assign the ascii value  
       while((ch=r.read())!='\n'){
         name+=(char)ch;
       }
       System.out.println(name);    
    }
}

