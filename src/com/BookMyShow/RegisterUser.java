package com.BookMyShow;
import java.util.ArrayList;


public class RegisterUser extends User {
    public ArrayList<Ticket> bookingHistory;

    public RegisterUser(String userName) {
        super(userName);
        this.bookingHistory = new ArrayList<>();
    }
   public void cancelTicket(Ticket ticket){

    } 
}