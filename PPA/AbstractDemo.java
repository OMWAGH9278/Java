// abstract class is a class which contains 0 or more 
// abstract methods in it

// Abstraction class achieves 0 to 100% abstraction

abstract class Arithmatic {
    public int Addition(int iNo1, int iNo2) {
        return iNo1 + iNo2;
    }

    public abstract int Substraction(int iNo1, int iNo2); // virtual int Substraction(int iNo1, int iNo2) = 0;
}

class Marvellous extends Arithmatic {
    public int Substraction(int iNo1, int iNo2) {
        return iNo1 - iNo2;
    }
}

class AbstractDemo {

    public static void main(String a[]) {
        // Arithmatic aobj = new Arithmatic(); NA
        Arithmatic aobj = new Marvellous(); // Allowed
        Marvellous mobj = new Marvellous();
        int iRet = 0;
        iRet = mobj.Addition(11, 10);
        System.out.println("Addition is : " + iRet);
        iRet = mobj.Substraction(11, 10);
        System.out.println("Substraction is : " + iRet);
    }
}