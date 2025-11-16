import java.util.*;

class ArrayX
{
    //////////////////////////////////////////////////////////////
    //
    //  Function name : Frequency
    //  Description   : To find frequency of given element
    //  Input         : int, int, int
    //  Output        : int
    //  Author        : Prajwal Sanjay Pansare
    //  Date          : 16/11/2025
    //
    //////////////////////////////////////////////////////////////

    public int Frequency(int Brr[], int iSize, int iNo)
    {
        int iCnt = 0, iCount = 0;


        for(iCnt = 0; iCnt < iSize; iCnt++)
        {
            if((Brr[iCnt] ) == iNo)
            {
                iCount++;
            }
        }
        
        return iCount;
    }
}

class program22_5
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iLength = 0, i = 0;
        int  iRet = 0, iValue = 0;

        System.out.println("Enter the size of an elements : ");
        iLength = sobj.nextInt();
        
        int Arr[] = new int[iLength];

        System.out.println("Enter the elements : ");

        for(i = 0; i < Arr.length; i++)
        {
            Arr[i] = sobj.nextInt();
        }

        System.out.println("Enter the element to find frequency : ");
        iValue = sobj.nextInt();

        ArrayX aobj = new ArrayX();
        aobj.Frequency(Arr, iLength, iValue);

        iRet = aobj.Frequency(Arr, iLength, iValue);

       System.out.println("Frequency of " + iValue + " : " + iRet);



        aobj = null;
        Arr = null;
        sobj = null;

        System.gc();
    }
}
