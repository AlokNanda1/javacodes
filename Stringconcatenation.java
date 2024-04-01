public class Stringconcatenation {
    public static void main(String[] args) {
    
    int a = 10;
    int b = 20;
    System.out.println(a+b);
    //the class name should always starts with capital letter - String
    //the keyword should only starts with small letter - int

    String x = "hello";
    String y = "selenium";
    System.out.println(x+y);   
    //in string the + opearator is working for concatenate the strings
    System.out.println(a+b+x+y); //30helloSelenium
    System.out.println(x+y+a+b); //helloSelenium1020
    System.out.println(x+y+(a+b)); //helloSelenium30
    //in the above the a+b will be calculated and concatenated with x+y
    System.out.println(a+b+x+y+a+b);//30helloSelenium1020
    System.out.println(a+b+x+y+(a+b)); //30helloSelenium30

    //strings can be concatenated with any data types
    double c = 12.34;
    double d = 25.55;
    System.out.println(x+y+c+d);//helloselenium12.3425.55
    System.out.println(x+y+a+b+c+d); //
    //after string when adding anu numbers it should concatenate not perform addition
    
    char g = 'u';
    char u = 'l';

    String p = "testing";
    String q = "automation";

    System.out.println(g+u);//it will print 225 as charcters are numeric data type i.e the ASCII values
    System.out.println(p+q+g+u);

    System.out.println(a);//will give you the value declared for the variable a
    System.out.println('a');//will print the character a
    System.out.println('a'+'b');//will print the added ASCII value of a and b
    //the special characters also has some ASCII value
    System.out.println('$'+'a');//36+97 ASCII values of $ and a

    //To know the ASCII value of any character convert it to any data type and print
    System.out.println((byte)'a');
    System.out.println((byte)'$');

    //String concatenation
    int s1 = 100;
    int s2 = 500;
    System.out.println("The value of s1 is:" +s1);
    System.out.println("The sum of s1 and s2 is:"+(s1+s2));
    
    }
}
