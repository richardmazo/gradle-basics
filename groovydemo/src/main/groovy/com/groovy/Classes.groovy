package com.groovy

class Patient {
    def firstName, lastName, age
    static hospitalCode="Best Hospital"

    void setLastName(lastName) {
        if(lastName==null) {
            throw new IllegalArgumentException("Last Name can not be null")
        }
        this.lastName = lastName
    }

    static void display(){
        println hospitalCode
    }
}

p = new Patient(firstName: 'John', lastName: 'Bailey', age: 40)
p.setLastName("Buffer")
println(p.firstName+" "+p.lastName+" "+p.age)

Patient.display()