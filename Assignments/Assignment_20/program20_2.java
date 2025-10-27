class Logic
{
    //////////////////////////////////////////////////////////////
    //
    //  Function name : printReverse
    //  Description   : To Display N number in reverse 
    //  Input         : int
    //  Output        : void
    //  Author        : Prajwal Sanjay Pansare
    //  Date          : 27/10/2025
    //
    //////////////////////////////////////////////////////////////

    void printReverse(int iNo)
    {
        if(iNo < 0)
        {
            iNo = -iNo;
        }

        int iCnt = 0;

        for(iCnt = iNo; iCnt >= 1; iCnt--) 
        {
            System.out.print(" "+iCnt);
        }
    }
        
}

//////////////////////////////////////////////////////////////
//
//  Entry point function for the application
//
//////////////////////////////////////////////////////////////

class program20_2
{
    public static void main(String argu[])
    {
        Logic obj = new Logic();
        obj.printReverse(10);  
    }
}
