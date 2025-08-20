nombre = str(input("ingrese su nombre: "))
apellido = str(input("ingrese su apellido: "))
edad = int(input("ingrese su edad: "))
sexo = str(input("ingrese su sexo \n *Masculino \n *Femenino \n Opción: "))

if edad >= 18:
    print(f"{nombre} {apellido} es mayor de edad")
elif edad < 18:
    print(f"{nombre} {apellido} es menor de edad")
else:
    print("Ingrese una edad valida")

if sexo.lower == "Masculino":
    print(f"{nombre} {apellido} es hombre")
elif sexo.lower == "Femenino":
    print(f"{nombre} {apellido} es mujer")
else:
    print("ingrese un sexo valido")