#include <iostream>

using namespace std;

class Game{
public:
    virtual string result(int condition) = 0;
};

class FakeFootballGame: public Game{
public:
    string result(int condition){
        return "draw";
    }
};


int main()
{
    FakeFootballGame game;
    cout<<game.result(1);
    return 0;
}
