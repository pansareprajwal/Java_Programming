import java.util.*;

class ArrayX
{
    public int Minimum(int Brr[], int iSize)
    {
        int iCnt = 0;
        int iMin = 0;

        for(iMin = Brr[0],iCnt = 0; iCnt < iSize; iCnt++)
        {
            if(Brr[iCnt] < iMin)
            {
                iMin = Brr[iCnt];
            }
        }

        return iMin;
    
    }
}

class program24_2
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

        iRet = aobj.Minimum(Arr, iLength);

        System.out.println("Smallest Number is "+ iRet);

        aobj = null;
        Arr = null;
        sobj = null;

        System.gc();
    }
}
