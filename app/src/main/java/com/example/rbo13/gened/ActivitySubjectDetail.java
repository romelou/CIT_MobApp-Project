package com.example.rbo13.gened;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class ActivitySubjectDetail extends AppCompatActivity {

    private TextView title, author, detail, link;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subject_detail);

        title = findViewById(R.id.textViewSubjectDetailTitle);
        author = findViewById(R.id.textViewSubjectDetailAuthor);
        detail = findViewById(R.id.textViewSubjectDetail);
        link = findViewById(R.id.textViewSubjectDetailLink);
        detail.setMovementMethod(new ScrollingMovementMethod());
        link.setLinksClickable(true);

        Intent intent = getIntent();
        String subjectTitle = intent.getStringExtra("subjectDetailTitle");
        String subjectAuthor = intent.getStringExtra("subjectDetailAuthor");
        String subjectDetail = intent.getStringExtra("subjectDetail");
        String subjectDetailLink = intent.getStringExtra("subjectDetailLink");

        title.setText(subjectTitle);
        author.setText(subjectAuthor);
        detail.setText((subjectDetail));
        link.setText(subjectDetailLink);
    }
}
