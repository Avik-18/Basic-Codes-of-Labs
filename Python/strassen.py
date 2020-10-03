
import random
  
def split(matrix):
	return matrix[0][0], matrix[0][1], matrix[1][0], matrix[1][1] 
	
def strassen(x, y,n):
	if n == 1:
		return x * y
	a, b, c, d = split(x)
	e, f, g, h = split(y)
	p1 = strassen(a, f - h,n/2)
	p2 = strassen(a + b, h,n/2)
	p3 = strassen(c + d, e,n/2)
	p4 = strassen(d, g - e,n/2)
	p5 = strassen(a + d, e + h,n/2)
	p6 = strassen(b - d, g + h,n/2)
	p7 = strassen(a - c, e + f,n/2)
	c11 = p5 + p4 - p2 + p6
	c12 = p1 + p2
	c21 = p3 + p4
	c22 = p1 + p5 - p3 - p7
	c=list()
	c.append(c11)
	c.append(c12)
	c.append(c21)
	c.append(c22)
	return c 

l=int(input("\nEnter order 0f matrix "))

rows, cols = (l, l) 
A=list()
for i in range(rows):
	col=list()
	for j in range(cols):
		z=random.randint(1,100)
		col.append(z)
	A.append(col)
B=list()
for i in range(rows):
	col1=list()
	for j in range(cols):
		z=random.randint(1,100)
		col1.append(z)
	B.append(col1)

C=list()
print(A)
print(B)
C=strassen(A,B,l)
print(C)



