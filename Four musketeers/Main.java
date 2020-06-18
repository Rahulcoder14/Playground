#include<iostream>
using namespace std;
#include<math.h>
int main()
{
  //Type your code here.
  float x1=2,y1=4,x2=10,y2=15,x3=5,y3=8;

  std::cin>>x1>>y1>>x2>>y2>>x3>>y3;
  float x = (x1+x2+x3)/3;
   float y = (y1+y2+y3)/3;
  std::cout<<x<<"\n";
  std::cout<<y;
}