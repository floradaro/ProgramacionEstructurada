#include<iostream>
#include <conio.h>
#include <stdlib.h>>
using namespace std;

void pedirDatos();
void buscarNumero(int *, int);

int nElementos, *elemento;

int main(){
	
	pedirDatos();
	
	buscarNumero(elemento, nElementos);
	
	delete [] elemento;
	
	getch();
	return 0;
}

void pedirDatos(){
	cout<< "Digite el numero de elementos del arreglo: ";
	cin >> nElementos;
	
	elemento = new int [nElementos];
		
	for(int i=0; i< nElementos; i++){
		cout<< "Digite un numero[" << i <<"]: ";
		cin >> *(elemento+i);
	}
}

void buscarNumero(int *elemento, int nElementos){
	
	int aux, posicion =-1;
	
	cout<< "Digite el numero a encontrar: ";
	cin >> aux ;
	
	for(int i=0; i < nElementos; i++){
		
		if (*(elemento+i) == aux){
			posicion = i;
			break;
		}
	}
	
	if (posicion == -1){
		cout<< "Valor no encontrado!!";
	}else{
		cout<< "Valor encontrado en la posicion " << posicion << "!";
	}
}
