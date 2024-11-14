#include <iostream>

using namespace std;

int posletra(string palabra, char letra1)
{
    for(int i=0;i<palabra.size();i++){
        if(letra1 == palabra[i])
            return i;
    }
}

void reemplazar(string & palabra, char letra2, char letra1)
{
    int pos= posletra(palabra,letra1);
    palabra[pos]=letra2;
}

int main()
{
char letra1;
char letra2;
string palabra;
cout<<"ingrese una palabra"<<endl;
cin>>palabra;
cout<<"ingrese un caracter a reemplazar"<<endl;
cin>>letra1;
cout<<"ingrese el caracter a ingresar"<<endl;
cin>>letra2;
for(int i=0;i<palabra.size();i++){
    if(letra1==palabra[i])
    reemplazar(palabra,letra2,letra1);
}
cout<<"La palabra final es:"<<palabra<<endl;

return 0;
}
