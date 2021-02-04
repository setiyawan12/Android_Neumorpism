package yayang.setiyawan.neumorphism

import android.app.ActivityOptions
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.util.Pair
import android.view.View
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.LinearLayout
import kotlinx.android.synthetic.main.activity_login.*
import kotlinx.android.synthetic.main.activity_main.*

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        animation()
        btn_login.setOnClickListener {
            val intent = Intent(this,DashboardActivity::class.java)
            startActivity(intent)
        }
    }

    fun animation(){
        val layout_main = findViewById<LinearLayout>(R.id.linear_bottom)
        val anim = AnimationUtils.loadAnimation(this , R.anim.fade_in)
        Handler(Looper.getMainLooper()).postDelayed({
            layout_main.
            animation = anim
            layout_main.visibility = View.VISIBLE
        },1500)
    }
}