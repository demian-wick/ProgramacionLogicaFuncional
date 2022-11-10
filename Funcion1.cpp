#include <iostream>
using namespace std;

float impuesto(float base, float impuest){
	float calculo = base + (base * impuest);
	return calculo;
}

main(){
	float precio = 2.50;
	float imp = 0.07;
	cout<<"Precio: " << impuesto(precio,imp);
}
