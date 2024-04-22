#include <iostream>
#include <conio.h>

using namespace std;

int main(){
	
	 int num, *dir_numero;
	 
	 cout << "Digite un numero: ";
	 cin  >> num;
	 
	 dir_numero= &num;
	 
	 bool es_primo = true;
	 
     if (*dir_numero <= 1) {
        es_primo = false;
	    } else {
	        for (int i = 2; i <= *dir_numero/2; i++) {
	            if (*dir_numero % i == 0) {
	                es_primo = false;
	                break;
	            }
	        }
	    }

    if (es_primo) {
        cout << "El numero " << *dir_numero << " es primo" << endl;
        cout << "Posicion: " << dir_numero << endl;
    } else {
        cout << "El numero " << *dir_numero << " no es primo" << endl;
        cout << "Posicion: " << dir_numero << endl;
    }


getch();
return 0;
}
