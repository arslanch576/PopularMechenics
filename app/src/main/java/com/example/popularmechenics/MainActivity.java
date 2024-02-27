package com.example.popularmechenics;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.post1).setOnClickListener(v -> {
            Intent intent=new Intent(this,ArticleDetailsActivity.class);
            intent.putExtra("title","Everything You Need to Know About Camouflage, According to a U.S. Army Sniper Course Instructor");
            intent.putExtra("author","MATT CRISARA");
            intent.putExtra("date","FEB 10, 2024");
            intent.putExtra("details","Humans aren’t great at blending in with their environment. In the 20th century—after we ditched the rather barbaric style of fighting wars in fields, with line formations charging at one another—camouflage would become a vital tool. This has grown into a multi-billion-dollar industry meant to keep soldiers hidden on the battlefield, offering a significant tactical advantage.");
            intent.putExtra("image",R.drawable.image1);
            startActivity(intent);
        });
        findViewById(R.id.post2).setOnClickListener(v -> {
            Intent intent=new Intent(this,ArticleDetailsActivity.class);
            intent.putExtra("title","The LAV-25: Everything You Need to Know About the Marines’ Favorite Ride");
            intent.putExtra("author"," KYLE MIZOKAMI");
            intent.putExtra("date","FEB 21, 2024");
            intent.putExtra("details","HuIts speed and firepower, coupled with its exceptional ability to deploy worldwide at a moment’s notice, makes the LAV-25 an ideal component of any crisis response force.mans aren’t great at blending in with their environment. In the 20th century—after we ditched the rather barbaric style of fighting wars in fields, with line formations charging at one another—camouflage would become a vital tool. This has grown into a multi-billion-dollar industry meant to keep soldiers hidden on the battlefield, offering a significant tactical advantage.");
            intent.putExtra("image",R.drawable.image2);
            startActivity(intent);
        });
    }
}