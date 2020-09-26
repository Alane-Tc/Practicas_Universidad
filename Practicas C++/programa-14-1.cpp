//
#include <stdlib.h>
#include <iostream>
using namespace std;
int main(){
    int tam;
    cout<<"Digita el tamaño de la matriz ";
    cin>>tam;
    
    if(tam<=100){
        int Matriz[tam][tam];
        int inverso=tam-1;
        
        for(int i=0;i<tam;i++,inverso--){
            for(int j=0;j<tam;j++){
                if(j==i||j==inverso){
                    Matriz[i][j]=1;
                }
                else{
                    Matriz[i][j]=9;}
            }}
        for(int i=0;i<tam;i++){
            for(int j=0;j<tam;j++){
                cout<<Matriz[i][j];}
            cout<<""<<endl;
        }}}

