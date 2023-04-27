package ser_des_inherit1;

import java.io.*;

public class SerDesDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Developer developer = new Developer();

        FileOutputStream fileOutputStream = new FileOutputStream("ser_des_dev.ser");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(developer);


        Developer dev = null;
        FileInputStream fileInputStream = new FileInputStream("ser_des_dev.ser");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        dev = (Developer) objectInputStream.readObject();

        System.out.println(dev.num_of_dev +" "+ dev.num_of_empl);

    }
}
