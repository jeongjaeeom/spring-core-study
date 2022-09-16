package com.example.springcore.orders

interface OrderService {
    fun createOrder(memberId: Long, itemName: String, itemPrice: Int): Order
}