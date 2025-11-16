import java.util.*;

class ArrayX
{
    //////////////////////////////////////////////////////////////
    //
    //  Function name : Difference
    //  Description   : to get difference between largest and smallest number
    //  Input         : int, int
    //  Output        : int
    //  Author        : Prajwal Sanjay Pansare
    //  Date          : 16/11/2025
    //
    //////////////////////////////////////////////////////////////

    public int Difference(int Brr[], int iSize)
    {
        int iCnt = 0;
        int iMin = 0, iMax = 0;

        for(iMin = Brr[0], iMax = Brr[0], iCnt = 0; iCnt < iSize; iCnt++)
        {
            if(Brr[iCnt] < iMin)
            {
                iMin = Brr[iCnt];
            }

            if(Brr[iCnt] > iMax)
            {
                iMax = Brr[iCnt];
            }
        }

        return (iMax - iMin);
    
    }
}

class program24_3
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iLength = 0, i = 0;
        int  iRet = 0;

        System.out.println("Enter the size of an elements : ");
        iLength = sobj.nextInt();
        
        int Arr[] = new int[iLength];

        System.out.println("Enter the elements : ");

        for(i = 0; i < Arr.length; i++)
        {
            Arr[i] = sobj.nextInt();
        }

        ArrayX aobj = new ArrayX();

        iRet = aobj.Difference(Arr, iLength);

        System.out.println("Difference is "+ iRet);

        aobj = null;
        Arr = null;
        sobj = null;

        System.gc();
    }
}
