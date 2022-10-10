
#include <iostream>

using namespace std;

class Laptop{
    public:
        string producer;
        int year_of_manufacture;
        bool dedicated_GPU;
        int serial_number;
        bool is_younger(Laptop another_laptop){
            if(another_laptop.year_of_manufacture > year_of_manufacture){
                return false;
            }
            return true;
        }
};

class Keyboard{
    public:
        string name;
        string switches;
        int serial_number;
};

class Mouse{
    public:
        bool is_wireless;
        int max_dpi;
        int serial_number;
};

int main()
{
    Laptop acer_swift;
    acer_swift.producer = "acer";
    acer_swift.year_of_manufacture = 2022;
    acer_swift.dedicated_GPU = true;
    acer_swift.serial_number = 123456789;
    
    Laptop lenovo_legion;
    lenovo_legion.year_of_manufacture = 2020;
    
    cout<<acer_swift.producer<<" "<<acer_swift.year_of_manufacture<<"\n";
    
    if(acer_swift.is_younger(lenovo_legion)){
        cout<<"acer zostal wyprodukowany pozniej niz lenovo";
    }
    
    return 0;
}