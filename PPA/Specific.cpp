#include<iostream>

using namespace std;

int Addi(int i, int j)
{
    int ans = 0;
    ans = i + j;
    return ans;
}
float Addf(float i, float j)
{
    float ans = 0.0;
    ans = i + j;
    return ans;
}


int main()
{
    int a = 10;
    int b = 11;
    int iRet = 0;
    
    float x = 90.0f;
    float y = 67.0f;
    float fRet = 0.0f;

    iRet = Addi(a,b);
    fRet = Addf(x,y);

    cout<<"Addition of integers : "<<iRet<<"\n";
    cout<<"Addition of floats : "<<fRet<<"\n";

    return 0;
}