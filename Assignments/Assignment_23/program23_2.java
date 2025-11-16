import java.util.*;

class ArrayX
{
    public int FirstOcc(int Brr[], int iSize, int iNo)
    {
        int iCnt = 0;


        for(iCnt = 0; iCnt < iSize; iCnt++)
        {
            if((Brr[iCnt] ) == iNo)
            {
                break;
            }
        }

        if(iCnt == iSize)
        {
            return -1;
        }
        else
        {
            return iCnt ;
        }      
    }
}

class program23_2
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
        aobj.FirstOcc(Arr, iLength, iValue);

        iRet = aobj.FirstOcc(Arr, iLength, iValue);

        if(iRet == -1)
        {
            System.out.println("There is no such number");
        }
       else
        {
            System.out.println("First occurenece of the number is at "+ iRet);
        }

        aobj = null;
        Arr = null;
        sobj = null;

        System.gc();
    }
}
