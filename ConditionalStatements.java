public class ConditionalStatements 
{
    public static void main(String[] args) 
    {
        int a = 5;
        int b = 5;
        System.out.println(a == b);
        if (a == b) 
        {
            System.out.println("Pass");
        } else 
        {
            System.out.println("Fail");
        }

        if (true) 
        {
            System.out.println("Hi selenium");
        } else 
        {
            System.out.println("Bye Selenium");
        }
        // the else part here is called a dead code because we are statically written
        // true for if condition so it'll never come to the else part
        // if we write false then the if statement will be a dead code

        boolean flag = true;
        if (flag) 
        {
            System.out.println("Hi Tester");
        } else 
        {
            System.out.println("Bye Tester");
        }
        // it will not show dead code beacuse the conditions are dependent on flag

        boolean test = true;
        if (!test) 
        {
            System.out.println("testing is done");
        } else 
        {
            System.out.println("testing is not done");
        }

        // nested if
        int number = 100; // 101 then it will go to else part
        if (number <= 100) 
        {
            System.out.println("calculating your marks");
            if (number >= 90) 
            {
                System.out.println("GRADE A");
                // we can write n number of if conitions together
                if (number == 100) 
                {
                    System.out.println("You got 100% Scholarship");
                }
                else
                {
                    System.out.println("You are not eligible for 100% scholarship.");
                }
            } 
        
            else
            {
                if(number>=80)
                {
                    System.out.println("GRADE B");
                }
            }
        }
            else 
            {
                System.out.println("Please pass the right marks");
            }
        // //if if if else
        // String browser = "chrome";
        // //the non primitive data type does not use == so .equals to method is used to
        // compare
        // if(browser.equals("chrome")){
        // System.out.println("Launch chrome");
        // }
        // if(browser.equals("Safari")){
        // System.out.println("Launch Safari");
        // }
        // if(browser.equals("firefox")){
        // System.out.println("Launch Firefox");
        // }
        // else{
        // System.out.println("Please pass the correct browser");
        // }

        // if else-if

        String browser = "chrome";

        if (browser.equals("chrome")) 
        {
            System.out.println("Launch chrome");
        } else if (browser.equals("firefox")) 
        {
            System.out.println("Launch firefox");
        } else if (browser.equals("safari")) 
        {
            System.out.println("Launch safari");
        } else 
        {
            System.out.println("Please pass the correct browser");
        }


    }
}



