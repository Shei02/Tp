#include <iostream>

using namespace std;

void cargararreglo (int arreglo[], int n)
{
    cout << "Cargue el arreglo" << endl;
    for (int i=0; i<n; i++)
    {
        cin >> arreglo[i];
    }
}

void imprimir (int arreglo[], int n)
{
    cout << "el arreglo es: " << endl;
    for (int i=0; i<n; i++)
    {
        cout << arreglo[i] << "|";
    }
}

void imprimirAlReves (int arreglo[], int n)
{
    cout << "el arreglo queda: " << endl;
    for (int i=0; i<n; i++)
    {
        cout << arreglo[n-i-1] << "|";
    }
}

int main()
{
 int n;
 int arreglo[n];
 cout << "ingrese la dim del arreglo: " << endl;
 cin >> n;
 cargararreglo(arreglo, n);
 imprimir(arreglo, n);
 cout<<""<<endl;
 imprimirAlReves(arreglo, n);
}
