#include <iostream>
using namespace std;
int main ()
{
char tipoBoletoSeleccionado;
char resultado;
do
{
cout<<"Selecciona El boleto Que Desea"<<endl;
cout<<endl;
cout<<"Seleciona El Boleto Que Desea"<<endl;
cout<<"A=Adulto N=Niños I=Adultos Con Credencial"<<endl; 
cin>>tipoBoletoSeleccionado;
if (tipoBoletoSeleccionado== 'A'||tipoBoletoSeleccionado=='a')
{
cout<<"El boleto De Adulto Cuesta 120"<<endl;
}
else if(tipoBoletoSeleccionado=='N' || tipoBoletoSeleccionado=='n')
{
cout<<"El boleto De Niño Cuesta 75"<<endl;	
}
else if(tipoBoletoSeleccionado=='I'||tipoBoletoSeleccionado=='i')
{
cout<<"El boleto De Los Adultos Con CREDENCIAL cuesta 60"<<endl;
}
cout<<endl;
cout<<"¿Queres Comprar Otro Boleto?"<<endl;
cout<<endl;
cout<<"Y=Si y N=No"<<endl;
cout<<endl;	
cin>>resultado;
}
while(resultado =='y') ;
cout<<"Lo sentimos, se agotaron los boletos XD"<<endl;
return 0;
}
