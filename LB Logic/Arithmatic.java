
package Marvellous;

public class Arithmatic
{
    public int iValue1;  // Characteristics
    public int iValue2;  // Characteristics

    public Arithmatic(int i, int j)  // Parametrised Constructor
    {
        iValue1 = i;
        iValue2 = j;
    }

    public int Addition()  // Behaviour
    {
        int iSum = 0;
        iSum = iValue1 + iValue2;
        return iSum;
    }
}
