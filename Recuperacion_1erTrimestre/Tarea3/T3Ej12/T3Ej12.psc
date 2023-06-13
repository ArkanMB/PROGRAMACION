Algoritmo T3Ej12
	
	Definir A, B, potencia, contador como entero

	Escribir "Vamos a calcular la potencia de A elevado a B"
	Escribir "Escribe el número A: "
	Leer A
	
	Escribir "Escribe el numero B (el exponente): "
	Leer B
	
	potencia <- 1
	contador <- 1
	
	Mientras contador == B  Hacer
		potencia <- potencia * A
		contador <- contador + 1
	Fin Mientras
	
	Escribir  "La potencia de => ", A, " elevado al exponete => ",B, " es igual a => ", potencia
	
FinAlgoritmo
