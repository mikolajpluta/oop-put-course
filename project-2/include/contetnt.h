//
// Created by mikolaj on 10.01.2023.
//

#include <string>

#ifndef PROJECT_2_CONTETNT_H
#define PROJECT_2_CONTETNT_H

#endif //PROJECT_2_CONTETNT_H

using namespace::std;

class Productable{
public:
    string name;
    int amount;
    float price;

    virtual Productable* takeProduct() = 0;
};

class Product: public Productable{
public:
    Product(string n, int a, float p);
    Product* takeProduct();
    Product makeDiscount(float new_price);
};

