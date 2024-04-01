public class Datatypes{
    public static void main(String[] args)
    {
        //1.byte - It is a keyword in java and must start with small letter
        //size: 1 byte = 8 bits
        //range: -128 to 127
        byte b = 10;
        //shortcut - syso+ctrl+space then enter
        System.out.println(b);
        //assign the value 10 to variable b, which is of type byte
        // = assignment opeartor
        //byte b = 20; is not possible, because duplicate variables are not allowed in java
        //but b = 30; is possible it will update the existing value of b

        //2. short - 
        //size: 2 byte = 16 bits
        //range: -32768 to 32767
        short s = 234;
        System.out.println(s);

        //3. int
        //size: 4 bytes = 32 bits
        //range: -2147483648 to 2147483647 --> -2^31 to 2^31-1
        int i = 2300;
        System.out.println(i);

        //4. long
        //size: 8 bytes = 64 bits
        //range: -9223372036854775808 to 9223372036854775807 --> -2^63 to -2^63-1
        long l = 98548847146l;
        System.out.println(l);

        //5. float - To store the decimal numbers we have to use floating category
        //size: 4 bytes = 32bits
        //range: after . it can take upto 7 digits
        float f1 = 378.98f;
        System.out.println(f1);

        //6. double
        //size: 8 bytes = 64 bits
        //range: after . it can take upto 15 digits
        // after this we can use BigInteger or BigDecimal for extremely long values
        double d = 7.9888;
        System.out.println(d);

        //7. char - Must be written within single quote and can't be double digit
        //size: 2 bytes = 16 bits
        //range: 0-9, a/A - z/Z, any symbol
        char a = 'k';
        System.out.println(a);

        //8. boolean - true/false
        //size: ~ 1bit
        boolean flag = true;
        boolean test = false;
        System.out.println(flag);
        System.out.println(test);

    }
}