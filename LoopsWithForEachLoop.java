import java.util.Arrays;

public class LoopsWithForEachLoop {
    public static void main(String[] args) {
        //for each loop
        int a[] = new int[4];
        a[0] = 10;
        a[1] = 20;
        a[2] = 30;
        a[3] = 40;
        
        for(int e: a){
            System.out.println(e);
        }//time complexity = O(n)
        System.out.println(a[2]);

        String emp[] = new String[5];
        emp[0] = "Alok";
        emp[1] = "Cybrain";
        emp[2] = "Bunty";
        emp[3] = "Kush";
        emp[4] = "Mukul";

        for(String e:emp){
            System.out.println(e);
            if(e.equals("Alok")){
                System.out.println("He is a Tester");
                break;
            }
        }
//we have to use object while storing different types of data in an array
        Object emps[] = new Object[5];
        emps[0] = "Tom";
        emps[1] = 30;
        emps[2] = 23.33;
        emps[3] = 'm';
        emps[4] = true;

        for(Object e : emps){
            System.out.println(e);
        }

        int ar[] = new int[4];
        ar[0] = 10;
        ar[1] = 20;
        ar[2] = 30;
        ar[3] = 40;

        for(int i=ar.length-1; i>=0; i--){
            System.out.println(ar[i]);
        }

        int test[] = {10,20,30,44,55,66,77,909};
        System.out.println(test.length);

        System.out.println(test[0]);
        System.out.println(test[7]);

        test[0] = 200;
        System.out.println(test[0]);
        //to print all the values in an array
        System.out.println(Arrays.toString(test));
    }
}
