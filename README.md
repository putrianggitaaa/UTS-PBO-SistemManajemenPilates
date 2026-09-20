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

# KODE YANG MENERAPKAN INHERITANCE
Penerapan inheritance terdapat pada class JenisKelas yang bertindak sebagai superclass, JenisKelasPrivate dan JenisKelasPublik yang bertindak sebagai subclass. Penjelasannya adalah sebagai berikut:
## JenisKelas.java
<img width="866" height="761" alt="image" src="https://github.com/user-attachments/assets/35738b53-77db-4972-a75f-6a102e8f82ee" />

Class JenisKelas berperan sebagai superclass yang menjadi dasar bagi jenis kelas Pilates lainnya. Class ini memiliki beberapa atribut umum, yaitu idJenis, namaJenis, level, dan durasi. Atribut tersebut merupakan informasi yang dibutuhkan oleh setiap jenis kelas Pilates. Class JenisKelas juga memiliki constructor yang digunakan untuk menginisialisasi atribut umum yang nantinya dapat diwariskan kepada subclass. Hal ini memungkinkan JenisKelasPrivate dan JenisKelasPublik menggunakan atribut yang sama tanpa perlu mendeklarasikan kembali atribut tersebut pada masing-masing class. Dengan demikian, JenisKelas menjadi induk (superclass), sedangkan JenisKelasPrivate dan JenisKelasPublik menjadi class turunan atau subclass.
## JenisKelasPrivate.java
<img width="786" height="342" alt="image" src="https://github.com/user-attachments/assets/c450ff80-4d1b-40bb-895a-4296738b06b5" />


Keyword extends menunjukkan bahwa JenisKelasPrivate merupakan subclass dari JenisKelas. Dengan demikian, JenisKelasPrivate dapat mewarisi atribut dan method yang dimiliki oleh class JenisKelas. Selain atribut yang diwarisi, JenisKelasPrivate memiliki atribut khusus yaitu jenisSesi yang digunakan untuk menyimpan jenis sesi pada kelas private. Inheritance juga diterapkan pada constructor melalui penggunaan Keyword super yang digunakan untuk memanggil constructor dari superclass JenisKelas. Dengan demikian, nilai idJenis, namaJenis, level, dan durasi dapat diteruskan dan diinisialisasi oleh constructor pada class JenisKelas. Setelah itu, jenisSesi diinisialisasi sebagai atribut khusus milik JenisKelasPrivate.
## JenisKelasPublik.java
<img width="766" height="367" alt="image" src="https://github.com/user-attachments/assets/b8102196-f303-4b0c-a8f8-5386d20e5132" />

Keyword extends menunjukkan bahwa JenisKelasPublik merupakan subclass dari JenisKelas. Class ini mewarisi atribut dan method yang dimiliki oleh superclass JenisKelas, seperti idJenis, namaJenis, level, dan durasi. JenisKelasPublik kemudian memiliki atribut tambahan yaitu Atribut kapasitas yang merupakan karakteristik khusus yang hanya ditambahkan pada class JenisKelasPublik untuk menentukan jumlah peserta dalam kelas publik. Inheritance juga diterapkan pada constructor melalui penggunaan Keyword super yang digunakan untuk memanggil constructor dari superclass JenisKelas. Dengan demikian, nilai idJenis, namaJenis, level, dan durasi dapat diteruskan dan diinisialisasi oleh constructor pada class JenisKelas. Setelah itu, kapasitas diinisialisasi sebagai atribut khusus milik JenisKelasPublik.
# DOKUMENTASI ALUR PROGRAM

## Tampilan Menu Utama
<img width="591" height="312" alt="image" src="https://github.com/user-attachments/assets/036bd8ed-d392-4cc0-8d53-728d8af3a08d" />

Pada bagian ini pengguna akan diberikan beberapa pilihan menu yang dapat digunakan untuk mengelola data. Terdapat menu member yang berfungsi untuk mengelola data member, menu Instruktur yang digunakan untuk mengelola data instruktur, menu jenis kelas yang digunakan untuk mengelola jenis kelas yang tersedia, serta menu pendaftaran kelas yang digunakan untuk mengelola daftar kelas yang akan dilaksanakan di studio pilates ini. Program ini dilengkapi input validator yang apabila kita menginput menu diluar dari 1-5, maka akan muncul pemberitahuan agar memilih menu dengan benar.

## Menu Member
<img width="535" height="237" alt="image" src="https://github.com/user-attachments/assets/8f65d11e-2201-4cda-9f4f-8321c1047d91" />

Menu member berisi 2 sub menu yaitu lihat dan tambah member yang fungsinya sebagai berikut:
* **Tambah Member**
 <img width="556" height="455" alt="image" src="https://github.com/user-attachments/assets/e77a130d-7c2e-47e4-838f-b4a59976f83a" />
Pada sub menu ini, pengguna dapat menambahkan member baru yang akan bergabung untuk mengikuti kelas di studio dengan memasukkan ID member, nama member, nomor telepon, dan usia member tersebut. Program ini dilengkapi dengan input validator sehingga pengguna tidak akan dapat memasukkan ID yang sama secara berulang dan tidak dapat mengosongkan nama atribut.

* **Lihat Member**
<img width="521" height="456" alt="image" src="https://github.com/user-attachments/assets/d92363b1-a351-46dd-8f94-f92d5fa9a26d" />



