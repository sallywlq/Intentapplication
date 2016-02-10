package com.example.wlq.intentapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SActivity extends AppCompatActivity {
    private Button bt;
    private String content = "hello,wlq";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_s);
        bt = (Button)findViewById(R.id.button1);
        /*
        *第二个页面什么时候回传数据
        * 回传到第一个页面的实际上是一个intent对象
         */
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent data = new Intent();
                data.putExtra("data1",content);
                setResult(2,data);
                finish();


            }
        });
    }
}
