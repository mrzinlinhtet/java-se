package writingfile;

import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("poem.txt");
            writer.write("Roses are red \nViolets are blue \nBooty Booty Booty \nRockin' everywhere");
            writer.append("\n(A poam by gamani)");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
