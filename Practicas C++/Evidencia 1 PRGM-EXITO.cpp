#include <iostream>
using namespace std;
int main ()
{
	/*El proposito de este programa es guardar la informacion y tener un control de los ingresos y egresos de un negocio*/
	cout<<"Producto"<<endl;
  	cout<<"Cds"<<endl;
	cout<<"Dvd"<<endl;
	cout<<"Blueray"<<endl;
	cout<<"Precio de compra de CdS"<<endl;
	int CCDS;
	cin>>CCDS;
	cout<<"Precio de compra de  Dvd"<<endl;
	int CDVD;
	cin>>CDVD;
	cout<<"Precio de compra de  Blueray"<<endl;
	int CBL;
	cin>>CBL;
	cout<<"Precio de venta de cds"<<endl;
	int VCDS;
	cin>>VCDS;
	cout<<"Precio de venta de dvd"<<endl;
	int VDVD;
	cin>>VDVD;
	cout<<"Precio de venta de bluerays"<<endl;
	int VBL;
	cin>>VBL;
	cout<<"Cds a registrar"<<endl;
	int CDSR;
	cin>>CDSR;
	cout<<"Dvds a registrar"<<endl;
	int DVDR;
	cin>>DVDR;
	cout<<"Bluerays a registrar"<<endl;
	int BLR;
	cin>>BLR;
	cout<<"Nombre de proveedor"<<endl;
	string Nombre;
	cin>>Nombre;
	cout<<"Apellido"<<endl;
	string Apellido;
	cin>>Apellido;
	cout<<"---------------------------"<<endl;
	cout<<"Numero telefonico proveedor"<<endl;
	string Numerotelefono;
	cin>>Numerotelefono;
    int ICDS,IDVD,IBL;
	ICDS=CDSR*CCDS;
	IDVD=DVDR*CDVD;
	IBL=BLR*CBL;
	int MONTO;
	MONTO=ICDS+IDVD+IBL;
	int GANANCIACDS,GANANCIADVD,GANANCIABL;
	GANANCIACDS=CDSR*VCDS-CCDS;
	GANANCIADVD=DVDR*VDVD-CDVD;
	GANANCIABL=BLR*VBL-CBL;
	int GANANCIAT;
	GANANCIAT=GANANCIACDS+GANANCIADVD+GANANCIABL;
	cout<<"Invercion en CDS=" <<ICDS<<endl;
	cout<<"Invercion en DVD=" <<IDVD<<endl;
	cout<<"Invercion en Bluerays=" <<IBL<<endl;
	cout<<"Monto total de la compra=" <<MONTO<<endl;
	cout<<"Ganancias esperadas por las ventas=" <<GANANCIAT<<endl;
	cout<<"Nombre de proveedor "<<Nombre<<endl;
	cout<<"Apellido de proveedor "<<Apellido<<endl;
	cout<<"Numero de telefono de proveedor "<<Numerotelefono<<endl;
	return 0; 
}
