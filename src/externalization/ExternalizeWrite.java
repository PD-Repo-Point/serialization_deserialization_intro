package externalization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

// Serialization --- Client
public class ExternalizeWrite {

    public static void main(String[] args) throws IOException {
        Employee employee = new Employee(123, "Alex", 45);
        FileOutputStream fileOutputStream = new FileOutputStream("employee.ser");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(employee);

        System.out.println("Successfully written employee object to the file ... ");

        objectOutputStream.close();

    }
}
