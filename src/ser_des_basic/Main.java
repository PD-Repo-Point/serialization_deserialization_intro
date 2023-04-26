package ser_des_basic;// SERIALIZATION AND DESERIALIZATION
// SERIALIZATION --> java supported object ----> file or network supported form
// ---  JVM {Windows} (S)  --- JVM {Linux} (D)
// it saves state of the object - f, m

// DESERIALIZATION ---> file or network supported form ---> java supported object

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Student student = new Student();
        Employee employee = new Employee();

        // fileOutputStream ----->  ObjectOutputStream ----> pass the object
        // ---Serialization---
        FileOutputStream fileOutputStream = new FileOutputStream("ser_des.ser");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(student);
        objectOutputStream.writeObject(employee);

        // We have deserialized in the order we have serialized
        // ---Deserialization---
        FileInputStream fileInputStream = new FileInputStream("ser_des.ser");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        // If we know the order of serialization of objects
        /* Student student1 = (Student) objectInputStream.readObject();
        System.out.println(student1.age +" "+student1.name);

        Employee employee1 = (Employee) objectInputStream.readObject();
        System.out.println(employee1.name +" "+employee1.salary);*/

        // If we don't know the order of serialization of objects then use
        // - instanceOf - to retrieve the object
        Object ob = objectInputStream.readObject();
        Student student1 = null;
        Employee employee1 = null;

        if(ob instanceof Student){
            student1 = (Student) ob;
            System.out.println(student1.age +" "+student1.name);
        }

        else if (ob instanceof Employee) {
            employee1 = (Employee) ob;
            System.out.println(employee1.name + " " + employee1.salary);
        }

    }
}