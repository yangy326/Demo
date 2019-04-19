package com.example.yangyang.demo.TestData;

public class Student {

    private String name;

    private int id;

    private String teachername;

    private int classid;

    private int iscontact;

    private String contacttime;


    public Student(String name, int id, String teachername, int classid, int iscontact, String contacttime) {
        this.name = name;
        this.id = id;
        this.teachername = teachername;
        this.classid = classid;
        this.iscontact = iscontact;
        this.contacttime = contacttime;
    }

    public int getIscontact() {
        return iscontact;
    }

    public void setIscontact(int iscontact) {
        this.iscontact = iscontact;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTeachername() {
        return teachername;
    }

    public void setTeachername(String teachername) {
        this.teachername = teachername;
    }

    public int getClassid() {
        return classid;
    }

    public void setClassid(int classid) {
        this.classid = classid;
    }



    public String getContacttime() {
        return contacttime;
    }

    public void setContacttime(String contacttime) {
        this.contacttime = contacttime;
    }
}
