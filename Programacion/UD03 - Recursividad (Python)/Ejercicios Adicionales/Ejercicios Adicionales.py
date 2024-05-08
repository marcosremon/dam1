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
        else:
            print("Ejercicio no válido")

        opt = input("\nDesea seguir ejecutando los ejercicios? [y/n]").lower()
        if opt != 'y':
            break

#--------------------------------------------------------------------------------------------------------------------------------------------------------------------------

#1. Realiza un programa que calcule la potencia de un número, dado este y su exponente. Pueden
#ocurrir tres casos:
#1º El exponente sea positivo: imprime resultado en pantalla.
#2º El exponente sea 0, el resultado es 1.
#3º El exponente sea negativo, el resultado es 1/potencia con el exponente positivo.

def ej1():

    base  = int(input("dime el valor de la base "))
    exponente = int(input("dime el valor del exponente "))

    if exponente > 0:
        resultado = base ** exponente
    elif exponente == 0:
        resultado = 1
    else:
        resultado = 1/(base ** abs(exponente))

    print(resultado)

#--------------------------------------------------------------------------------------------------------------------------------------------------------------------------

#2. El director de una escuela está organizando un viaje de estudios y requiere determinar
#cuánto debe cobrar a cada alumno y cuánto debe pagar a la compañía de viajes por el
#servicio. La forma de cobrar es la siguiente:
#a. * Si son 100 alumnos o más, el costo por cada alumno es de 65 euros.
#b. * De 50 a 99 alumnos, el costo es de 70 euros.
#c. * De 30 a 49 alumnos, el costo es de 95 euros.
#d. * Menos de 30 alumnos, el costo de la renta del autobús es de 4000 euros, sin
#importar el número de alumnos.
#Realiza un algoritmo que permita determinar el pago a la compañía de autobuses y lo
#que debe pagar cada alumno por el viaje.

def ej2():
    
    alumnos = int(input("cuantos alumno van a ir al viaje "))
    
    if alumnos < 30:
        comanyia = 4000
        pago_alumno = comanyia / alumnos
        print(f"cada alumno tendra que pagar {round(pago_alumno,3)} y se tendra que pagar a la compañia de viajes {comanyia}") 
    elif alumnos >= 30 or alumnos <= 49:
        pago_alumno = 95
        comanyia = alumnos * pago_alumno
        print(f"cada alumno tendra que pagar {pago_alumno} y se tendra que pagar a la compañia de viajes {comanyia}")   
    elif alumnos >= 50 or alumnos <= 99:
        pago_alumno = 70
        comanyia = alumnos * pago_alumno
        print(f"cada alumno tendra que pagar {pago_alumno} y se tendra que pagar a la compañia de viajes {comanyia}")
    elif alumnos >= 100:
        pago_alumno = 65
        comanyia = alumnos * pago_alumno
        print(f"cada alumno tendra que pagar {pago_alumno} y se tendra que pagar a la compañia de viajes {comanyia}")
     
#--------------------------------------------------------------------------------------------------------------------------------------------------------------------------

#3. La política de cobro de una compañía telefónica es:
#Cuando se realiza una llamada, el cobro es por el tiempo que esta dura, de tal
#forma que los primeros cinco minutos cuestan 1 euro, los siguientes tres, 80
#céntimos, los siguientes dos minutos a 70 céntimos y a partir del décimo minuto, 50 céntimos.
#Además, se carga un impuesto de 3% cuando es domingo, y si es otro día, en
#turno de mañana 15% y en turno de tarde 10%.
#Realiza un algoritmo para determinar cuánto debe pagar por cada concepto una
#persona que realiza una llamada.

def ej3():
    
    def calcular_costo_llamada(duracion, dia, turno):
        tarifa_5_min = 1.0
        tarifa_3_min = 0.8
        tarifa_2_min = 0.7
        tarifa_despues_10_min = 0.5

        impuesto_domingo = 0.03
        impuesto_manana = 0.15
        impuesto_tarde = 0.1

        if duracion <= 5:
            costo_base = duracion * tarifa_5_min
        elif duracion <= 8:
            costo_base = 5 * tarifa_5_min + (duracion - 5) * tarifa_3_min
        elif duracion <= 10:
            costo_base = 5 * tarifa_5_min + 3 * tarifa_3_min + (duracion - 8) * tarifa_2_min
        else:
            costo_base = 5 * tarifa_5_min + 3 * tarifa_3_min + 2 * tarifa_2_min + (duracion - 10) * tarifa_despues_10_min
    
        if dia == "domingo":
            costo_total = costo_base * (1 + impuesto_domingo)
        else:
            if turno == "manana":
                costo_total = costo_base * (1 + impuesto_manana)
            else:
                costo_total = costo_base * (1 + impuesto_tarde)

        return costo_total

    duracion_llamada = int(input("Ingrese la duración de la llamada en minutos: "))
    dia_llamada = input("Ingrese el día de la llamada (domingo, lunes, martes, etc.): ")
    turno_llamada = input("Ingrese el turno de la llamada (manana o tarde): ")
    
    costo_total_llamada = calcular_costo_llamada(duracion_llamada, dia_llamada, turno_llamada)
    print(f"El costo total de la llamada es: {costo_total_llamada:.2f} euros.")


