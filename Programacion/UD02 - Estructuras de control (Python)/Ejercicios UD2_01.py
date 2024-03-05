def main():
    while True:
        eleccion = int(input("Elige qué ejercicio quieres ejecutar (número del ejercicio): "))
        if eleccion == 1:
            ej1()
            break
        if eleccion == 2:
            ej2()
            break
        if eleccion == 3:
            ej3()
            break
        if eleccion == 4:
            ej4()
            break
        if eleccion == 5:
            ej5()
            break
        if eleccion == 6:
            ej6()
            break
        if eleccion == 7:
            ej7()
            break
        if eleccion == 8:
            ej8()
            break
        if eleccion == 9:
            ej9()
            break
        if eleccion == 10:
            ej10()
            break
        if eleccion == 11:
            ej11()
            break
        if eleccion == 12:
            ej12()
            break
        if eleccion == 13:
            ej13()
            break
        if eleccion == 14:
            ej14()
            break
        if eleccion == 15:
            ej15()
            break
        if eleccion == 16:
            ej16()
            break
        if eleccion == 17:
            ej17()
            break
        if eleccion == 18:
            ej18()
            break
        if eleccion == 19:
            ej19()
            break
        if eleccion == 20:
            ej20()
            break
        if eleccion == 21:
            ej21()
            break
        if eleccion == 22:
            ej22()
            break
        if eleccion == 23:
            ej23()
            break
        if eleccion == 24:
            ej24()
            break
        if eleccion == 25:
            ej25()
            break
        if eleccion == 26:
            ej26()
            break
        if eleccion == 27:
            ej27()
            break
        if eleccion == 28:
            ej28()
            break
        if eleccion == 29:
            ej29()
            break
        if eleccion == 30:
            ej30()
            break
        if eleccion == 31:
            ej31()
            break
        if eleccion == 32:
            ej32()
            break
        if eleccion == 33:
            ej33()
            break
        if eleccion == 34:
            ej34()
            break
        if eleccion == 35:
            ej35()
            break
        if eleccion == 36:
            ej36()
            break
        if eleccion == 37:
            ej37()
            break
        if eleccion == 38:
            ej38()
            break
        else:
            print("Ejercicio no válido")

        opt = input("\nDesea seguir ejecutando los ejercicios? [y/n]").lower()
        if opt != 'y':
            break

#--------------------------------------------------------------------------------------------------------------------------------------------------------------------------

#Ej1. Calcula la superficie y el perímetro de un cuadrado cuyo lado pediremos por teclado.

def ej1():

    lado = int(input("dime cuanto mide el lado de un cuadrado "))
    perimetro = lado * 4
    area = lado*lado

    print(f"el area del cuadrado con un lado de {lado} es de {area} y su perimetro es {perimetro}")

#--------------------------------------------------------------------------------------------------------------------------------------------------------------------------

#Ej2. Calcula la superficie y el perímetro de un rectángulo cuyos datos pediremos por teclado.

def ej2():

    base = int(input("dime cuanto mide el area de un rectangulo "))
    altura = int(input("dime cuanto mide la altura de un rectangulo "))
    perimetro = base * 2 + altura * 2
    area = base * altura

    print(f"el area del rectangulo con una base de {base} y una altura de {altura} es de {area} y su perimetro es {perimetro}")

#--------------------------------------------------------------------------------------------------------------------------------------------------------------------------

#Ej3. Calcula el área y la circunferencia de un círculo cuyo radio se debe preguntar al usuario.

def ej3():

    radio = int(input("dime el radio de un circulo "))
    area = 2 * 3.14 * radio
    perimetro = 3.14 * (radio**2)

    print(f"el area de un circulo con un radio de {radio} es de {area} y su perimetro es de {perimetro}")

#--------------------------------------------------------------------------------------------------------------------------------------------------------------------------

#Ej4. Diseña un algoritmo que calcule la media de tres números que pediremos al usuario. Se deben dar dos resultado: la media con decimales y redondeada

def ej4():

    num1 = float(input("dime el valor de la primera nota: "))
    num2 = float(input("dime el valor de la segunda nota: "))
    num3 = float(input("dime el valor de la tercera nota: "))

    media_real = (num1+num2+num3)/3
    media_redondeada = (num1+num2+num3)//3

    print(f"la media de las tres notas con decimales es de {media_real} y la media redondeada es de {media_redondeada}")

