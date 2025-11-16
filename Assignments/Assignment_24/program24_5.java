import java.util.*;

class ArrayX
{
    //////////////////////////////////////////////////////////////
    //
    //  Function name : DigitsSum
    //  Description   : To get summation of digits of elements from data
    //  Input         : int, int
    //  Output        : int
    //  Author        : Prajwal Sanjay Pansare
    //  Date          : 16/11/2025
    //
    //////////////////////////////////////////////////////////////

    public void DigitsSum(int Brr[], int iSize)
    {
        int iCnt = 0, iDigit = 0, iNo = 0, iSum = 0;

        for(iCnt = 0; iCnt < iSize; iCnt++)
        {
            iNo = Brr[iCnt];
            iSum = 0;
            while(iNo != 0)
            {
                iDigit = iNo % 10;
                iNo = iNo / 10;
                iSum = iSum + iDigit; 
            }
            System.out.println(iSum);
        }
    
    }
}

class program24_5
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

        aobj.DigitsSum(Arr, iLength);

        aobj = null;
        Arr = null;
        sobj = null;

        System.gc();
    }
}
