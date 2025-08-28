package day9.oops;

public class User {

    //non-static(instance) variable, properties, member's data, data, fields, attributes
    String name;
    int age;

//    public void assignUserInfo(String n, int a) {
//        name = n;
//        age = a;
//    }

    public User(String n, int a) {
        name = n;
        age = a;
        System.out.println("constructor called");
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        User user1 = new User("Raju", 20);
        System.out.println("user1: " + user1);
        System.out.println("user1: " + user1.hashCode());
//        user1.assignUserInfo("John Doe", 10);
//        user1.name = "Hari";
//        user1.age = 20;
//        System.out.println(user1.name);
//        System.out.println(user1.age);
        user1.displayInfo();

        System.out.println("================");

        User user2 = new User("Shyam", 30);
        System.out.println("user2: " + user2);
        System.out.println("user2: " + user2.hashCode());
        System.out.println();
//        user2.name = "Shyam";
//        user2.age = 30;
//        System.out.println(user2.name);
//        System.out.println(user2.age);
//        user2.assignUserInfo("Ram", 20);
        user2.displayInfo();
        System.out.println("=====");

//        user1.assignUserInfo("Eliza", 10);
        user1 = new User("Hari", 10);
        System.out.println("user1: " + user1);
        System.out.println("user1: " + user1.hashCode());
        System.out.println("day9.oops.User@"+Integer.toHexString(user1.hashCode()));
        user1.displayInfo();
    }

}

//constructor: is a special member function which has the following characteristics:
//it's name is same as class name
//it has no return type
//we can not use 'void' keyword
//we can use any access modifier
//it is used to initialize member's data
//it runs only once for each object