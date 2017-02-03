package com.cool.movie.model;

/**
 * @author Sophie Song
 * @since 2017/2/3
 */
//这是一个Model, Model是用来定义数据结构的, 这个Model简单定义了一个叫Greeting的数据结构, 这个数据结构有id, 有content, 同时还有get和set方法
public class Greeting {
    private final long id;
    private final String content;

    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
