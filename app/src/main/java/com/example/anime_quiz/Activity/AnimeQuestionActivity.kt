package com.example.anime_quiz.Activity

import android.content.Intent
import android.os.Bundle
import android.view.Window
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.bumptech.glide.request.RequestOptions
import com.example.anime_quiz.Adapter.QuestionAdapter
import com.example.anime_quiz.Domain.QuestionModel
import com.example.anime_quiz.R
import com.example.anime_quiz.databinding.ActivityAnimeQuestionBinding

class AnimeQuestionActivity : AppCompatActivity(),QuestionAdapter.score {
    private lateinit var binding: ActivityAnimeQuestionBinding
    var position: Int = 0
    var receivedList: MutableList<QuestionModel> = mutableListOf()
    var allScore = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAnimeQuestionBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val window: Window = this@AnimeQuestionActivity.window
        window.statusBarColor = ContextCompat.getColor(this@AnimeQuestionActivity, R.color.grey)

        receivedList = intent.getParcelableArrayListExtra<QuestionModel>("list")!!.toMutableList()

        binding.apply {
            backBtn.setOnClickListener { finish() }

            progressBar.progress = 1

            questionTxt.text = receivedList[position].question
            val drawableResourceId: Int = binding.root.resources.getIdentifier(
                receivedList[position].picPath,
                "drawable", binding.root.context.packageName
            )

            Glide.with(this@AnimeQuestionActivity)
                .load(drawableResourceId)
                .centerCrop()
                .apply(RequestOptions.bitmapTransform(RoundedCorners(60)))
                .into(pic)

            loadAnswer()

            rightArrow.setOnClickListener {
                if (progressBar.progress == 10) {
                    val intent = Intent(this@AnimeQuestionActivity, ScoreActivity::class.java)
                    intent.putExtra("Score", allScore)
                    startActivity(intent)
                    finish()
                    return@setOnClickListener
                }
                position++
                progressBar.progress = progressBar.progress + 1
                questionNumberTxt.text = "Question" + progressBar.progress + "/10"
                questionTxt.text = receivedList[position].question

                val drawableResourceId: Int = binding.root.resources.getIdentifier(
                    receivedList[position].picPath,
                    "drawable", binding.root.context.packageName
                )

                Glide.with(this@AnimeQuestionActivity)
                    .load(drawableResourceId)
                    .centerCrop()
                    .apply(RequestOptions.bitmapTransform(RoundedCorners(60)))
                    .into(pic)

                loadAnswer()
            }

            leftArrow.setOnClickListener {
                if (progressBar.progress == 1) {
                    return@setOnClickListener
                }
                position--
                progressBar.progress = progressBar.progress - 1
                questionNumberTxt.text = "Question" + progressBar.progress + "/10"
                questionTxt.text = receivedList[position].question

                val drawableResourceId: Int = binding.root.resources.getIdentifier(
                    receivedList[position].picPath,
                    "drawable", binding.root.context.packageName
                )

                Glide.with(this@AnimeQuestionActivity)
                    .load(drawableResourceId)
                    .centerCrop()
                    .apply(RequestOptions.bitmapTransform(RoundedCorners(60)))
                    .into(pic)

                loadAnswer()
            }
        }
    }

    private fun loadAnswer() {
        val users: MutableList<String> = mutableListOf()
        users.add(receivedList[position].answer_1.toString())
        users.add(receivedList[position].answer_2.toString())
        users.add(receivedList[position].answer_3.toString())
        users.add(receivedList[position].answer_4.toString())

        if (receivedList[position].clickAnswer != null) users.add(receivedList[position].clickAnswer.toString())

        val questionAdapter by lazy {
            QuestionAdapter(
                receivedList[position].correctAnswer.toString(), users, this
            )
        }

        questionAdapter.differ.submitList(users)
        binding.questionList.apply {
            layoutManager = LinearLayoutManager(this@AnimeQuestionActivity)
            adapter = questionAdapter
        }
    }

    override fun amount(number: Int, clickedAnswer: String) {
        allScore+=number
        receivedList[position].clickAnswer =clickedAnswer
    }
}
