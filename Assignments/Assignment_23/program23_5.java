import java.util.*;

class ArrayX
{
    //////////////////////////////////////////////////////////////
    //
    //  Function name : Product
    //  Description   : To get product of Odd number
    //  Input         : int, int
    //  Output        : int
    //  Author        : Prajwal Sanjay Pansare
    //  Date          : 16/11/2025
    //
    //////////////////////////////////////////////////////////////

    public int Product(int Brr[], int iSize)
    {
        int iCnt = 0;
        int iCount = 0;
        boolean bOdd = false;

        for(iCount = 1,iCnt = 0; iCnt < iSize; iCnt++)
        {
            if((Brr[iCnt] % 2) != 0)
            {
                iCount = iCount * Brr[iCnt];
                bOdd = true;
            }
        }

        if(bOdd == false)
        {
            return 0;
        }
        else 
        {
            return iCount;
        }
    
    }
}

class program23_5
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

        iRet = aobj.Product(Arr, iLength);

        System.out.println("Product is "+ iRet);

        aobj = null;
        Arr = null;
        sobj = null;

        System.gc();
    }
}
