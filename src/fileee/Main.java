package fileee;

import java.io.File;

public class Main {
    public static void main(String[] args) {

        File file = new File("C:\\Java\\java-se\\src\\fileee\\secret_msg.txt");

        if (file.exists()) {
            System.out.println("That file exists! :o!");
            System.out.println(file.getPath());
            System.out.println(file.getAbsolutePath());
            System.out.println(file.isFile());
            file.delete();
        }
        else {
            System.out.println("That file doest not exist :( ");
        }
    }
}
