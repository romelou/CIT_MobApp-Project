package com.example.rbo13.gened;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.ListView;
import android.widget.RelativeLayout;
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
    RelativeLayout relativeLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subject_detail);

        presidentList = new ArrayList<>();

        listView = findViewById(R.id.listView);
        relativeLayout = findViewById(R.id.relativeParentContainer);

        title = findViewById(R.id.txtSubject);
        author = findViewById(R.id.txtAuthor);
        detail = findViewById(R.id.txtDetail);
        link = findViewById(R.id.txtRefLink);

        information = findViewById(R.id.information);
        detail.setMovementMethod(new ScrollingMovementMethod());
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
//            scrollView.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT, 250));
//            detail.setLayoutParams(new RelativeLayout.LayoutParams());
//            detail.setLayoutParams(new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.MATCH_PARENT), 250);


            //adding some values to our list
            presidentList.add(new President(R.drawable.aguinaldo, "Emilio Aguinaldo", "(1899 - 1901)"));
            presidentList.add(new President(R.drawable.quezon, "Manuel L. Quezon", "(1935 - 1944)"));
            presidentList.add(new President(R.drawable.laurel, "Jose P. Laurel", "(1943 - 1945)"));
            presidentList.add(new President(R.drawable.osmena, "Sergio Osmeña", "(1944 - 1946)"));
            presidentList.add(new President(R.drawable.roxas, "Manuel Roxas", "(1946 - 1948)"));
            presidentList.add(new President(R.drawable.quirino, "Elpidio Quirino", "(1948 - 1953)"));
            presidentList.add(new President(R.drawable.magsaysay, "Ramon Magsaysay", "(1953 - 1957)"));
            presidentList.add(new President(R.drawable.garcia, "Carlos P. Garcia", "(1957 - 1961)"));
            presidentList.add(new President(R.drawable.macapagal, "Diosdado Macapagal", "(1961 - 1965)"));
            presidentList.add(new President(R.drawable.marcos, "Ferdinand E. Marcos", "(1965 - 1986)"));
            presidentList.add(new President(R.drawable.aquino, "Corazon C. Aquino", "(1986 - 1992)"));
            presidentList.add(new President(R.drawable.ramos, "Fidel V. Ramos", "(1992 - 1998)"));
            presidentList.add(new President(R.drawable.estrada, "Joseph Ejercito Estrada", "(1998 - 2001)"));
            presidentList.add(new President(R.drawable.arroyo, "Gloria Macapagal Arroyo", "(2001 - 2010)"));
            presidentList.add(new President(R.drawable.pnoy, "Benigno Aquino III", "(2010 - 2016)"));
            presidentList.add(new President(R.drawable.pduts, "Rodrigo Roa Duterte", "(2016 - Kasalukuyan)"));

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
