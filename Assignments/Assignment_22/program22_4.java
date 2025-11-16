import java.util.*;

class ArrayX
{
    //////////////////////////////////////////////////////////////
    //
    //  Function name : Frequency
    //  Description   : To display the frequency of element "11"
    //  Input         : int, int
    //  Output        : int
    //  Author        : Prajwal Sanjay Pansare
    //  Date          : 16/11/2025
    //
    //////////////////////////////////////////////////////////////

    public int Frequency(int Brr[], int iSize)
    {
        int iCnt = 0, iCount = 0;


        for(iCnt = 0; iCnt < iSize; iCnt++)
        {
            if((Brr[iCnt] ) == 11)
            {
                iCount++;
            }
        }
        
        return iCount;
    }
}

class program22_4
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iLength = 0, i = 0;
        int  iRet = 0;

        System.out.println("Enter the size of an elements : \n");
        iLength = sobj.nextInt();
        
        int Arr[] = new int[iLength];

        System.out.println("Enter the elements : \n");

        for(i = 0; i < Arr.length; i++)
        {
            Arr[i] = sobj.nextInt();
        }

        ArrayX aobj = new ArrayX();
        aobj.Frequency(Arr, iLength);

        iRet = aobj.Frequency(Arr, iLength);

       System.out.println("Frequency of 11 : "+iRet);

        aobj = null;
        Arr = null;
        sobj = null;

        System.gc();
    }
}
