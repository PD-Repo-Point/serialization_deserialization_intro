package ser_des_obj_graph;

import java.io.*;

public class SerDesDemo {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Employee employee = new Employee();

        // Code for Serialization
        FileOutputStream fileOutputStream = new FileOutputStream("ser_ses_objects.ser");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(employee);

        // Code for deserialization
        FileInputStream fileInputStream = new FileInputStream("ser_ses_objects.ser");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Employee empl = (Employee)objectInputStream.readObject();

        // All the classes should implement Serializable class
        System.out.println(empl.trainer.student.number_of_session);

    }
}
