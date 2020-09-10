global seleccion
global bucle

seleccion = int(input("Opcion 1: Escribir\nOpcion 2: leer\n"))

if seleccion == 1:
    escribir = open("lista.txt", "a")
    Nombre = input("Nombre: ")
    Apellido = input("Apellido: ")
    Cedula = input("Cedula: ")
    
    Numhorastrabajo = input("Numero de Horas de trabajo: ") 
    escribir.write(f"Nombre: {Nombre}|Apellido: {Apellido}|Cedula: {Cedula}|Numero de Horas de trabajo: {Numhorastrabajo}\n")
    escribir.close()
elif seleccion == 2:
    leer = open("lista.txt", "r")
    print(leer.read())
    leer.close()
else:
    print("No es una opcion posible")

