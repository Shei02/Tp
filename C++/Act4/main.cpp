#include <iostream>
#include <math.h>

using namespace std;

int main()
{
    float a;
    float b;
    float c;
    float x1;
    float x2;
    float discriminante;
    cout << "ingrese el valor de a" << endl;
    cin >> a;
    cout << "ingrese el valor de b" << endl;
    cin >> b;
    cout << "ingrese el valor de c" << endl;
    cin >> c;
    discriminante= (b*b) - (4*a*c);
    if (discriminante > 0.0)
    {
        x1=(-b + sqrt(discriminante)) / (2*a);
        x2=(-b - sqrt(discriminante)) / (2*a);
        cout << "x1 es: " << x1 << endl;
        cout << "x2 es: " << x2 << endl;
    }
    if (discriminante == 0.0)
    {
        x1=x2= -b / (2*a);
        cout << "x1 es: " << x1 << endl;
        cout << "x2 es: " << x2 << endl;
    }
    if (discriminante < 0.0)
    {
        x1= -b / (2*a);
        x2= -sqrt(discriminante) / (2*a);
        cout << "x1 es: " << x1 << endl;
        cout << "x2 es imaginaria" << endl;
    }
    return 0;
}
