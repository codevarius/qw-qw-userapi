package org.qwep.qwuserapi.response;

import java.time.LocalDateTime;

public class SimplePingResponse {

    private LocalDateTime timeStamp;
    private String message;

    public SimplePingResponse(LocalDateTime timeStamp, String message) {
        this.timeStamp = timeStamp;
        this.message = message;
    }

    public SimplePingResponse() {
    }

    public LocalDateTime getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(LocalDateTime timeStamp) {
        this.timeStamp = timeStamp;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
