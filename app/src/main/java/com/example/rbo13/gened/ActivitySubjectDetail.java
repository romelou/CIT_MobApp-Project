package com.example.rbo13.gened;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import models.President;
import models.Subject;

public class ActivitySubjectDetail extends AppCompatActivity {

    private TextView title, author, detail, link, president, information;

    private List<President> presidentList;

    ListView listView;
    ScrollView scrollView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subject_detail);

        presidentList = new ArrayList<>();

        listView = findViewById(R.id.listView);


        title = findViewById(R.id.txtSubject);
        author = findViewById(R.id.txtAuthor);
        detail = findViewById(R.id.txtDetail);
        link = findViewById(R.id.txtRefLink);

        information = findViewById(R.id.information);

        link.setMovementMethod(LinkMovementMethod.getInstance());

        Intent intent = getIntent();
        String subjectTitle = intent.getStringExtra("subjectDetailTitle");
        String subjectAuthor = intent.getStringExtra("subjectDetailAuthor");
        String subjectDetail = intent.getStringExtra("subjectDetail");
        String subjectDetailLink = intent.getStringExtra("subjectDetailLink");
        boolean hasInfo = intent.getBooleanExtra("hasInfo", false);

        detail.setText((subjectDetail));
        title.setText(subjectTitle);
        author.setText(subjectAuthor);
        detail.setText((subjectDetail));

        if ( hasInfo ) {
            information.setVisibility(View.VISIBLE);

            //adding some values to our list
            presidentList.add(new President(R.drawable.aguinaldo, "Emilio Aguinaldo", "(1899 - 1901)"));
            presidentList.add(new President(R.drawable.quezon, "Emilio Aguinaldo", "(1899 - 1901)"));
            presidentList.add(new President(R.drawable.laurel, "Emilio Aguinaldo", "(1899 - 1901)"));
            presidentList.add(new President(R.drawable.osmena, "Emilio Aguinaldo", "(1899 - 1901)"));
            presidentList.add(new President(R.drawable.roxas, "Emilio Aguinaldo", "(1899 - 1901)"));
            presidentList.add(new President(R.drawable.quirino, "Emilio Aguinaldo", "(1899 - 1901)"));

            //creating the adapter
            MyListAdapter adapter = new MyListAdapter(this, R.layout.custom_list, presidentList);

            //attaching adapter to the listview
            listView.setAdapter(adapter);
        }


        if (subjectDetailLink.equals("")) {
            link.setText("No reference link provided");
        } else {
            link.setText(subjectDetailLink);
        }



//        //adding some values to our list
//        presidentList.add(new President(R.drawable.aguinaldo, "Emilio Aguinaldo", "(1899 - 1901)"));
//        presidentList.add(new President(R.drawable.quezon, "Emilio Aguinaldo", "(1899 - 1901)"));
//        presidentList.add(new President(R.drawable.laurel, "Emilio Aguinaldo", "(1899 - 1901)"));
//        presidentList.add(new President(R.drawable.osmena, "Emilio Aguinaldo", "(1899 - 1901)"));
//        presidentList.add(new President(R.drawable.roxas, "Emilio Aguinaldo", "(1899 - 1901)"));
//        presidentList.add(new President(R.drawable.quirino, "Emilio Aguinaldo", "(1899 - 1901)"));
//
//        //creating the adapter
//        MyListAdapter adapter = new MyListAdapter(this, R.layout.custom_list, presidentList);
//
//        //attaching adapter to the listview
//        listView.setAdapter(adapter);


//        title = findViewById(R.id.textViewSubjectDetailTitle);
//        author = findViewById(R.id.textViewSubjectDetailAuthor);
//        detail = findViewById(R.id.textViewSubjectDetail);
//        link = findViewById(R.id.textViewSubjectDetailLink);
//        detail.setMovementMethod(new ScrollingMovementMethod());
//        link.setMovementMethod(LinkMovementMethod.getInstance());
//
//        Intent intent = getIntent();
//        String subjectTitle = intent.getStringExtra("subjectDetailTitle");
//        String subjectAuthor = intent.getStringExtra("subjectDetailAuthor");
//        String subjectDetail = intent.getStringExtra("subjectDetail");
//        String subjectDetailLink = intent.getStringExtra("subjectDetailLink");
//
//        title.setText(subjectTitle);
//        author.setText(subjectAuthor);
//        detail.setText((subjectDetail));
//
//        if (subjectDetailLink.equals("")) {
//            link.setText("No reference link provided");
//        } else {
//            link.setText(subjectDetailLink);
//        }

    }
}
