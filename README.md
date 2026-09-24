# Charist Evlyn Myscha Rerung_2509116102

## Deskripsi Program
Sistem Manajemen Studio Musik merupakan program berbasis bahasa pemrograman Java yang digunakan untuk mengelola data studio musik secara sederhana. Program ini dibuat untuk membantu pengguna dalam mengelola data studio, pelanggan, dan booking studio. Program ini menerapkan operasi CRUD untuk menambah, menampilkan, mengubah, dan menghapus data yang tersimpan.
## Class yang ada di Program ini
Program ini memiliki beberapa class, yaitu 

1. Main.java sebagai class utama atau entry point yang digunakan untuk menjalankan program, menampilkan menu utama, menerima input pilihan dari pengguna, dan menjalankan proses sesuai dengan menu yang dipilih.

2. Class Studio.java merupakan class entitas yang menyimpan informasi mengenai studio musik, seperti ID studio, nama studio, jenis studio, dan harga sewa per jam. Class ini menerapkan constructor, getter, setter, access modifier, dan encapsulation.
3. Class Pelanggan.java merupakan class entitas yang digunakan untuk menyimpan data pelanggan, seperti ID pelanggan, nama, nomor telepon, dan alamat. Class ini juga menerapkan constructor, getter, setter, access modifier, dan encapsulation.
4. Class Booking.java merupakan class entitas yang digunakan untuk menyimpan data pemesanan studio, seperti ID booking, ID pelanggan, ID studio, tanggal booking, jam booking, dan durasi booking. Class ini juga menerapkan constructor, getter, setter, access modifier, dan encapsulation. Data dari masing-masing class tersebut disimpan menggunakan ArrayList sehingga dapat dikelola selama program berjalan.

## Alur Perencanaan Program
Alur program dimulai ketika program dijalankan melalui class Main.java. Program akan menampilkan menu utama yang berisi beberapa pilihan, yaitu tambah data studio, lihat data studio, ubah data studio, hapus data studio, tambah data pelanggan, lihat data pelanggan, tambah data booking, lihat data booking, dan keluar. Pengguna dapat memilih menu dengan memasukkan angka sesuai dengan pilihan yang tersedia.

Setelah pengguna memilih menu, program menggunakan percabangan untuk menentukan proses yang akan dijalankan. Pada proses pengelolaan data studio, pengguna dapat menambahkan data studio baru, melihat data yang telah tersimpan, mengubah data berdasarkan ID studio, atau menghapus data studio. Pengguna juga dapat menambahkan dan melihat data pelanggan serta menambahkan dan melihat data booking. Program menggunakan perulangan agar menu dapat terus ditampilkan dan digunakan kembali sampai pengguna memilih menu keluar. Selain itu, program juga menggunakan perulangan untuk menampilkan data yang telah tersimpan pada ArrayList.

## Inheritance
Penerapan inheritance pada program dilakukan dengan menggunakan extends pada class PelangganUmum dan PelangganMember. Kedua class tersebut mewarisi atribut dan method yang terdapat pada class Pelanggan. Pada PelangganMember juga terdapat atribut tambahan berupa jenisMember karena pelanggan member memiliki informasi tambahan yang tidak dimiliki pelanggan umum. Dengan inheritance ini, saya tidak perlu membuat ulang atribut dasar pelanggan pada setiap class karena sudah dapat diwariskan dari class Pelanggan.

Selain inheritance, program ini juga menerapkan polymorphism melalui method overriding pada method getInfo(). Method getInfo() yang terdapat pada class Pelanggan dibuat kembali pada class PelangganUmum dan PelangganMember sehingga dapat menghasilkan informasi yang berbeda sesuai dengan jenis pelanggan. Pada pelanggan umum akan menampilkan informasi sebagai pelanggan umum, sedangkan pada pelanggan member akan menampilkan nama pelanggan beserta jenis member yang dimiliki
1. Pelanggan umum
   
  <img width="1010" height="89" alt="image" src="https://github.com/user-attachments/assets/8cda92a5-6a23-4189-b06a-d3c75ee0d5c4" />

   Pada kode tersebut, PelangganUmum merupakan subclass dari Pelanggan yang menggunakan extends untuk mewarisi atribut dan method dari class Pelanggan. Kemudian super() digunakan untuk memanggil constructor dari class induk dan mengisi data pelanggan seperti ID, nama, nomor telepon, dan alamat.

