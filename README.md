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
 
Pada sub menu ini, pengguna dapat menambahkan member baru yang akan bergabung untuk mengikuti kelas di studio dengan memasukkan data-data pribadi member tersebut. Program ini dilengkapi dengan input validator sehingga pengguna tidak akan dapat memasukkan ID yang sama secara berulang dan tidak dapat mengosongkan nama atribut.

* **Lihat Member**
 <img width="546" height="462" alt="image" src="https://github.com/user-attachments/assets/723b2fd5-242f-4699-8a9d-893ec435c802" />

 Pada sub menu ini, pengguna dapat melihat daftar member yang telah terdaftar pada sistem.

* **Kembali**
<img width="575" height="365" alt="image" src="https://github.com/user-attachments/assets/5c16a9c6-3337-4085-97a1-55fa33dd9037" />

Pada sub menu ini, pengguna dapat kembali ke menu utama program.

## Menu Instruktur 
<img width="567" height="307" alt="image" src="https://github.com/user-attachments/assets/57253ce7-2eec-4b5a-af50-0c5aea68f273" />

Menu instruktur berisi 2 sub menu yaitu lihat dan tambah instruktur yang fungsinya sebagai berikut:

* **Tambah Instruktur**
<img width="692" height="412" alt="image" src="https://github.com/user-attachments/assets/76ca191e-4b59-4dd0-b430-377fd0f380b0" />

Pada sub menu ini, pengguna dapat menambahkan instruktur baru yang akan bergabung untuk memandu kelas di studio dengan memasukkan data-data pribadi instruktur tersebut. Program ini dilengkapi dengan input validator sehingga pengguna tidak akan dapat memasukkan ID yang sama secara berulang dan tidak dapat mengosongkan nama atribut.

* **Lihat Instruktur**
<img width="567" height="507" alt="image" src="https://github.com/user-attachments/assets/3f12579f-15ef-43e3-aa85-0a842e3e3b86" />

 Pada sub menu ini, pengguna dapat melihat daftar instruktur yang telah terdaftar pada sistem.

* **Kembali**
<img width="570" height="371" alt="image" src="https://github.com/user-attachments/assets/1db7252b-a4e0-4ebb-bb0d-bbe6ebeb6719" />

Pada sub menu ini, pengguna dapat kembali ke menu utama program.

## Menu Jenis Kelas
<img width="560" height="302" alt="image" src="https://github.com/user-attachments/assets/ceb8e4a7-65f6-44c7-87d5-47b41412a450" />

Menu jenis kelas berisi 2 sub menu yaitu lihat dan tambah jenis kelas yang fungsinya sebagai berikut:

* **Tambah Jenis Kelas**
<img width="730" height="705" alt="image" src="https://github.com/user-attachments/assets/263c6ce8-0968-4577-ab22-aafa6a020c9f" />

Pada sub menu ini, pengguna dapat menambahkan jenis kelas baru yang akan dilaksanakan di studio dengan memasukkan informasi dari jenis kelas tersebut tersebut. Program ini dilengkapi dengan input validator sehingga pengguna tidak akan dapat memasukkan ID yang sama secara berulang dan tidak dapat mengosongkan nama atribut.

* **Lihat Jenis Kelas**
<img width="552" height="817" alt="image" src="https://github.com/user-attachments/assets/745f873b-ccc5-4fc5-bcbf-711a7b26128c" />

 Pada sub menu ini, pengguna dapat melihat daftar jenis kelas yang telah terdaftar pada sistem.

* **Kembali**
<img width="582" height="362" alt="image" src="https://github.com/user-attachments/assets/cca445db-af1f-4c25-b1a1-41a2758cb7ee" />

Pada sub menu ini, pengguna dapat kembali ke menu utama program.

## Menu Daftar Kelas 
<img width="557" height="357" alt="image" src="https://github.com/user-attachments/assets/fc16a388-f1ef-41fd-b0e9-ac47d3445aaf" />

Menu pendaftaran kelas berisi 4 sub menu yaitu lihat, tambah, hapus, dan perbarui daftar kelas yang fungsinya sebagai berikut:

* **Lihat Daftar Kelas**
<img width="571" height="377" alt="image" src="https://github.com/user-attachments/assets/76e3c902-da59-437d-9881-edb07a6b2244" />

Pada sub menu ini, pengguna dapat melihat daftar kelas yang telah terdaftar pada sistem.

* **Pendaftaran Kelas**
<img width="590" height="296" alt="image" src="https://github.com/user-attachments/assets/30b7cfb6-61f1-41cc-9e1d-21dbf67b2682" />

Pada sub menu ini, sistem akan menampilkan id member, id instruktur, dan id jenis kelas agar pengguna dapat memilih member, instruktur, dan jenis kelas apa yang ingin ditambahkan. Setelah itu, akan muncul output dimana kelas berhasil ditambahkan dan tertera identitas member, instruktur, dan jenis kelas yang akan dilaksanakan. Program ini dilengkapi dengan input validator sehingga pengguna tidak akan dapat memasukkan ID yang sama secara berulang dan tidak dapat mengosongkan nama atribut.

* **Hapus Kelas**
<img width="522" height="737" alt="image" src="https://github.com/user-attachments/assets/142dc259-b5e5-4316-866a-7c2f43f71eb6" />

Pada sub menu ini, sistem akan mengarahkan pengguna untuk menginput ID kelas yang akan dihapus. Selanjutnya, sistem akan menghapus kelas sesuai dengan ID yang di input oleh pengguna. 

* **Update Status Kelas**
<img width="562" height="870" alt="image" src="https://github.com/user-attachments/assets/9c78d973-18a9-427b-8e47-26a0fca55504" />

Pada sub menu ini, sistem dapat memperbarui status dari daftar kelas. Sub menu ini dapat digunakan untuk memperbarui status dari kelas yang telah didaftarkan dari Terjadwal menjadi Selesai atau Batal agar memudahkan pengelola dalam monitoring daftar kelasnya.

* **Kembali**
<img width="577" height="355" alt="image" src="https://github.com/user-attachments/assets/25053e78-39f0-4b6f-ad81-90514e82132a" />

Pada sub menu ini, pengguna dapat kembali ke menu utama program.

## Keluar
<img width="577" height="450" alt="image" src="https://github.com/user-attachments/assets/c4f2d33c-9a17-484b-98e6-9a6b00885662" />

Pada menu ini, pengguna akan diarahkan untuk keluar dari sistem.
