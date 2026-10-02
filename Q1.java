//  write a java program to create a method calculate() that declares three local variable a,b and c. store value and them  dispaly their sum , difference  and product.

class Q1
{ 

    void calculate( )

    {
        int a = 10;
        int b = 20;
        int c = 30;

         System.out.println("sum = "+ a+b+c);
         System.out.println("difference  = "+ (a-b-c));
         System.out.println("product = "+ (a*b*c));
    }
     
    public static void main(String[] args)
    { 

        Q1 obj = new Q1();
        obj.calculate();


    }
    
}