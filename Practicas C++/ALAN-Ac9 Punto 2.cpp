#include <iostream>
using namespace std;
int main () {
	cout<<"Introduce el dia 1"<<endl;
	int D;
	cin>>D;
	cout<<"Introduce el mes 1"<<endl;
	int M;
	cin>>M;
	cout<<"Introduce el dia 2"<<endl;
	int D2;
	cin>>D2;
	cout<<"Introduce el mes 2"<<endl;
	int M2;
	cin>>M2;
 if(M<M2){
	cout<<"Esta fecha se cumple primero"<<endl<<D<<endl<<M<<endl;
} else{
if (M>M2){
cout<<"Esta fehca se cumple primero"<<endl<<D2<<endl<<M2<<endl;
} else {
if(M=M2){
if(D>D2){
cout<<"Esta fecha se cumple primero"<<endl<<D<<endl<<M<<endl;
} else{
if (M=M2){
if(D<D2){
cout<<"Esta fecha se cumple primero"<<endl<<D2<<endl<<M2<<endl;
} else{
if ((M=M2)&&(D=D2)){
cout<<"Son iguales las fechas"<<endl;
}
}
}
}
}
}
}
			
system ("PAUSE");
return 0; 
}


