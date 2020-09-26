# include <iostream>
#include <stdlib.h>
using namespace std;
int main ()
{
	int Gb, A1, A2;
	int Megabytes;
	int Kilobytes;
	int Bytes;
	Gb=0, A1=1024, Megabytes=0, Kilobytes=0,	Bytes=0;
	A2=8;
	cout<<"Gigabytes"<<endl;
	cin>>Gb;
	
	Megabytes=Gb*A1;
	Kilobytes=Megabytes*A1;
	Bytes=Kilobytes*A2;
	
	cout<<"Gigabytes/Megabytes"<<Megabytes<<endl;
	cout<<"Megabytes/Kilobytes"<<Kilobytes<<endl;
	cout<<"Kilobytes/Bytes"<<Bytes<<endl;
	system("PAUSE");
	return 0 ;
}
