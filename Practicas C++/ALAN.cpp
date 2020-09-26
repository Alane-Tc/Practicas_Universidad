# include <iostream>
# include <cmath>
# include <stdlib.h> 
using namespace std;
int main (){
	double V;
	int A;
	double Cmetros=1609;
	double Alt;
	int Velocidad;
	int Vcuadrada;	
cout<<"FORMULA=(0.5*pow(v,2)*pow(seno,2)angulo)/9.8"<<endl;
cout<<"Cual fua la velocidad en Millas"<<endl;
cin>>V;
cout<<"Cual fue el angulo de lanzamiento"<<endl;
cin>>A;
cout<<"OPERACIONES"<<endl;
Velocidad=(V*Cmetros);
cout<<"Velocidad en metros...."<<Velocidad<<endl;
Vcuadrada=(Velocidad*Velocidad);
cout<<"Velocidad al cuadrado...."<<Vcuadrada<<endl;
Alt=((0.5)*(Vcuadrada)*(pow(sin(A),2)))/9.8;
cout<<"OPERACION CON EXITO...."<<endl;
cout<<"Altura Maxima en metros...."<<Alt<<endl;
return 0;
}

