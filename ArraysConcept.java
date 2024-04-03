import java.util.Arrays;

public class ArraysConcept {

    public static void main(String[] args) {
        //1. Array declaration using new keyword
        int a[] = new int[4];
        //we can add the [] before or after a
        //both side we have define the type of variable we want to store
        //new is used as keyword to initiate new memory allocation
        a[0] = 10;
        a[1] = 20;
        a[2] = 30;
        a[3] = 40;
        System.out.println(a[0]);
        System.out.println(a[3]);
        // System.out.println(a[4]); ArrayIndexOutOfBoundException
        // System.out.println(a[-1]); ArrayIndexOutOfBoundException

        //to print the length of array
        int len = a.length;
        System.out.println(len);
        int hi = len-1;
        System.out.println(hi);
        int li = 0;
        System.out.println(li);

        //To print all the values from array use for loop
        for(int i=0; i<4; i++){
            System.out.println(a[i]);
        }

        //without using for loop
        System.out.println(Arrays.toString(a));

        //double array
        double d[] = new double[2];
        d[0] = 12.76;
        d[1] = 24.44;
        System.out.println(d[0]+d[1]);

        //string array
        String emp[] = new String[3];
        emp[0] = "Alok";
        emp[1] = "Nanda";
        emp[2] = "QA";
        System.out.println("total emp:" + emp.length);
        System.out.println(Arrays.toString(emp));

        for(int k = 0; k<emp.length; k++){
            System.out.println(emp[k]);
            if(emp[k].equals("Nanda"));
            {
                System.out.println("Nanda Salary is:" +1000);
                break;
            }
        }

        String browsers[] = {"chrome", "firefox", "IE", "safari"};
        for(int k=0; k<4; k++){
            System.out.println(browsers[k]);
            if(browsers[k].equals("IE")){
                System.out.println("This browser is deprecated!");
            }
        }

    }
}