#--------------------------------------------------------------------------------------------------------------------------------------------------------------------------

#Ej5. Determinar si un número leído por teclado es positivo o negativo

def ej5():

    num = int(input("dame un numero negativo o positivo "))

    if num < 0:
        print("el numero dado es negativo")
    else:
        print("el numero dado es positivo")

#--------------------------------------------------------------------------------------------------------------------------------------------------------------------------

#Ej6. Calcula la raíz cuadrada de un número que pedimos por teclado, teniendo la precaución de que el número no sea negativo; en este caso se debe informar de que la
#operación no es posible.

def ej6():

    num = int(input("dame un numero y te calculo la raiz cuadrada "))

    if num > 0:
        print(num**0.5)
    else:
        print("esta operacion no es posible")

#--------------------------------------------------------------------------------------------------------------------------------------------------------------------------

#Ej7. Determinar si un año pedido por teclado es bisiesto o no. (para determinarlo usar:

#PASO1: Si el año es divisible por 4, vaya al paso 2. De lo contrario, vaya al paso 5.
#PASO2: Si el año es divisible por 100, vaya al paso 3. De lo contrario, vaya al paso 4.
#PASO3: Si el año es divisible por 400, vaya al paso 4. De lo contrario, vaya al paso 5.

#PASO4: El año es un año bisiesto (tiene 366 días). true
#PASO5: El año no es un año bisiesto (tiene 365 días).) false

def ej7():

    anyo = int(input("dime un anyo y te digo si es bisiesto o no "))

    if anyo % 4 != 0:
        print("no es bisiesto")
    if (anyo % 4 == 0) and (anyo / 100 > 0):
        if anyo % 400 != 0:
            print("es bisiesto")
        else: 
            print("no es bisiesto")        

#--------------------------------------------------------------------------------------------------------------------------------------------------------------------------

#Ej8. Determinar si un número real pedido por teclado tiene decimales o no.

def ej8():

    num = float(input("dime un numero real "))

    if num % num == 0:
        print("el numero no tiene decimales")
    else:
        print("el numero si tiene decimales")
    
#--------------------------------------------------------------------------------------------------------------------------------------------------------------------------

#Ej9. Leídos dos números por teclado, restar al mayor el menor. Por ejemplo, sí A=9 y B=3 entonces se debe mostrar: "El primero es mayor y la resta es 6.

def ej9():

    num1 = int(input("dime el valor para el numero 1: "))
    num2 = int(input("dime el valor para el numero 2: "))

    if num1 > num2:
        print(f"el numero 1 es mayor al numero 2 y la resta es {num1-num2}")
    else:
        print(f"el numero 2 es mayor al numero 1 y la resta es {num2-num1}")

#--------------------------------------------------------------------------------------------------------------------------------------------------------------------------

#Ej10. Realiza un conversor de grados Centígrados a grados Farenheit. Nuestro algoritmo
#debe poder hacer la conversión en ambos sentidos ºF = 9/8 ºC + 32

def ej10():

    grados = str(input("que mediada de grados quieres cambiar a la otra medida [celsius/farenheit] "))
    while True:
        if grados == "celsius" or grados == "Celsius":
            cantidad = int(input("cuantos grados celsius quieres convertir a farenhait "))
            ceslius_a_farenheit = (cantidad * (9/5)) + 32
            print(f"elegiste cambiar {cantidad} grados {grados} a la otra medida lo que combierte {cantidad} grados {grados} a {ceslius_a_farenheit} grados farenheit")
            break

        elif grados == "farenheit" or grados == "Farenheit":
            cantidad = int(input("cuantos grados celsius quieres convertir a farenhait "))
            farenheit_a_celsius = (cantidad - 32) *  (5/9)
            print(f"elegiste cambiar {cantidad} grados {grados} a la otra medida lo que combierte {cantidad} grados {grados} a {farenheit_a_celsius} grados celsius")
            break

        elif grados != "farenheit" or grados != "Farenheit" or grados != "celsius" or grados != "Celsius":
            print("medida mal escrita")
            grados = str(input("que mediada de grados quieres cambiar a la otra medida [celsius/farenheit] "))

#--------------------------------------------------------------------------------------------------------------------------------------------------------------------------

