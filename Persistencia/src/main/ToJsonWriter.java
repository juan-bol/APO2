package main;

import com.google.gson.Gson;
import model.Person;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

public class ToJsonWriter {

    public static void main(String[] args) {
        Gson gson = new Gson();

        ArrayList<Person> people = new ArrayList<>();

        people.add(new Person("Alfa", 1));
        people.add(new Person("Beta", 2));
        people.add(new Person("Gamma", 3));
        people.add(new Person("Delta", 4));
        people.add(new Person("Eta", 5));

        String json = gson.toJson(people);
        System.out.print(json);

        try {
            FileOutputStream fos = new FileOutputStream(new File("people.txt"));
            fos.write( json.getBytes(StandardCharsets.UTF_8) );
            fos.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
