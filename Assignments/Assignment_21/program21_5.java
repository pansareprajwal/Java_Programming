class Logic
{
    //////////////////////////////////////////////////////////////
    //
    //  Function name : printDivisibleBy2and3
    //  Description   : To display the numbers which divisible by 2 & 3
    //  Input         : int
    //  Output        : void
    //  Author        : Prajwal Sanjay Pansare
    //  Date          : 27/10/2025
    //
    //////////////////////////////////////////////////////////////

    void printDivisibleBy2and3(int iNo)  
    {
        if(iNo < 0)
        {
            iNo = -iNo;
        }

        int iCnt = 0;

        for(iCnt = 1; iCnt <= iNo; iCnt++)
        { 
            if(((iCnt % 2) == 0) && ((iCnt % 3) == 0))
            {
                System.out.print(iCnt+" ");
            }
        }
    }
        
}

//////////////////////////////////////////////////////////////
//
//  Entry point function for the application
//
//////////////////////////////////////////////////////////////

class program21_5
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.printDivisibleBy2and3(30);  
    }
}
