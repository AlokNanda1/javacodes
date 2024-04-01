public class TimeComplexity {
    public static void main(String[] args) {
        int i = 1;
        System.out.println(i);
        //Constant time - Big O(1)
        String name = "Alok";
        System.out.println(name);//O(1)

        int n = 1;
        for(int p = 1; p<=n ; p++){
            System.out.println(p);
        }
        //1+n+n+n==> 3n+1 --> 3n --->  O(n)
    }
    
}