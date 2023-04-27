package ser_des_inherit1;

public class Developer extends Employee{
    // if the parent class i.e. Employee implements Serializable that means the child class
    // i.e. Developer will also be Serializable
    int num_of_dev = 5;
}
