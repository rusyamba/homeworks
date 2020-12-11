package com.company;

import java.time.LocalDate;

public class Group {
    Student[] student;
    int course;
    String date;
    String duration;

    public Group(Student[] student, int course, String date,String duration) {
        this.student = student;
        this.course = course;
        this.date = date;
        this.duration = duration;
    }

    public Student[] getStudent() {
        return student;
    }

    public void setStudent(Student[] student) {
        this.student = student;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }
}
