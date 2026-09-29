// VuDinhBien_25810007

package com.ute.baitap.Buoi4.bai01

class SanPham(
    val tenSanPham: String,
    val gia: Double,
    val soLuongTonKho: Int = 0
)

fun main() {
    val sanPham1 = SanPham("Chuot khong day", 250000.0, 30)
    val sanPham2 = SanPham(tenSanPham = "Ban phim co", gia = 890000.0)

    println("San pham 1:")
    println("Ten san pham: ${sanPham1.tenSanPham}")
    println("Gia: ${sanPham1.gia}")
    println("So luong ton: ${sanPham1.soLuongTonKho}")

    println("San pham 2:")
    println("Ten san pham: ${sanPham2.tenSanPham}")
    println("Gia: ${sanPham2.gia}")
    println("So luong ton: ${sanPham2.soLuongTonKho}")
}