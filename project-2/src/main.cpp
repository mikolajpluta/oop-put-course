#include <iostream>
#include "D:\oop-put-course\project-2\include\contetnt.h"
using namespace::std;

int main() {
    Product* p = new Product("klawiatura", 10, 100);
    cout<< p->amount<<"\n";
    cout<< p->price<<"\n";
    p = p->takeProduct();
    cout<< p->amount<<"\n";
    cout<< p->price<<"\n";
    *p = p->makeDiscount(90);
    cout<< p->amount<<"\n";
    cout<< p->price<<"\n";
    return 0;
}
