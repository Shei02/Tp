#include <iostream>

using namespace std;

bool numprimo (int n)
{
    if (n == 0 || n == 1 || n == 4)
        return false;
    for (int i = 2; i<n/2; i++)
    {
        if (n % i == 0)
            return false;
    }
    return true;
}

int main()
{
    int n;
    cout << "Ingres el numero: " << endl;
    cin >> n;
    if (numprimo(n))
    {
        cout << "Es primo";
    }
    else
    {
        cout << "No es primo";
    }
    return 0;
}
