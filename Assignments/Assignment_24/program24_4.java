import java.util.*;

class ArrayX
{
    public void Digits(int Brr[], int iSize)
    {
        int iCnt = 0;

        for(iCnt = 0; iCnt < iSize; iCnt++)
        {
            if((Brr[iCnt] > 99) && (Brr[iCnt] < 1000))
            {
                System.out.println(Brr[iCnt]);
            }
        }
    
    }
}

class program24_4
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

        aobj.Digits(Arr, iLength);

        aobj = null;
        Arr = null;
        sobj = null;

        System.gc();
    }
}
