class Logic
{

    //////////////////////////////////////////////////////////////
    //
    //  Function name : calculateSum
    //  Description   : To get summatation of natural numbers
    //  Input         : int
    //  Output        : void
    //  Author        : Prajwal Sanjay Pansare
    //  Date          : 27/10/2025
    //
    //////////////////////////////////////////////////////////////

    void calculateSum(int num)
    {
        int iCnt = 0;
        int iSum = 0;

        for(iCnt = 1; iCnt <= num; iCnt++)
        {
            iSum = iSum + iCnt;
        }
        System.out.print("Sum is : "+ iSum);
    }
}

//////////////////////////////////////////////////////////////
//
//  Entry point function for the application
//
//////////////////////////////////////////////////////////////

class program16_1
{
    public static void main(String argu[])
    {
        Logic obj = new Logic();
        obj.calculateSum(10);
    }
}
