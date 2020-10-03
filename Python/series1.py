n=int(input("Enter a no : "))
s=n**2
a=n
c=0
print("a==== ",a)
while a>0 :
	c=c+1
	a=a//10
print("c== ",c)
if(s%(10**c)==n):
	print("Automorphic no.")
else:
	print("Not")
	
