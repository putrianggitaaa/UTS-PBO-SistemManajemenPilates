# UTS PEMROGRAMAN BERORIENTASI OBJEK

Nama: Putri Anggita Melasari

Kelas: A'25

NIM: 2509116010

# SISTEM MANAJEMEN PILATES
Sistem Manajemen Pilates merupakan program berbasis bahasa pemrograman Java yang dibuat untuk membantu pengelolaan data pada studio Pilates secara sederhana. Program memungkinkan pengelola studio pilates untuk mengelola beberapa data utama, yaitu data member yang mengikuti kelas pilates, data instruktur yang memandu kelas pilates, jenis kelas pilates yang dapat diikuti, serta pendaftaran kelas. Pengelola dapat menambahkan dan melihat data member, instruktur, serta jenis kelas. Selain itu, program juga menyediakan pengelolaan daftar kelas yang mencakup pendaftaran kelas, penghapusan kelas, dan pembaruan status kelas.

# STRUKTUR DAN HIERARKI CLASS
Berikut adalah berbagai _class_ yang digunakan dalam program beserta penjelasan class yang bertindak sebagai _superclass_ dan _subclass_:
## SistemPilates.java
Class ini berfungsi sebagai _class main_ atau _entry point_ yang digunakan untuk menjalankan program utama.
## service.java
Class ini berfungsi sebagai proses pengolahan data dan menampung method untuk menambahkan, menampilkan, menghapus, dan memperbarui data sesuai dengan fitur yang tersedia. 
## InputValidator.java
Class ini berfungsi sebagai class yang menampung method untuk memvalidasi input angka, teks, nomor telepon, pilihan menu, jenis kelamin, dan status kelas. Dengan adanya class ini, proses validasi input dapat dipisahkan dari proses pengelolaan data sehingga kode pada class service menjadi lebih terstruktur.
## Member.java
Class ini berfungsi sebagai class yang merepresentasikan data member pada program, berisi identitas pribadi dari member tersebut.
## Instruktur.java
Class ini berfungsi sebagai class yang merepresentasikan data instruktur pada program, berisi identitas pribadi dari instruktur tersebut.
## JenisKelas.java (SuperClass)
Class ini berfungsi sebagai _superclass_ yang digunakan untuk enyimpan atribut umum dari jenis kelas Pilates. Atribut tersebut meliputi ID jenis, nama jenis, level, dan durasi kelas. Class ini menjadi dasar bagi class JenisKelasPrivate dan JenisKelasPublik sehingga kedua jenis kelas tersebut dapat menggunakan atribut umum yang sama tanpa harus mendefinisikannya kembali.
## JenisKelasPrivate.java (SubClass) 
Class ini berfungsi sebagai _subclass_ dari JenisKelas.java yang digunakan untuk merepresentasikan kelas Pilates private. Class ini mewarisi atribut umum dari JenisKelas dan memiliki atribut tambahan berupa jenisSesi. Atribut tersebut digunakan untuk membedakan bentuk sesi pada kelas private.
## JenisKelasPublik.java (SubClass)
Class ini berfungsi sebagai _subclass_ dari JenisKelas.java yang digunakan untuk merepresentasikan kelas Pilates publik. Selain mewarisi atribut dari JenisKelas, class ini memiliki atribut tambahan berupa kapasitas untuk menentukan jumlah peserta yang dapat mengikuti kelas publik tersebut.
## DaftarKelas.java
Class ini berfungsi untuk menyimpan informasi mengenai pendaftaran atau jadwal kelas yang diikuti oleh member. Class ini menghubungkan beberapa data, yaitu ID member, ID instruktur, ID jenis kelas, tanggal kelas, jam kelas, ruangan, dan status kelas. Dengan adanya class ini, data member, instruktur, dan jenis kelas dapat dihubungkan dalam satu data pendaftaran kelas.
