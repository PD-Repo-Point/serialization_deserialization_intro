package ser_des_basic;

import java.io.Serializable;

public class Student implements Serializable {
    String name ="John";
    int age = 15; // transient will work with variables
}
