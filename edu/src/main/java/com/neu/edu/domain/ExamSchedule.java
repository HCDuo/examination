package com.neu.edu.domain;

import javax.xml.crypto.Data;

/**
 * <pre>
 *
 * </pre>
 *
 * @author <a href="https://github.com/HCDUO">HCDUO</a>
 * @date:2023/7/13 15:29
 */
public class ExamSchedule {
    private String name;
    private int TeacherId;
    private String room;
    private Data StartTime;
    private Data EndTime;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTeacherId() {
        return TeacherId;
    }

    public void setTeacherId(int teacherId) {
        TeacherId = teacherId;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public Data getStartTime() {
        return StartTime;
    }

    public void setStartTime(Data startTime) {
        StartTime = startTime;
    }

    public Data getEndTime() {
        return EndTime;
    }

    public void setEndTime(Data endTime) {
        EndTime = endTime;
    }
}
