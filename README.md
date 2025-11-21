# Proyek Otomatisasi Pengujian Web - Swag Labs

Proyek ini berisi kumpulan skrip pengujian otomatis untuk situs web e-commerce demo, [Sauce Demo (Swag Labs)](https://www.saucedemo.com/). Tujuan dari proyek ini adalah untuk mendemonstrasikan keahlian dalam melakukan otomatisasi pengujian fungsional pada aplikasi web menggunakan ekosistem Java.

## 📝 Ringkasan & Cakupan Pengujian

Pengujian ini mencakup skenario-skenario kritis pada alur kerja aplikasi Swag Labs untuk memastikan fungsionalitas utama berjalan sesuai harapan.

Cakupan pengujian yang ada saat ini meliputi:
- **Fungsionalitas Login**
  - ✅ Login berhasil dengan kredensial yang valid.
  - ❌ Gagal login dengan username yang salah.
  - ❌ Gagal login dengan password yang salah.
  - ❌ Memblokir akses ke halaman inventaris tanpa login.
- **Manajemen Inventaris & Keranjang**
  - ✅ Menambahkan satu produk ke keranjang.
  - ✅ Menambahkan beberapa produk ke keranjang.
  - ✅ Menghapus produk dari keranjang melalui halaman inventaris.
- **Fitur Halaman Inventaris**
  - ✅ Mengurutkan produk dari harga terendah ke tertinggi.
  - (Skipped) Reset status aplikasi melalui menu navigasi.

## 🚀 Teknologi & Tools yang Digunakan

Proyek ini dibangun menggunakan teknologi yang umum digunakan dalam industri untuk otomatisasi pengujian berbasis Java.
- **Bahasa Pemrograman**: `Java`
- **Framework Automasi**: `Selenium WebDriver`
- **Test Runner & Framework**: `TestNG`
- **Build Tool & Dependency Manager**: `Apache Maven`
- **Pola Desain**: `Page Object Model (POM)`
- **Reporting**: Laporan default TestNG (Surefire) dan custom listener untuk:
  - `Screenshot on Failure/Success`: Mengambil screenshot secara otomatis setelah setiap tes selesai untuk dokumentasi visual.
  - `Emailable Report`: Mengirim laporan hasil tes melalui email (implementasi dasar).

## Struktur Proyek

Proyek ini disusun mengikuti pola desain **Page Object Model (POM)** untuk memisahkan logika tes dari elemen UI. Ini membuat skrip lebih bersih, mudah dibaca, dan mudah dikelola.

```
swaglabs-test/
├── pom.xml
└── src/
    └── test/
        └── java/
            └── com/juaracoding/swaglabs/
                ├── BaseTest.java               # Kelas dasar untuk setup & teardown WebDriver
                ├── LoginTest.java              # Kumpulan tes untuk fungsionalitas login
                ├── InventoryTest.java          # Kumpulan tes untuk halaman inventaris
                ├── components/                 # Komponen UI yang dapat digunakan kembali (Header, Navbar)
                ├── listeners/                  # Custom listener (Screenshot, Email)
                ├── pages/                      # Kelas-kelas Page Object (LoginPage, InventoryPage)
                └── resources/
                    ├── mailtrap.properties     # Konfigurasi email
                    └── testng.xml              # Konfigurasi suite tes TestNG
```

## ⚙️ Cara Menjalankan Proyek

### Prasyarat
- Java Development Kit (JDK) 11 atau lebih tinggi.
- Apache Maven.
- Browser Mozilla Firefox.

### Langkah-langkah Eksekusi
1. **Clone repository ini:**
   ```bash
   git clone <url-repository-anda>
   ```
2. **Buka terminal dan navigasi ke direktori root proyek.**
   ```bash
   cd swaglabs-test
   ```
3. **Jalankan tes menggunakan Maven:**
   Perintah ini akan membersihkan proyek, meng-compile, dan menjalankan semua tes yang terdefinisi di `testng.xml`.
   ```bash
   mvn clean test
   ```

## 📊 Hasil & Laporan Pengujian

Setelah eksekusi selesai, hasil pengujian dapat ditemukan di direktori `target/`.
- **Laporan HTML Utama**: Buka file `target/surefire-reports/emailable-report.html` di browser Anda untuk melihat ringkasan hasil tes yang mudah dibaca.
- **Screenshots**: Screenshot untuk setiap tes (baik sukses maupun gagal) akan disimpan di `target/screenshots/` dengan nama yang sesuai dengan metode tesnya.
- **Laporan XML**: Hasil mentah dalam format XML dapat ditemukan di `target/surefire-reports/`.
