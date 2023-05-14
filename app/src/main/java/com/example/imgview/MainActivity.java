package com.example.imgview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    boolean isVk=true;

    public void change(View view){
        ImageView iv=findViewById(R.id.imageView3);
        if(isVk){
            iv.setImageResource(R.drawable.vm);
            isVk=false;
        }
        else{
            iv.setImageResource(R.drawable.vk);
            isVk=true;
        }

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}