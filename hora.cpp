#include <iostream>
using namespace std;

int horas(int hactual, int hcantidad){
	if(hactual<24){
		int cantidad = hactual + hcantidad;
		if(cantidad >= 24){
			cantidad = cantidad % 24;
			cout<<cantidad;
		} else{
		  cout<<"La hora es: " << cantidad;
		}
		
	} else {
		cout<< "Ingrese una hora valida.";
	}
}

main(){
	int horac;
	int horad;
	cout<< "Ingrese la hora actual: \n";
	cin>>horac;
	cout<<"Ingrese la cantidad de horas: \n";
	cin>>horad;
	horas(horac,horad);
	//printf("La hora final es: %d \n", horas(horac,horad));
}
