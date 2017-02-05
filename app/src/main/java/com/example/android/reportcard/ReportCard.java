package com.example.android.reportcard;

import java.util.ArrayList;

/**
 * Created by Will on 1/20/2017.
 */

public class ReportCard {
    private String mDate;
    private String mTime;

    private String mStudentName;
    private String mHomeroomTeacher;
    private int mGradeLevel;
    private String mTerm;
    private String mAddress;
    private String mPhone;

    private ArrayList<String> mClasses;
    private ArrayList<String> mTeachers;
    private ArrayList<String> mGrades;

    public ReportCard(String date, String Time, String studentName, String homeroomTeacher, int gradeLevel, String term, String address, String phone, ArrayList<String> classes, ArrayList<String> teachers, ArrayList<String> grades) {
        mDate = date;
        mTime = Time;

        mStudentName = studentName;
        mHomeroomTeacher = homeroomTeacher;
        mGradeLevel = gradeLevel;
        mTerm = term;
        mAddress = address;
        mPhone = phone;

        mClasses = classes;
        mTeachers = teachers;
        mGrades = grades;
    }

    public String getDate() {
        return mDate;
    }

    public String getTime() {
        return mTime;
    }

    public String getStudentName() {
        return mStudentName;
    }

    public String getHomeroomTeacher() {
        return mHomeroomTeacher;
    }

    public int getGradeLevel() {
        return mGradeLevel;
    }

    public String getTerm() {
        return mTerm;
    }

    public String getAddress() {
        return mAddress;
    }

    public String getPhone() {
        return mPhone;
    }

    public String getClass(String teacher) {
        return mClasses.get(mTeachers.indexOf(teacher));
    }

    public String getTeacher(String className) {
        return mTeachers.get(mClasses.indexOf(className));
    }

    public String getGrade(String className) {
        return mGrades.get(mClasses.indexOf(className));
    }

    public void setDate(String date) {
        mDate = date;
    }

    public void setTime(String time) {
        mTime = time;
    }

    public void setStudentName(String studentName) {
        mStudentName = studentName;
    }

    public void setHomeroomTeacher(String homeroomTeacher) {
        mHomeroomTeacher = homeroomTeacher;
    }

    public void setGradeLevel(int gradeLevel) {
        mGradeLevel =  gradeLevel;
    }

    public void setTerm(String term) {
        mTerm = term;
    }

    public void setAddress(String address) {
        mAddress = address;
    }

    public void setPhone(String phone) {
        mPhone = phone;
    }

    public void setClass(String teacher, String className) {
        mClasses.set(mTeachers.indexOf(teacher), className);
    }

    public void setTeacher(String className, String teacher) {
        mTeachers.set(mClasses.indexOf(className), teacher);
    }

    public void setGrade(String className, String grade) {
        mGrades.set(mClasses.indexOf(className), grade);
    }

    @Override
    public String toString() {
        String result = "";
        result += "Date: " + mDate + "\n";
        result += "Time: " + mTime + "\n";
        result += "\n";
        result += "\n";
        result += "Student Name: " + mStudentName + "\n";
        result += "Address: " + mAddress + "\n";
        result += "Homeroom Teacher: " + mHomeroomTeacher + "\n";
        result += "Grade: " + mGradeLevel + "\n";
        result += "Term: " + mTerm + "\n";
        result += "Address: " + mAddress + "\n";
        result += "Phone: " + mPhone + "\n";
        result += "\n";
        result += "\n";
        result += "Class\tTeacher\tGrade\n";

        for (int i = 0; i < mClasses.size(); i++) {
            result += mClasses.get(i) + "\t";
            result += mTeachers.get(i) + "\t";
            result += mGrades.get(i) + "\n";
        }

        return result;
    }
}
