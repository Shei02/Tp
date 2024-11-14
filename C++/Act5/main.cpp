#include <iostream>

using namespace std;

int main()
{
    int interes;
    int monto;
    int cmeses;
    int rentabilidad;
    cout << "Ingrese el monto que desea: " << endl;
    cin >> monto;
    cout << "Ingrese el plazo que desea en meses: " << endl;
    cin >> cmeses;
    rentabilidad = ((3*cmeses)*monto)/100;
    cout << "Su rentabilidad es aproximadamente: " << rentabilidad << endl;
}