#--------------------------------------------------------------------------------------------------------------------------------------------------------------------------

#4. Una compañía de transporte internacional tiene servicio en algunos países de América
#del Norte, América Central, América del Sur, Europa y Asia. El costo por servicio de
#transporte se basa en el peso del paquete y la zona a la que va dirigida. Lo anterior se
#muestra en la siguiente tabla:

    #ZONA UBICACIÓN COSTO/KILOGRAMO
    
    #1 América del Norte   24,00 euros
    #2 América Central     20,00 euros
    #3 América del Sur     21,00 euros
    #4 Europa              10,00 euros
    #5 Asia                18,00 euros
    
#Parte de su política implica que los paquetes con un peso superior a 5kg no son
#transportados, por cuestiones de logística y seguridad.
#Realiza un algoritmo para determinar el cobro por la entrega de un paquete o, en
#su caso, el rechazo de la entrega.

def ej4():
    
    continente = str(input("a que continente desea viajar [A.Norte/A.Central/A.Sur/Europa/Asia] "))
    peso_maleta = int(input("cuanto pesa tu maleta "))
    ANorte = 24
    ACentral = 20
    ASur = 21
    Europa = 10
    Asia = 18
    
    if peso_maleta > 5:
        print(f"su maleta no podra viajar por motivos de logistica y seguridad.")
    elif continente == "A.Norte":
        print(f"el cobro de su maleta sera {peso_maleta*ANorte}€")
    elif continente == "A.Central":
        print(f"el cobro de su maleta sera {peso_maleta*ACentral}€")
    elif continente == "A.Sur":
        print(f"el cobro de su maleta sera {peso_maleta*ASur}€")    
    elif continente == "Europa":
        print(f"el cobro de su maleta sera {peso_maleta*Europa}€")
    elif continente == "Asia":
        print(f"el cobro de su maleta sera {peso_maleta*Asia}€")


#5. Pedir 10 números, y mostrar al final si se ha introducido alguno negativo y cuántos.

def ej5():
    
    contador_positivos = 0
    contador_negativos = 0
    for _ in range(10):        
        num = int(input("dime un numero "))
        if num < 0:
            contador_negativos += 1
        else:
            contador_positivos += 1
            
    print(f"se han introducido {contador_positivos} numeros positivos y {contador_negativos} numeros negativos")

#--------------------------------------------------------------------------------------------------------------------------------------------------------------------------

#6. Dibuja un cuadrado de n elementos de lado utilizando *.
#  ***
#  ***
#  ***

def ej6():
    
    lado = int(input("cuantos caracteres tendra tu cuadrado por lado "))
    for _ in range(lado):
        for _ in range(lado):
            print(f"*", end=" ")
        print()
        
#--------------------------------------------------------------------------------------------------------------------------------------------------------------------------

#7. Necesitamos mostrar un contador con 5 dígitos (X-X-X-X-X), que muestre los números
#del 0-0-0-0-0 al 9-9-9-9-9, con la particularidad que cada vez que aparezca un 3 lo
#sustituya por una E.

def ej7():
    print("a")    

#--------------------------------------------------------------------------------------------------------------------------------------------------------------------------

#8. Realizar un programa que nos pida un número n, y nos diga cuantos números hay
#entre 1 y n que son primos.

def ej8():
    
    def num_primo (num):
        mama = True
        for mamasita in range(2,num):
            if num % mamasita == 0:
                mama = False
        if mama:
            return "este numero es primo"
        return "este numero no es primo"

    num = int(input("dime un numero "))
    fin = num_primo(num)
    
    print(fin)    
    
#--------------------------------------------------------------------------------------------------------------------------------------------------------------------------

#9. Escudos legionarios

#Cuenta la historia que existio un general que establecio que la mejor figura para la formacion no era
#la rectangular sino la cuadrada, de forma que el numero de filas y columnas de legionarios coincidıa. El
#problema al que se enfrentaba este general era decidir en cuantas formaciones (y de que tamaño) debia
#separar su ejercito para que:
    #No quedara ningun legionario fuera de una formacion (aunque admitia formaciones de un unico legionario).
    #Se minimizara el numero de escudos necesarios para protegerlos.
#Nuestro general, despues de hacer muchos calculos, decidio que la mejor manera de que estas dos
#condiciones se cumpliesen era comenzar haciendo el cuadrado mas grande posible con sus legionarios.
#Con los que le quedasen libres volvıa a repetir la operacion, y asi hasta que no quedasen legionarios que formar
#Por ejemplo, si el numero de legionarios en el ejercito era 35, la manera utilizada por el general para
#hacer la formacion consistia en un cuadrado de 25 legionarios (5×5), otro de 9 (3×3) y otro de 1 (1×1):

#   * * * * *
#   * * * * *   * * *
#   * * * * *   * * *    *
#   * * * * *   * * *
#   * * * * *

#Esta formacion requerıa un total de 71 escudos

def ej9():
    print("a")

#--------------------------------------------------------------------------------------------------------------------------------------------------------------------------

if __name__ == "__main__":
    main()