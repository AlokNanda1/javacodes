public class Assignment {
    public static void main(String[] args) {
        

        int a = 1;
        int b = a++ + ++a * --a - a--;
        //1 + 3 * 2 - 2 = 5
        System.out.println(b);

        int m = 0 , n = 0;
        int p = --m * --n * n-- *m--;
        //p = -1 * -1 * -1 * -1 = 1
        System.out.println(p);
        System.out.println(m);//current value = -2
        System.out.println(n);//current value = -2

        int i = 19, j = 29;
        int k = i-- - i++ + --j - ++j + --i - j-- + ++i - j++;
        //19-18+28-29+18-29+19-28 = -20
        System.out.println("i="+i);//19
        System.out.println("j="+j);//29
        System.out.println("k="+k);//-20
    }
}
