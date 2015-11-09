package lv.javaguru.java3.core.domain;


import java.util.Date;

/**
 * Created by Edgar on 08-Nov-15.
 */
public class EventBuilder {

    private Long id;
    private String title;
    private String description;
    private Profile author;

    private EventBuilder() {

    }

    public static EventBuilder createEvent() {
        return new EventBuilder();
    }

    public Event build() {
        Event event = new Event();
        event.setId(id);
        event.setTitle(title);
        event.setDescription(description);
        event.setAuthor(author);
        event.setCreated(new Date());
        return event;
    }

    public EventBuilder withId(Long id) {
        this.id = id;
        return this;
    }

    public EventBuilder withTitle(String title){
        this.title = title;
        return this;
    }

    public EventBuilder withDescription(String description){
        this.description = description;
        return this;
    }

    public EventBuilder withAuthor(Profile author){
        this.author = author;
        return this;
    }
}
