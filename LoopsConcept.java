public class LoopsConcept {
    public static void main(String[] args) {
        //print 1-10
        //while loop
        int i = 1;
        while (i<=10) {
            System.out.println(i);//1 in infinite loop
            i++; //print the value of i till 10
        }
        int k = 1;
        while(true){
            System.out.println("Welcome to Hotel Taj");
            if(k==5){
                break;       
            }
            k++;    
        }

        //for loop
        
        //for(initialize; condition; increment/decrement)
        for(int j=1; j<=10; j++){ //1 to 10
            System.out.println(j);
        }
        int c=1;//print the statement 5 times
        for(; true ;){
            System.out.println("Welcome to naveen automation labs");
            if(c==5){
                break;
            }
            c++;
        }
       for(char ch='a'; ch<= 'z'; ch++){//print a - z
        System.out.println(ch);//if we add byte with ch then it will print the ASCII value
       }
       for(double d=1.1; d<=5.1; d++){
        System.out.println(d);
       }
       for(int r=1; r<=100; r++){
        if(k%2 == 0){
            System.out.println(r);
        }
       }

    //Do while loop
    int e = 1;
    do{
        System.out.println(e);
        e++;
    }
    while(e<=10);
    }
    
}
