class Logic
{
    //////////////////////////////////////////////////////////////
    //
    //  Function name : findSmallest
    //  Description   : To get largest digit from number
    //  Input         : int
    //  Output        : void
    //  Author        : Prajwal Sanjay Pansare
    //  Date          : 27/10/2025
    //
    //////////////////////////////////////////////////////////////

    void findSmallest(int iNo)
    {
        if(iNo < 0)
        {
            iNo = -iNo;
        }

        int iDigit = 0;
        int iMax = 0;

        iMax = 10;
        while(iNo != 0)
        {
            iDigit = iNo % 10;
            iNo = iNo / 10;
            if(iMax > iDigit)
            {
                iMax = iDigit;
            }
        } 

        System.out.print("Smallest digit is "+iMax);
    }
        
}

//////////////////////////////////////////////////////////////
//
//  Entry point function for the application
//
//////////////////////////////////////////////////////////////

class program20_5
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.findSmallest(45872);  
    }
}
