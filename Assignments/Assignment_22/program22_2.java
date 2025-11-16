import java.util.*;

class ArrayX
{
    //////////////////////////////////////////////////////////////
    //
    //  Function name : Frequency
    //  Description   : Freqency difference of Even and Odd
    //  Input         : int, int
    //  Output        : int
    //  Author        : Prajwal Sanjay Pansare
    //  Date          : 16/11/2025
    //
    //////////////////////////////////////////////////////////////
    public int Frequency(int Brr[], int iSize)
    {
        int iCnt = 0, iEven = 0, iOdd = 0;

        for(iCnt = 0; iCnt < iSize; iCnt++)
        {
            if((Brr[iCnt] % 2) == 0)
            {
                iEven++;
            }
            else
            {
                iOdd++;
            }
        }
        
        return (iEven-iOdd);
    }
}

class program22_2
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iLength = 0, i = 0, iRet = 0;

        System.out.println("Enter the size of an elements : ");
        iLength = sobj.nextInt();
        
        int Arr[] = new int[iLength];

        System.out.println("Enter the elements : ");

        for(i = 0; i < Arr.length; i++)
        {
            Arr[i] = sobj.nextInt();
        } 

        ArrayX aobj = new ArrayX();
        aobj.Frequency(Arr, iLength);

        iRet = aobj.Frequency(Arr, iLength);
        System.out.println("Freqency difference : "+iRet);

        aobj = null;
        Arr = null;
        sobj = null;

        System.gc();
    }
}
