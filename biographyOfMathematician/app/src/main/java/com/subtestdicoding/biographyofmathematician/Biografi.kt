package com.subtestdicoding.biographyofmathematician

data class Biografi(
    val judul: String,
    val deskripsi: String,
    val gambarResId: Int,
    val prestasi: String,
)

val matematikawanList = listOf(
    Biografi(
        "Leonhard Euler",
        "Euler adalah seorang matematikawan asal Swiss, dikenal sebagai salah satu matematikawan terbesar dalam sejarah. Euler memberikan kontribusi besar di berbagai bidang matematika, fisika, dan rekayasa. Euler dikenal sebagai tokoh yang mengubah wajah matematika dengan kontribusinya pada teori graf, analisis matematika, dan teori bilangan. Dia mengembangkan rumus Euler yang terkenal eiπ+1=0eiπ+1=0, yang menggabungkan lima konstanta matematika paling penting. Euler juga meneliti topik-topik seperti teori graf, integral, dan deret tak hingga.",
        R.drawable.euler,
        "Rumus Euler untuk teori bilangan dan teorema Euler untuk graf.",
    ),
    Biografi(
        "Carl Friedrich Gauss",
        "Gauss adalah seorang matematikawan Jerman, dikenal sebagai \"Pangeran Matematika.\" Gauss memberikan kontribusi besar pada berbagai cabang matematika, termasuk aljabar, statistik, analisis matematika, dan teori bilangan. Gauss menunjukkan bakat matematika sejak usia muda dan menemukan metode interpolasi kuadratik pada usia 15 tahun. Dia juga mengembangkan teori bilangan dengan menemukan hukum distribusi bilangan prima. Kontribusi Gauss dalam statistik dan teori peluang juga menjadi landasan bagi banyak penemuan di bidang statistika modern.",
        R.drawable.gauss,
        "Teorema Gauss untuk teori bilangan dan distribusi Gauss.",
    ),
    Biografi(
        "Ada Lovelace",
        "Augusta Ada King, Countess of Lovelace, atau dikenal sebagai Ada Lovelace, adalah seorang matematikawan dan penulis asal Inggris yang diakui sebagai penulis algoritma pertama yang dirancang untuk dieksekusi oleh mesin Babbage, menjadikannya \"ibu pemrograman komputer.\" Lovelace menerjemahkan artikel ilmiah karya matematikawan Prancis, Charles Babbage, dan menambahkan catatan-catatan yang menggambarkan konsep algoritma. Ini membuatnya menjadi tokoh pertama yang memahami potensi komputasi mesin dan melihatnya lebih dari sekadar perangkat penghitung.",
        R.drawable.ada_lovelace,
        "Konsep potensi mesin untuk melakukan pekerjaan matematika.",
    ),
    Biografi(
        "Georg Cantor",
        "Georg Cantor, matematikawan Jerman, dikenal sebagai pendiri teori himpunan dan konsep-konsepnya mengenai bilangan tak hingga. Cantor membuat terobosan signifikan dalam analisis matematika dan membuka pintu untuk pemahaman yang lebih dalam tentang struktur matematika. Cantor memperkenalkan konsep himpunan dan membuktikan bahwa ada tingkatan tak hingga. Dia juga menunjukkan bahwa ada banyak tingkatan tak hingga yang berbeda. Pemikiran inovatifnya mengenai himpunan tak hingga membentuk dasar untuk cabang matematika modern seperti teori himpunan dan topologi.",
        R.drawable.georg_cantor,
        "Menemukan bahwa tidak semua himpunan dapat diukur dan ada banyak tingkatan ketidakberkalaan dalam matematika.",
    ),
    Biografi(
        "David Hilbert",
        "Hilbert yang seorang matematikawan Jerman, adalah salah satu tokoh utama dalam matematika abad ke-19 dan awal abad ke-20. Ia memimpin perkembangan dalam berbagai bidang matematika, terutama dalam teori bilangan, geometri, dan analisis matematika. Hilbert dikenal dengan daftar 23 masalah yang menjadi panduan bagi perkembangan matematika. Dia memberikan kontribusi besar dalam formalisasi matematika dan membawa gagasan aksioma ke inti pembuktian matematika. Hilbert juga mengembangkan teori ruang abstrak dan memperluas pemahaman kita tentang dimensi.",
        R.drawable.david_hilbert,
        "Hilbert menyusun daftar 23 masalah terbuka yang memotivasi riset matematika selama beberapa dekade.",
    ),
    Biografi(
        "Kurt Gödel",
        "Gödel adalah matematikawan dan logikawan berkebangsaan Austria-Amerika, terkenal karena teorema ketidaklengkapan Gödel, yang merupakan salah satu pencapaian paling penting dalam logika matematika.Gödel membuktikan bahwa dalam setiap sistem aksiomatik yang cukup kuat, akan ada pernyataan yang benar tetapi tidak dapat dibuktikan di dalam sistem tersebut. Temuannya mengguncang dasar matematika dan berdampak besar pada filosofi dan teori komputasi.",
        R.drawable.kurt_godel,
        "Mendefinisikan konsep keberlanjutan dalam teori himpunan, memberikan kontribusi pada logika matematika.",
    ),
    Biografi(
        "Alan Turing",
        "Alan Turing adalah matematikawan dan ilmuwan komputer asal Inggris, diakui sebagai salah satu pendiri ilmu komputer. Ia membuat kontribusi penting dalam pemecahan kode selama Perang Dunia II dan merancang konsep mesin Turing, yang menjadi dasar bagi komputer modern. Turing memainkan peran kunci dalam pengembangan komputer elektronik dan memberikan kontribusi penting dalam desain mesin yang dapat menyelesaikan masalah matematika dengan metode komputasi. Ia juga merancang Tes Turing, yang menjadi landasan untuk mendefinisikan kecerdasan buatan.",
        R.drawable.alan_turing,
        "Berkontribusi besar selama Perang Dunia II dengan membongkar kode Enigma Jerman.",
    ),
    Biografi(
        "John von Neumann",
        "John von Neumann adalah seorang ilmuwan matematika dan fisika Hungary-Amerika, adalah tokoh multibakat yang berkontribusi pada matematika, fisika teoretis, dan pengembangan komputer. Neumann berperan dalam pengembangan arsitektur von Neumann, yang membentuk dasar bagi banyak komputer modern. Kontribusinya mencakup bidang teori permainan, fisika kuantum, dan pengembangan metode numerik. Von Neumann juga berpartisipasi dalam proyek bom atom selama Perang Dunia II.",
        R.drawable.john_von_neumann,
        "Konsep arsitektur von Neumann menjadi dasar untuk komputer modern.",
    ),
    Biografi(
        "Andrew Wiles",
        "Andrew Wiles, matematikawan Inggris, terkenal karena membuktikan Teorema Fermat yang terkenal, suatu permasalahan yang belum terpecahkan selama lebih dari tiga abad. Wiles menghabiskan bertahun-tahun memecahkan masalah Fermat, dan buktinya yang rumit membuka pintu untuk pemahaman lebih mendalam tentang teori bilangan dan geometri aljabar. Kontribusinya menunjukkan ketekunan dan ketelitian yang luar biasa dalam dunia matematika.",
        R.drawable.andrew_wiles,
        "Wiles memecahkan masalah Teorema Fermat pada tahun 1994, dan menjadi suatu kontribusi besar bagi kemajuan " + "teknologi umat manusia.",
    ),
    Biografi(
        "Grace Hopper",
        "Grace Hopper, ilmuwan komputer dan perwira angkatan laut Amerika Serikat, adalah salah satu pelopor dalam pengembangan komputer dan pemrograman. Hopper adalah salah satu tokoh utama dalam pengembangan bahasa pemrograman COBOL, yang memungkinkan penulisan program komputer menggunakan kata-kata manusia. Ia juga menciptakan konsep debugging dan dikenal karena ketekunan dan inovasinya dalam dunia komputasi. Setiap matematikawan dan ilmuwan komputer ini memberikan kontribusi berharga yang membentuk fondasi matematika dan ilmu komputer modern. Prestasi mereka mencakup berbagai bidang dan menunjukkan keberagaman pengetahuan dan kecerdasan yang telah memajukan pemahaman kita tentang dunia ini.",
        R.drawable.grace_hopper,
        "Menemukan bahasa pemrograman COBOL yang memungkinkan penggunaan kata-kata alih-alih kode mesin, memudahkan pengembangan software",
    ),
)
