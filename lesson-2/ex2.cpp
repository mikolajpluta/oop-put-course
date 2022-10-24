#include <iostream>
#include <string.h>
//tootbrush pencil

using namespace::std;
class Pencil{
   private:
   string color;
   int size;
   string hardness;

   public:
   Pencil(){
        this->color = "unknown";
        this->hardness = "unknown";
   }
   Pencil(string clr, int s, string hrdns){
        this->color = clr;
        this->hardness = hrdns;
        this->size = s;
   }
   int sizeCheck(){
    return this->size;
   }
   void changeSize(int s){
    this->size = s;
   }
 
};



int main(){
    
    Pencil olowek("czerwony", 5, "h4");
    cout<<olowek.sizeCheck()<<"\n";
    olowek.changeSize(10);
    cout<<olowek.sizeCheck();
    
    return 0;
}