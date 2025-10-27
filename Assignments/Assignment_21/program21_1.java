class Logic
{
    //////////////////////////////////////////////////////////////
    //
    //  Function name : productofDigits
    //  Description   : To get multiplication of digits
    //  Input         : int
    //  Output        : void
    //  Author        : Prajwal Sanjay Pansare
    //  Date          : 27/10/2025
    //
    //////////////////////////////////////////////////////////////

    void productofDigits(int iNo)
    {
        if(iNo < 0)
        {
            iNo = -iNo;
        }

        int iDigit = 0;
        int iMult = 0;

        iMult = 1;
        while(iNo != 0)
        {
            iDigit = iNo % 10;
            iNo = iNo / 10;
            iMult = iMult * iDigit;
        } 

        System.out.print("Product of digits is "+iMult);
    }
        
}

//////////////////////////////////////////////////////////////
//
//  Entry point function for the application
//
//////////////////////////////////////////////////////////////

class program21_1
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.productofDigits(45872);  
    }
}
