#include <iostream>

using namespace std;

int main()
{int x=1001,first,last,v;
  std::cin>>x;
  first=x/1000;
  last=x%10;
  v=first+last;
  std::cout<<v;

}