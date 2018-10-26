package vnuk;

public class App 
{
    public static void main( String[] args )
    {
        int num = 5;
        num=addFive(num);
        num=addSeven(num);
        System.out.println( "Number is "+num);
    }

    public static int addFive(int num){
        return num+5;
    }

    public static int addSeven(int num){
        return num+7;
    }
}
