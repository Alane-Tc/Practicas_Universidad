#include <iostream>
#include "string"
using namespace std;
//Este es un programa para calcular los promedios de los grupos
int main(){
string fin;
int contadorC=1;
int contadorGrupo=1;
int CG,CC;
float promGrupo,sumaGrupo=0,calificaciones;
cout<<"------Programa para los promedios---------"<<endl; 
do{
		
cout<<"Cantidad de Grupos a calificar=";
cin>>CG;		
while(CG>0){
cout<<"Cantidad de alumnos a calificar= "<<contadorGrupo<<endl;
cin>>CC;			
while(CC>0){
cout<<"Calificaion= "<<contadorC<<endl;
cin>>calificaciones;
sumaGrupo=sumaGrupo+calificaciones;
promGrupo=sumaGrupo/contadorC;
contadorC++;
CC--;
}
cout<<"El promedio de Grupo= "<<contadorGrupo<<endl<<promGrupo<<endl;
contadorGrupo++;
sumaGrupo=0;
promGrupo=0;
contadorC=1;
CG--;
}
contadorGrupo=1;
cout<<"Deseas ingresar mas grupos?="<<endl;
cin>>fin;
}while(fin=="si");
cout<<"Fin";
}

