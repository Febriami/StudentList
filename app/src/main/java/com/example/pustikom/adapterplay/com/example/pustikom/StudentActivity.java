package com.example.pustikom.adapterplay;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.example.pustikom.adapterplay.com.example.pustikom.adapter.StudentArrayAdapter;
import com.example.pustikom.adapterplay.com.example.pustikom.user.Student;

import java.util.ArrayList;

/**
 * Created by pustikom on 07/10/16.
 */

public class StudentActivity extends AppCompatActivity {
	private StudentArrayAdapter studentArrayAdapter;
	private list_view;
	private TextView emptyTexView;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view);

        //ArrayList<Student> students = populateStudentDummies();
        StudentArrayAdapter studentArrayAdapter = new StudentArrayAdapter(this,students);
        List_Item = (ListView) findViewById(R.id.list_item);
        List_Item.setAdapter(studentArrayAdapter);
		emptyTexView = (TextView) findViewById(R.Id.empty_view);
		List_Item .setEmptyView(emptyTexView);
		floatingActionButton addButton = (FloatingActionButton) findViewById(R.id.addButton);
		addButton.setOnClikListener(new View.OnClikListener(){
		 @Override
            public void onClick(View view) {
                Intent intent = new Intent(StudentActivity.this,AddStudentActivity.class);
                startActivity(intent);
            }
		});
    }

    private ArrayList<Student> populateStudentDummies(){
        ArrayList<Student> studentList = new ArrayList<Student>();
        studentList.add(new Student(1,"3145136188","TRI FEBRIANA SIAMI","0858xxxxxx","tri@mhs.unj.ac.id"));
        studentList.add(new Student(2,"3145136192","Ummu Kultsum","0813xxxxxx","ummu@mhs.unj.ac.id"));
        return studentList;
    }
	
	public boolean onOptionsItemSelected(MenuItem item) {
    // Handle item selection
    switch (item.getItemId()) {
        case R.id.new_Id:
            newId();
            return true;
        case R.id.:
            show();
            return true;
        default:
            return super.onOptionsItemSelected(item);
    }
}
