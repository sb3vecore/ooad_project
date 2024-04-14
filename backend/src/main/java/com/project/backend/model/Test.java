package com.project.backend.model;

import java.util.*;

public class Test {
    String teacherId;
    String subject;
    String difficulty;
    String startDateTime;
    String endDateTime;
    String description;
    Boolean accepted;
    ArrayList<Question> questionList;

    public Test(String teacherId, String subject, String difficulty, String startDateTime, String endDateTime, String description, boolean accepted, ArrayList<Question> questionList) {
        this.teacherId = teacherId;
        this.subject = subject;
        this.difficulty = difficulty;
        this.startDateTime = startDateTime;
        this.endDateTime = endDateTime;
        this.description = description;
        this.accepted = accepted;
        this.questionList = questionList;
    }

    String getTeacherId() {
        return this.teacherId;
    }

    String getSubject() {
        return this.subject;
    }

    String getDifficulty() {
        return this.difficulty;
    }

    String getStartDateTime() {
        return this.startDateTime;
    }

    String getEndDateTime() {
        return this.endDateTime;
    }

    String getDescription() {
        return this.description;
    }

    boolean getAccepted() {
        return this.accepted;
    }

    ArrayList<Question> getQuestionList() {
        return this.questionList;
    }

    void setAccepted(Boolean accepted) {
        this.accepted = accepted;
    }
}