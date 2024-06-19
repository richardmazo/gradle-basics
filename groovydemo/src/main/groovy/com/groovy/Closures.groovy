package com.groovy

c={ n=2 ->
    println(n%2==0?"even":"odd")
}

c.call()

4.times { n->println n}
4.times { print it }