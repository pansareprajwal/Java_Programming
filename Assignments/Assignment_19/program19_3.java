class Logic
{
    //////////////////////////////////////////////////////////////
    //
    //  Function name : checkDivisible
    //  Description   : To check number is divisible by 5 and 11
    //  Input         : int
    //  Output        : void
    //  Author        : Prajwal Sanjay Pansare
    //  Date          : 27/10/2025
    //
    //////////////////////////////////////////////////////////////

    void checkDivisible(int num)
    {
        if(num < 0)
        {
            num = -num;
        }

        if(((num % 5) == 0) || (num % 11) == 0)
        {
            System.out.print("It is divisible");
        }
        else
        {
            System.out.print("It is not divisible");
        }
    }
}

//////////////////////////////////////////////////////////////
//
//  Entry point function for the application
//
//////////////////////////////////////////////////////////////

class program19_3
{
    public static void main(String argu[])
    {
        Logic obj = new Logic();
        obj.checkDivisible(55);  
    }
}
