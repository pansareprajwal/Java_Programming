class Logic
{
    //////////////////////////////////////////////////////////////
    //
    //  Function name : sumEvenNumbers
    //  Description   : To get sum of all even numbers
    //  Input         : int
    //  Output        : void
    //  Author        : Prajwal Sanjay Pansare
    //  Date          : 27/10/2025
    //
    //////////////////////////////////////////////////////////////

    void sumEvenNumbers(int iNo)
    {
        if(iNo < 0)
        {
            iNo = -iNo;
        }

        int iCnt = 0;
        int iSum = 0;

        for(iCnt = 1; iCnt <= iNo; iCnt++) 
        {
            if((iCnt % 2) == 0)
            {
                iSum = iSum + iCnt;
            }
        }
        System.out.print("Sum of Even numbers is "+iSum);
    }
        
}

//////////////////////////////////////////////////////////////
//
//  Entry point function for the application
//
//////////////////////////////////////////////////////////////

class program20_1
{
    public static void main(String argu[])
    {
        Logic obj = new Logic();
        obj.sumEvenNumbers(10);  
    }
}
