import random
import time
import sys

sys.setrecursionlimit(10**8) 

def stable(A,S) :
	for j in range(0,l-1) :
		if A[j]==A[j+1] :
			for k in range(j+1,l) :
				if S[j]>S[k] and A[j]==A[k] :
					z=A[j]
					A[j]=A[k]
					A[k]=z
					S[j] , S[k]=S[k] , S[j]
				elif A[j]!=A[k] :
					break;
def insertion(A,l,S):
	start=time.time()
	for j in range(1,l):
	
		x=A[j]
		y=S[j]
		i=j-1
		while i>=0 and A[i]>x :
			A[i+1]=A[i]
			S[i+1]=S[i]
			i=i-1

		A[i+1]=x
		S[i+1]=y
	end=time.time()
	return (A,end-start)
	
	

def merge(A,p,q,r,T): 
    n1=q-p+1
    n2=r-q
    L=[0]*(n1) 
    R=[0]*(n2) 
    L1=[0]*(n1) 
    R1=[0]*(n2)  
    for i in range(0,n1): 
        L[i]=A[p+i] 
        L1[i]=T[p+i]
  
    for j in range(0,n2): 
        R[j]=A[q+1+j] 
        R1[j]=T[q+1+j]
    i=0     
    j=0    
    k=p        
    while i<n1 and j<n2 : 
        if L[i]<=R[j]: 
            A[k]=L[i] 
            T[k]=L1[i]
            i=i+1
        else: 
            A[k]=R[j] 
            T[k]=R1[j]
            j=j+1
        k=k+1
    while i<n1 : 
        A[k]=L[i] 
        T[k]=L1[i]
        i=i+1
        k=k+1
    while j<n2 : 
        A[k]=R[j] 
        T[k]=R1[j]
        j=j+1
        k=k+1 
def mergeSort(A,p,r,T): 
    start=time.time()
    if p<r:  
        q=(p+(r-1))//2   
        mergeSort(A,p,q,T) 
        mergeSort(A,q+1,r,T) 
        merge(A,p,q,r,T)
    end=time.time() 
    return (A,end-start)


	


def partition_endpivot(A,p,r,Q):
	x=A[r]
	z=Q[r]
	i=p-1
	for j in range(p,r):
		if A[j]<=x :
			i=i+1
			y=A[i]
			A[i]=A[j]
			A[j]=y
			q=Q[i]
			Q[i]=Q[j]
			Q[j]=q
	y=A[i+1]
	A[i+1]=A[r]
	A[r]=y
	q=Q[i+1]
	Q[i+1]=Q[r]
	Q[r]=q
	return (i+1)

def quickSort_endpivot(A,p,r,Q):	
	start=time.time()
	if p<r :
		q=partition_endpivot(A,p,r,Q)
		quickSort_endpivot(A,p,q-1,Q)
		quickSort_endpivot(A,q+1,r,Q)
	end=time.time()
	return (A,end-start)
	
def partition_startpivot(A,p,r,R):
	i=p+1
	x=A[p]
	z=R[p]
	for j in range(p+1,r+1):
		if x>=A[j] :
			y=A[i]
			A[i]=A[j]
			A[j]=y
			w=R[i]
			R[i]=R[j]
			R[j]=w
			i=i+1
	y=A[p]
	A[p]=A[i-1]
	A[i-1]=y
	w=R[p]
	R[p]=R[i-1]
	R[i-1]=w
	return (i-1)  
	
def quickSort_startpivot(A,p,r,R):
	start=time.time()
	if p<r :
		q=partition_startpivot(A,p,r,R)
		quickSort_startpivot(A,p,q-1,R)
		quickSort_startpivot(A,q+1,r,R)
	end=time.time()
	return (A,end-start)


def partition_randompivot(A,p,r,T):
	i=random.randint(p,r)
	y=A[r]
	A[r]=A[i]
	A[i]=y
	z=T[r]
	T[r]=T[i]
	T[i]=z
	i=p
	for j in range(p,r):
		if A[j]<=A[r] :
			y=A[j]
			A[j]=A[i]
			A[i]=y
			z=T[j]
			T[j]=T[i]
			T[i]=z
			i=i+1
	y=A[i]
	A[i]=A[r]
	A[r]=y
	z=T[i]
	T[i]=T[r]
	T[r]=z
	return (i) 					 
	
def quickSort_randompivot(A,p,r,T):
	start=time.time()
	if p<r :
		q=partition_randompivot(A,p,r,T) 
		quickSort_randompivot(A,p,q-1,T)
		quickSort_randompivot(A,q+1,r,T)
	end=time.time()
	return (A,end-start)









def display(arr):
	for i in range(20):
		print(arr[i], end=",")


l=int(input("Enter length of array "))
A= list()
for i in range(l):
	z=random.randint(1,10000)
	A.append(z)
		
I= A.copy()
M= A.copy()
QE= A.copy()
QS= A.copy()
QR= A.copy()

S = [ut for  ut in range(0, l)]


P= S.copy()
Q= S.copy()
R= S.copy()
T= S.copy()

ins=list()
ins,ti=insertion(I,l,S)
stable(ins,S)

print("\n\nFirst 20 elements Sorted elements using INSERTION sort : ")
display(ins)
print("\n\nTime taken for sorting ",l," elements : ", ti)


mer=list()
mer,tm=quickSort_endpivot(M,0,l-1,P)	
stable(mer,P)

print("\n\nFirst 20 Sorted elements using  MERGE sort : ")
display(mer)
print("\n\nTime taken for sorting ",l," elements : ", tm)



	
qe=list()
qe,te=quickSort_endpivot(QE,0,l-1,Q)	
stable(qe,Q)

print("\n\nFirst 20 Sorted elements using QUICK sort ( END element as pivot ) : ")
display(qe)
print("\n\nTime taken for sorting ",l," elements : ", te)




qs=list()
qs,ts=quickSort_startpivot(QS,0,l-1,R)	
stable(qs,R)

print("\n\nFirst 20 Sorted elements using QUICK sort ( START element as pivot ) : ")
display(qs)
print("\n\nTime taken for sorting ",l," elements : ", ts)



qr=list()
qr,tr=quickSort_startpivot(QR,0,l-1,T)	
stable(qr,T)

print("\n\nFirst 20 Sorted elements using QUICK sort ( RANDOM element as pivot ) : ")
display(qr)
print("\n\nTime taken for sorting ",l," elements : ", tr)









		
