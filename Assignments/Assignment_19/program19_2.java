class Logic
{
    //////////////////////////////////////////////////////////////
    //
    //  Function name : displayGrade
    //  Description   : To display grade by marks
    //  Input         : int
    //  Output        : void
    //  Author        : Prajwal Sanjay Pansare
    //  Date          : 27/10/2025
    //
    //////////////////////////////////////////////////////////////

    void displayGrade(int num)
    {
        if((num > 100) || (num < 0))
        {
            System.out.print("Invalid Marks");
        }

        if((num > 75) && (num < 100))
        {
            System.out.print("A grade");
        }
        else if((num > 50) && (num < 75))
        {
            System.out.print("B grade");
        }
        else if((num < 50) && (num >= 0))
        {
            System.out.print("C grade");
        }
    }
}

//////////////////////////////////////////////////////////////
//
//  Entry point function for the application
//
//////////////////////////////////////////////////////////////

class program19_2
{
    public static void main(String argu[])
    {
        Logic obj = new Logic();
        obj.displayGrade(82);  // Example input
    }
}