2. Pelanggan Member
   
   <img width="500" height="150" alt="image" src="https://github.com/user-attachments/assets/45ec2fb5-099a-4e39-87b3-c543218aaf7e" />
   
Pada kode tersebut, PelangganMember merupakan subclass dari Pelanggan yang mewarisi data dari class induknya. Class ini memiliki atribut tambahan jenisMember untuk menyimpan jenis member pelanggan. super() digunakan untuk memanggil constructor Pelanggan, sedangkan getJenisMember() dan setJenisMember() digunakan untuk mengambil dan mengubah nilai jenisMember

## Encapsulation
<img width="331" height="111" alt="image" src="https://github.com/user-attachments/assets/a8c39739-fcb7-402b-8796-ea164c6273e7" />

Pada program ini, encapsulation diterapkan dengan membuat atribut pada setiap class menggunakan access modifier private, sehingga data tidak dapat diakses secara langsung dari luar class. Untuk mengakses dan mengubah data tersebut, saya menggunakan method getter dan setter. Contohnya pada class Pelanggan, atribut seperti idPelanggan, nama, noTelepon, dan alamat dibuat private, kemudian disediakan getter untuk mengambil data dan setter untuk mengubah data. Dengan cara ini, data pada class dapat lebih terkontrol dan tidak dapat diubah secara langsung dari luar class.

<img width="299" height="444" alt="image" src="https://github.com/user-attachments/assets/acb664b6-d8cb-4d93-9bc2-ca341f666e06" />

Pada bagian kode ini, encapsulation diterapkan melalui method getter dan setter. Method getNama(), getNoTelepon(), dan getAlamat() digunakan untuk mengambil nilai dari atribut yang bersifat private, sedangkan method setIdPelanggan(), setNama(), setNoTelepon(), dan setAlamat() digunakan untuk mengubah nilai atribut tersebut. Dengan begitu, data pelanggan tidak diakses atau diubah secara langsung dari luar class, tetapi melalui method yang sudah disediakan. Selain itu, method getInfo() digunakan untuk menampilkan informasi pelanggan.


## Polymorphism
<img width="334" height="131" alt="image" src="https://github.com/user-attachments/assets/8c1a50e9-b9db-4c8b-a38c-07444bd0293e" />
<img width="343" height="96" alt="image" src="https://github.com/user-attachments/assets/a09429a8-fefd-4e2c-a39b-298a66584f84" />

Pada bagian kode tersebut, polymorphism diterapkan melalui method overriding dengan menggunakan @Override. Method getInfo() pada class PelangganMember dibuat ulang dari method yang ada pada class Pelanggan, tetapi isi method disesuaikan dengan kebutuhan pelanggan member. Pada bagian return, program menampilkan nama pelanggan melalui getNama() dan jenis member melalui jenisMember. Jadi, meskipun menggunakan nama method yang sama yaitu getInfo(), hasil yang ditampilkan berbeda dengan getInfo() pada PelangganUmum.

## Running Program

1. Tampilan Menu Utama
   
   <img width="364" height="260" alt="image" src="https://github.com/user-attachments/assets/2f8ab8bb-5b26-47e3-9428-986d9528fd68" />
   
   Pada bagian ini ditampilkan tampilan awal program atau menu utama. Menu utama berisi beberapa pilihan yang dapat digunakan untuk mengelola data studio musik, yaitu menambah, melihat, mengubah, dan menghapus data studio, menambah dan melihat data pelanggan, menambah dan melihat data booking, serta menu untuk keluar dari program.

