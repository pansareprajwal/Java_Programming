import java.util.*;

class ArrayX
{
    //////////////////////////////////////////////////////////////
    //
    //  Function name : Range
    //  Description   : To get elements between range
    //  Input         : int, int, int, int
    //  Output        : void
    //  Author        : Prajwal Sanjay Pansare
    //  Date          : 16/11/2025
    //
    //////////////////////////////////////////////////////////////

    public void Range(int Brr[], int iSize, int iStart, int iEnd)
    {
        int iCnt = 0;

        for(iCnt = 0; iCnt < iSize; iCnt++)
        {
            if((iStart < Brr[iCnt]) && (iEnd > Brr[iCnt]))
            {
                System.out.println(Brr[iCnt]);
            }
        }
     
    }
}

class program23_4
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iLength = 0, i = 0, iValue1 = 0, iValue2 = 0;

        System.out.println("Enter the size of an elements : ");
        iLength = sobj.nextInt();
        
        int Arr[] = new int[iLength];

        System.out.println("Enter the elements : ");

        for(i = 0; i < Arr.length; i++)
        {
            Arr[i] = sobj.nextInt();
        }

        System.out.println("Enter the starting point : ");
        iValue1 = sobj.nextInt();

        System.out.println("Enter the ending point : ");
        iValue2 = sobj.nextInt();

        ArrayX aobj = new ArrayX();
        aobj.Range(Arr, iLength, iValue1, iValue2);

        aobj = null;
        Arr = null;
        sobj = null;

        System.gc();
    }
}
