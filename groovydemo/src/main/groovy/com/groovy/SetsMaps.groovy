package com.groovy

s=['java','js','python','js'] as Set
TreeSet s1 = ['java','js','python','js'] as Set
println s
println s.class

m=[courseName:'Gradle', rating:5, price:20]
println m
m.each { k,v->
    println k
    println v
}
println("--------")
println m.courseName
println m['courseName']
println m.get('courseName')
println("--------")
m.review="Its awesome"
//m['review']="Its Awesome" //Es otra forma de hacer la asignacion
println m.get('review')