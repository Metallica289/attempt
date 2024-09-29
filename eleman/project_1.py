#ProjectEuler , Soru 41 , Pandijital Asal.
def carpanlara_ayirma(n):
    esler = []
    for i in range(2, int(n**0.5)+1):
        if n % i == 0:
            esler.append([i, n // i, n])
    return esler


def pandijital(liste):
    rakamlar = [int(j) for alt_liste in liste for sayi in alt_liste for j in str(sayi)]
    rakamlar.sort()
    if "".join(str(i) for i in rakamlar) == "123456789":
        return True
    return False

counter = 0
for n in range(100, 10000):
    carpanlar = carpanlara_ayirma(n)
    for es in carpanlar:
        if pandijital(es):
            counter += 1
            break
print(counter)
