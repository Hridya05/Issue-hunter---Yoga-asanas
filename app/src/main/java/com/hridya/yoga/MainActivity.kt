package com.hridya.yoga

import android.annotation.SuppressLint
import android.graphics.Typeface
import android.os.Bundle
import android.util.TypedValue
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val pose1: ImageButton = findViewById(R.id.button1)
        val img: ImageView = findViewById((R.id.image))
        val text1: TextView = findViewById(R.id.brief)
        val text2: TextView = findViewById(R.id.benefits)

        val pose2: ImageButton = findViewById(R.id.button2)
        val pose3: ImageButton = findViewById(R.id.button3)
        val pose4: ImageButton = findViewById(R.id.button4)

        pose1.setOnClickListener {
            text1.text = "COBRA POSE - BHUJANGASANA "
            text1.setTextSize(TypedValue.COMPLEX_UNIT_SP, 40f)
            text1.setTypeface(null, Typeface.BOLD)
            img.setImageResource(R.drawable.b)
            text2.text = "Benefits: Lengthens the abdominal muscles, strengthens the spine, and firms the buttocks while stretching and opening the chest, lungs, and shoulders."
            text2.setTextSize(TypedValue.COMPLEX_UNIT_SP, 20f )
        }
        pose2.setOnClickListener {
            text1.setText("WARRIOR POSE - VIRABHADRASANA")
            text1.setTextSize(TypedValue.COMPLEX_UNIT_SP, 40f)
            text1.setTypeface(null, Typeface.BOLD)
            img.setImageResource(R.drawable.v)
            text2.setText("Benefits: Helps to strengthen the shoulders, arms, and back, stretches and strengthens the thighs, calves, and ankles, opens the chest and hips, and gently stretches the shoulders, navel, and neck.")
            text2.setTextSize(TypedValue.COMPLEX_UNIT_SP, 20f )}
        pose3.setOnClickListener {
            text1.setText("MONKEY POSE - HANUMANASANA ")
            text1.setTextSize(TypedValue.COMPLEX_UNIT_SP, 40f)
            text1.setTypeface(null, Typeface.BOLD)
            img.setImageResource(R.drawable.h)
            text2.setText("Benefits: Strengthens muscles in the thighs, hamstrings, groin area, and pelvic floor. Stretches the chest, thighs, arms, shoulders, and back. Increases energy and positive thoughts and activates the thymus gland. Increases overall flexibility.")
            text2.setTextSize(TypedValue.COMPLEX_UNIT_SP, 20f )
        }
        pose4.setOnClickListener {
            text1.setText("HERO POSE - VIRASANA ")
            text1.setTextSize(TypedValue.COMPLEX_UNIT_SP, 40f)
            text1.setTypeface(null, Typeface.BOLD)
            img.setImageResource(R.drawable.virasana)
            text2.setText("Benefits: Stretches the thighs, knees, and ankles and strengthens the arches. Improves digestion and relieves gas. Also therapeutic for high blood pressure and asthma. The hero pose can also be used for sitting for longer periods, such as for meditation, rather than the Easy, Half Lotus or Lotus pose.")
            text2.setTextSize(TypedValue.COMPLEX_UNIT_SP, 20f )}
            text2.setTextSize(TypedValue.COMPLEX_UNIT_SP, 20f )}

}