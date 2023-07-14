package com.neu.edu.vo;

import javax.xml.crypto.Data;

/**
 * <pre>
 *
 * </pre>
 *
 * @author <a href="https://github.com/HCDUO">HCDUO</a>
 * @date:2023/7/13 15:54
 */
public class ExamScheduleVO {
    private String exam_name;
    private int teacher_id;
    private String room;
    private Data start_time;
    private Data end_time;
    public String getExam_name() {
        return exam_name;
    }
    public void setExam_name(String exam_name) {
        this.exam_name = exam_name;
    }

    public int getTeacher_id() {
        return teacher_id;
    }

    public void setTeacher_id(int teacher_id) {
        this.teacher_id = teacher_id;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public Data getStart_time() {
        return start_time;
    }

    public void setStart_time(Data start_time) {
        this.start_time = start_time;
    }

    public Data getEnd_time() {
        return end_time;
    }

    public void setEnd_time(Data end_time) {
        this.end_time = end_time;
    }
}
