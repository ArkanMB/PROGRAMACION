Algoritmo T3Ej6
	Definir contador,numNegativo Como Entero
	contador <- 0
	numNegativo <- 0
	Escribir 'Escribe 100 numeros, enteros no nulos, uno detras de otro, pulsando Intro entre numeros: '
	Mientras contador<100 Hacer
		Leer num
		Si num=0 Entonces
			Escribir 'El numero no puede ser 0 te lo he dicho'
		SiNo
			Si num<0 Entonces
				numNegativo <- 1
			FinSi
			contador <- contador+1
		FinSi
	FinMientras
FinAlgoritmo
