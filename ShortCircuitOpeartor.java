public class ShortCircuitOpeartor {
    public static void main(String[] args) {
        
        int a = 100;
        int b = 200;
        int c = 300;

        // && is called the short circuit opearator
        //beacause if the first condition is failed then no need to proceed
        //like if a>b false it'll not check a>c
        //to optimise code we use && because & will check all the conditions based on true false and then proceed
        if(a>b && a>c){
            System.out.println("A is greatest");
        }

        else if(b>c){
            System.out.println("B is greatest");
        }

        else{
            System.out.println("C is greatest");
        }
    }
}
