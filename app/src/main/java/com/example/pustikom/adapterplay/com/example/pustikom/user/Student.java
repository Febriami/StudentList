package com.example.pustikom.adapterplay.com.example.pustikom.user;

/**
 * Created by pustikom on 07/10/16.
 */

public class Student {
    private int id;
    private String noreg;
    private String name;
    private String phone;
    private String mail;

    public Student(int id, String noreg, String name, String phone, String mail){
        this.id=id;
        this.noreg=noreg;
        this.name=name;
        this.phone=phone;
        this.mail=mail;
    }

	public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
	
    public String getNoreg() {
        return noreg;
    }

    public void setNoreg(String noreg) {
        this.noreg = noreg;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
	
	    public static ArrayList<Student> getStudent(){
        ArrayList<Student> studentList=new ArrayList<>();
        studentList.add(new Student(1, "3145136192", "Ummu", "amalinaghina@gmail.com", "098786785678"));
        studentList.add(new Student(2, "3145136204", "Dinda", "dinda.kharisma@gmail.com", "098908979909"));
        studentList.add(new Student(3, "3145136188", "Tri", "trifebriana@gmail.com", "097987867879"));

        return studentList;
    }
}
