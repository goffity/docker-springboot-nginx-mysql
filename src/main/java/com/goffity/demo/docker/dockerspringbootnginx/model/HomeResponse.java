package com.goffity.demo.docker.dockerspringbootnginx.model;

public class HomeResponse {
    private int statusCode;
    private String status;
    private String message;
    private String displayMessage;
    private String detail;

    public HomeResponse(int statusCode, String status, String message, String displayMessage, String detail) {
        this.statusCode = statusCode;
        this.status = status;
        this.message = message;
        this.displayMessage = displayMessage;
        this.detail = detail;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getDisplayMessage() {
        return displayMessage;
    }

    public void setDisplayMessage(String displayMessage) {
        this.displayMessage = displayMessage;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }
}
