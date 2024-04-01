public class IncrementAndDecrementOpeartors {
    public static void main(String[] args) {
        // ++ and --
        int a = 1;
        int b = a++;
        //the original value of a will be assigned to b and then 1 will be added

        //post increment
        System.out.println(a);//2
        System.out.println(b);//1

        int l = 3;
        int m = l++;
        System.out.println(l);//4
        System.out.println(m);//3

        int p = -98;
        int q = p++;
        System.out.println(p);//-97
        System.out.println(q);//-98

        //pre increment
        int x = 1;
        int y = ++x;
        System.out.println(x);
        System.out.println(y);

        int t = 4;
        int s = ++t;
        System.out.println(t);
        System.out.println(s);

        int pop = 2;
        System.out.println(pop++);//print 2 because the memory will contain the value of pop immediately
        System.out.println(pop);//it will print the updated value in memory after post increment i.e 3

        int loop = 3;
        System.out.println(++loop);//perform the pre increment opeartion and print the updated vaue of p i.e 4
        System.out.println(loop);//print the current new value of loop which is assigned after pre increment i.e also 4

        //post decrement
        int ab = 2;
        int xy = ab--;
        System.out.println(ab);//1 first the value of ab will be decremented by one and assigned to ab
        System.out.println(xy);//2 now the xy will print the original value of ab

        int rest = -99;
        int api = rest --;
        System.out.println(rest);//it will print the decremented value of rest i.e -100
        System.out.println(api);//it will print the original value of rest i.e 99


        //pre decrement
        int aa = 2;
        int bb = --aa; //1-2 2-1 2++ 2+1  --2 1-2 2-1 2-- 2-1
        System.out.println(aa);//it will print the decremented value of aa i.e 1
        System.out.println(bb);//now it will print the newly assigned value of aa i.e also 1
        
        int s3 = 40;
        System.out.println(s3--);//40
        System.out.println(s3);//39

        int p3 = 50;
        System.out.println(--p3);//49
        System.out.println(p3);//49

        int na = 1;
        int test = na++ + na++ + na++ + na++;
        // first it will contain the value of na for all and then add 1
        // na++ = 1 and then it will increase the value by one after each increment the na will contain the updated value
        //1 + (1+1) = 2 + (2+1) = 3 + (3+1)=4 i.e 1+2+3+4
        System.out.println(test);
        System.out.println(na); //5 the updated value of na
    }
}
