import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.ArrayList;

import static java.nio.file.StandardOpenOption.CREATE;

public class PersonGenerator {
    public static void main(String[] args) {
        String personRec = "";
        String ID = "";
        String firstName = "";
        String lastName = "";
        String Title = "";
        int YOB = 0;
        ArrayList<String> ppl = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        boolean done = false;
        File workingDirectory = new File(System.getProperty("user.dir"));
        Path file = Paths.get(workingDirectory.getPath() + "\\src\\personTestData.txt");

        do {
            ID = SafeInput.getNonZeroLenString(in, "Enter their ID [6 digits]");
            firstName = SafeInput.getNonZeroLenString(in, "Enter their First Name");
            lastName = SafeInput.getNonZeroLenString(in, "Enter their Last Name");
            Title = SafeInput.getNonZeroLenString(in, "Enter their Title");
            YOB = SafeInput.getRangedInt(in, "Enter the year of birth ", 1940, 2010);


            Person person = new Person(ID, firstName, lastName, Title, YOB);
            ppl.add(person.toCSV());
            done = SafeInput.getYNConfirm(in, "Are you done?");

        }while(!done);

        try
        {
            // Typical java pattern of inherited classes
            // we wrap a BufferedWriter around a lower level BufferedOutputStream
            OutputStream out =
                    new BufferedOutputStream(Files.newOutputStream(file, CREATE));
            BufferedWriter writer =
                    new BufferedWriter(new OutputStreamWriter(out));

            // Finally can write the file LOL!

            for(String rec : ppl)
            {
                writer.write(rec, 0, rec.length());  // stupid syntax for write rec
                // 0 is where to start (1st char) the write
                // rec. length() is how many chars to write (all)
                writer.newLine();  // adds the new line

            }
            writer.close(); // must close the file to seal it and flush buffer
            System.out.println("Data file written!");
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        }
}