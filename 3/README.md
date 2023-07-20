## Kompleksitas Waktu: O(N)
-Program melakukan satu kali iterasi pada string input untuk memeriksa setiap karakter tanda kurung.

-Setiap karakter diolah secara terpisah, sehingga waktu eksekusi secara linear dengan panjang string input (N).

## Kompleksitas Ruang: O(N)
-Program menggunakan Stack untuk melacak tanda buka kurung yang belum memiliki tanda tutup yang sesuai.

-Jumlah elemen maksimum yang dapat disimpan dalam stack adalah N, jika setiap karakter dalam string input adalah tanda buka kurung.

-Sehingga, ruang yang digunakan bergantung pada panjang string input (N).


Karena kompleksitas waktu dan ruang program sama-sama bergantung pada panjang string input (N), maka kompleksitas program adalah O(N) baik untuk waktu maupun ruang.
