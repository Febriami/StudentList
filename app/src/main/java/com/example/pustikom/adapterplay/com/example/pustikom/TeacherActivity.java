package com.example.pustikom.adapterplay;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by pustikom on 07/10/16.
 */

public class TeacherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.teacher_instance);
		
		
		//ArrayList<Student> students = populateStudentDummies();
        TeacherArrayAdapter teacherArrayAdapter = new StudentArrayAdapter(this,students);
        List_item = (ListView) findViewById(R.id.list_item);
        List_item.setAdapter(studentArrayAdapter);
		emptyTexView = (TextView) findViewById(R.Id.empty_view);
		List_Item .setEmptyView(emptyTexView);
		floatingActionButton addButton = (FloatingActionButton) findViewById(R.id.addButton);
		teacherView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TeacherActivity.this,AddTeacherActivity.class);
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
        case R.id.new_game:
            newGame();
            return true;
        case R.id.help:
            showHelp();
            return true;
        default:
            return super.onOptionsItemSelected(item);
    }
	}

}
