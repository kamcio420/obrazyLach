package com.example.obrazylach

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.SeekBar
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var image1 = findViewById<ImageView>(R.id.image1)
        var image2 = findViewById<ImageView>(R.id.image2)
        var image3 = findViewById<ImageView>(R.id.image3)

        val seek1H = findViewById<SeekBar>(R.id.image1HBar)
        val seek1V = findViewById<SeekBar>(R.id.image1VBar)
        val seek2H = findViewById<SeekBar>(R.id.image2HBar)
        val seek2V = findViewById<SeekBar>(R.id.image2VBar)
        val seek3H = findViewById<SeekBar>(R.id.image3HBar)
        val seek3V = findViewById<SeekBar>(R.id.image3VBar)
        val progressBarV = findViewById<ProgressBar>(R.id.progressBarV)
        val progressBarH = findViewById<ProgressBar>(R.id.progressBarH)
        val percentV = findViewById<TextView>(R.id.percentV)
        val percentH = findViewById<TextView>(R.id.percentH)


        var resetButton = findViewById<Button>(R.id.resetButton)

        resetButton.setOnClickListener {
            seek1H.progress = 0
            seek1V.progress = 0
            seek2H.progress = 0
            seek2V.progress = 0
            seek3H.progress = 0
            seek3V.progress = 0
            image1.layoutParams.width = 2
            image1.layoutParams.height = 2
            image2.layoutParams.width = 2
            image2.layoutParams.height = 2
            image3.layoutParams.width = 2
            image3.layoutParams.height = 2
            progressBarV.progress = 0
            progressBarH.progress = 0
            percentV.text = "0%"
            percentH.text = "0%"

        }

        seek1H?.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar, progress: Int,
                                           fromUser: Boolean) {
                if(seek1H.progress != 0)
                    image1.layoutParams.width = seek1H.progress * 3
                findViewById<TextView>(R.id.textView2).text = seek1H.progress.toString()
                progressBarH.progress = (seek1H.progress / 3) + (seek2H.progress / 3) + (seek3H.progress / 3) + 1
                percentH.text = progressBarH.progress.toString() + "%"

            }

            override fun onStartTrackingTouch(seekBar: SeekBar) {
                if(seek1H.progress != 0)
                    image1.layoutParams.width = seek1H.progress * 3

            }

            override fun onStopTrackingTouch(seekBar: SeekBar) {
                if(seek1H.progress != 0)
                    image1.layoutParams.width = seek1H.progress * 3
                percentH.text = progressBarH.progress.toString() + "%"
            }
        })

        seek1V?.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar, progress: Int, fromUser: Boolean) {
                if(seek1V.progress != 0)
                    image1.layoutParams.height = seek1V.progress * 3
                findViewById<TextView>(R.id.textView2).text = seek1H.progress.toString()
                progressBarV.progress = (seek1V.progress / 3) + (seek2V.progress / 3) + (seek3V.progress / 3) + 1
                percentV.text = progressBarV.progress.toString() + "%"
            }

            override fun onStartTrackingTouch(seekBar: SeekBar) {
                if(seek1V.progress != 0)
                    image1.layoutParams.height = seek1V.progress * 3         }

            override fun onStopTrackingTouch(seekBar: SeekBar) {
                if(seek1V.progress != 0)
                    image1.layoutParams.height = seek1V.progress * 3        }
        })

        seek2H?.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar, progress: Int,
                                           fromUser: Boolean) {
                if(seek2H.progress != 0)
                    image2.layoutParams.width = seek2H.progress * 3
                findViewById<TextView>(R.id.textView2).text = seek2H.progress.toString()
                progressBarH.progress = (seek1H.progress / 3) + (seek2H.progress / 3) + (seek3H.progress / 3) + 1
                percentH.text = progressBarH.progress.toString() + "%"

            }

            override fun onStartTrackingTouch(seekBar: SeekBar) {
                if(seek2H.progress != 0)
                    image2.layoutParams.width = seek2H.progress * 3

            }

            override fun onStopTrackingTouch(seekBar: SeekBar) {
                if(seek2H.progress != 0)
                    image2.layoutParams.width = seek2H.progress * 3
            }
        })

        seek2V?.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar, progress: Int, fromUser: Boolean) {
                if(seek2V.progress != 0)
                    image2.layoutParams.height = seek2V.progress * 3
                findViewById<TextView>(R.id.textView2).text = seek2V.progress.toString()
                progressBarV.progress = (seek1V.progress / 3) + (seek2V.progress / 3) + (seek3V.progress / 3) + 1
                percentV.text = progressBarV.progress.toString() + "%"
            }

            override fun onStartTrackingTouch(seekBar: SeekBar) {
                if(seek2V.progress != 0)
                    image1.layoutParams.height = seek2V.progress * 3         }

            override fun onStopTrackingTouch(seekBar: SeekBar) {
                if(seek2V.progress != 0)
                    image1.layoutParams.height = seek2V.progress * 3        }
        })

        seek3H?.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar, progress: Int,
                                           fromUser: Boolean) {
                if(seek3H.progress != 0)
                    image3.layoutParams.width = seek3H.progress * 3
                findViewById<TextView>(R.id.textView2).text = seek3H.progress.toString()
                progressBarH.progress = (seek1H.progress / 3) + (seek2H.progress / 3) + (seek3H.progress / 3) + 1
                percentH.text = progressBarH.progress.toString() + "%"

            }

            override fun onStartTrackingTouch(seekBar: SeekBar) {
                if(seek3H.progress != 0)
                    image3.layoutParams.width = seek3H.progress * 3

            }

            override fun onStopTrackingTouch(seekBar: SeekBar) {
                if(seek3H.progress != 0)
                    image3.layoutParams.width = seek3H.progress * 3
            }
        })

        seek3V?.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar, progress: Int, fromUser: Boolean) {
                if(seek3V.progress != 0)
                    image3.layoutParams.height = seek3V.progress * 3
                findViewById<TextView>(R.id.textView2).text = seek3H.progress.toString()
                progressBarV.progress = (seek1V.progress / 3) + (seek2V.progress / 3) + (seek3V.progress / 3) + 1
                percentV.text = progressBarV.progress.toString() + "%"
            }

            override fun onStartTrackingTouch(seekBar: SeekBar) {
                if(seek3V.progress != 0)
                    image3.layoutParams.height = seek3V.progress * 3         }

            override fun onStopTrackingTouch(seekBar: SeekBar) {
                if(seek3V.progress != 0)
                    image3.layoutParams.height = seek3V.progress * 3        }
        })

    }
}