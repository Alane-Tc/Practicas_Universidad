# include <iostream>
# include <cstdlib>


using namespace std;
int main ()
{
	//Este programa sirve para convertir la moneda//;
	cout<<"Cantidad a convertir"<<endl;
	double Pesos;
		cin>>Pesos;
		double libras;
		double Euro;
		double DolarUSA;
		double DolarCanadiense;
		double DolarAustraliano;
		double Select;
		libras=24;
		Euro=22;
		DolarUSA=19;
		DolarCanadiense=14;
		DolarAustraliano=13;


	 cout<<"introducir pesos"<<endl;
	 int moneda;
	 cout<<"1 libra/n 2 euro/n 3 dolar usa/n 4 dolar canadiense/n 5 dolar australiano"<<endl;
	 cin>>moneda;
	 switch (moneda)
	 	{
			case 1:	libras=Pesos/libras;
			cout<<"Pesos en libras es =" <<libras<<endl;
				break;
				case 2: Euro=Pesos/Euro;
					cout<<"Pesos en euros es =" <<Euro<<endl;
					break;
					case 3: DolarUSA=Pesos/DolarUSA;
					cout<<"Pesos en dolar estaunidense =" <<DolarUSA<<endl;
						break;
						case 4:DolarCanadiense=Pesos/DolarCanadiense;
						cout<<"Pesos en dolar canadiense es =" <<DolarCanadiense<<endl;
							break;
							case 5:	DolarAustraliano=Pesos/DolarAustraliano;
							cout<<"Pesos en dolar australiano es =" <<DolarAustraliano<<endl;
}
return 0;
}
								

				
	 
