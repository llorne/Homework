package Homework1_12;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.*;

public class LoaderRunnable implements Runnable {

    private String path;


    public LoaderRunnable(String path) {
        this.path = path;
    }

    @Override
    public void run(){
        FileInputStream fis;
        if(this.path != null && new File(this.path).exists()){
            try{
                fis = new FileInputStream(this.path);
                ObjectInputStream ois = new ObjectInputStream(fis);
                Person person = (Person)ois.readObject();
                ois.close();
                System.out.println(person.toString());

            }catch (ClassNotFoundException | IOException ex){
                System.out.println("ERROR " + this.path);
                System.out.println(ex.getMessage());
            }
        }


    }
}

