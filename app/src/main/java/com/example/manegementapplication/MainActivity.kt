package com.example.manegementapplication
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.android.volley.Response
import com.android.volley.toolbox.Volley
import com.example.manegementapplication.HomeActivity
import com.example.manegementapplication.LoginRequest
import com.example.manegementapplication.R
import kotlinx.android.synthetic.main.activity_main.*
import org.json.JSONException
import org.json.JSONObject

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var login_id: EditText? = null
        var login_password: EditText? = null
        var login_button: Button? = null

        login_id = findViewById(R.id.login_id)
        login_password = findViewById(R.id.login_password)
        login_button = findViewById(R.id.login_button)
        login_button.setOnClickListener{
                val id = login_id.getText().toString()
                val pw = login_password.getText().toString()
                val responseListener =
                    Response.Listener<String?> { response ->
                        try {
                            val jsonObject = JSONObject(response)
                            val success = jsonObject.getBoolean("success")
                            println("${success}")
                            if (success) { //로그인 성공시
                                val id = jsonObject.getString("id")
                                val pw = jsonObject.getString("pw")
                                val Store_num = jsonObject.getString("Store_num")
                                Toast.makeText(applicationContext, "로그인 성공", Toast.LENGTH_SHORT)
                                    .show()
                                val intent = Intent(this@MainActivity, HomeActivity::class.java)
                                intent.putExtra("id", id)
                                intent.putExtra("pw", pw)
                                intent.putExtra("Store_num",Store_num)
                                startActivity(intent)
                            } else { //로그인 실패시
                                Toast.makeText(applicationContext, "로그인 실패", Toast.LENGTH_SHORT)
                                    .show()
                                return@Listener
                            }
                        } catch (e: JSONException) {
                            e.printStackTrace()
                        }
                    }
                val loginRequest = LoginRequest(id, pw, responseListener)
                val queue = Volley.newRequestQueue(this@MainActivity)
                queue.add(loginRequest)
        }
    }
}