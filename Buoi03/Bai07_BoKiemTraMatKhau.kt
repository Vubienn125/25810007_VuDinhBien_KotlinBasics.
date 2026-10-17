// VuDinhBien_25810007

package com.ute.baitap.Buoi3

fun main() {
    val kiemTraDoDai: (String) -> Boolean = { matKhau -> matKhau.length >= 8 }

    val matKhau1 = "abc123"
    val matKhau2 = "matkhau8"
    val matKhau3 = "MatKhau2026"

    println("Mat khau \"$matKhau1\" hop le: ${kiemTraDoDai(matKhau1)}")
    println("Mat khau \"$matKhau2\" hop le: ${kiemTraDoDai(matKhau2)}")
    println("Mat khau \"$matKhau3\" hop le: ${kiemTraDoDai(matKhau3)}")
}