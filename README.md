# Charist Evlyn Myscha Rerung_2509116102

## Deskripsi Program
Sistem Manajemen Studio Musik merupakan program berbasis bahasa pemrograman Java yang digunakan untuk mengelola data studio musik secara sederhana. Program ini dibuat untuk membantu pengguna dalam mengelola data studio, pelanggan, dan booking studio. Program ini menerapkan operasi CRUD untuk menambah, menampilkan, mengubah, dan menghapus data yang tersimpan.
Program yang dibuat merupakan Sistem Manajemen Studio Musik yang digunakan untuk mengelola data studio, pelanggan, dan booking studio. Program ini dibuat untuk membantu proses pencatatan data studio yang tersedia, data pelanggan, serta jadwal booking yang dilakukan oleh pelanggan.
## Hierarki Class
Pada program ini, inheritance diterapkan dengan menjadikan class Pelanggan sebagai superclass yang memiliki dua subclass, yaitu PelangganUmum dan PelangganMember. Class PelangganUmum digunakan untuk data pelanggan biasa, sedangkan PelangganMember digunakan untuk data pelanggan yang memiliki jenis member tertentu. Hierarki class pada program ini dapat digambarkan dengan Pelanggan berada di bagian atas sebagai superclass, kemudian bercabang menjadi PelangganUmum dan PelangganMember sebagai subclass.
## Inheritance
Penerapan inheritance pada program dilakukan dengan menggunakan extends pada class PelangganUmum dan PelangganMember. Kedua class tersebut mewarisi atribut dan method yang terdapat pada class Pelanggan. Pada PelangganMember juga terdapat atribut tambahan berupa jenisMember karena pelanggan member memiliki informasi tambahan yang tidak dimiliki pelanggan umum. Dengan inheritance ini, saya tidak perlu membuat ulang atribut dasar pelanggan pada setiap class karena sudah dapat diwariskan dari class Pelanggan.

Selain inheritance, program ini juga menerapkan polymorphism melalui method overriding pada method getInfo(). Method getInfo() yang terdapat pada class Pelanggan dibuat kembali pada class PelangganUmum dan PelangganMember sehingga dapat menghasilkan informasi yang berbeda sesuai dengan jenis pelanggan. Pada pelanggan umum akan menampilkan informasi sebagai pelanggan umum, sedangkan pada pelanggan member akan menampilkan nama pelanggan beserta jenis member yang dimiliki
1. Pelanggan umum
   
  <img width="1010" height="89" alt="image" src="https://github.com/user-attachments/assets/8cda92a5-6a23-4189-b06a-d3c75ee0d5c4" />

   Pada kode tersebut, PelangganUmum merupakan subclass dari Pelanggan yang menggunakan extends untuk mewarisi atribut dan method dari class Pelanggan. Kemudian super() digunakan untuk memanggil constructor dari class induk dan mengisi data pelanggan seperti ID, nama, nomor telepon, dan alamat.

2. Pelanggan Member
   
   <img width="500" height="150" alt="image" src="https://github.com/user-attachments/assets/45ec2fb5-099a-4e39-87b3-c543218aaf7e" />
   
Pada kode tersebut, PelangganMember merupakan subclass dari Pelanggan yang mewarisi data dari class induknya. Class ini memiliki atribut tambahan jenisMember untuk menyimpan jenis member pelanggan. super() digunakan untuk memanggil constructor Pelanggan, sedangkan getJenisMember() dan setJenisMember() digunakan untuk mengambil dan mengubah nilai jenisMember
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













   
