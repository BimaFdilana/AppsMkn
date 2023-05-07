package com.example.myapplication

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.databinding.FragmentListBinding

class List: Fragment() {

    private var binding : FragmentListBinding? = null
    lateinit var rv_hero : RecyclerView
    @SuppressLint("MissingInflatedId")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_list, container, false)

        //<-- Recycleview -->

        val lm = LinearLayoutManager(activity)
        lm.orientation = LinearLayoutManager.VERTICAL
        rv_hero = view.findViewById(R.id.rv_hero)

        val adapterHero = SuperAdapter(ArrayHero,activity)
        rv_hero.setHasFixedSize(true)
        rv_hero.layoutManager = lm
        rv_hero.adapter = adapterHero

        return view
    }

    val ArrayHero : ArrayList<Superhero>get(){
        val arrayhero = ArrayList<Superhero>()

        val superhero1 = Superhero()
        superhero1.imgSuperhero = R.drawable.makan1
        superhero1.nameSuperhero = "Gulai Ikan Patin"
        superhero1.descSuperhero = "Gulai Ikan Patinn adalah masakan yang diolah menggunakan tempoyak yaitu daging buah yang telah di fermentasi, namun dapat digantikan juga dengan santan untuk menghindari bau dan rasa tempoyaknya yang cukup menyengat."

        val superhero2 = Superhero()
        superhero2.imgSuperhero = R.drawable.makan2
        superhero2.nameSuperhero = "Gulai Cipuik"
        superhero2.descSuperhero = "Gulai Siput sendiri dalam bahasa dialek Kuantan Singingi disebut dengan “Gulai Cipuik”, sedang dalam bahasa Melayu Rokan disebut dengan Rengkitang. Warga Riau lainnya ada yang menyebutnya \"Gulai Tengkuyung\", masakan \"Gulai Siput Masak Keladi\" atau \"Gulai Siput Lonceng\"."

        val superhero4 = Superhero()
        superhero4.imgSuperhero = R.drawable.makan3
        superhero4.nameSuperhero = "Sambal Cencalok"
        superhero4.descSuperhero = "Cincalok adalah makanan yang berbahan dasar udang yang difermentasikan. Makanan ini adalah makanan khas Pekanbaru, Kepulauan Riau dan berkembang di Kalimantan Barat."

        val superhero5 = Superhero()
        superhero5.imgSuperhero = R.drawable.makan4
        superhero5.nameSuperhero = "Nasi Lemak"
        superhero5.descSuperhero = "Nasi lemak adalah nasi yang dimasak menggunakan santan kelapa sehingga rasanya menjadi gurih, selain itu, kerap kali ditambahkan juga daun pandan dalam proses pembuatannya untuk memperkuat aroma."

        val superhero6 = Superhero()
        superhero6.imgSuperhero = R.drawable.makan5
        superhero6.nameSuperhero = "Lopek Bugi"
        superhero6.descSuperhero = "Lapek Bugih (dari bahasa Minangkabau: Lepat Bugis) merupakan salah satu kue tradisional Minangkabau yang terbuat dari tepung ketan yang dikukus dan dibungkus daun pisang. Lapek Bugih ini juga dimiliki oleh orang ocu (orang Melayu Kampar) di Kuapan, Kampar dengan nama \"Lopek Bugi\""

        val superhero7 = Superhero()
        superhero7.imgSuperhero = R.drawable.makan6
        superhero7.nameSuperhero = "Tarempa"
        superhero7.descSuperhero = "Mie Tarempa merupakan salah satu kuliner yang cukup populer di Kota Batam. Mie Tarempa cukup berbeda, jika dibandingkan dengan beberapa mie yang dikenal masyarakat pada umumnya."

        val superhero8 = Superhero()
        superhero8.imgSuperhero = R.drawable.makan7
        superhero8.nameSuperhero = "Mie lendir"
        superhero8.descSuperhero = "Mie Lendir merupakan makanan khas Pulau Batam dan Pulau Bintan, Provinsi Kepulauan Riau. Makanan ini terdiri dari mie kuning yang direbus bersama taoge dan disajikan bersama sebutir telur rebus yang dibelah dua, kemudian disiram dengan kuah kacang yang kental."

        val superhero9 = Superhero()
        superhero9.imgSuperhero = R.drawable.makan8
        superhero9.nameSuperhero = "Ikan Cuka"
        superhero9.descSuperhero = "Ikan Cuka adalah hidangan khas Riau berbahan dasar ikan tenggiri dengan balutan bumbu merah."

        val superhero10 = Superhero()
        superhero10.imgSuperhero = R.drawable.makan9
        superhero10.nameSuperhero = "Ikan Tongkol Asam Padeh"
        superhero10.descSuperhero = "Gulai ikan asam padeh adalah suatu masakan Minangkabau yang memiliki cita rasa pedas dan asam. Gulai ikan asam padeh ini merupakan salah satu kuliner dari Sumatra Barat."

        val superhero11 = Superhero()
        superhero11.imgSuperhero = R.drawable.makan10
        superhero11.nameSuperhero = "Ayam Kemangi"
        superhero11.descSuperhero = "Citarasa dari daun kemangi memang mampu menyedapkan setiap masakan. Tak terkecuali menu ayam dengan bumbu pedas ini. Jangan lupa untuk memasukkan kemangi terakhir kali sesaat masakan akan diangkat, agar tidak terlalu layu & hilang citarasanya."

        arrayhero.add(superhero1)
        arrayhero.add(superhero2)
        arrayhero.add(superhero4)
        arrayhero.add(superhero5)
        arrayhero.add(superhero6)
        arrayhero.add(superhero7)
        arrayhero.add(superhero8)
        arrayhero.add(superhero9)
        arrayhero.add(superhero10)
        arrayhero.add(superhero11)

        return arrayhero
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null

    }
}