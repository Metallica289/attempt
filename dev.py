import time
start = time.time()
def is_prime(numb):
    for i in range(2,int(numb**0.5)+1):
        if numb % i == 0:
            return False
    return True

def is_permutations(new_numb , main_numb):
    return sorted(str(new_numb)) == sorted(str(main_numb))


for numb in range(1000,10000):
    main_numb = numb
    text = str(numb)
    for j in range(3):
        if is_prime(numb) and is_permutations(numb,main_numb):
            numb += 3330
            text += str(numb)
        else:
            break

    else:
        print(main_numb,text[:len(text)-5])

finish = time.time()
print(finish-start)
