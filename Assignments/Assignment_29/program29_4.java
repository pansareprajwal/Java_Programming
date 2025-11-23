import java.util.*;

class Pattern
{
    //////////////////////////////////////////////////////////////
    //
    //  Function name : Pattern
    //  Description :   print pattern using input
    //  Input :         int
    //  Output :        void
    //  Author :        Prajwal Sanjay Pansare
    //  Date :          23/11/2025
    //
    //////////////////////////////////////////////////////////////
    
    public void Display(int iRow, int iCol)
    {
        int i = 0, j = 0;

        for(i = 1; i <= iRow; i++)                       
        {
            for(j = 1; j <= iCol; j++)                        
            {
                if((i % 2) == 0)
                {
                    System.out.printf("%d\t",-j);
                }
                else
                {
                    System.out.printf("%d\t",j);
                }
            }
            System.out.println();
        }
        
        System.out.println();
    }
}
class program29_4
{
    public static void main(String A[])
    {   
        Scanner sobj = new Scanner(System.in);
        int iValue1 = 0, iValue2 = 0;

        System.out.println("Enter the number of rows : ");
        iValue1 = sobj.nextInt();

        System.out.println("Enter the number of columns : ");
        iValue2 = sobj.nextInt();
        
        Pattern pobj = new Pattern();
        pobj.Display(iValue1, iValue2);
    }
}