class Logic
{
    //////////////////////////////////////////////////////////////
    //
    //  Function name : checkPerfect
    //  Description   : To check number is perfect or not
    //  Input         : int
    //  Output        : void
    //  Author        : Prajwal Sanjay Pansare
    //  Date          : 27/10/2025
    //
    //////////////////////////////////////////////////////////////

    void checkPerfect(int iNo)
    {
        if(iNo < 0)
        {
            iNo = -iNo;
        }

        int iCnt = 0;
        int iSum = 0;

        for(iCnt = 1; iCnt < iNo; iCnt++) 
        {
            if((iNo % iCnt) == 0)
            {
                iSum = iSum + iCnt;
            }
        }

        if(iSum == iNo)
        {
            System.out.print("It is Perfect number");
        }
        else
        {
            System.out.print("It is not Perfect number");
        }
    }
        
}

//////////////////////////////////////////////////////////////
//
//  Entry point function for the application
//
//////////////////////////////////////////////////////////////

class program20_3
{
    public static void main(String argu[])
    {
        Logic obj = new Logic();
        obj.checkPerfect(6);  
    }
}
