package com.example.owner.myunist_info;

/**
 * Created by mintaewon on 2015. 7. 30..
 */
public class SubjectListItem {
    public String subject_name;
    public String subject_contents;
    public String track;
    public SubjectListItem(String subject_name, String subject_contents,String track){
        this.subject_name=subject_name;
        this.subject_contents=subject_contents;
        this.track=track;
    }
}
