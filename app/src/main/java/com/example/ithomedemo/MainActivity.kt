package com.example.ithomedemo

import android.app.Activity
import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.WindowManager
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val itList=ArrayList<IT>()

    private fun intiFruits(){
        repeat(2)
        {
            itList.add(IT("11.1 天猫 / 京东红包双双加码：第一波狂促开启，预售付尾款","10:48","0评",R.drawable.gundon1))
            itList.add(IT("11.1 天猫 / 京东红包双双加码：第一波狂促开启，预售付尾款","10:48","0评",R.drawable.gundon1))
            itList.add(IT("11.1 天猫 / 京东红包双双加码：第一波狂促开启，预售付尾款","10:48","0评",R.drawable.gundon1))
            itList.add(IT("11.1 天猫 / 京东红包双双加码：第一波狂促开启，预售付尾款","10:48","0评",R.drawable.gundon1))
            itList.add(IT("11.1 天猫 / 京东红包双双加码：第一波狂促开启，预售付尾款","10:48","0评",R.drawable.gundon1))
            itList.add(IT("11.1 天猫 / 京东红包双双加码：第一波狂促开启，预售付尾款","10:48","0评",R.drawable.gundon1))
            itList.add(IT("11.1 天猫 / 京东红包双双加码：第一波狂促开启，预售付尾款","10:48","0评",R.drawable.gundon1))
            itList.add(IT("11.1 天猫 / 京东红包双双加码：第一波狂促开启，预售付尾款","10:48","0评",R.drawable.gundon1))
            itList.add(IT("11.1 天猫 / 京东红包双双加码：第一波狂促开启，预售付尾款","10:48","0评",R.drawable.gundon1))
            itList.add(IT("11.1 天猫 / 京东红包双双加码：第一波狂促开启，预售付尾款","10:48","0评",R.drawable.gundon1))
            itList.add(IT("11.1 天猫 / 京东红包双双加码：第一波狂促开启，预售付尾款","10:48","0评",R.drawable.gundon1))
            itList.add(IT("11.1 天猫 / 京东红包双双加码：第一波狂促开启，预售付尾款","10:48","0评",R.drawable.gundon1))
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()//去掉标题

        fullScreen(this)
        window.decorView.systemUiVisibility =
                View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN or View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR
        intiFruits()

        //上下文,列表子视图,数据源
//        val adapter = ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,data)
        val itAdapter = ITAdapter(this,R.layout.slide_page,itList)
        //绑定到控件
//        listViewTest.adapter = adapter
        listViewTest.adapter = itAdapter


        listViewTest.setOnItemClickListener { _,_,i,_->
            val fruit=itList[i]
            Toast.makeText(this,fruit.consulting, Toast.LENGTH_SHORT).show()
            val intent = Intent(this,MainActivity1::class.java)
            startActivity(intent)
        }
    }
    //------------------------
    //------------------------
    /**
     * 通过设置全屏，设置状态栏透明
     *
     * @param activity
     */
    private fun fullScreen(activity: Activity) {
        run {

            //5.x开始需要把颜色设置透明，否则导航栏会呈现系统默认的浅灰色
            val window = activity.window
            val decorView = window.decorView
            //两个 flag 要结合使用，表示让应用的主体内容占用系统状态栏的空间
            val option = (View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                    or View.SYSTEM_UI_FLAG_LAYOUT_STABLE)
            decorView.systemUiVisibility = option
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
            window.statusBarColor = Color.TRANSPARENT
        }
    }
}