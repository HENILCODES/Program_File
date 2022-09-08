#include <iostream>
#include <string>
using namespace std;

void myFun(string name) {
  cout << "Welcome " << name;
}

int main() {
  myFun("Henil");
  myFun("Kevin");
  myFun("Raj");
  return 0;
}
