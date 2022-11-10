#include <iostream>
using namespace std;

float perimetro(float radio){
	float p = (3.1416 * 2) * radio;
	return p;
	
}

float area(float radio){
	float a = (radio * radio) * 3.1416;
	return a;
}

main(){
	float rad = 5;
	printf("El perimetro del circulo es: %f \n",perimetro(rad));
	printf("El area del circulo es: %f \n", area(rad));
}
