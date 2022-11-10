#include <iostream>
using namespace std;

sumatoria(int n){
    int var = 0;
    for(int x = 0;x<=n; x++){
    	var = x + var;
	}
   return var;
}

main(){
	int valor = 10;
	printf("La sumatoria de %d es %d", valor, sumatoria(valor));
}
