package com.example.aplikasikotlin
class Biodata(val nama: String, val umur: Int, val alamat: String) {
    // Fungsi untuk menampilkan biodata
    fun tampilkanBiodata() {
        println("Nama: $nama")
        println("Umur: $umur tahun")
        println("Alamat: $alamat")
    }
}

// Fungsi untuk menampilkan daftar hobi
fun tampilkanHobi(hobi: List<String>) {
    println("Hobi:")
    for (hobiItem in hobi) {
        println("- $hobiItem")
    }
}

fun main() {
    // Membuat objek biodata
    val biodata = Biodata("John", 25, "Jl. Mawar No. 10")

    // Memanggil fungsi tampilkanBiodata dari objek biodata
    biodata.tampilkanBiodata()

    // Daftar hobi
    val daftarHobi = listOf("Membaca", "Bermain musik", "Olahraga")

    // Memanggil fungsi tampilkanHobi
    tampilkanHobi(daftarHobi)
}
