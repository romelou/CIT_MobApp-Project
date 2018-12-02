package com.example.rbo13.gened;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

import models.Subject;

public class SubjectsAdapter extends RecyclerView.Adapter<SubjectsAdapter.SubjectViewHolder> {

    //this context we will use to inflate the layout
    private Context mCtx;

    //we are storing all the products in a list
    private List<Subject> subjectList;

    //getting the context and subject list with constructor
    public SubjectsAdapter(Context mCtx, List<Subject> subjectList) {
        this.mCtx = mCtx;
        this.subjectList = subjectList;
    }

    @Override
    public SubjectViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //inflating and returning our view holder
        LayoutInflater inflater = LayoutInflater.from(mCtx);
        View view = inflater.inflate(R.layout.layout_subjects, null);
        return new SubjectViewHolder(view);
    }

    @Override
    public void onBindViewHolder(SubjectViewHolder holder, int position) {
        //getting the product of the specified position
        final Subject subject = subjectList.get(position);

        //binding the data with the viewholder views
        holder.textViewSubjectTitle.setText(subject.getTitle());
        holder.textViewSubjectAuthor.setText(subject.getAuthor());
        holder.imageView.setImageDrawable(mCtx.getResources().getDrawable(subject.getImage()));

        holder.view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Context ctx = v.getContext();
                Intent subjectIntent = new Intent(ctx, ActivitySubjectDetail.class);

                subjectIntent.putExtra("subjectDetailTitle", subject.getTitle());
                subjectIntent.putExtra("subjectDetailAuthor", subject.getAuthor());
                subjectIntent.putExtra("subjectDetail", subject.getDetail());
                subjectIntent.putExtra("subjectDetailLink", subject.getReferenceLink());
                subjectIntent.putExtra("hasInfo", subject.isHasInfo());
                ctx.startActivity(subjectIntent);
            }
        });
    }


    @Override
    public int getItemCount() {
        return subjectList.size();
    }

    class SubjectViewHolder extends RecyclerView.ViewHolder {

        TextView textViewSubjectTitle, textViewSubjectAuthor;
        ImageView imageView;
        View view;

        public SubjectViewHolder(View itemView) {
            super(itemView);

            view = itemView;

            textViewSubjectTitle = itemView.findViewById(R.id.textViewSubjectTitle);
            textViewSubjectAuthor = itemView.findViewById(R.id.textViewSubjectAuthor);

            imageView = itemView.findViewById(R.id.imageView);
        }
    }
}
