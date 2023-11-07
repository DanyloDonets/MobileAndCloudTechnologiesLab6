package donets.danylo.mobileandcloudtechnologies.lab6_1

import android.graphics.Color
import android.os.Bundle
import android.os.SystemClock
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {

    lateinit var btn: Button
    private var count = 0
    lateinit var constraintlayout: ConstraintLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        constraintlayout = findViewById(R.id.act)
        btn = findViewById(R.id.btn)
        btn.setOnClickListener {
            count++
            Toast.makeText(this, "تكبير times: $count", Toast.LENGTH_SHORT).show()
            constraintlayout.setBackgroundResource(R.color.yellow)
            SystemClock.sleep(200)
            constraintlayout.setBackgroundResource(R.color.red)
            SystemClock.sleep(600)
            constraintlayout.setBackgroundResource(R.color.white)
        }
    }
}