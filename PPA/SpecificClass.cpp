#include<iostream>
using namespace std;

class Array
{
    public:
        int *arr;
        int iSize;

        Array(int length)
        {
            iSize = length;
            arr = new int[iSize];
        }
        void Accept()
        {
            cout<<"Enter the values\n";
            for(int i = 0; i < iSize; i++)
            {
                cin>>arr[i];
            }
        } 
        void Display()
        {
            cout<<"Values of array are :\n";
            for(int i = 0; i < iSize; i++)
            {
                cout<<arr[i]<<"\n";
            }
        }
};

int main()
{
    Array obj1(5);

    obj1.Accept();
    obj1.Display();

    return 0;
}