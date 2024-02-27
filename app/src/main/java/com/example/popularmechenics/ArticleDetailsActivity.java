package com.example.popularmechenics;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Paint;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ArticleDetailsActivity extends AppCompatActivity {
    TextView title;
    TextView author;
    TextView date;
    TextView details;
    ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_article_details);

        title=findViewById(R.id.title);
        author=findViewById(R.id.author);
        date=findViewById(R.id.date);
        details=findViewById(R.id.details);
        image=findViewById(R.id.image);

        title.setText(getIntent().getStringExtra("title"));
        author.setText(getIntent().getStringExtra("author"));
        date.setText(getIntent().getStringExtra("date"));
        details.setText(getIntent().getStringExtra("details"));
        image.setImageResource(getIntent().getIntExtra("image",R.drawable.image1));

        author.setPaintFlags(Paint.UNDERLINE_TEXT_FLAG);
    }
}