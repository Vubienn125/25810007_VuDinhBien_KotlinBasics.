// VuDinhBien_25810007

package com.ute.baitap.Buoi3

fun main() {
    val tuoi = 25
    val loaiVe = if (tuoi < 13) {
        "Ve tre em"
    } else if (tuoi < 60) {
        "Ve nguoi lon"
    } else {
        "Ve cao tuoi"
    }

    println(loaiVe)
}
