int main(){
	string r;
	int contadorCalificacion=1;
	int contadorGrupo=1;
	int cantidadGrupos,cantidadCalificaciones;
	double promedioGrupo,sumaGrupo=0,calificaciones;
	
	do{
		
		cout<<"Introduce la cantidad de Grupos a Calificar... ";
		cin>>cantidadGrupos;
		
		while(cantidadGrupos>0){
			cout<<"Introduce la cantidad de calificaciones del grupo "<<contadorGrupo<<"... " ;
			cin>>cantidadCalificaciones;
			
			while(cantidadCalificaciones>0){
				cout<<"Introduce la calificaion "<<contadorCalificacion<<": ";
				cin>>calificaciones;
				sumaGrupo=sumaGrupo+calificaciones;
				promedioGrupo=sumaGrupo/contadorCalificacion;
				contadorCalificacion++;
				cantidadCalificaciones--;
			}
			cout<<"El promedio del Grupo "<<contadorGrupo<<": "<<promedioGrupo<<endl;
			contadorGrupo++;
			sumaGrupo=0;
			promedioGrupo=0;
			contadorCalificacion=1;
			cantidadGrupos--;
		}
		contadorGrupo=1;
		cout<<"Ya no hay mas grupos, Quieres ingresar mas?";
		cin>>r;
	}while(r=="si");
	cout<<"Fin";
}
