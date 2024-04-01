import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<Object> ar = new ArrayList<Object>();
        //for the above if we don't mention object it will give error according to java
        //so for declaring an arraylist we have to define the datatype o be stored
        ar.add(100);
        ar.add("Testing");
        ar.add('m');
        ar.add(true);

        for(Object e: ar){
            System.out.println(e);
        }
    }
    
}
