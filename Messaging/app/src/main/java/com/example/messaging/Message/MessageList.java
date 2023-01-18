package com.example.messaging.Message;

public class MessageList {
    private String name,mobile,lastMessage,pfpic;
    private int unseenMessage;

    public MessageList(String name, String mobile, String lastMessage, String pfpic,int unseenMessage) {
        this.name = name;
        this.mobile = mobile;
        this.lastMessage = lastMessage;
        this.unseenMessage = unseenMessage;
        this.pfpic = pfpic;
    }

    public String getName() {
        return name;
    }

    public String getMobile() {
        return mobile;
    }

    public String getLastMessage() {
        return lastMessage;
    }

    public int getUnseenMessage() {
        return unseenMessage;
    }

    public String getPfpic() {
        return pfpic;
    }
}
