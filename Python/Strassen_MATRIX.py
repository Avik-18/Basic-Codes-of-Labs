import random

def spli(m):
	row = len(m)
	col4=row
	print (row,col4)
	row2, col2 = row//2, col4//2
	a=list()
	b=list()
	c=list()
	d=list()
	for i in range(row2):
		col=list()
		for j in range(col2):
			col.append(m[i][j])
		a.append(col)
	print(a)

	for i in range(row2):
		col=list()
		for j in range(col2,col4):
			col.append(m[i][j])
		b.append(col)
	print(b)
	for i in range(row2,row):
		col=list()
		for j in range(col2):
			col.append(m[i][j])
		c.append(col)
	print(c)
	for i in range(row2,row):
		col=list()
		for j in range(col2,col4):
			col.append(m[i][j])
		d.append(col)
	print(d)
	return a, b, c, d
def sub(a,b):
	t=len(a)
	print (t)
	s=list()
	for i in range(t):
		col=list()
		for j in range(t):
			z=a[i][j]-b[i][j]
			col.append(z)
		s.append(col)
	return s
def add(a,b):
	t=len(a)
	print (t)
	s=list()
	for i in range(t):
		col=list()
		for j in range(t):
			z=a[i][j]+b[i][j]
			col.append(z)
		s.append(col)
	return s
def strassen(x, y):
	q=len(x)
	print("x",q)
	print(x," ",y)
	if q == 1:
		return x[0][0] * y[0][0]
	a, b, c, d = spli(x)
	e, f, g, h = spli(y)
	s=sub(f,h)
	p1 = strassen(a, s)
	print (p1)
	
	ad=add(a,b)	
	p2 = strassen(ad, h)
	print (p2)
	
	ad1=add(c,d)
	p3 = strassen(ad1, e)
	print (p3)
	
	s1=sub(g,e)
	p4 = strassen(d, s1)
	print (p4)
	
	ad2=add(a,d)
	ad3=add(e,h)
	p5 = strassen(ad2,ad3)
	print (p5)
	
	s2=sub(b,d)
	ad4=add(g,h)
	p6 = strassen(s2, ad4)
	print (p6)
	
	s3=sub(a,c)
	ad5=add(e,f)
	p7 = strassen(s3, ad5)
	print (p7)
	print("          ",p1,p2,p3,p4,"  ",p5,p6)
	c11 = p5 + p4 - p2 + p6
	c12 = p1 + p2
	c21 = p3 + p4
	c22 = p1 + p5 - p3 - p7
	print("            ",c11,c12,c21,c22)
	c=list()
	c.append(c11)
	c.append(c12)
	c.append(c21)
	c.append(c22)
	return c 

l=int(input("\nEnter order 0f matrix "))
A=[[14,2,38,4],[21,2,33,4],[41,52,38,44],[21,29,3,74]]
B=[[5,2,6,4],[7,2,3,8],[10,12,43,74],[71,92,30,14]]
D=A
print(D)
C=[]
print(A)
print(B)
C=strassen(A,B)
print(C)


