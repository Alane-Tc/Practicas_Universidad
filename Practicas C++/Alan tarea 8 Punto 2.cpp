#include <iostream>
//Punto 2
using namespace std;
int main () {
int x; 
cout<<"Favor de ingresar el angulo determinado"<<endl;
cin>>x;
if (x<90){
cout<<"Pertenece al cuadrante 1"<<endl;
}else{
if ((x>90)&&(x<180)){
cout<<"Pertenece al cuadrante 2"<<endl;
}else{
if ((x>180)&&(x<270)){
cout<<"Pertenence al cuadrante 3"<<endl; 
}else{
if ((x>270)&&(x<360)){
cout<<"Pertenece al cuadrante 4"<<endl;
} else{if (x=0,90,180,270,360){
cout<<"No pertenece a un cuadrante por lo que cae a un EJE"<<endl;
return 0; 
}
}
}
}
}
}

