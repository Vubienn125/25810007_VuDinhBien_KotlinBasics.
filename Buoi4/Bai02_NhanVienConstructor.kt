// VuDinhBien_25810007

package com.ute.baitap.Buoi4

class NhanVien(
    maNhanVien: String,
    val ten: String,
    var luongThang: Double
) {
    constructor(ten: String) : this("TAM", ten, 0.0)
}

fun main() {
    val nv1 = NhanVien("F01", "Vu Dinh Bien", 12000000.0)
    val nv2 = NhanVien("Nguyen Quang Minh")

    println("Nhan vien 1:")
    println("Ten: ${nv1.ten}")
    println("Luong thang: ${nv1.luongThang}")

    println("Nhan vien 2:")
    println("Ten: ${nv2.ten}")
    println("Luong thang: ${nv2.luongThang}")

    nv1.luongThang = 15000000.0
    println("Luong moi cua nv1: ${nv1.luongThang}")
}