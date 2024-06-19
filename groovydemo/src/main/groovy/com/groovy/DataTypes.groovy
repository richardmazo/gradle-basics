package com.groovy

float a = 10.24F
def b = 10.24F
println a
println a.class

s = 'hello'
println s

name = "Richard"
s="hello ${name}"
println s

s='''
All the power is with in you.
You can do anything and everything 

'''

println(s)

emailPattern=/[\w-\.]+@([\w-]+\.)+[\w-]{2,4}/
println emailPattern.getClass()
print "testgmail.com"==~ emailPattern