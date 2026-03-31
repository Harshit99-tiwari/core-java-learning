package ExceptionHandling;

public class Finallyblock {
     static void meth1() throws Exception
    {
        try{
        throw new Exception();
        }
        finally
        {
        System.out.println("final message");
        }
    }
    public static void main(String[] args) throws Exception
    {
        meth1();
    }
}
