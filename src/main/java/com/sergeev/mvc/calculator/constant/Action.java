package com.sergeev.mvc.calculator.constant;

public enum Action {

    MULTIPLICATION("*"),
    ADDITION("+"),
    SUBTRACTION("-"),
    DIVISION("/");

    private String action;

    Action(String action) {
        this.action = action;
    }

    public String getAction() {
        return action;
    }
}