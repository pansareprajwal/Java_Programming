import java.util.*;

class ArrayX
{
    public int Difference(int Brr[], int iSize)
    {
        int iCnt = 0, iEven = 0, iOdd = 0;

        for(iCnt = 0; iCnt < iSize; iCnt++)
        {
            if((Brr[iCnt] % 2) == 0)
            {
                iEven = iEven + Brr[iCnt];
            }
            else
            {
                iOdd = iOdd + Brr[iCnt];
            }
        }

        return iEven - iOdd;
    }
}

class program25_1
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iLength = 0, i = 0;
        int iRet = 0;

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

        System.out.println("Result is "+iRet);

        aobj = null;
        Arr = null;
        sobj = null;

        System.gc();
    }
}
