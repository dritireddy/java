class AllOperators {
    public static void main(String[] args) {

        int a = 10, b = 5;

        
        System.out.println("Arithmetic Operators:");
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));

        
        System.out.println("\nRelational Operators:");
        System.out.println("a > b : " + (a > b));
        System.out.println("a < b : " + (a < b));
        System.out.println("a >= b : " + (a >= b));
        System.out.println("a <= b : " + (a <= b));
        System.out.println("a == b : " + (a == b));
        System.out.println("a != b : " + (a != b));

       
        boolean x = true, y = false;
        System.out.println("\nLogical Operators:");
        System.out.println("x && y : " + (x && y));
        System.out.println("x || y : " + (x || y));
        System.out.println("!x : " + (!x));


         int c = 10;
        System.out.println("\nAssignment Operators:");
        c += 5;
        System.out.println("c += 5 : " + c);
        c -= 2;
        System.out.println("c -= 2 : " + c);
        c *= 3;
        System.out.println("c *= 3 : " + c);
        c /= 2;
        System.out.println("c /= 2 : " + c);
        c %= 4;
        System.out.println("c %= 4 : " + c);



         int d = 5;
        System.out.println("\nUnary Operators:");
        System.out.println("d = " + d);
        System.out.println("++d = " + (++d));
        System.out.println("d++ = " + (d++));
        System.out.println("After d++ = " + d);
        System.out.println("--d = " + (--d));
        System.out.println("d-- = " + (d--));
        System.out.println("After d-- = " + d);

       
        System.out.println("\nBitwise Operators:");
        System.out.println("a & b = " + (a & b));
        System.out.println("a | b = " + (a | b));
        System.out.println("a ^ b = " + (a ^ b));
        System.out.println("~a = " + (~a));

      
        System.out.println("\nShift Operators:");
        System.out.println("a << 1 = " + (a << 1));
        System.out.println("a >> 1 = " + (a >> 1));

     
        int max = (a > b) ? a : b;
        System.out.println("\nTernary Operator:");
        System.out.println("Maximum = " + max);
    }
}



     
        
