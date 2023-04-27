package externalization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

// Deserialization - Server
public class ExternalizeRead {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        FileInputStream fileInputStream = new FileInputStream("employee.ser");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        Employee employee1 = (Employee) objectInputStream.readObject();

        //System.out.println(employee1.getId()+" "+employee1.getName());
        System.out.println("Successfully read employee object to the File");

        objectInputStream.close();

    }
}
