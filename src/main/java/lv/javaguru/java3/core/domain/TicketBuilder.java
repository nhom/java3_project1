package lv.javaguru.java3.core.domain;

/**
 * Created by Edgar on 10-Nov-15.
 */
public class TicketBuilder {

    private Long id;
    private int price;
    private Event event;

    public static TicketBuilder createTicket() {
        return new TicketBuilder();
    }

    public Ticket build() {
        Ticket ticket = new Ticket();
        ticket.setId(id);
        ticket.setPrice(price);
        ticket.setEvent(event);
        return ticket;
    }

    public TicketBuilder withId(Long id) {
        this.id = id;
        return this;
    }

    public TicketBuilder withPrice(int price) {
        this.price = price;
        return this;
    }

    public TicketBuilder withEvent(Event event){
        this.event = event;
        return this;
    }
}
