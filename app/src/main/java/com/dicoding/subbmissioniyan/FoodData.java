package com.dicoding.subbmissioniyan;

import java.util.ArrayList;

public class FoodData {
    private static String[] foodname = {
            "Alpukat",
            "Kentang",
            "Tempe",
            "Susu",
            "Telur",
            "Brokoli",
            "Dada Ayam",
            "Ikan",
            "Kacang Almond",
            "oatmeal",
            "Keju",
            "Kacang Merah"
    };

    private static String[] clubdetail = {
            "Alpukat adalah buah yang lezat dan sering digunakan sebagai bahan dalam berbagai hidangan. Daging buah alpukat berwarna hijau dan memiliki tekstur yang lembut serta kaya akan lemak sehat. Alpukat sering digunakan sebagai bahan dalam berbagai hidangan, seperti guacamole, salad, smoothie, atau sebagai tambahan pada roti dan sandwich. Alpukat mengandung banyak nutrisi penting, seperti vitamin K, vitamin C, vitamin E, vitamin B6, folat, dan potasium." +
                    "" +
                    "" +
                    "Manfaat untuk seseorang yang ingin menaikan massa ototnya : " +
                    "> Mengandung lemak sehat, termasuk asam lemak tak jenuh tunggal yang baik untuk kesehatan jantung.\n" +
                    "> Tinggi kalori dan nutrisi, membantu meningkatkan asupan energi.\n" +
                    "> Mengandung serat untuk pencernaan yang sehat.\n" +
                    "> Kaya akan vitamin dan mineral, seperti vitamin K, vitamin E, dan kalium.",
            "Kentang adalah makanan yang serbaguna dan populer di seluruh dunia. Kentang biasanya digunakan sebagai bahan makanan dan memiliki tekstur yang lembut serta rasa yang enak. Kentang dapat dimasak dalam berbagai cara, seperti direbus, digoreng, dipanggang, atau diolah menjadi sup, kue, atau makanan lainnya. Kentang mengandung karbohidrat kompleks, serat, vitamin C, vitamin B6, kalium, magnesium, dan zat besi. Karbohidrat dalam kentang memberikan energi yang dibutuhkan oleh tubuh, sementara serat membantu dalam pencernaan. Kentang juga merupakan sumber antioksidan yang baik." +
                    "" +
                    "" +
                    "Manfaat untuk seseorang yang ingin menaikan massa ototnya :" +
                    "> Sumber karbohidrat kompleks yang memberikan energi tahan lama.\n" +
                    ">Kaya akan vitamin C, vitamin B6, dan potasium.\n" +
                    "> Memiliki serat yang membantu menjaga kesehatan pencernaan.\n" +
                    "> Menyediakan sumber energi yang tinggi untuk kegiatan fisik intens.",
            "Tempe adalah makanan tradisional Indonesia yang terbuat dari kedelai yang difermentasi. Ini adalah salah satu makanan yang populer dan sering digunakan dalam masakan Indonesia. Tempe memiliki rasa yang khas dan tekstur yang kenyal, serta kandungan gizi yang tinggi. Selain rasanya yang lezat, tempe juga memiliki berbagai manfaat kesehatan. Ini kaya akan protein nabati, serat, dan berbagai nutrisi penting seperti vitamin B, zat besi, kalsium, dan magnesium. Tempe juga mengandung probiotik alami yang baik untuk kesehatan pencernaan." +
                    "" +
                    "" +
                    "Manfaat untuk seseorang yang ingin menaikan massa ototnya :" +
                    "> Sumber protein nabati yang kaya akan asam amino esensial.\n" +
                    "> Mengandung serat untuk kesehatan pencernaan.\n" +
                    "> Mengandung vitamin B12, besi, dan kalsium.\n" +
                    "> Memiliki rendah lemak jenuh dan kolesterol.",
            "Susu adalah minuman yang berasal dari hewan, seperti sapi atau kambing.usu merupakan sumber nutrisi penting yang kaya akan kalsium, protein, lemak, vitamin, dan mineral lainnya. Susu sering dikonsumsi oleh manusia sebagai minuman atau digunakan dalam pembuatan produk makanan dan minuman lainnya. Susu memiliki manfaat kesehatan yang penting. Kalsium dalam susu berperan dalam membangun dan menjaga kekuatan tulang dan gigi. Protein dalam susu membantu pembentukan dan perbaikan jaringan tubuh. Selain itu, susu juga mengandung vitamin D, vitamin B12, riboflavin, dan mineral lainnya yang penting untuk kesehatan tubuh." +
                    "" +
                    "" +
                    "Manfaat untuk seseorang yang ingin menaikan massa ototnya :" +
                    "> Sumber protein yang lengkap dengan asam amino esensial.\n" +
                    "> Kaya akan kalsium dan vitamin D untuk kesehatan tulang.\n" +
                    "> Mengandung karbohidrat dan lemak sebagai sumber energi tambahan.\n" +
                    "> Memiliki asam lemak sehat seperti omega-3.",
            "Telur-ayam adalah sumber protein yang murah dan mudah ditemukan. elur ayam biasanya digunakan sebagai bahan dalam banyak resep makanan, baik itu digoreng, direbus, ditumis, atau digunakan dalam adonan kue. Selain menjadi bahan makanan yang serbaguna, telur ayam juga memiliki nilai gizi yang tinggi. Telur ayam kaya akan protein, vitamin, dan mineral. Protein yang terkandung dalam telur ayam sangat baik untuk pertumbuhan dan pemeliharaan sel-sel tubuh. Telur ayam juga mengandung vitamin B kompleks, vitamin D, vitamin E, dan mineral seperti zat besi dan seng." +
                    "" +
                    "" +
                    "Manfaat untuk seseorang yang ingin menaikan massa ototnya :" +
                    "> Sumber protein yang lengkap dengan asam amino esensial.\n" +
                    "> Kaya akan kalsium dan vitamin D untuk kesehatan tulang.\n" +
                    "> Mengandung karbohidrat dan lemak sebagai sumber energi tambahan.\n" +
                    "> Memiliki asam lemak sehat seperti omega-3.",
            "Brokoli adalah sayuran hijau yang kaya akan nutrisi. Sayuran ini memiliki kepala bunga yang tersusun rapat dan batang yang panjang. Brokoli biasanya dikonsumsi dalam bentuk yang direbus, direbus, ditumis, atau digunakan sebagai bahan dalam berbagai hidangan, seperti sup, tumisan, salad, atau dijadikan bahan tambahan dalam hidangan pasta. Brokoli dikenal karena kandungan gizinya yang kaya, termasuk serat, vitamin C, vitamin K, vitamin A, asam folat, dan mineral seperti potassium dan kalsium. Brokoli juga mengandung senyawa fitokimia yang bermanfaat, seperti sulforaphane, yang diyakini memiliki efek antioksidan dan anti-inflamasi serta potensi melawan beberapa jenis kanker." +
                    "" +
                    "" +
                    "Manfaat untuk seseorang yang ingin menaikan massa ototnya :" +
                    "> Kaya akan serat yang membantu kesehatan pencernaan.\n" +
                    "> Mengandung vitamin C, vitamin K, dan vitamin A.\n" +
                    "> Menyediakan antioksidan dan senyawa anti-inflamasi.\n" +
                    "> Rendah kalori namun memberikan rasa kenyang.",
            "Dada ayam adalah potongan daging ayam yang rendah lemak dan kaya protein. Dada ayam merupakan sumber protein yang sangat baik. Selain itu, dada ayam juga mengandung nutrisi penting seperti zat besi, vitamin B6, vitamin B12, dan selenium.  Dada ayam merupakan bagian daging ayam yang terletak di bagian depan, tepat di atas tulang dada. Dagingnya biasanya lebih lembut dan sedikit lebih rendah lemak dibandingkan dengan bagian lainnya.. Daging ayam tanpa kulit memiliki kandungan lemak yang lebih rendah dibandingkan dengan daging ayam dengan kulit." +
                    "" +
                    "" +
                    "Manfaat untuk seseorang yang ingin menaikan massa ototnya :" +
                    "> Sumber protein yang rendah lemak dan kalori.\n" +
                    "> Mengandung vitamin B, zat besi, dan selenium.\n" +
                    "> Membantu pertumbuhan dan pemulihan otot.\n" +
                    "> Dapat membantu meningkatkan metabolisme.",
            "Ikan merupakan sumber protein tinggi dan juga mengandung asam lemak omega-3 yang baik untuk kesehatan jantung.  Konsumsi ikan salmon secara teratur dapat memberikan berbagai manfaat kesehatan, termasuk meningkatkan fungsi otak, meningkatkan kesehatan jantung, mengurangi risiko inflamasi, dan meningkatkan kualitas tidur. Salmon merupakan sumber protein yang baik dan sehat. Protein dalam salmon penting untuk pertumbuhan dan perbaikan jaringan tubuh.  Salmon merupakan salah satu sumber terbaik asam lemak omega-3, terutama omega-3 jenis EPA (eicosapentaenoic acid) dan DHA (docosahexaenoic acid), yang memiliki banyak manfaat untuk tubuh." +
                    "" +
                    "" +
                    "Manfaat untuk seseorang yang ingin menaikan massa ototnya :" +
                    "> Sumber protein tinggi dengan asam lemak omega-3.\n" +
                    "> Kaya akan vitamin D, vitamin B12, dan mineral.\n" +
                    "> Membantu kesehatan jantung dan fungsi otak.\n" +
                    "> Dapat membantu mengurangi peradangan dalam tubuh.",
            "Kacang almond adalah sumber lemak sehat, protein, serat, vitamin E, magnesium, dan zat besi. Kacang almond adalah jenis kacang yang populer dan memiliki banyak manfaat kesehatan. Kacang almond mengandung lemak sehat, protein, serat, vitamin E, magnesium, dan zat besi. Mereka juga rendah karbohidrat dan tidak mengandung kolesterol. Kacang almond dapat dikonsumsi langsung sebagai camilan sehat atau digunakan sebagai bahan tambahan dalam berbagai resep makanan dan minuman. Kacang almond bisa dikonsumsi langsung sebagai camilan yang sehat. Anda dapat memakannya dalam keadaan mentah atau sangrai untuk memberikan rasa yang lebih kaya. Tambahkan sedikit garam atau rempah favorit Anda untuk variasi rasa." +
                    "" +
                    "" +
                    "Manfaat untuk seseorang yang ingin menaikan massa ototnya :" +
                    "> Sumber lemak sehat, termasuk asam lemak tak jenuh tunggal dan omega-6.\n" +
                    "> Mengandung protein, serat, vitamin E, dan mineral.\n" +
                    "> Membantu kesehatan jantung dan menurunkan risiko penyakit kronis.\n" +
                    "> Memberikan energi dan rasa kenyang.",
            "Oatmeal adalah makanan sarapan yang populer dan sehat. Oatmeal adalah jenis makanan yang terbuat dari biji-bijian oat yang dihancurkan atau digiling. Biji oat merupakan sumber makanan yang kaya serat, vitamin, mineral, dan antioksidan. Oatmeal sering diolah menjadi bubur dengan merebus biji oat dalam air atau susu. Oatmeal mengandung serat larut yang dapat membantu mengurangi kadar kolesterol dalam tubuh dan meningkatkan kesehatan jantung. Konsumsi oatmeal dapat membantu mengontrol nafsu makan karena kandungan serat yang membuat Anda merasa kenyang lebih lama.  Serat yang terdapat dalam oatmeal dapat membantu mengendalikan kadar gula darah dengan menghambat penyerapan glukosa dalam tubuh." +
                    "" +
                    "" +
                    "Manfaat untuk seseorang yang ingin menaikan massa ototnya :" +
                    "> Mengandung beta-glukan, jenis serat larut yang dapat menurunkan kolesterol.\n" +
                    "> Kaya akan vitamin B kompleks, termasuk tiamin, riboflavin, dan niacin.\n" +
                    "> Mengandung mineral seperti besi, magnesium, dan seng.\n" +
                    "> Menyediakan energi bertahap dan membantu menjaga rasa kenyang.",
            "Keju adalah produk susu yang terbuat dari pengolahan susu. Keju mengandung berbagai nutrisi penting, termasuk protein, lemak, kalsium, fosfor, selenium, vitamin A, vitamin B12, riboflavin, dan zinc. Namun, kandungan nutrisi keju dapat bervariasi tergantung pada jenisnya. Keju dibuat dari susu, baik susu sapi, kambing, domba, atau hewan lainnya. Proses pembuatan keju melibatkan pemanasan susu, penambahan mikroba penghasil asam, dan penambahan enzim untuk membekukan protein susu. Setelah itu, keju diproses melalui tahap pemotongan, pemanasan, pembentukan, pengepakan, dan pematangan. Ada banyak jenis keju yang berbeda, dengan karakteristik unik dan rasa yang beragam." +
                    "" +
                    "" +
                    "Manfaat untuk seseorang yang ingin menaikan massa ototnya :" +
                    "> Sumber protein dan lemak yang tinggi, terutama protein kasein.\n" +
                    "> Kaya akan kalsium, fosfor, dan vitamin B12.\n" +
                    "> Memberikan asam lemak omega-3 dan omega-6.\n" +
                    "> Membantu dalam pemulihan otot dan pertumbuhan.",
            "Kacang merah adalah kacang yang kaya akan protein nabati, serat, zat besi, vitamin B, dan mineral. Kacang merah sering digunakan sebagai bahan utama dalam berbagai hidangan, seperti sup kacang merah, semur kacang merah, sambal kacang merah, dan kacang merah goreng. Kacang merah juga sering digunakan sebagai bahan dalam pembuatan kue, seperti brownies kacang merah atau bubur kacang merah. Selain rasanya yang lezat, kacang merah juga mengandung banyak nutrisi penting. Kacang merah kaya akan serat, protein nabati, zat besi, magnesium, dan folat. Konsumsi kacang merah secara teratur dapat memberikan manfaat bagi kesehatan, seperti menjaga kesehatan jantung, meningkatkan pencernaan, mengatur gula darah, dan memberikan energi." +
                    "" +
                    "" +
                    "Manfaat untuk seseorang yang ingin menaikan massa ototnya :" +
                    "> Sumber protein nabati yang tinggi.\n" +
                    "> Mengandung serat larut dan tidak larut yang baik untuk pencernaan.\n" +
                    "> Kaya akan zat besi, seng, dan magnesium.\n" +
                    "> Menyediakan karbohidrat kompleks yang memberikan energi bertahap."
    };

    private static int[] foodimage = {
            R.drawable.alpukat,
            R.drawable.kentangg,
            R.drawable.tempee,
            R.drawable.susuu,
            R.drawable.telurr,
            R.drawable.brokoli,
            R.drawable.dadaayam,
            R.drawable.ikan,
            R.drawable.kacangalmond,
            R.drawable.oatmeal,
            R.drawable.kejuu,
            R.drawable.kmerah
    };

    static ArrayList<Food> getListData() {
        ArrayList<Food> list = new ArrayList<>();
        for (int position = 0; position < foodname.length; position++) {
            Food food = new Food();
            food.setName(foodname[position]);
            food.setDetail(clubdetail[position]);
            food.setPhoto(foodimage[position]);
            list.add(food);
        }
        return list;
    }
}

