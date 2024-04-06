public class User {
    String name; 
    int age;
    String city;

    public static void main(String[] args) {
    
        User u1 = new User();
        u1.name = "Alok";
        u1.age = 25;
        u1.city = "LA";

        User u2 = new User();
        u2.name = "Sandeep";
        u2.age = 25;
        u2.city = "AUS";

        User u3 = new User();
        u3.name = "Alok";
        u3.age = 25;
        u3.city = "LA";

        System.out.println(u1.name + "" + u1.age + "" + u1.age);
        System.out.println(u2.name + "" + u2.age + "" + u2.age);
        System.out.println(u3.name + "" + u3.age + "" + u3.age);

        //In java we can assign one object reference to another
        u1=u2;
        u2=u3; //u2 will point to u3
        //it will assign the values of u2 to u1 and print
        //the u1 will point to u2 object and print the values
        System.out.println(u1.name + "" + u1.age + "" + u1.age);
        System.out.println(u2.name + "" + u2.age + "" + u2.age);
        System.out.println(u3.name + "" + u3.age + "" + u3.age);


}
