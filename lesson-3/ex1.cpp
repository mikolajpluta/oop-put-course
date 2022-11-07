#include <iostream>
#include <string>

using namespace::std;

class Client{
    private:
    string first_name;
    string second_name;
    int id;

    public:
    Client(){};
    Client(string n, string s, int i){
        this->first_name = n;
        this->second_name = s;
        this->id = i;
    }
    string showProfile(){
        string result = this->first_name + " " + this->second_name + " id: " + to_string(this->id);
        return result;
    }
};

class BankAccount{
    private:
    Client owner;
    int balance;
    bool isValid;
    string creationDate;

    public:
    BankAccount(Client o, int b, bool i, string c){
        this->owner = o;
        this->balance = b;
        this->isValid = i;
        this->creationDate = c;
    }
    string validationCheck(){
        if(this->isValid)
            return "konto jest aktywne";
        else
            return "konto zawieszone";
    }
    string showBalance(){
        return to_string(this->balance);
    }
    string showDetails(){
        return "imie, nazwisko, id: " + this->owner.showProfile();
    }


};


int main(){

    Client mikolaj("mikolaj", "pluta", 1);    
    BankAccount account(mikolaj, 100, true, "01:01:2022");
    cout<<account.validationCheck()<<"\n"<<account.showBalance()<<"\n"<<account.showDetails();
    

    return 0;
}