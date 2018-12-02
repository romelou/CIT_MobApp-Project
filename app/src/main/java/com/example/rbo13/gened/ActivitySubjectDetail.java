package com.example.rbo13.gened;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import models.President;

public class ActivitySubjectDetail extends AppCompatActivity {

    private TextView title, author, detail, link, information;

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
            presidentList.add(new President(R.drawable.quezon, "Manuel L. Quezon", "(1935 - 1944)"));
            presidentList.add(new President(R.drawable.laurel, "Jose P. Laurel", "(1899 - 1901)"));
            presidentList.add(new President(R.drawable.osmena, "Emilio Aguinaldo", "(1899 - 1901)"));
            presidentList.add(new President(R.drawable.roxas, "Emilio Aguinaldo", "(1899 - 1901)"));
            presidentList.add(new President(R.drawable.quirino, "Emilio Aguinaldo", "(1899 - 1901)"));
            presidentList.add(new President(R.drawable.magsaysay, "Emilio Aguinaldo", "(1899 - 1901)"));
            presidentList.add(new President(R.drawable.garcia, "Emilio Aguinaldo", "(1899 - 1901)"));
            presidentList.add(new President(R.drawable.macapagal, "Emilio Aguinaldo", "(1899 - 1901)"));
            presidentList.add(new President(R.drawable.marcos, "Emilio Aguinaldo", "(1899 - 1901)"));
            presidentList.add(new President(R.drawable.aquino, "Emilio Aguinaldo", "(1899 - 1901)"));
            presidentList.add(new President(R.drawable.ramos, "Emilio Aguinaldo", "(1899 - 1901)"));
            presidentList.add(new President(R.drawable.estrada, "Emilio Aguinaldo", "(1899 - 1901)"));
            presidentList.add(new President(R.drawable.arroyo, "Emilio Aguinaldo", "(1899 - 1901)"));
            presidentList.add(new President(R.drawable.pnoy, "Emilio Aguinaldo", "(1899 - 1901)"));
            presidentList.add(new President(R.drawable.pduts, "Emilio Aguinaldo", "(1899 - 1901)"));

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

    }
}
