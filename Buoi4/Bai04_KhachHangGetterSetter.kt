// VuDinhBien_25810007

package com.ute.baitap.Buoi4.bai04

class KhachHang(
    var ho: String,
    var ten: String
) {
    var hoTen: String
        get() = "$ho $ten"
        set(value) {
            val phanHoTen = value.trim().split(" ")
            ho = phanHoTen.dropLast(1).joinToString(" ")
            ten = phanHoTen.last()
        }
}

fun main() {
    val khachHang = KhachHang("Vu", "Bien")
    println("Ho ten ban dau: ${khachHang.hoTen}")

    khachHang.ten = "Dinh Bien"
    println("Ho ten sau khi doi: ${khachHang.hoTen}")

    khachHang.hoTen = "Nguyen Quang Minh"

    println("Ho sau khi tach: ${khachHang.ho}")
    println("Ten sau khi tach: ${khachHang.ten}")
    println("Ho ten moi: ${khachHang.hoTen}")
}
