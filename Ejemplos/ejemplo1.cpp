#include <iostream>

using namespace std;

class foo{
public:
	foo(){};
	~foo(){};
	void push(int);
	void pop();
};

int main()
{
	foo *p = new foo();
	foo &a=*p;
	foo *p3=p;
	return 0;
}
