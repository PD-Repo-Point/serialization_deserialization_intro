package ser_des_basic;

import java.io.Serializable;

public class Employee implements Serializable {
    String name = "Alex";
    transient int salary = 50000;


}
