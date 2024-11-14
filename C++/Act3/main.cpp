#include <iostream>

using namespace std;

int main()
{
    string palabra;
    string palabra2;
    string concatenacion;
    cout << "Escriba una palabra" << endl;
    cin >> palabra;
    cout << "Escriba la otra palabra" << endl;
    cin >> palabra2;
    concatenacion= palabra + palabra2;
    cout << "El resultado es: " << concatenacion << endl;
    return 0;
}
