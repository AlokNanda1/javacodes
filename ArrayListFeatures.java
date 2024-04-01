import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListFeatures {
    public static void main(String[] args) {
        ArrayList<Integer> ar = new ArrayList<Integer>(20);
        //when we define 20 it will allocate 20 virtual segment but by default it is 10
        //lf(load factor) = vc/2 in this case it will be 20/2 - 10

        ArrayList<Integer> numList = new ArrayList<Integer>();
        numList.add(100);
        numList.add(200);
        numList.add(300);
        numList.add(400);
        System.out.println(numList.size());
        //removing value based on index
        numList.remove(2);
        System.out.println(numList.get(2));

        ArrayList<String> empList = new ArrayList<String>(Arrays.asList("Alok","Swagat","Rajendra"));
        System.out.println(empList.size());
        System.out.println(empList);
        //add a new element to the array list
        empList.add("Lisa");
        System.out.println(empList.size());
        System.out.println(empList);

        empList.add(0,"Ankit");
        System.out.println(empList);

        //we can't add any element by providing index number
        //empList.add(8,"Vijay"); It will give AIOB exception

        List<Integer> nums = Arrays.asList(1,2,3,4,5);
        System.out.println(nums.size());

        List<String> PageList = Arrays.asList("Login","Signup","Dashboard");

        ArrayList<Integer> nList = new ArrayList<Integer>();
        nList.add(100);
        nList.add(260);
        nList.add(10);
        nList.add(4000);
        nList.add(40);
        nList.add(5);

        System.out.println(nList);
        //to sort the array elements -for dynamic array only
        Collections.sort(nList);
        System.out.println(nList);
        //to print the array elements in reverse order
        Collections.reverse(nList);
        System.out.println(nList);

        //to sort the array elements inside a static array
        int test[] = {23,2,45,100,1,900};
        Arrays.sort(test);
        System.out.println(Arrays.toString(test));

        ArrayList<String> myList = new ArrayList<String>(Collections.nCopies(5,"iPhone"));
        System.out.println(myList.size());
        System.out.println(myList);

    }
}
