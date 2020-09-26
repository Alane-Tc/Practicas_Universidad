# include <iostream>
# include <cmath>
# include <stdlib.h> 
//Programa para calcular altura maxima ALTURA=(0.5*pow(v,2)*pow(seno,2)angulo)/9.8
using namespace std;
//ALAN TAMEZ 2656078
int main (){
double Velocidad0;
double Angulo;
double Equivalencia=1609;
double Altura;
double Velocidad;
int V2;	
//El usiario debe ingresar los valores de millas y angulo
  cout<<"Cantidad de Millas*H"<<endl;
    cin>>Velocidad0;
     cout<<"Ingresa el Angulo de lanzamiento"<<endl;
      cin>>Angulo;
      //Calculando..... :V
       Velocidad=(Velocidad0*Equivalencia);
         cout<<"Esta es La Velocidad en METROS____"<<Velocidad<<endl;
          V2=(Velocidad*Velocidad);
          cout<<"Esta es La Velocidad al CUADRADO____"<<V2<<endl;
        Altura=((0.5)*(V2)*(pow(sin(Angulo),2)))/9.8;
           cout<<"Esta es la Altura Maxima Alcanzada___"<<Altura<<endl;
           return 0; 
       }

