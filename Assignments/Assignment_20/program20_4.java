class Logic
{
    //////////////////////////////////////////////////////////////
    //
    //  Function name : findLargest
    //  Description   : To get largest digit from number
    //  Input         : int
    //  Output        : void
    //  Author        : Prajwal Sanjay Pansare
    //  Date          : 27/10/2025
    //
    //////////////////////////////////////////////////////////////

    void findLargest(int iNo)
    {
        if(iNo < 0)
        {
            iNo = -iNo;
        }

        int iDigit = 0;
        int iMax = 0;

        while(iNo != 0)
        {
            iDigit = iNo % 10;
            iNo = iNo / 10;
            if(iMax < iDigit)
            {
                iMax = iDigit;
            }
        } 

        System.out.print("Largest digit is "+iMax);
    }
        
}

//////////////////////////////////////////////////////////////
//
//  Entry point function for the application
//
//////////////////////////////////////////////////////////////

class program20_4
{
    public static void main(String argu[])
    {
        Logic obj = new Logic();
        obj.findLargest(83429);  
    }
}
