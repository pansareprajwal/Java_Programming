class Logic
{
    //////////////////////////////////////////////////////////////
    //
    //  Function name : checkLeapYear
    //  Description   : To check year is leap or not
    //  Input         : int
    //  Output        : void
    //  Author        : Prajwal Sanjay Pansare
    //  Date          : 27/10/2025
    //
    //////////////////////////////////////////////////////////////

    void checkLeapYear(int num)
    {
        if((num % 4) == 0)
        {
            System.out.print("It is Leap year");
        }
        else
        {
            System.out.print("It is not Leap year");
        }
    }
}

//////////////////////////////////////////////////////////////
//
//  Entry point function for the application
//
//////////////////////////////////////////////////////////////

class program19_1
{
    public static void main(String argu[])
    {
        Logic obj = new Logic();
        obj.checkLeapYear(2019);  // Example input
    }
}
