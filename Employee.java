public class Employee {
    //class variables - class data member
    String name; //(global variable)
    int age;
    String city;

    public static void main(String[] args) {
        //String name = "Naveen" (local variable)
        //class = template or buleprint of the object
        //object = physical entity
        //if we want to use the class variables we need to create objects using
        //new keyword
        Employee obj = new Employee();
        //obj - object reference name, new Employee() - Object
        // Employee is the type of object reference
        obj.name = "Alok";
        obj.age = 25;
        obj.city = "LA";

        System.out.println(obj.name + "" + obj.age + "" + obj.age);

        Employee obj1 = new Employee();
        obj1.name = "Uma";
        obj1.age = 26;
        obj1.city = "CHD";

        //three new objects will be created when 
        new Employee().name = "Peter";
        new Employee().age = 22;
        new Employee().city = "Jeypore";

    }
    
}
