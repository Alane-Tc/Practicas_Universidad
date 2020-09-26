#include <iostream>
using namespace std;
int main () {
cout<<"Selecciona el tipo de CD que deseas"<<endl;
double A, B, C, D;
A=59.90, B=129.90, C=179.90, D=250.00;
cout<<"1 Seleccion de CD A\n 2 Seleccion de CD B\n 3 Seleccion de CD C\n 4 Seccion de CD D"<<endl;
int seleccion;
cin>> seleccion;
switch (seleccion)
{
	case 1:
		cout<<"¿Cual es el precio de CD A="<<A<<endl;
		break;
		case 2:
			cout<<"¿Cual es el Precio de CD B="<<B<<endl;
			break;
			case 3:
				cout<<"¿cual es el Precio de CD C="<<C<<endl;
				break;
				case 4:
					cout<<"¿Cual es el Precio de CD D="<<D<<endl;
					break;
}
}