#Ej11. Diseña un algoritmo que determine si tres números que pedimos por teclado están
#ordenados de menor a mayor (NO consiste en ordenar, solo indicar si están ordenados o no).

def ej11():

    num1 = int(input("dime el valor del numero 1: "))
    num2 = int(input("dime el valor del numero 2: "))
    num3 = int(input("dime el valor del numero 3: "))

    if (num1 < num2 and num1 < num3) and (num2 < num3 and num2 > num1):
        print("estan bien ordenados del menor al mayor")
    else:
        print("no estan ordenados de menor a mayor")

#--------------------------------------------------------------------------------------------------------------------------------------------------------------------------

#Ej12. Diseña un algoritmo parecido al anterior en el que se indique si tres números pedidos son consecutivos o no.

def ej12():

    num1 = int(input("dime el valor del numero 1: "))
    num2 = int(input("dime el valor del numero 2: "))
    num3 = int(input("dime el valor del numero 3: "))

    if ((num2 == num1 + 1) and (num3 == num2 + 1)) or ((num2 == num1 - 1) and (num3 == num2 - 1)):
        print("si son consecutivos")
    else:
        print("no son consecutivos")

#--------------------------------------------------------------------------------------------------------------------------------------------------------------------------

#Ej13. Dados dos números enteros realizar el algoritmo que calcule el cociente y el resto mediante restas sucesivas.
#Ejemplo: 18 : 4
#Se irá restando 18-4 = 14; 14-4 = 10; 10-4 = 6; 6-4 = 2
#Hasta que el resultado de la resta (2) es menor que el divisor (4). Por lo tanto el cociente es elnúmero de restas que se han hecho (4)
# y el resto es el valor de la última resta (2).

