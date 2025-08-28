package day10.oops;

public class UserTest {

    public static void main(String[] args) {
        User user1 = new User();
        //set
        user1.setName("Ram");
        user1.setAge(22);
        //get
        System.out.println(user1.getName());
        System.out.println(user1.getAge());

        System.out.println("===============");
        User user2 = new User();
        user2.setName("shyam");
        user2.setAge(23);
        System.out.println(user2.getName());
        System.out.println(user2.getAge());

    }
}
