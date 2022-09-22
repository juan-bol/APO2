package main;

import com.google.gson.Gson;
import model.Person;

import java.io.*;
import java.util.ArrayList;

public class ToJsonReader {

    public static void main(String[] args) {
        try {
            File file = new File("people.txt");
            System.out.println("Existe: "+file.exists());
            FileInputStream fis = new FileInputStream(file);

            BufferedReader reader = new BufferedReader(new InputStreamReader(fis));

            String json = "";
            String line;
            if((line=reader.readLine())!=null){
                json= line;
            }
            fis.close();
            System.out.println(json);

            Gson gson = new Gson();
            Person[] peopleFromJson = gson.fromJson(json, Person[].class);

            ArrayList<Person> people = new ArrayList<>();
            for(Person p : peopleFromJson){
                people.add(p);
                System.out.println(p.getName()+" "+p.getAge());
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}