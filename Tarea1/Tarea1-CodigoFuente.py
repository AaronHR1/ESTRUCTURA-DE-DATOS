import pandas as pd
datos=pd.read_csv('D:\descargas\PresenciaRedesSociales.csv',header=None,encoding='latin-1')
matriz=datos.values


seguidoresEnero=int(matriz[8][3])
seguidoresJunio=int(matriz[8][8])
diferencia=seguidoresJunio-seguidoresEnero

print("Diferencia de seguidores en twitter entre el mes de enero y junio: "+ str(diferencia) +"\n")

print("Diferencia de visualizaciones de youtube entre dos meses \n ")



bandera=True
while bandera:
    mes1=int(input("Digite el primer mes en un formato de 12 numeros: \n"))
    
    if mes1 < 1 or mes1>12:
        print("Porfavor digite un numero del 1 al 12: \n")
    elif mes1>6:
        print("Por ahora solo tenemos registros del mes enero al mes de junio \n")
    else:
        bandera=False
        
bandera=True
while bandera:
    mes2=int(input("Digite el segundo mes en un formato de 12 numeros: \n"))
    
    if mes2 < 1 or mes1>12:
        print("Porfavor digite un numero del 1 al 12: \n")
    elif mes2>6:
        print("Por ahora solo tenemos registros del mes enero al mes de junio \n")
    else:
        bandera=False
 

diferencia=abs(int(matriz[16][mes2+2])-int(matriz[16][mes1+2]))
print("Diferencia de visualizaciones de youtube entre " + matriz[0][mes1+2] + " y " + matriz[0][mes2+2] +": " + str(diferencia))

sumaCrecimiento=0
for i in range(6):
    sumaCrecimiento+=int(matriz[9][i+3])
print("promedio de crecimiento de twitter de enero a junio: " + str(sumaCrecimiento/6))

sumaCrecimiento=0
for i in range(6):
    sumaCrecimiento+=int(matriz[2][i+3])
print("promedio de crecimiento de facebook de enero a junio: " + str(sumaCrecimiento/6))

promedio=0

for i in range(6):
    promedio+=int(matriz[18][i+3])
print("promedio de “Me gusta” de Youtube: " + str(promedio/6))

promedio=0

for i in range(6):
    promedio+=int(matriz[13][i+3])
print("promedio de “Me gusta” de Twitter: " + str(promedio/6))

promedio=0

for i in range(6):
    promedio+=int(matriz[5][i+3])
print("promedio de “Me gusta” de Facebook: " + str(promedio/6))



