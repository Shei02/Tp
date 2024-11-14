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

bool existemayoria (int arreglo[], int n)
{
    int aux;
    int contador;
    contador=0;
    aux=arreglo[0];
    for (int i=1; i<n; i++)
    {
        if (aux == arreglo[i])
        {
            contador++;
        }
    }
    if (contador > (n/2))
    {
        cout << "existe el elemento mayoria" << endl;
        return true;
    }
}

int main()
{
    int n;
    int dato;
    bool existo;
    cout << "Ingrese la cantidad de elementos en el arreglo" << endl;
    cin >> n;
    int arreglo[n];
    cargararreglo(arreglo,n);
    imprimir(arreglo,n);
    existo= existemayoria(arreglo,n);
    return 0;
}
