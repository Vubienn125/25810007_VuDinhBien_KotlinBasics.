// VuDinhBien_25810007

package com.ute.baitap.Buoi4.bai06

open class DongVat(val ten: String) {
    open fun keu(): String {
        return "..."
    }
}

class Cho(ten: String) : DongVat(ten) {
    override fun keu(): String {
        return "Gau gau"
    }
}

class Meo(ten: String) : DongVat(ten) {
    override fun keu(): String {
        return "Meo meo"
    }
}

fun main() {
    val danhSach: List<DongVat> = listOf(
        Cho("KiKi"),
        Meo("Tom"),
        Cho("LuLu")
    )

    for (dongVat in danhSach) {
        println("${dongVat.ten} keu: ${dongVat.keu()}")
    }
}