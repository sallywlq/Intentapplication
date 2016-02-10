package com.example.wlq.intentapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class FActivity extends AppCompatActivity {
    private Button bt1;
    private Button bt2;
    private TextView textview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_f);
        bt1 = (Button)findViewById(R.id.button1_f);
        bt2 = (Button)findViewById(R.id.button2_s);
        textview = (TextView)findViewById(R.id.text2);

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FActivity.this,SActivity.class);
                FActivity.this.startActivity(intent);
            }
        });
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FActivity.this,SActivity.class);
                startActivityForResult(intent,1);
            }
        });
    }
    /*
    *通过startActivityForResult跳转，接收返回的数据
    * requestCode:请求的标识
    * resultCode：第二个页面返回的标识
    * data：第二个页面回传的数据
     */

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == 1&& resultCode ==2){
            String content = data.getStringExtra("data1");
            textview.setText(content);

        }
    }
}
