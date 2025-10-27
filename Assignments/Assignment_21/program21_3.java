class Logic
{
    //////////////////////////////////////////////////////////////
    //
    //  Function name : displayFactors
    //  Description   : To diplay all factors of number
    //  Input         : int
    //  Output        : void
    //  Author        : Prajwal Sanjay Pansare
    //  Date          : 27/10/2025
    //
    //////////////////////////////////////////////////////////////

    void displayFactors(int iNo)  
    {
        if(iNo < 0)
        {
            iNo = -iNo;
        }

        int iCnt = 0;

        for(iCnt = 1; iCnt <= iNo/2; iCnt++)
        { 
            if((iNo % iCnt) == 0)
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

class program21_3
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.displayFactors(40);  
    }
}
