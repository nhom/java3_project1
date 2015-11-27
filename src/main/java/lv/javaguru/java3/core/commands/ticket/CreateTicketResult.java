package lv.javaguru.java3.core.commands.ticket;

import lv.javaguru.java3.core.commands.DomainCommandResult;
import lv.javaguru.java3.core.domain.Ticket;

/**
 * Created by User on 10.11.2015..
 */
public class CreateTicketResult implements DomainCommandResult{

    private Ticket ticket;

    public CreateTicketResult(Ticket ticket) {
        this.ticket = ticket;
    }

    public Ticket getTicket() {
        return ticket;
    }
}
