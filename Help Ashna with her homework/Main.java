#include<iostream>
int main()
{
  int a,b,c,v,n,m,q;
  std::cin>>a>>b;
  c=a+b;
  v=a-b;
  n=a*b;
  m=a/b;
  q=a%b;
  std::cout<<"a+b="<<c<<"\n";
  std::cout<<"a-b="<<v<<"\n";
  std::cout<<"a*b="<<n<<"\n";
  std::cout<<"a/b="<<m<<"\n";
  std::cout<<"a%b="<<q<<"\n";
}