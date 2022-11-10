#include <iostream>
using namespace std;

convertir(double dollar){
	double pesos = dollar * 20;
	return pesos;
}

main(){
	int valor = 20;
	printf("El valor de %d dolares es: %d pesos.",valor,convertir(valor));
}
