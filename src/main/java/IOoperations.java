import com.google.gson.Gson;

import java.io.FileWriter;
import java.io.IOException;

import java.io.FileReader;
import java.io.Reader;

public class IOoperations {

    public static void main(String[] args) {

        Gson gson = new Gson();

        ListOfMembers listFromTheFile = null;

        try (Reader reader = new FileReader("example-member-list.json")) {

            // Convert JSON File to Java Object
            listFromTheFile = gson.fromJson(reader, ListOfMembers.class);
            // print staff object
            System.out.println(listFromTheFile);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
