package com.joewalker.shoppingcart

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ShoppingCartApp

fun main(args: Array<String>) {
    runApplication<ShoppingCartApp>(*args)
}
