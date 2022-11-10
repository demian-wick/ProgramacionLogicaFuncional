#include <iostream>
using namespace std;

float promedio(float n1, float n2, float n3, float n4){
	float p = (n1 + n2 + n3 + n4) / 4;
	return p;
}

main(){
	float nota1 = 55;
	float nota2 = 71;
	float nota3 = 46;
	float nota4 = 87;
	
	printf("El promedio es: %f \n", promedio(nota1,nota2,nota3, nota4));
}
