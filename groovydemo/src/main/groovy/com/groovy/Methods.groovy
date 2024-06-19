package com.groovy

int product(int x=3, int y){
    x*y
}

result = product(10,5)
println result

void display(Map productDetails) {
    println productDetails.name
    println productDetails.price
}

display([name: 'Iphone', price: 1000])