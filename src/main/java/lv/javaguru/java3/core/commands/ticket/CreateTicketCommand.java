package lv.javaguru.java3.core.commands.ticket;

import lv.javaguru.java3.core.commands.DomainCommand;
import lv.javaguru.java3.core.domain.Event;
import lv.javaguru.java3.core.domain.Profile;

import java.util.Date;

/**
 * Created by User on 10.11.2015..
 */
public class CreateTicketCommand implements DomainCommand<CreateTicketResult> {

    private int price;
    private Date date;
    private Event event;
    private Profile participant;

    public CreateTicketCommand(int price, Date date, Event event, Profile participant) {
        this.price = price;
        this.date = date;
        this.event = event;
        this.participant = participant;
    }

    public int getPrice() {
        return price;
    }

    public Date getDate() {
        return date;
    }

    public Event getEvent() {
        return event;
    }

    public Profile getParticipant() {
        return participant;
    }
}
