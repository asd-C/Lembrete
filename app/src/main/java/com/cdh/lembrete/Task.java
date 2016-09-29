package com.cdh.lembrete;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by chendehua on 16/9/28.
 */

public class Task {
    private String name;
    private String date;
    private List<String> tags;
    private String description;
    private String dateCreate;

    public Task(String name, String date) {
        this.name = name;
        this.date = date;
        tags = new ArrayList<>();
    }

    public Task(String name, String date, String[] tags) {
        this(name, date, Arrays.asList(tags));
    }

    public Task(String name, String date, List<String> tags) {
        this.name = name;
        this.date = date;
        this.tags = tags;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public List<String> getTags() {
        return tags;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDateCreate() {
        return dateCreate;
    }

    public void setDateCreate(String dateCreate) {
        this.dateCreate = dateCreate;
    }

    public String getTagsString() {
        String r = "";
        for (String s: tags) r += (s + " ");
        return r;
    }

    public void setTags(ArrayList<String> tags) {
        this.tags = tags;
    }
}
