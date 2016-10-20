package com.example.pustikom.adapterplay.com.example.pustikom.user;

/**
 * Created by pustikom on 07/10/16.
 */

public class Teacher {
    private int id;
    private String nip;
    private String name;
    private String phone;
    private String mail;

    public Teacher(int id, String nip, String name, String phone, String mail) {
        this.id=id;
        this.nip=nip;
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

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
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
	
	public static ArrayList<Teacher> getTeacher(){
        ArrayList<Teacher> teacherList=new ArrayList<>();
        teacherList.add(new Teacher(1, "1111111111", "Rudi", "098786785678", "Rudy@gmail.com"));
        teacherList.add(new Teacher(2, "2222222222", "Enda", "098908979909", "Enda@gmail.com"));
        teacherList.add(new Teacher(3, "3333333333", "Elis", "097987867879", "Elis@gmail.com"));

        return teacherList;
    }
}
