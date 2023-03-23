
import java.util.ArrayList;

public class RegisterUser extends User {
    public ArrayList<Ticket> bookingHistory;

    public RegisterUser(String name) {
        super(name);
        this.bookingHistory = new ArrayList<>();
    }
    public void cancelTicket(Ticket ticket){

    } 
}