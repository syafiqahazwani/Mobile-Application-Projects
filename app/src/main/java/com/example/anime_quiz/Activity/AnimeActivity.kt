package com.example.anime_quiz.Activity

import android.content.Intent
import android.os.Bundle
import android.view.Window
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.example.anime_quiz.Domain.QuestionModel
import com.example.anime_quiz.R
import com.example.anime_quiz.databinding.ActivityAnimeBinding
import java.util.ArrayList

class AnimeActivity : AppCompatActivity() {
    lateinit var binding: ActivityAnimeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAnimeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val window: Window = this@AnimeActivity.window
        window.statusBarColor = ContextCompat.getColor(this@AnimeActivity, R.color.grey)

        binding.apply {

            animeLevel1.setOnClickListener {
                val intent=Intent(this@AnimeActivity,AnimeQuestionActivity::class.java)
                intent.putParcelableArrayListExtra("list", ArrayList(questionList1()))
                startActivity(intent)
            }
            animeLevel2.setOnClickListener {
                val intent=Intent(this@AnimeActivity,AnimeQuestionActivity::class.java)
                intent.putParcelableArrayListExtra("list", ArrayList(questionList2()))
                startActivity(intent)
            }
            animeLevel3.setOnClickListener {
                val intent=Intent(this@AnimeActivity,AnimeQuestionActivity::class.java)
                intent.putParcelableArrayListExtra("list", ArrayList(questionList3()))
                startActivity(intent)
            }
            animeLevel4.setOnClickListener {
                val intent=Intent(this@AnimeActivity,AnimeQuestionActivity::class.java)
                intent.putParcelableArrayListExtra("list", ArrayList(questionList4()))
                startActivity(intent)
            }
            animeLevel5.setOnClickListener {
                val intent=Intent(this@AnimeActivity,AnimeQuestionActivity::class.java)
                intent.putParcelableArrayListExtra("list", ArrayList(questionList5()))
                startActivity(intent)
            }
            animeLevel6.setOnClickListener {
                val intent=Intent(this@AnimeActivity,AnimeQuestionActivity::class.java)
                intent.putParcelableArrayListExtra("list", ArrayList(questionList6()))
                startActivity(intent)
            }
            animeLevel7.setOnClickListener {
                val intent=Intent(this@AnimeActivity,AnimeQuestionActivity::class.java)
                intent.putParcelableArrayListExtra("list", ArrayList(questionList7()))
                startActivity(intent)
            }
            animeLevel8.setOnClickListener {
                val intent=Intent(this@AnimeActivity,AnimeQuestionActivity::class.java)
                intent.putParcelableArrayListExtra("list", ArrayList(questionList8()))
                startActivity(intent)
            }
            animeLevel9.setOnClickListener {
                val intent=Intent(this@AnimeActivity,AnimeQuestionActivity::class.java)
                intent.putParcelableArrayListExtra("list", ArrayList(questionList9()))
                startActivity(intent)
            }
            animeLevel10.setOnClickListener {
                val intent=Intent(this@AnimeActivity,AnimeQuestionActivity::class.java)
                intent.putParcelableArrayListExtra("list", ArrayList(questionList10()))
                startActivity(intent)
            }
        }
    }

    private fun questionList1(): MutableList<QuestionModel> {
        val question: MutableList<QuestionModel> = mutableListOf()
        question.add(
            QuestionModel(
                1,
                "Name these Anime?",
                "Earth",
                "Copek",
                "Neptune",
                "One Piece",
                "d",
                10,
                "level1",
                null
            )
        )
        question.add(
            QuestionModel(
                2,
                "Name these Anime?",
                "Detective Conan",
                "Canada",
                "United States",
                "China",
                "a",
                10,
                "level2",
                null
            )
        )
        question.add(
            QuestionModel(
                3,
                "Name these Anime?",
                "Cheese",
                "Lemon juice",
                "Naruto",
                "Cannabis",
                "c",
                10,
                "level3",
                null
            )
        )
        question.add(
            QuestionModel(
                4,
                "Name these Anime?",
                "Luna (Moon)",
                "Phobos (Mars' moon)",
                "Venus' moon",
                "Digimon",
                "d",
                10,
                "level4",
                null
            )
        )
        question.add(
            QuestionModel(
                5,
                "Name these Anime?",
                "O",
                "H",
                "Pokemon",
                "N",
                "c",
                10,
                "level5",
                null
            )
        )
        question.add(
            QuestionModel(
                6,
                "Name these Anime?",
                "Shakespeare",
                "Authur Miller",
                "Ashkouri",
                "Bleach",
                "d",
                10,
                "level6",
                null
            )
        )
        question.add(
            QuestionModel(
                7,
                "Name these Anime?",
                "Fullmetal Alchemist",
                "Atlantic Ocean",
                "India Ocean",
                "Arctic Ocean",
                "a",
                10,
                "level7",
                null
            )
        )
        question.add(
            QuestionModel(
                8,
                "Name these Anime?",
                "Fairy Tail",
                "Buddhism, Hindustan, Sikhism",
                "Zoroastrianism, Brahmanism, Yazdanism",
                "Taoism, Shintoism, Confucianism",
                "a",
                10,
                "level8",
                null
            )
        )
        question.add(
            QuestionModel(
                9,
                "Name these Anime?",
                "Asia",
                "Europe",
                "Gintama",
                "America",
                "c",
                10,
                "level9",
                null
            )
        )
        question.add(
            QuestionModel(
                10,
                "Name these Anime?",
                "Pacific Ocean",
                "Atlantic Ocean",
                "Indian Ocean",
                "Boku no Hero Academia",
                "d",
                10,
                "level10",
                null
            )
        )
        return question
    }

    private fun questionList2(): MutableList<QuestionModel> {
        val question: MutableList<QuestionModel> = mutableListOf()
        question.add(
            QuestionModel(
                11,
                "Name these Anime?",
                "Earth",
                "Copek",
                "Neptune",
                "Death Note",
                "d",
                10,
                "level11",
                null
            )
        )
        question.add(
            QuestionModel(
                12,
                "Name these Anime?",
                "Bellzebub",
                "Canada",
                "United States",
                "China",
                "a",
                10,
                "level12",
                null
            )
        )
        question.add(
            QuestionModel(
                13,
                "Name these Anime?",
                "Cheese",
                "Lemon juice",
                "Shingeki no Kyojin",
                "Cannabis",
                "c",
                10,
                "level13",
                null
            )
        )
        question.add(
            QuestionModel(
                14,
                "Name these Anime?",
                "Luna (Moon)",
                "Phobos (Mars' moon)",
                "Venus' moon",
                "Tokyo Ghoul",
                "d",
                10,
                "level14",
                null
            )
        )
        question.add(
            QuestionModel(
                15,
                "Name these Anime?",
                "O",
                "H",
                "Shugo Chara",
                "N",
                "c",
                10,
                "level15",
                null
            )
        )
        question.add(
            QuestionModel(
                16,
                "Name these Anime?",
                "Shakespeare",
                "Authur Miller",
                "Ashkouri",
                "Black Clover",
                "d",
                10,
                "level16",
                null
            )
        )
        question.add(
            QuestionModel(
                17,
                "Name these Anime?",
                "Sword Art Online",
                "Atlantic Ocean",
                "India Ocean",
                "Arctic Ocean",
                "a",
                10,
                "level17",
                null
            )
        )
        question.add(
            QuestionModel(
                18,
                "Name these Anime?",
                "Nanatsu no Taizai",
                "Buddhism, Hindustan, Sikhism",
                "Zoroastrianism, Brahmanism, Yazdanism",
                "Taoism, Shintoism, Confucianism",
                "a",
                10,
                "level18",
                null
            )
        )
        question.add(
            QuestionModel(
                19,
                "Name these Anime?",
                "Asia",
                "Europe",
                "Kuroko no Basuke",
                "America",
                "c",
                10,
                "level19",
                null
            )
        )
        question.add(
            QuestionModel(
                20,
                "Name these Anime?",
                "Pacific Ocean",
                "Atlantic Ocean",
                "Indian Ocean",
                "Soul Eater",
                "d",
                10,
                "level20",
                null
            )
        )
        return question
    }

    private fun questionList3(): MutableList<QuestionModel> {
        val question: MutableList<QuestionModel> = mutableListOf()
        question.add(
            QuestionModel(
                21,
                "Name these Anime?",
                "Earth",
                "Copek",
                "Neptune",
                "Sket Dance",
                "d",
                10,
                "level21",
                null
            )
        )
        question.add(
            QuestionModel(
                22,
                "Name these Anime?",
                "Ao no Exorcist",
                "Canada",
                "United States",
                "China",
                "a",
                10,
                "level22",
                null
            )
        )
        question.add(
            QuestionModel(
                23,
                "Name these Anime?",
                "Cheese",
                "Lemon juice",
                "Ansatsu Kyoushitsu",
                "Cannabis",
                "c",
                10,
                "level23",
                null
            )
        )
        question.add(
            QuestionModel(
                24,
                "Name these Anime?",
                "Luna (Moon)",
                "Phobos (Mars' moon)",
                "Venus' moon",
                "Kuroshitsuji",
                "d",
                10,
                "level24",
                null
            )
        )
        question.add(
            QuestionModel(
                25,
                "Name these Anime?",
                "O",
                "H",
                "Mahouka Koukou no Rettousei",
                "N",
                "c",
                10,
                "level25",
                null
            )
        )
        question.add(
            QuestionModel(
                26,
                "Name these Anime?",
                "Shakespeare",
                "Authur Miller",
                "Ashkouri",
                "Durarara",
                "d",
                10,
                "level26",
                null
            )
        )
        question.add(
            QuestionModel(
                27,
                "Name these Anime?",
                "D.Gray man",
                "Atlantic Ocean",
                "India Ocean",
                "Arctic Ocean",
                "a",
                10,
                "level27",
                null
            )
        )
        question.add(
            QuestionModel(
                28,
                "Name these Anime?",
                "Toaru Majutsu no Index",
                "Buddhism, Hindustan, Sikhism",
                "Zoroastrianism, Brahmanism, Yazdanism",
                "Taoism, Shintoism, Confucianism",
                "a",
                10,
                "level28",
                null
            )
        )
        question.add(
            QuestionModel(
                29,
                "Name these Anime?",
                "Asia",
                "Europe",
                "Toaru Kagaku no Railgun",
                "America",
                "c",
                10,
                "level29",
                null
            )
        )
        question.add(
            QuestionModel(
                30,
                "Name these Anime?",
                "Pacific Ocean",
                "Atlantic Ocean",
                "Indian Ocean",
                "Nana",
                "d",
                10,
                "level30",
                null
            )
        )
        return question
    }

    private fun questionList4(): MutableList<QuestionModel> {
        val question: MutableList<QuestionModel> = mutableListOf()
        question.add(
            QuestionModel(
                31,
                "Name these Anime?",
                "Earth",
                "Copek",
                "Neptune",
                "Stines;Gate",
                "d",
                10,
                "level31",
                null
            )
        )
        question.add(
            QuestionModel(
                32,
                "Name these Anime?",
                "Arcana Famiglia",
                "Canada",
                "United States",
                "China",
                "a",
                10,
                "level32",
                null
            )
        )
        question.add(
            QuestionModel(
                33,
                "Name these Anime?",
                "Cheese",
                "Lemon juice",
                "Kaichou wa Maid sama",
                "Cannabis",
                "c",
                10,
                "level33",
                null
            )
        )
        question.add(
            QuestionModel(
                34,
                "Name these Anime?",
                "Luna (Moon)",
                "Phobos (Mars' moon)",
                "Venus' moon",
                "Special A",
                "d",
                10,
                "level34",
                null
            )
        )
        question.add(
            QuestionModel(
                35,
                "Name these Anime?",
                "O",
                "H",
                "Ao Haru Ride",
                "N",
                "c",
                10,
                "level35",
                null
            )
        )
        question.add(
            QuestionModel(
                36,
                "Name these Anime?",
                "Shakespeare",
                "Authur Miller",
                "Ashkouri",
                "Another",
                "d",
                10,
                "level36",
                null
            )
        )
        question.add(
            QuestionModel(
                37,
                "Name these Anime?",
                "Tonari no Kaibutsukun",
                "Atlantic Ocean",
                "India Ocean",
                "Arctic Ocean",
                "a",
                10,
                "level37",
                null
            )
        )
        question.add(
            QuestionModel(
                38,
                "Name these Anime?",
                "Coppelion",
                "Buddhism, Hindustan, Sikhism",
                "Zoroastrianism, Brahmanism, Yazdanism",
                "Taoism, Shintoism, Confucianism",
                "a",
                10,
                "level38",
                null
            )
        )
        question.add(
            QuestionModel(
                39,
                "Name these Anime?",
                "Asia",
                "Europe",
                "Zetsuen no Tempest",
                "America",
                "c",
                10,
                "level39",
                null
            )
        )
        question.add(
            QuestionModel(
                40,
                "Name these Anime?",
                "Pacific Ocean",
                "Atlantic Ocean",
                "Indian Ocean",
                "Blood Lad",
                "d",
                10,
                "level40",
                null
            )
        )
        return question
    }

    private fun questionList5(): MutableList<QuestionModel> {
        val question: MutableList<QuestionModel> = mutableListOf()
        question.add(
            QuestionModel(
                41,
                "Name these Anime?",
                "Earth",
                "Copek",
                "Neptune",
                "Guilty Crown",
                "d",
                10,
                "level41",
                null
            )
        )
        question.add(
            QuestionModel(
                42,
                "Name these Anime?",
                "Hamatora",
                "Canada",
                "United States",
                "China",
                "a",
                10,
                "level42",
                null
            )
        )
        question.add(
            QuestionModel(
                43,
                "Name these Anime?",
                "Cheese",
                "Lemon juice",
                "Hyouka",
                "Cannabis",
                "c",
                10,
                "level43",
                null
            )
        )
        question.add(
            QuestionModel(
                44,
                "Name these Anime?",
                "Luna (Moon)",
                "Phobos (Mars' moon)",
                "Venus' moon",
                "Deadman Wonderland",
                "d",
                10,
                "level44",
                null
            )
        )
        question.add(
            QuestionModel(
                45,
                "Name these Anime?",
                "O",
                "H",
                "Code Geass",
                "N",
                "c",
                10,
                "level45",
                null
            )
        )
        question.add(
            QuestionModel(
                46,
                "Name these Anime?",
                "Shakespeare",
                "Authur Miller",
                "Ashkouri",
                "Toradora",
                "d",
                10,
                "level46",
                null
            )
        )
        question.add(
            QuestionModel(
                47,
                "Name these Anime?",
                "Kokoro Connect",
                "Atlantic Ocean",
                "India Ocean",
                "Arctic Ocean",
                "a",
                10,
                "level47",
                null
            )
        )
        question.add(
            QuestionModel(
                48,
                "Name these Anime?",
                "Sakurasou no Pet na Kanojo",
                "Buddhism, Hindustan, Sikhism",
                "Zoroastrianism, Brahmanism, Yazdanism",
                "Taoism, Shintoism, Confucianism",
                "a",
                10,
                "level48",
                null
            )
        )
        question.add(
            QuestionModel(
                49,
                "Name these Anime?",
                "Asia",
                "Europe",
                "Chihayafuru",
                "America",
                "c",
                10,
                "level49",
                null
            )
        )
        question.add(
            QuestionModel(
                50,
                "Name these Anime?",
                "Pacific Ocean",
                "Atlantic Ocean",
                "Indian Ocean",
                "Fruit Basket",
                "d",
                10,
                "level50",
                null
            )
        )
        return question
    }

    private fun questionList6(): MutableList<QuestionModel> {
        val question: MutableList<QuestionModel> = mutableListOf()
        question.add(
            QuestionModel(
                51,
                "Name these Anime?",
                "Earth",
                "Copek",
                "Neptune",
                "Re Zero kara Isekai Hajimemasu",
                "d",
                10,
                "level51",
                null
            )
        )
        question.add(
            QuestionModel(
                52,
                "Name these Anime?",
                "Overload",
                "Canada",
                "United States",
                "China",
                "a",
                10,
                "level52",
                null
            )
        )
        question.add(
            QuestionModel(
                53,
                "Name these Anime?",
                "Cheese",
                "Lemon juice",
                "Kono Subarashi Sekai",
                "Cannabis",
                "c",
                10,
                "level53",
                null
            )
        )
        question.add(
            QuestionModel(
                54,
                "Name these Anime?",
                "Luna (Moon)",
                "Phobos (Mars' moon)",
                "Venus' moon",
                "Youjo Senki",
                "d",
                10,
                "level54",
                null
            )
        )
        question.add(
            QuestionModel(
                55,
                "Name these Anime?",
                "O",
                "H",
                "Tate no Yuusha",
                "N",
                "c",
                10,
                "level55",
                null
            )
        )
        question.add(
            QuestionModel(
                56,
                "Name these Anime?",
                "Shakespeare",
                "Authur Miller",
                "Ashkouri",
                "Fate Zero",
                "d",
                10,
                "level56",
                null
            )
        )
        question.add(
            QuestionModel(
                57,
                "Name these Anime?",
                "Steins Gate",
                "Atlantic Ocean",
                "India Ocean",
                "Arctic Ocean",
                "a",
                10,
                "level57",
                null
            )
        )
        question.add(
            QuestionModel(
                58,
                "Name these Anime?",
                "Code Breaker",
                "Buddhism, Hindustan, Sikhism",
                "Zoroastrianism, Brahmanism, Yazdanism",
                "Taoism, Shintoism, Confucianism",
                "a",
                10,
                "level58",
                null
            )
        )
        question.add(
            QuestionModel(
                59,
                "Name these Anime?",
                "Asia",
                "Europe",
                "Hataraku Maou Sama",
                "America",
                "c",
                10,
                "level59",
                null
            )
        )
        question.add(
            QuestionModel(
                60,
                "Name these Anime?",
                "Pacific Ocean",
                "Atlantic Ocean",
                "Indian Ocean",
                "Accel World",
                "d",
                10,
                "level60",
                null
            )
        )
        return question
    }

    private fun questionList7(): MutableList<QuestionModel> {
        val question: MutableList<QuestionModel> = mutableListOf()
        question.add(
            QuestionModel(
                61,
                "Name these Anime?",
                "Earth",
                "Copek",
                "Neptune",
                "Ookami to Kuro Ouji",
                "d",
                10,
                "level61",
                null
            )
        )
        question.add(
            QuestionModel(
                62,
                "Name these Anime?",
                "Yahari ore no Seishun",
                "Canada",
                "United States",
                "China",
                "a",
                10,
                "level62",
                null
            )
        )
        question.add(
            QuestionModel(
                63,
                "Name these Anime?",
                "Cheese",
                "Lemon juice",
                "Yamada-kun 7 nin no Majo",
                "Cannabis",
                "c",
                10,
                "level63",
                null
            )
        )
        question.add(
            QuestionModel(
                64,
                "Name these Anime?",
                "Luna (Moon)",
                "Phobos (Mars' moon)",
                "Venus' moon",
                "Angel Beats",
                "d",
                10,
                "level64",
                null
            )
        )
        question.add(
            QuestionModel(
                65,
                "Name these Anime?",
                "O",
                "H",
                "Date A Live",
                "N",
                "c",
                10,
                "level65",
                null
            )
        )
        question.add(
            QuestionModel(
                66,
                "Name these Anime?",
                "Shakespeare",
                "Authur Miller",
                "Ashkouri",
                "Kekkai Sensen",
                "d",
                10,
                "level66",
                null
            )
        )
        question.add(
            QuestionModel(
                67,
                "Name these Anime?",
                "K",
                "Atlantic Ocean",
                "India Ocean",
                "Arctic Ocean",
                "a",
                10,
                "level67",
                null
            )
        )
        question.add(
            QuestionModel(
                68,
                "Name these Anime?",
                "Shigatsu wa kimi no Uso",
                "Buddhism, Hindustan, Sikhism",
                "Zoroastrianism, Brahmanism, Yazdanism",
                "Taoism, Shintoism, Confucianism",
                "a",
                10,
                "level68",
                null
            )
        )
        question.add(
            QuestionModel(
                69,
                "Name these Anime?",
                "Asia",
                "Europe",
                "Ore Monogatari",
                "America",
                "c",
                10,
                "level69",
                null
            )
        )
        question.add(
            QuestionModel(
                70,
                "Name these Anime?",
                "Pacific Ocean",
                "Atlantic Ocean",
                "Indian Ocean",
                "Owari Seraph",
                "d",
                10,
                "level70",
                null
            )
        )
        return question
    }

    private fun questionList8(): MutableList<QuestionModel> {
        val question: MutableList<QuestionModel> = mutableListOf()
        question.add(
            QuestionModel(
                71,
                "Name these Anime?",
                "Earth",
                "Copek",
                "Neptune",
                "Noragami",
                "d",
                10,
                "level71",
                null
            )
        )
        question.add(
            QuestionModel(
                72,
                "Name these Anime?",
                "Kiseijuu no Kakuritsu",
                "Canada",
                "United States",
                "China",
                "a",
                10,
                "level72",
                null
            )
        )
        question.add(
            QuestionModel(
                73,
                "Name these Anime?",
                "Cheese",
                "Lemon juice",
                "Shokugeki no Soma",
                "Cannabis",
                "c",
                10,
                "level73",
                null
            )
        )
        question.add(
            QuestionModel(
                74,
                "Name these Anime?",
                "Luna (Moon)",
                "Phobos (Mars' moon)",
                "Venus' moon",
                "Nisekoi",
                "d",
                10,
                "level74",
                null
            )
        )
        question.add(
            QuestionModel(
                75,
                "Name these Anime?",
                "O",
                "H",
                "Anohana",
                "N",
                "c",
                10,
                "level75",
                null
            )
        )
        question.add(
            QuestionModel(
                76,
                "Name these Anime?",
                "Shakespeare",
                "Authur Miller",
                "Ashkouri",
                "Free",
                "d",
                10,
                "level76",
                null
            )
        )
        question.add(
            QuestionModel(
                77,
                "Name these Anime?",
                "Mirai Nikki",
                "Atlantic Ocean",
                "India Ocean",
                "Arctic Ocean",
                "a",
                10,
                "level77",
                null
            )
        )
        question.add(
            QuestionModel(
                78,
                "Name these Anime?",
                "Psycho-Pass",
                "Buddhism, Hindustan, Sikhism",
                "Zoroastrianism, Brahmanism, Yazdanism",
                "Taoism, Shintoism, Confucianism",
                "a",
                10,
                "level78",
                null
            )
        )
        question.add(
            QuestionModel(
                79,
                "Name these Anime?",
                "Asia",
                "Europe",
                "Prison School",
                "America",
                "c",
                10,
                "level79",
                null
            )
        )
        question.add(
            QuestionModel(
                80,
                "Name these Anime?",
                "Pacific Ocean",
                "Atlantic Ocean",
                "Indian Ocean",
                "Divine Gate",
                "d",
                10,
                "level80",
                null
            )
        )
        return question
    }

    private fun questionList9(): MutableList<QuestionModel> {
        val question: MutableList<QuestionModel> = mutableListOf()
        question.add(
            QuestionModel(
                81,
                "Name these Anime?",
                "Earth",
                "Copek",
                "Neptune",
                "Hai to Gensou no Grimgar",
                "d",
                10,
                "level81",
                null
            )
        )
        question.add(
            QuestionModel(
                82,
                "Name these Anime?",
                "Orange",
                "Canada",
                "United States",
                "China",
                "a",
                10,
                "level82",
                null
            )
        )
        question.add(
            QuestionModel(
                83,
                "Name these Anime?",
                "Cheese",
                "Lemon juice",
                "Working",
                "Cannabis",
                "c",
                10,
                "level83",
                null
            )
        )
        question.add(
            QuestionModel(
                84,
                "Name these Anime?",
                "Luna (Moon)",
                "Phobos (Mars' moon)",
                "Venus' moon",
                "One Punch Man",
                "d",
                10,
                "level84",
                null
            )
        )
        question.add(
            QuestionModel(
                85,
                "Name these Anime?",
                "O",
                "H",
                "Black Bullet",
                "N",
                "c",
                10,
                "level85",
                null
            )
        )
        question.add(
            QuestionModel(
                86,
                "Name these Anime?",
                "Shakespeare",
                "Authur Miller",
                "Ashkouri",
                "Rokka no Yuusha",
                "d",
                10,
                "level86",
                null
            )
        )
        question.add(
            QuestionModel(
                87,
                "Name these Anime?",
                "Taboo Tatto",
                "Atlantic Ocean",
                "India Ocean",
                "Arctic Ocean",
                "a",
                10,
                "level87",
                null
            )
        )
        question.add(
            QuestionModel(
                88,
                "Name these Anime?",
                "Trinity 7",
                "Buddhism, Hindustan, Sikhism",
                "Zoroastrianism, Brahmanism, Yazdanism",
                "Taoism, Shintoism, Confucianism",
                "a",
                10,
                "level88",
                null
            )
        )
        question.add(
            QuestionModel(
                89,
                "Name these Anime?",
                "Asia",
                "Europe",
                "Strike the Blood",
                "America",
                "c",
                10,
                "level89",
                null
            )
        )
        question.add(
            QuestionModel(
                90,
                "Name these Anime?",
                "Pacific Ocean",
                "Atlantic Ocean",
                "Indian Ocean",
                "Hibike Euphonium",
                "d",
                10,
                "level90",
                null
            )
        )
        return question
    }

    private fun questionList10(): MutableList<QuestionModel> {
        val question: MutableList<QuestionModel> = mutableListOf()
        question.add(
            QuestionModel(
                91,
                "Name these Anime?",
                "Earth",
                "Copek",
                "Neptune",
                "Nijiiro Days",
                "d",
                10,
                "level91",
                null
            )
        )
        question.add(
            QuestionModel(
                92,
                "Name these Anime?",
                "Btooom",
                "Canada",
                "United States",
                "China",
                "a",
                10,
                "level92",
                null
            )
        )
        question.add(
            QuestionModel(
                93,
                "Name these Anime?",
                "Cheese",
                "Lemon juice",
                "Akuma no Riddle",
                "Cannabis",
                "c",
                10,
                "level93",
                null
            )
        )
        question.add(
            QuestionModel(
                94,
                "Name these Anime?",
                "Luna (Moon)",
                "Phobos (Mars' moon)",
                "Venus' moon",
                "Qualidea Code",
                "d",
                10,
                "level94",
                null
            )
        )
        question.add(
            QuestionModel(
                95,
                "Name these Anime?",
                "O",
                "H",
                "Relife",
                "N",
                "c",
                10,
                "level95",
                null
            )
        )
        question.add(
            QuestionModel(
                96,
                "Name these Anime?",
                "Shakespeare",
                "Authur Miller",
                "Ashkouri",
                "Kuzu no Honkai",
                "d",
                10,
                "level96",
                null
            )
        )
        question.add(
            QuestionModel(
                97,
                "Name these Anime?",
                "Masamunekun no Revenge",
                "Atlantic Ocean",
                "India Ocean",
                "Arctic Ocean",
                "a",
                10,
                "level97",
                null
            )
        )
        question.add(
            QuestionModel(
                98,
                "Name these Anime?",
                "Chuunibyou Koi wa Shitai",
                "Buddhism, Hindustan, Sikhism",
                "Zoroastrianism, Brahmanism, Yazdanism",
                "Taoism, Shintoism, Confucianism",
                "a",
                10,
                "level98",
                null
            )
        )
        question.add(
            QuestionModel(
                99,
                "Name these Anime?",
                "Asia",
                "Europe",
                "Tokyo ESP",
                "America",
                "c",
                10,
                "level99",
                null
            )
        )
        question.add(
            QuestionModel(
                100,
                "Name these Anime?",
                "Pacific Ocean",
                "Atlantic Ocean",
                "Indian Ocean",
                "Akagami no Shirayukihime",
                "d",
                10,
                "level100",
                null
            )
        )
        return question
    }

}