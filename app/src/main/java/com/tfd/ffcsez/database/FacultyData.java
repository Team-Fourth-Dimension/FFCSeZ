package com.tfd.ffcsez.database;

import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

import com.tfd.ffcsez.models.CourseData;

@Entity (tableName = "facultylist")
public class FacultyData {

    @PrimaryKey(autoGenerate = true)
    private int id;
    private String batch;
    private String c;
    private String classOption;
    private String courseCode;
    private String courseStatus;
    private String courseTitle;
    private String courseType;
    private String empName;
    private String empSchool;
    private String j;
    private String l;
    private String p;
    private String roomNumber;
    private String slot;
    private String t;
    private String time;

    // Constructors
    @Ignore
    public FacultyData(){

    }

    @Ignore
    public FacultyData(String batch, String c, String classOption,
                       String courseCode, String courseStatus, String courseTitle,
                       String courseType, String empName, String empSchool, String j, String l,
                       String p, String roomNumber, String slot, String t, String time) {
        this.batch = batch;
        this.c = c;
        this.classOption = classOption;
        this.courseCode = courseCode;
        this.courseStatus = courseStatus;
        this.courseTitle = courseTitle;
        this.courseType = courseType;
        this.empName = empName;
        this.empSchool = empSchool;
        this.j = j;
        this.l = l;
        this.p = p;
        this.roomNumber = roomNumber;
        this.slot = slot;
        this.t = t;
        this.time = time;
    }

    public FacultyData(int id, String batch, String c, String classOption,
                       String courseCode, String courseStatus, String courseTitle,
                       String courseType, String empName, String empSchool, String j, String l,
                       String p, String roomNumber, String slot, String t, String time) {
        this.id = id;
        this.batch = batch;
        this.c = c;
        this.classOption = classOption;
        this.courseCode = courseCode;
        this.courseStatus = courseStatus;
        this.courseTitle = courseTitle;
        this.courseType = courseType;
        this.empName = empName;
        this.empSchool = empSchool;
        this.j = j;
        this.l = l;
        this.p = p;
        this.roomNumber = roomNumber;
        this.slot = slot;
        this.t = t;
        this.time = time;
    }

    @Ignore
    public FacultyData(CourseData course) {
        this.batch = course.getBatch();
        this.c = course.getC();
        this.classOption = course.getClassOption();
        this.courseCode = course.getCourseCode();
        this.courseStatus = course.getCourseStatus();
        this.courseTitle = course.getCourseTitle();
        this.courseType = course.getCourseType();
        this.empName = course.getEmpName();
        this.empSchool = course.getEmpSchool();
        this.j = course.getJ();
        this.l = course.getL();
        this.p = course.getP();
        this.roomNumber = course.getRoomNumber();
        this.slot = course.getSlot();
        this.t = course.getT();
        this.time = course.getTime();
    }

    // Standard getters & setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public String getC() {
        return c;
    }

    public void setC(String c) {
        this.c = c;
    }

    public String getClassOption() {
        return classOption;
    }

    public void setClassOption(String classOption) {
        this.classOption = classOption;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getCourseStatus() {
        return courseStatus;
    }

    public void setCourseStatus(String courseStatus) {
        this.courseStatus = courseStatus;
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }

    public String getCourseType() {
        return courseType;
    }

    public void setCourseType(String courseType) {
        this.courseType = courseType;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpSchool() {
        return empSchool;
    }

    public void setEmpSchool(String empSchool) {
        this.empSchool = empSchool;
    }

    public String getJ() {
        return j;
    }

    public void setJ(String j) {
        this.j = j;
    }

    public String getL() {
        return l;
    }

    public void setL(String l) {
        this.l = l;
    }

    public String getP() {
        return p;
    }

    public void setP(String p) {
        this.p = p;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getSlot() {
        return slot;
    }

    public void setSlot(String slot) {
        this.slot = slot;
    }

    public String getT() {
        return t;
    }

    public void setT(String t) {
        this.t = t;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}