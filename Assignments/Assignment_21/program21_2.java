class Logic
{
    //////////////////////////////////////////////////////////////
    //
    //  Function name : countEvenOddRange
    //  Description   : To count number of even and odd in N number
    //  Input         : int
    //  Output        : void
    //  Author        : Prajwal Sanjay Pansare
    //  Date          : 27/10/2025
    //
    //////////////////////////////////////////////////////////////

    void countEvenOddRange(int iNo)
    {
        if(iNo < 0)
        {
            iNo = -iNo;
        }

        int iCnt = 0;
        int iEvenFreq = 0;
        int iOddFreq = 0;

        for(iCnt = 1; iCnt <= iNo; iCnt++)
        {
            if((iCnt % 2) == 0)
            {
                iEvenFreq++;
            }
            else
            {
                iOddFreq++;
            }
        }

        System.out.print("Even :"+iEvenFreq+"\n");
        System.out.print("Odd : "+iOddFreq);
    }
        
}

//////////////////////////////////////////////////////////////
//
//  Entry point function for the application
//
//////////////////////////////////////////////////////////////

class program21_2
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.countEvenOddRange(75);  
    }
}
