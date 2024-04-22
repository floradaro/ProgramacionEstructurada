#include <iostream>
#include <stdlib.h>
#include <conio.h>
#include <string.h>

using namespace std;

void pedirDatos();
void contandoVocales(char *);

char nombreUsuario[30];

int main(){
	
	
	pedirDatos();
	contandoVocales(nombreUsuario);

	getch();
	return 0;
}

void pedirDatos(){
	cout<< "Digite su nombre: ";
	cin.getline(nombreUsuario, 30, '\n');
	
	strupr(nombreUsuario);
}

void contandoVocales(char *nombre){
	int contA = 0, contE = 0, contI = 0, contO = 0, contU = 0;
	
	while (*nombre){
		switch(*nombre){
			case 'A':
				contA++;
				break;
			case 'E':
				contE++;
				break;
			case 'I':
				contI++;
				break;
			case 'O':
				contO++;
				break;
			case 'U':
				contU++;
				break;
		}
		nombre ++;
	}
	
	cout<< "El numero de vocales son: " <<endl;
	cout << "A: " << contA <<endl;
	cout << "E: " << contE <<endl;
	cout << "I: " << contI <<endl;
	cout << "O: " << contO <<endl;
	cout << "U: " << contU <<endl;

	
}


