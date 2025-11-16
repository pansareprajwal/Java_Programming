import java.util.*;

class ArrayX
{
    //////////////////////////////////////////////////////////////
    //
    //  Function name : LastOcc
    //  Description   : To find last Occurence of element in data
    //  Input         : int, int, int
    //  Output        : int
    //  Author        : Prajwal Sanjay Pansare
    //  Date          : 16/11/2025
    //
    //////////////////////////////////////////////////////////////

    public int LastOcc(int Brr[], int iSize, int iNo)
    {
        int iCnt = 0;


        for(iCnt = iSize - 1; iCnt > 0; iCnt--)
        {
            if((Brr[iCnt] ) == iNo)
            {
                break;
            }
        }

        if(iCnt == 0)
        {
            return -1;
        }
        else
        {
            return iCnt;
        }      
    }
}

class program23_3
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iLength = 0, i = 0, iValue = 0;
        int  iRet = 0;

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
        aobj.LastOcc(Arr, iLength, iValue);

        iRet = aobj.LastOcc(Arr, iLength, iValue);

        if(iRet == -1)
        {
            System.out.println("There is no such number");
        }
       else
        {
            System.out.println("Last occurenece of the number is at "+ iRet);
        }

        aobj = null;
        Arr = null;
        sobj = null;

        System.gc();
    }
}
