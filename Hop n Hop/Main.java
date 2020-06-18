#include<iostream>
#include<math.h>
 
int main()
{
  int x=3,y=4,x1,y1;
  std::cin>>x1>>y1;
  double pow1,pow2,power,sqr;
  pow1=pow((x1-x),2);
  pow2=pow((y1-y),2);
  power=pow1+pow2;
  sqr=sqrt(power);
  std::cout<<int(sqr);
}
  