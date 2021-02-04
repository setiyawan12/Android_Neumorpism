package yayang.setiyawan.neumorphism

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_recycle.*
import yayang.setiyawan.neumorphism.adapter.UserAdapter
import yayang.setiyawan.neumorphism.model.User
import java.nio.file.Files.size

class RecycleActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycle)

        var user = mutableListOf(
                User("yayang"),
                User("tes"),
                User("setiyawan"),
                User("anton"),
                User("jdjdjdj"),
        )

        val adapter = UserAdapter(user)
        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(this)

        bt_addList.setOnClickListener {
            val title = et_addList.text.toString().trim()
            val users = User(title)
            user.add(users)
            adapter.notifyDataSetChanged()
            adapter.notifyItemInserted(user.size-1)
        }
    }
}