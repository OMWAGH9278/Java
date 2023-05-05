
class Array
{
    public int iSize;
    public String arr[];
    public int iMaxLength;

    public Array(int a, String b[])
    {
        iSize = a;
        arr = b;
        iMaxLength = 0;
    }

    public int maxStringLength()
    {
        int iCnt = 0;
        for(iCnt = 0; iCnt < iSize; iCnt++)
        {
            if(arr[iCnt].length() > iMaxLength)
            {
                iMaxLength = arr[iCnt].length();
            }
        }

        return iMaxLength;
    }
}

class Assignment26_9
{
    public static void main(String arg[])
    {
        Array aobj = new Array(arg.length,arg);
        
        int iRet = aobj.maxStringLength();
        System.out.println("Length is : "+iRet);
    }
}