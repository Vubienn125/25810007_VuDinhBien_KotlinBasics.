// VuDinhBien_25810007

package com.ute.baitap.Buoi3
fun datBan(tenKhach: String, soKhach: Int, loaiBan: String = "Ban thuong"): Unit {
    println("Khach: $tenKhach, So khach: $soKhach, Loai ban: $loaiBan")
}

fun main() {
    datBan("Long", 2)
    datBan("Hao", 4, "Ban VIP")
    datBan(soKhach = 6, tenKhach = "Bien", loaiBan = "Ban phong rieng")
}