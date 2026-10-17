// VuDinhBien_25810007

package com.ute.baitap.Buoi3

fun dinhDangDiaChi(
    ten: String,
    diaChi: String,
    thanhPho: String = "Dong Nai",
    maBuuDien: String = "76000",
    quocGia: String = "Viet Nam"
): Unit {
    println("$ten, $diaChi, $thanhPho, $maBuuDien, $quocGia")
}

fun main() {
    dinhDangDiaChi(
        ten = "Bien",
        diaChi = "123 Hoang Dieu 2, Thu Duc",
        thanhPho = "Ho Chi Minh",
        maBuuDien = "70000",
        quocGia = "Viet Nam"
    )
}