def ej13():

    num1 = 18
    num2 = 4
    resta = num1 - num2

    for i in range((num1//num2) -1):
        resta = resta - num2
    print(f"el cociente es {num1//num2} y el resto es {resta}")

#--------------------------------------------------------------------------------------------------------------------------------------------------------------------------

#Ej14. Determinar el número de cifras de un número de, como máximo, cinco cifras.
#Ejemplos: 9560 debe indicar que tiene 4 cifras; -369 tiene 3 cifras.

def ej14():

    num = -53400
    num_str = len(str(num))

    if num < 0:
        num_str -= 1

    print(f"el numero que introdujiste tiene {num_str} cifras")

#--------------------------------------------------------------------------------------------------------------------------------------------------------------------------

#Ej15. Calcula cual es el mayor, menor y mediano de tres números que se piden por teclado.

def ej15():

    num1 = int(input("dime el valor del numero 1: "))
    num2 = int(input("dime el valor del numero 2: "))
    num3 = int(input("dime el valor del numero 3: "))

    if (num1 > num2 and num1 > num3) and (num2 > num3):
        print(f"el mayor es el numero 1({num1}) el mediano es el numero 2({num2}) y el menor es el numero 3({num3})")
    elif (num1 > num2 and num1 > num3) and (num3 > num2):
        print(f"el mayor es el numero 1({num1}) el mediano es el numero 3 y el menor es el numero 2({num2})")

    elif (num2 > num1 and num2 > num3) and (num1 > num3):
        print(f"el mayor es el numero 2({num2}) el mediano es el numero 1({num1}) y el menor es el numero 3({num3})")
    elif (num2 > num1 and num2 > num3) and (num3 > num1):
        print(f"el mayor es el numero 2({num2}) el mediano es el numero 3({num3}) y el menor es el numero 1(num1{num1})")

    elif (num3 > num1 and num3 > num2) and (num1 > num2):
        print(f"el mayor es el numero 3({num3}) el mediano es el numero 1({num1}) y el menor es el numero 2({num2})")
    elif (num3 > num1 and num3 > num2) and (num2 > num1):
        print(f"el mayor es el numero 3({num3}) el mediano es el numero 2({num2}) y el menor es el numero 1({num1})")

#--------------------------------------------------------------------------------------------------------------------------------------------------------------------------

#Ej16. Dada una hora por teclado (horas, minutos y segundos) realiza un algoritmo que
#muestre la hora después de incrementarle un segundo.

def ej16():

    hora = 22
    minutos = 59
    segundos = 57
    segundos += 1

    if segundos >= 60:
        segundos = 0
        minutos += 1
        if minutos >= 60:
            minutos = 0
            hora += 1
            if hora >= 24:
                hora = 0

    print(f"el tiempo tras aumentar un segundo es de {hora} horas {minutos} minutos y de {segundos} segundos")

#--------------------------------------------------------------------------------------------------------------------------------------------------------------------------

#Ej17. Realiza un algoritmo que resuelva una ecuación de segundo grado. El programa pedirá por teclado los tres coeficientes 
# y mostrará las posibles soluciones: No tiene solución, una única solución (y su valor) o dos soluciones (y sus valores).

def ej17():

    def parte_positiva (a,b,c):
        return (-b + (((b**2) - (4*a*c))**0.5)) / (2 * a)

    def parte_negativa (a,b,c):
        return (-b - (((b**2) - (4*a*c))**0.5)) / (2 * a)

    a = int(input("dime el valor que le vamos a dar a a: "))
    b = int(input("dime el valor que le vamos a dar a b: "))
    c = int(input("dime el valor que le vamos a dar a c: "))
    raiz_positiva = parte_positiva(a,b,c)
    raiz_negativa = parte_negativa(a,b,c)

    print(f"el resultado de la ecuacion de segundo grado es: la parte positiva {round(raiz_positiva,3)} y la negativa es {round(raiz_negativa,3)}")

#--------------------------------------------------------------------------------------------------------------------------------------------------------------------------

#Ej18. Determinar el precio de un billete de tren, conociendo la distancia a recorrer y sabiendo que si el número de días de estancia 
# es superior a 7 y la distancia superior a 800 km el billete tiene una reducción del 30%. El precio por km es de 2,5 €.

def ej18():

    km = float(input("dime cuantos kilometros quieres hacer "))
    dias = int(input("dime en cuantos dias quieres hacerlos "))
    precio = km * 2.5
    precio_rebaja = precio * 0.30

    if km > 800 and dias > 7:
        precio_rebaja = precio - precio_rebaja
        print(f"el precio por un viaje de {km} km y {dias} dias sera de {precio_rebaja}€")
    else:
        print(f"el precio por un viaje de {km} km y {dias} dias sera de {precio}€")

#--------------------------------------------------------------------------------------------------------------------------------------------------------------------------

#Ej19. Los empleados de una fábrica trabajan por turnos: diurno y nocturno. Se debe calcular
#el jornal diario de acuerdo con los siguientes puntos:
#- La tarifa por horas diurnas es de 20 €.
#- La tarifa por horas nocturnas es de 35 €.
#- Caso de ser domingo, la tarifa se incrementará en 10 € más para el turno diurno y 15 € más
#para el nocturno.

def ej19():

    horas = int(input("cuantas horas has trabajado al dia "))
    turno = str(input("de que turno has trabajado [diurno/nocturno] "))
    domingo = str(input("trabajaste el domingo [si/no] "))

    def jornal (horas, turno, domingo):
        if turno == "diurno" or turno == "Diurno":
            if domingo == "si" or domingo == "Si":
                dinero = horas * 30
                return dinero
            else:
                dinero = horas * 20
                return dinero
        elif turno == "nocturno" or turno == "Nocturno":
            if domingo == "si" or domingo == "Si":
                dinero = horas * 45
                return dinero
            else:
                dinero = horas * 35
                return dinero

    resultado = jornal (horas, turno, domingo)

    print(f"el trabajador selecionado ha cobrado {resultado} € el dia")

#--------------------------------------------------------------------------------------------------------------------------------------------------------------------------

#Ej20. Dado el nombre (o número) de un mes y el año (comprobando si es o no bisiesto),
#deducir el número de días del mes.

def ej20():
    
    mes_txt = ["enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"]
    dias_mes = ["31", "28", "31", "30", "31", "30", "31", "31", "30", "31", "30", "31"]
    bisiesto = ["31", "29", "31", "30", "31", "30", "31", "31", "30", "31", "30", "31"]

    mes = str(input("Dime un mes por texto o por número: "))
    anyo = int(input("dime un anyo y te digo si es bisiesto o no "))

    if anyo % 4 != 0:
        bisiesto = False
    if (anyo % 4 == 0) and (anyo / 100 > 0):
        if anyo % 400 != 0:
            bisiesto = True
        else: 
            bisiesto = False

    for i in range(len(mes_txt)):
        if mes_txt[i] == mes.lower():
            if bisiesto:
                print(f"{mes_txt[i]} tiene {bisiesto[i]} días.")
            else:
                print(f"{mes_txt[i]} tiene {dias_mes[i]} días.")

#--------------------------------------------------------------------------------------------------------------------------------------------------------------------------

#Ej21. Escribe todos los números pares entre 1 y 20.

def ej21():

    num = 0

    while num < 20:
        num += 2
        print(num)

#--------------------------------------------------------------------------------------------------------------------------------------------------------------------------

#Ej22. Suma todos los números impares que hay entre 1 y 20 mostrando el resultado al final.
#Generaliza luego este ejercicio para dos números cualquiera pedidos por teclado, deberá ir del
#menor al mayor.

def ej22():

    num = -1

    while num < 20:
        if num +2 > 20:
            break
        else:
            num += 2
            print(num)

#--------------------------------------------------------------------------------------------------------------------------------------------------------------------------

#Ej23. Calcula el factorial de un número entero. El factorial es el resultado de multiplicar ese
#número por todos los números menores que él. Ejemplo: 4! = 4*3*2*1 = 24.

def ej23():

    num = int(input("dime un numero "))
    contenedor = num

    while contenedor >= 2:
        contenedor -= 1
        num = num * contenedor
    print(num)

#--------------------------------------------------------------------------------------------------------------------------------------------------------------------------

#Ej24. Calcula la media de diez números que pedimos por teclado. Generaliza la solución para
#una cantidad cualquiera de números que pediremos al principio.

def ej24():

    cantidad_numeros = int(input("de cuantos numeros quieres hacer la media "))
    nota = float(input("dime la nota del examen "))
    suma_de_notas = nota
    contador = 1

    while contador < cantidad_numeros:
        nota = float(input("dime la nota del examen "))
        suma_de_notas += nota
        contador += 1

    print(f"la media de los {cantidad_numeros} examenes ha sido de {suma_de_notas / cantidad_numeros}")

#--------------------------------------------------------------------------------------------------------------------------------------------------------------------------

#Ej25. Calcula la media para una cantidad indefinida de números. El programa parará de pedir
#números cuando se le introduzca un número negativo, en ese momento nos dará la media de
#los números introducidos hasta ese momento y la cantidad de los mismos (sin incluir al
#negativo que usamos para acabar).

def ej25():

    nota = float(input("dime la nota del examen "))
    suma_de_notas = nota
    contador = 1

    while True:
        if nota >= 0:
            nota = float(input("dime la nota del examen "))
            if nota < 0:
                print(f"se ha introducido un numero negativo a si que la media de todos los numero introducidos hasta ahora a sido de {suma_de_notas / contador}")
                break
            else:
                suma_de_notas += nota
                contador += 1        

#--------------------------------------------------------------------------------------------------------------------------------------------------------------------------

#Ej26. Mostrar el mensaje: "¿Desea terminar (s/n)?". El programa terminará cuando el
#usuario teclee 's' o 'S'; en otro caso el programa continuará indefinidamente.

def ej26():

    while True:
        acabar = str(input("[si/no] "))
        if acabar == "si" or acabar == "Si" or acabar == "sI" or acabar == "SI":
            print("has selecionado acabar el programa")
            break    

#--------------------------------------------------------------------------------------------------------------------------------------------------------------------------

#Ej27. Diseña un algoritmo que pida números hasta que se le introduzca un número mayor
#que 100.

def ej27():

    while True:
        num = int(input("dime un numero "))
        if num > 100:
            print("has introducido un numero mas grande de 100")
            break

#--------------------------------------------------------------------------------------------------------------------------------------------------------------------------

#Ej28. Piensa un algoritmo que pida números hasta que el número leído esté entre 1 y 5, en
#ese momento se debe salir.

def ej28():

    while True:
        num = int(input("dime un numero "))
        if num in range(1,6):
            print("se ha selecionado un numero comprendido entre 1 y 5")
            break

#--------------------------------------------------------------------------------------------------------------------------------------------------------------------------

#Ej29. Realiza un algoritmo que introducidas las notas de N alumnos nos indicará cuantos
#aprobados y cuantos suspensos hay. Generaliza este ejercicio para una cantidad indefinida de
#notas (pararemos con una nota negativa). Amplia el ejercicio indicando no solo cuantos
#aprobados hay, también cuantos sobresalientes, notables, bienes, aprobados y suspensos.

def ej29():

    suspenso = 0
    aprobado = 0
    bienes = 0
    notable = 0
    sobresaliente = 0

    while True:
        nota = float(input("dime una nota de un examen "))
        if nota < 0:
            print(f"se ha introducido un numero negativo se cerrara el programa: ha habido un total de \n{suspenso} suspensos \n{aprobado} aprobado"
                  f" \n{bienes} bienes \n{notable} notables y \n{sobresaliente} sobresalientes")
            break
        else:
            if nota < 5 and nota >= 0:
                suspenso += 1
            elif nota >= 5 and nota < 6:
                aprobado += 1
            elif nota >= 6 and nota < 7:
                bienes += 1
            elif nota >= 7 and nota < 9:
                notable += 1
            elif nota >= 9 and nota < 10:
                sobresaliente += 1

#--------------------------------------------------------------------------------------------------------------------------------------------------------------------------

#Ej30. Diseña el algoritmo que indique el mayor de una serie de números que introducimos
#por teclado. Crea dos versiones: en la primera la cantidad está definida en la segunda será
#indefinida.

def ej30():

    '''definido'''

    cuantos_numeros = int(input("cuantos numeros quieres "))
    contador = 1
    mayor = 0

    while contador <= cuantos_numeros:
        num = int(input("dime un numero "))
        mayor = max(num, mayor)
        contador += 1
    print(f"el mayor de todos los numero dados fue {mayor}")

    '''indefinido'''

    mayor = 0

    while True:
        num = int(input("Dime un número (o ingresa 0 para detenerte): "))    
        if num == 0:
            break    
        mayor = max(num, mayor)

    print(f"El mayor de todos los números dados fue {mayor}")
    
#--------------------------------------------------------------------------------------------------------------------------------------------------------------------------

#Ej31. Determinar si un número introducido por teclado es primo o no. Un número primo
#solo es divisible por él mismo y por la unidad.

def ej31():

    premo = int(input("dime un numero "))
    mama = True
    
    for mamasita in range(2, premo):
        if premo % mamasita == 0:
            mama = False
    if mama:
        print("this numero is premo")
    else:
        print("this numero no es premo")        

#--------------------------------------------------------------------------------------------------------------------------------------------------------------------------

#Ej32. Reutiliza el ejercicio anterior para mostrar los números primos que hay del 1 al 100.

def ej32():

    for numero in range(1, 101):
        premo = True
        for divisor in range(2, numero):
            if numero % divisor == 0:
                premo = False

        if premo:
            print(numero, end=' ')

#--------------------------------------------------------------------------------------------------------------------------------------------------------------------------

#Ej33. Genera una combinación al azar para la lotería primitiva. Los números de la lotería
#son 6, comprendidos del 1 al 49. En esta versión no importa si se repite algún número.

def ej33():

    import random as LosPollosHermanos
    contador = 0
    while contador < 6:
        contador += 1
        rule = LosPollosHermanos.randint(1, 50)
        print(rule, end=" ")

#--------------------------------------------------------------------------------------------------------------------------------------------------------------------------

#Ej34. Genera combinaciones al azar para una quiniela de fútbol. Recordemos que son 15
#resultados: 1, X y 2.

def ej34():

    import random as MiBuenAmigoMicolash
    jornada = 0
    while jornada < 15:
        jornada += 1
        equipo1 = MiBuenAmigoMicolash.randint(0, 10)
        equipo2 = MiBuenAmigoMicolash.randint(0, 10)
        
        if equipo1 > equipo2:
            print(f"jornada {jornada}: 1")
        elif equipo1 < equipo2:
            print(f"jornada {jornada}: 2")
        if equipo1 == equipo2:
            print(f"jornada {jornada}: X")
        
#--------------------------------------------------------------------------------------------------------------------------------------------------------------------------

#Ej35. Reutiliza el ejercicio anterior: genera una apuesta al azar y unos resultados también
#al azar; después indica cuantos aciertos se han producido.

def ej35():

    import random as genichiro
    jornada = 0
    contador_victorias = 0
    contador_derrotas = 0
    
    while jornada < 15:
        jornada += 1
        apuesta = genichiro.randint(0,2)
        equipo1 = genichiro.randint(0, 10)
        equipo2 = genichiro.randint(0, 10)
        
        if (apuesta == 1 and equipo1 > equipo2) or (apuesta == 2 and equipo2 > equipo1) or (apuesta == 0 and equipo1 == equipo2):
            contador_victorias += 1
        elif (apuesta == 1 and equipo2 > equipo1 or equipo1 == equipo2) or (apuesta == 2 and equipo1 > equipo2 or equipo2 == equipo1) or (apuesta == 0 and equipo1 < equipo2 or equipo2 < equipo1):
            contador_derrotas += 1
            
    print(f"se han acertado un total de {contador_victorias} apuestas")
    print(f"se han fallado un total de {contador_derrotas} apuestas")

#--------------------------------------------------------------------------------------------------------------------------------------------------------------------------

#Ej36. La calculadora. Diseña un algoritmo que pida dos números y un operador (una
#operación aritmética básica: sumar, restar, multiplicar o dividir). Se debe mostrar el resultado
#de dicha operación. Controla el posible error como la división por cero, en este caso se indicará
#que no se puede realizar. El ejercicio se debe repetir indefinidamente hasta que el usuario
#decida terminar.

def ej36():

    num1 = int(input("dime un nuemro "))
    num2 = int(input("dime otro nuemro "))
    operacion = (str(input("que operacion vas a querer hacer [suma/resta/multiplicacion/division]: "))).lower()
    
    if operacion == "suma" or "Suma":
        print(f"el resultado de la {operacion} es {num1 + num2}")
    elif operacion == "resta" or "Resta":
        print(f"el resultado de la {operacion} es {num1 - num2}")
    elif operacion == "multiplicacion" or "Multiplicacion":
        print(f"el resultado de la {operacion} es {num1 * num2}")
    elif operacion == "division" or "Division":
        print(f"el resultado de la {operacion} es {num1 // num2}")
        
#--------------------------------------------------------------------------------------------------------------------------------------------------------------------------

#Ej37. Juego del número secreto. El ordenador 'pensará' un número del 1 al 100. El usuario
#tendrá 5 intentos para averiguarlo. El programa le irá dando pistas del tipo mayor o menor. Al
#final, pase lo que pase (gane o pierda), se le preguntará al usuario si quiere continuar.

def ej37():

    import random as GayMaricon
    rule = GayMaricon.randint(1, 101)
    print(rule)
    contador = 0
    limitador = 5
    
    while contador < limitador:
        apuesta = int(input("intenta averiguar el numero de la rule "))
        contador += 1
        if apuesta != rule:     
            if apuesta > rule:
                print("el numero que pusiste es mayor al de la rule")
                print(f"intento [{contador}/{limitador}]")
                print("--------------------------------------------")
            elif apuesta < rule:
                print("el numero que pusiste es menor al de la rule")
                print(f"intento [{contador}/{limitador}]")
                print("--------------------------------------------")
        else:
            print(f"acertaste el numero de la rule({rule})")
            print(f"intento [{contador}/{limitador}]")
            break
        
        if contador >= 5:
            continuar = str(input("quieres seguir jugando [y/n] "))
            if continuar == "y" or continuar == "Y":
                limitador = 10
            
#--------------------------------------------------------------------------------------------------------------------------------------------------------------------------
  
#Ej38. Realiza un ejercicio en el que se muestre un menú que indique que ejercicio quiere
#realizar: 23, 29, 31 o salir. El programa realizará esos ejercicios hasta que el usuario indique
#que quiere salir

def ej38():
    
    while True:
        eleccion = str(input("Elige qué ejercicio quieres ejecutar [1/2/3/salir]: "))
        if eleccion == "1":
            ej1()
            break
        if eleccion == "2":
            ej2()
            break
        if eleccion == "3":
            ej3()
            break
        if eleccion == "salir":
            break
        else:
            print("Ejercicio no válido")

        opt = input("\nDesea seguir ejecutando los ejercicios? [y/n]").lower()
        if opt != 'y':
            break

#--------------------------------------------------------------------------------------------------------------------------------------------------------------------------

if __name__ == "__main__":
    main()