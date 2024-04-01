public class MathematicalOpeartions{

    public static void main(String[] args) {
        System.out.println(4/2);
        System.out.println(4-2);
        System.out.println(4+2);
        System.out.println(4*2);

        System.out.println(9/3);
        System.out.println(9/2);//4
        System.out.println(9.0/2);//4.5
        System.out.println(9/2.0);//4.5

        System.out.println((float)9/2);
        System.out.println(0/9);
        System.out.println(9/0);//will give arthematic exception in case of integer
        System.out.println(9.0/0);//will give infinity in case of floating values
        System.out.println(9/0.0);

        System.out.println(0.0/0.0);//NaN - Not a number in java
        System.out.println(0.0/2.0);//0.0
        System.out.println((float)9/0);//Infinity

        System.out.println(9%2);//print the remainder

    }
}