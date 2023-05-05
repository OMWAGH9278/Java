#include<iostream>
using namespace std;

template<class T>
class Array
{
    public:
        T *arr;
        int iSize;

        Array(int length)
        {
            iSize = length;
            arr = new T[iSize];
        }
        void Accept()
        {
            cout<<"\nEnter the values\n";
            for(int i = 0; i < iSize; i++)
            {
                cin>>arr[i];
            }
        }
        void Display()
        {
            cout<<"Values of array are\n";
            for(int i = 0; i < iSize; i++)
            {
                cout<<arr[i]<<"\t";
            }
        } 
};

int main()
{
    Array <int>obj1(5);
    
    obj1.Accept();
    obj1.Display();

    Array <float>obj2(5);
    
    obj2.Accept();
    obj2.Display();

    Array <char>obj3(5);
    
    obj3.Accept();
    obj3.Display();

    Array <double>obj4(5);
    
    obj4.Accept();
    obj4.Display();

    return 0;
}