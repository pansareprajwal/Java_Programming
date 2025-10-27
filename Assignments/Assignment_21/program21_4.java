class Logic
{
    //////////////////////////////////////////////////////////////
    //
    //  Function name : CountFactors
    //  Description   : To count total number of factors
    //  Input         : int
    //  Output        : void
    //  Author        : Prajwal Sanjay Pansare
    //  Date          : 27/10/2025
    //
    //////////////////////////////////////////////////////////////

    void CountFactors(int iNo)  
    {
        if(iNo < 0)
        {
            iNo = -iNo;
        }

        int iCnt = 0;
        int iFreq = 0;

        for(iCnt = 1; iCnt <= iNo/2; iCnt++)
        { 
            if((iNo % iCnt) == 0)
            {
                iFreq++;
            }
        }
        
        System.out.print("Total factors in number "+iFreq);
    }
        
}

//////////////////////////////////////////////////////////////
//
//  Entry point function for the application
//
//////////////////////////////////////////////////////////////

class program21_4
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.CountFactors(20);  
    }
}
