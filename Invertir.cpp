#include <iostream>
using namespace std;

int orden(int numero){
	if(numero >= 100 && numero < 1000){
		int invertir = numero % 10;
		int n = numero / 10;
		n = n%10;
		int b = numero / 100;
		b = b%10;
		cout<< invertir << n << b;
	} else {
		cout<<"Ingrese un valor valido";
	}
}

main(){
	cout<<"Ingrese un numero de tres digitos por favor: \n";
	int n;
	cin>>n;
	orden(n);
}
