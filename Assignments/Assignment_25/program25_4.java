import java.util.*;

class ArrayX
{
    //////////////////////////////////////////////////////////////
    //
    //  Function name : Display
    //  Description   : To show elements which are divisible by 3 and 5
    //  Input         : int, int
    //  Output        : void
    //  Author        : Prajwal Sanjay Pansare
    //  Date          : 16/11/2025
    //
    //////////////////////////////////////////////////////////////

    public void Display(int Brr[], int iSize)
    {
        int iCnt = 0;

        for(iCnt = 0; iCnt < iSize; iCnt++)
        {
            if(((Brr[iCnt] % 3) == 0) && ((Brr[iCnt] % 5) == 0))
            {
                System.out.println(Brr[iCnt]);
            }         
        }
    }
}

class program25_4
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iLength = 0, i = 0;

        System.out.println("Enter the size of an elements : ");
        iLength = sobj.nextInt();
        
        int Arr[] = new int[iLength];

        System.out.println("Enter the elements : ");

        for(i = 0; i < Arr.length; i++)
        {
            Arr[i] = sobj.nextInt();
        }

        ArrayX aobj = new ArrayX();

        aobj.Display(Arr, iLength);

        aobj = null;
        Arr = null;
        sobj = null;

        System.gc();
    }
}
