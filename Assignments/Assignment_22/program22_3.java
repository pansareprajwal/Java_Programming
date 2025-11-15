import java.util.*;

class ArrayX
{
    public boolean Frequency(int Brr[], int iSize)
    {
        int iCnt = 0;


        for(iCnt = 0; iCnt < iSize; iCnt++)
        {
            if((Brr[iCnt] ) == 11)
            {
                break;
            }
        }
        
        if(iCnt != iSize)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

class program22_3
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iLength = 0, i = 0;
        boolean  bRet = false;

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

        bRet = aobj.Frequency(Arr, iLength);

       if(bRet == true)
        {
             System.out.println("11 is present in numbers");
        }
       else
        {
             System.out.println("11 is not present in numbers");
        }

        aobj = null;
        Arr = null;
        sobj = null;

        System.gc();
    }
}
