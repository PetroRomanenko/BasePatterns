package com.ferros.basepatterns.behavioral.mediator.MyVariant;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ChatRoomImpl implements ChatRoom{
    DateFormat dateFormat = new SimpleDateFormat("E dd-MM-yyyy hh:mm:ss a");
    Date date = new Date();
    @Override
    public void showMessage(String msg, User p) {

        System.out.println(p.getName()+"'gets message: "+msg);
        System.out.println("\t\t\t\t"+"["+dateFormat.format(date).toString()+"]");
    }
}
