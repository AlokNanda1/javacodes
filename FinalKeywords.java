public class FinalKeywords {
    public static void main(String[] args) {
        //constant values
        int x = 10;
        x = 20;
        x =30;
        x = 40;
        System.out.println(x); //print 40 the updated value of x

        final int days = 7;
        //days = 10;
        int salary = days*100;
        System.out.println(salary);
        //first it will print 700 but if someone updates the value of date to 10 then 
        //it will create issue for that we have to define final keyowrd with int
        //if we declare final keyword for a variable then we can't change the value of the variable

        final int DEFAULT_TIME_OUT = 10;
        final String LOGIN_PAGE_TITLE = "Login Page";
    }
}
