

def maximumSwap(num):
    numeros=str(num)
    arregloNumeros = [int(digito) for digito in numeros]
    
    inicio=0
    
    indexMayor=inicio
    encontrar=False
    
    while inicio<len(numeros) and not encontrar:
        mayor=arregloNumeros[inicio]
        for i in range(inicio+1,len(arregloNumeros)):
            if arregloNumeros[i]>mayor:
                indexMayor=i
                mayor = arregloNumeros[i]
                encontrar=True
                
        if not encontrar:
            inicio+=1
    
    if not encontrar:
        return num
    
    aux=arregloNumeros[inicio]
    arregloNumeros[inicio]=arregloNumeros[indexMayor]
    arregloNumeros[indexMayor]=aux
    
    string=""
    for elemento in arregloNumeros:
        string+=str(elemento)
    
    return int(string)  

print(maximumSwap(98368))


