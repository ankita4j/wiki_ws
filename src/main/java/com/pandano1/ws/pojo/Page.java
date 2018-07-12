package com.pandano1.ws.pojo;

public class Page {
    String id;
    String content;
    String owner;
    String title;

    public String getId() {
        return id;
    }

    public Page setId(String id) {
        this.id = id;
        return this;
    }

    public String getContent() {
        return content;
    }

    public Page setContent(String content) {
        this.content = content;
        return this;
    }

    public String getOwner() {
        return owner;
    }

    public Page setOwner(String owner) {
        this.owner = owner;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public Page setTitle(String title) {
        this.title = title;
        return this;
    }

    @Override
    public String toString() {
        return "Page{" +
                "id='" + id + '\'' +
                ", content='" + content + '\'' +
                ", owner='" + owner + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}
