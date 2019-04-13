package com.ajordon.rest.webservices.restfulwebservices.helloworld;

public class HelloWorldBean {
    private String message;

    public HelloWorldBean(String message) {
        this.message = message;
    }
    //cannot return without getter
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "HelloWorldBean{" + "message='" + message + '\'' + '}';
    }
}
