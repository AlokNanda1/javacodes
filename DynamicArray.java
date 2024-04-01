import java.util.ArrayList;

public class DynamicArray {
    public static void main(String[] args) {
        //Arraylist - default class
        //create the object of array list
        ArrayList ar = new ArrayList<>();

        ar.add(100);//at index 0
        ar.add(200);//at index 1

        //to know the size of the array in dynamic array list
        System.out.println(ar.size());

        ar.add(300);
        ar.add(400);
        ar.add(500);

        System.out.println(ar.size());

        ar.add(12.33);
        ar.add(true);
        ar.add('m');
        ar.add("test");

        //generics in arraylist:
        ArrayList<Integer>marksList = new ArrayList<Integer>();
        //here we can't store any other type of data as we have already defined integer
        marksList.add(100);
        marksList.add(200);
        System.out.println(marksList.size());

        ArrayList<String>browserList = new ArrayList<String>();
        browserList.add("chrome");
        browserList.add("firefox");
        browserList.add("safari");

        System.out.println(browserList.size());
        System.out.println(browserList.get(1));

        //to print all the value from array list : for loop
        for(int i=0; i<browserList.size(); i++){
            System.out.println(browserList.get(i));
            if(browserList.get(i).equals("firefox")){
                System.out.println("mozilla");
                break;
            }
        }

        //emp info: name, age, salary, string, string, char, true
        ArrayList<Object>empInfo = new ArrayList<>();
        empInfo.add("Alok");
        empInfo.add("Nanda");
        empInfo.add(25);
        empInfo.add(20.45);
        empInfo.add("Odisha");
        empInfo.add('m');
        empInfo.add(true);

        System.out.println(empInfo.size());
        for(Object e : empInfo){
            System.out.println(e);
        }
        System.out.println(empInfo);
    }
}
