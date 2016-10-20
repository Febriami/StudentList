package com.example.pustikom.adapterplay.com.example.pustikom.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.pustikom.adapterplay.R;
import com.example.pustikom.adapterplay.com.example.pustikom.user.Student;

import org.w3c.dom.Text;

import java.util.ArrayList;

/**
 * Created by pustikom on 07/10/16.
 */

public class TeacherArrayAdapter extends ArrayAdapter<Student> {

    public TeacherArrayAdapter(Context context, ArrayList<Teacher> teacherArrayList) {
        super(context, 0, teacherArrayList);
    }

    public View getView(int position, View view, ViewGroup parent){
        Teacher teacher = getItem(position);
        if(view==null){
            view= LayoutInflater.from(getContext()).inflate(R.layout.teacher_instance,parent,false);
        }

        TextView idView = (TextView) view.findViewById(R.id.teacher_id);
        TextView nipView = (TextView) view.findViewById(R.id.teacher_nip);
        TextView nameView = (TextView) view.findViewById(R.id.teacher_name);
		TextView phoneView = (TextView) view.findViewById(R.id.teacher_phone);
        TextView mailView = (TextView) view.findViewById(R.id.teacher_email);


        //set content
        idView.setText(teacher.getId() + "");
        nipView.setText(teacher.getNIP());
        nameView.setText(teacher.getName());
		phoneView.setText(teacher.getPhone());
        mailView.setText(teacher.getMail());
        return view;
    }
}
