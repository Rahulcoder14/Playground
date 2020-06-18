#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
 int x,y,z,a,b,c;
  std::cin>>x>>y>>z;
  a=75*y;
  b=30*z;
  c=a+b;
  if(c<=x)
  {
    std::cout<<"Boat is stable";
}
  else
  {
    std::cout<<"Boat will drow";
  }
}
    