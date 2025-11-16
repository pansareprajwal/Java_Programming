import java.util.*;

class ArrayX
{
    //////////////////////////////////////////////////////////////
    //
    //  Function name : Check
    //  Description   : Whether the number present or not in data
    //  Input         : int, int, int
    //  Output        : boolean
    //  Author        : Prajwal Sanjay Pansare
    //  Date          : 16/11/2025
    //
    //////////////////////////////////////////////////////////////

    public boolean Check(int Brr[], int iSize, int iNo)
    {
        int iCnt = 0;


        for(iCnt = 0; iCnt < iSize; iCnt++)
        {
            if((Brr[iCnt] ) == iNo)
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

class program23_1
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iLength = 0, i = 0, iValue = 0;
        boolean  bRet = false;

        System.out.println("Enter the size of an elements : ");
        iLength = sobj.nextInt();
        
        int Arr[] = new int[iLength];

        System.out.println("Enter the elements : ");

        for(i = 0; i < Arr.length; i++)
        {
            Arr[i] = sobj.nextInt();
        }

        System.out.println("Enter the element : ");
        iValue = sobj.nextInt();

        ArrayX aobj = new ArrayX();
        aobj.Check(Arr, iLength, iValue);

        bRet = aobj.Check(Arr, iLength, iValue);

       if(bRet == true)
       {
            System.out.println("Number is present");
       }
       else
       {
            System.out.println("Number is not present");
       }



        aobj = null;
        Arr = null;
        sobj = null;

        System.gc();
    }
}
