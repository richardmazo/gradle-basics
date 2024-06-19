package com.groovy

LinkedList l = [1,2,3]
ll = [1,2,3]
println l
println l.class

l << 4
println l

l=l+[5,6,7]
println l

println l-[3,5]

l.each { println it }
l.reverseEach { println it }
l.eachPermutation { println it }
