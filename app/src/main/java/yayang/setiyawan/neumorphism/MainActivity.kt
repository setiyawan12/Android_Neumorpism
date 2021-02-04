package yayang.setiyawan.neumorphism

import android.app.Activity
import android.app.ActivityOptions
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.util.Pair
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Handler(Looper.getMainLooper()).postDelayed({
            val asu = Intent(this , LoginActivity::class.java)
            val options =ActivityOptions.makeSceneTransitionAnimation(this,
                Pair.create(iv_logo, "logo"),
                Pair.create(tv_logo, "logo_text"),
                Pair.create(img_logo, "img_tree"),
                )
            startActivity(asu, options.toBundle())
            finish()
        },2500)
    }
}