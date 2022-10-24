#include <iostream>
#include <string.h>
//tootbrush pencil

using namespace::std;

class Toothbrush{
    private:
    string owner;

    public:
    Toothbrush(){
        this->owner = "unknown";
    }
    Toothbrush(string setOwner){
        this->owner = setOwner;
    }
    string printOwner(){
        return this->owner;
    }

    
};

int main(){
    
    Toothbrush brush("mikolaj");
    cout<<brush.printOwner();
    return 0;
}