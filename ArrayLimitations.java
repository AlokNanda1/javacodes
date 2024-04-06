import java.util.Arrays;

public class ArrayLimitations {

    public static void main(String[] args) {
        int product[] = new int[50];

        //object is the class in java
        //object array we can store any type of data
        Object emp[] = new Object[5];
        emp[0] = "Tom";
        emp[1] = 30;
        emp[2] = 23.33;
        emp[3] = 'm';
        emp[4] = true;

        System.out.println(Arrays.toString(emp));

        for(int i = 0; i<emp.length; i++){
            System.out.println(emp[i]);
        }

        //static array example
        //bookmyshow.com --> 200 tickets
        //flight/bus booking --> 100 seats
        //ecommerce --> categories
    }
}