2. Tambah Data Studio

   <img width="329" height="176" alt="image" src="https://github.com/user-attachments/assets/84587ca4-2c5d-4f9a-911a-d1e471205b90" />

   Setelah memilih menu tambah data studio, pengguna akan diminta untuk memasukkan data studio berupa ID studio, nama studio, jenis studio, dan harga sewa per jam. Data yang telah dimasukkan kemudian disimpan ke dalam ArrayList dan dapat ditampilkan kembali melalui menu lihat data studio.

3. Lihat Data Studio

   <img width="333" height="257" alt="image" src="https://github.com/user-attachments/assets/720b4d41-bf03-423e-81da-831ee21594d6" />

      Pada menu lihat data studio, program akan menampilkan seluruh data studio yang sebelumnya telah ditambahkan. Data ditampilkan menggunakan perulangan sehingga setiap data studio yang tersimpan di dalam ArrayList dapat ditampilkan.

4. Ubah Data Studio

   <img width="318" height="176" alt="image" src="https://github.com/user-attachments/assets/2a6673ec-e477-4f03-ae16-eff6513d2cd5" />

   Pada menu ubah data studio, pengguna memasukkan ID studio yang ingin diubah. Jika ID studio ditemukan, pengguna dapat memasukkan data baru berupa nama studio, jenis studio, dan harga sewa per jam. Setelah itu, data studio akan diperbarui sesuai dengan input yang diberikan.

5. Hapus Data Studio

   <img width="269" height="100" alt="image" src="https://github.com/user-attachments/assets/5681be88-c6d0-4e88-8479-1162bb979840" />

   Pada menu hapus data studio, pengguna memasukkan ID studio yang ingin dihapus. Program akan mencari data berdasarkan ID tersebut. Jika data ditemukan, data studio akan dihapus dari ArrayList dan program akan menampilkan pemberitahuan bahwa data berhasil dihapus.

6. Tambah Data Pelanggan

   <img width="348" height="260" alt="image" src="https://github.com/user-attachments/assets/a4f1d670-dca6-425c-b74e-0c02e654cded" />

   Pada gambar tersebut, saya menambahkan data pelanggan baru dengan memilih Pelanggan Umum. Setelah ID, nama, nomor telepon, dan alamat dimasukkan, program menampilkan pilihan jenis pelanggan dan data berhasil ditambahkan setelah memilih opsi 1.

7. Lihat Data Pelanggan

   <img width="395" height="407" alt="image" src="https://github.com/user-attachments/assets/381ac826-b9fa-4197-93a0-af7fed2716ac" />

   Pada gambar tersebut, menu Lihat Data Pelanggan menampilkan seluruh data pelanggan yang tersimpan, yaitu pelanggan umum dan pelanggan member. Bagian Jenis menunjukkan hasil polymorphism dari method getInfo(), di mana pelanggan umum dan pelanggan member menampilkan informasi yang berbeda sesuai dengan jenis pelanggannya.

8. Tambah Booking

   <img width="258" height="150" alt="image" src="https://github.com/user-attachments/assets/66b5ec8a-3367-415f-b18a-fae43aeb2eaa" />

   Pada gambar tersebut, saya mencoba menambahkan data booking dengan memasukkan ID booking, ID pelanggan, dan ID studio. Namun, program menampilkan pesan “Studio tidak ditemukan!” karena ID studio 001 yang dimasukkan tidak sesuai dengan ID studio yang tersedia di dalam data.

9. Lihat Booking

    <img width="243" height="208" alt="image" src="https://github.com/user-attachments/assets/18214f01-20d3-40e5-b434-9cbc9666503d" />

    Pada gambar tersebut, menu Lihat Data Booking menampilkan data booking yang sudah tersimpan, mulai dari ID booking, ID pelanggan, ID studio, tanggal, jam, hingga durasi booking. Data tersebut menunjukkan bahwa booking BK001 dilakukan oleh pelanggan PL001 untuk studio ST001 selama 2 jam.

10. Keluar

    <img width="400" height="98" alt="image" src="https://github.com/user-attachments/assets/e3f9ffa3-66ef-4d0d-8626-0e17d485e583" />

    Selesai.... Terimakasih.













   
