
// Case 4
// Multiple inheritance (Not Allowed)

class Demo
{
    int i;
    void fun()
    {}
}

class Hello extends Demo
{
    int i;
    void fun()
    {}
}

class Marvellous extends Demo, Hello  // Error
{

}
