#include <iostream>

using namespace std;

class A{};
class B:public A{};
class C:public A{};
class D:public B,C{};

int main()
{
	return 0;
}

