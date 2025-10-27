class Logic
{
    //////////////////////////////////////////////////////////////
    //
    //  Function name : printDigits
    //  Description   : To Display the digits of the numbers
    //  Input         : int
    //  Output        : void
    //  Author        : Prajwal Sanjay Pansare
    //  Date          : 27/10/2025
    //
    //////////////////////////////////////////////////////////////

    void printDigits(int num)
    {
        int iDigit1, iDigit2 = 0;
        int iRev = 0;

        while(num != 0)
        {
            iDigit1 = num % 10;
            num = num / 10;
            iRev = (iRev*10) + iDigit1;
        }

        while(iRev != 0)
        {
            iDigit2 = iRev % 10;
            iRev = iRev / 10;
            System.out.print(iDigit2+" ");
        }

    }
}

//////////////////////////////////////////////////////////////
//
//  Entry point function for the application
//
//////////////////////////////////////////////////////////////

class program19_4
{
    public static void main(String argu[])
    {
        Logic obj = new Logic();
        obj.printDigits(9876);  
    }
}
