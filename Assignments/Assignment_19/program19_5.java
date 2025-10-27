class Logic
{
    //////////////////////////////////////////////////////////////
    //
    //  Function name : calculatePower
    //  Description   : To Display the digits of the numbers
    //  Input         : int
    //  Output        : void
    //  Author        : Prajwal Sanjay Pansare
    //  Date          : 27/10/2025
    //
    //////////////////////////////////////////////////////////////

    void calculatePower(int base, int exp)
    {
        int iCnt = 0;
        int iTotal = 0;

        iTotal = 1;
        for(iCnt = 1; iCnt <= exp; iCnt++)
        {
            iTotal = iTotal*base;
        }
        System.out.print("Power of number is "+iTotal);
    }
}

//////////////////////////////////////////////////////////////
//
//  Entry point function for the application
//
//////////////////////////////////////////////////////////////

class program19_5
{
    public static void main(String argu[])
    {
        Logic obj = new Logic();
        obj.calculatePower(2, 5);  
    }
}
