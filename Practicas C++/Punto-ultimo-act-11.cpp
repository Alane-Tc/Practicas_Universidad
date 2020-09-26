# include <iostream>
# include <cstdlib>
# include <cmath>
//Escribe un programa que permita calcular la distancia entre dos puntos (x1, y1) y (x2, y2). Recuerda que la fórmula para calcular la distancia es:
using namespace std;
//ALAN TAMEZ 2656078
int main (){
//Variables	
double X1,X2,Y1,Y2; 
double distancia; 
//El usiario debe ingresar valores que se le pide 
cout<<"Favor de ingresar valores"<<endl; 
cout<<"Ingrese valor de X1"<<endl;
cin>>X1; 
cout<<"Ingrese el valor de Y1"<<endl;
cin>>Y1;
cout<<"Ingrese valor de X2"<<endl;
cin>>X2; 
cout<<"Ingrese valor de Y2"<<endl;
cin>>Y2; 
//Calcular lo que es la distancia (Formula)
distancia=sqrt(pow(X1-X2,2)+ pow(Y1-Y2,2) );
cout<<"La distancia es:"<<distancia<<endl; 
return 0; 		
}
