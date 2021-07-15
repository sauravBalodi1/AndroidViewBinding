package com.example.viewbindingconsepts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.viewbindingconsepts.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
//      var binding: ActivityMainBinding = TODO()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val fragmentA=FirstFrag()
        val fragmentB=fragg2()
        var bind=findViewById<Button>(R.id.frag1btn)
    var bind2=findViewById<Button>(R.id.frag2btn)
        bind.setOnClickListener{
            supportFragmentManager.beginTransaction().replace(R.id.textId,fragmentA).commit()
        }

    bind2.setOnClickListener{
        supportFragmentManager.beginTransaction().replace(R.id.textId,fragmentB).commit()
    }
//        binding.frag1btn.setOnClickListener{
//            supportFragmentManager.beginTransaction().replace(R.id.textId,fragmentB).commit()
//        }

    }
}