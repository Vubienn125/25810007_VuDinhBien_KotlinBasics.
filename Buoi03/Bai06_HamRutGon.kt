// VuDinhBien_25810007

package com.ute.baitap.Buoi3

fun binhPhuongDayDu(n: Int): Int {
    return n * n
}
fun binhPhuongRutGon(n: Int): Int = n * n

fun chuViHinhVuongDayDu(canh: Int): Int {
    return canh * 4
}
fun chuViHinhVuongRutGon(canh: Int): Int = canh * 4

fun laSoChanDayDu(n: Int): Boolean {
    return n % 2 == 0
}
fun laSoChanRutGon(n: Int): Boolean = n % 2 == 0


fun main() {
    val n = 5
    val canh = 4

    println("Binh phuong:")
    println(binhPhuongDayDu(n))
    println(binhPhuongRutGon(n))

    println("\nChu vi hinh vuong:")
    println(chuViHinhVuongDayDu(canh))
    println(chuViHinhVuongRutGon(canh))

    println("\nKiem tra so chan:")
    println(laSoChanDayDu(n))
    println(laSoChanRutGon(n))
}
