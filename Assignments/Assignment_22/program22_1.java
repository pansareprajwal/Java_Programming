import java.util.*;

class ArrayX
{
    public int CountEven(int Brr[], int iSize)
    {
        int iCnt = 0, iFrequency = 0;

        for(iCnt = 0; iCnt < iSize; iCnt++)
        {
            if((Brr[iCnt] % 2) == 0)
            {
                iFrequency++;
            }
        }
        
        return iFrequency;
    }
}

class program22_1
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
        aobj.CountEven(Arr, iLength);

        iRet = aobj.CountEven(Arr, iLength);
        System.out.println("Number of even elements are : "+iRet);

        aobj = null;
        Arr = null;
        sobj = null;

        System.gc();
    }
}
