package lv.javaguru.java3.core.database.event;

import lv.javaguru.java3.core.database.CRUDOperationDAOImpl;
import lv.javaguru.java3.core.domain.Event;
import org.springframework.stereotype.Component;

@Component
class EventDAOImpl extends CRUDOperationDAOImpl<Event, Long> implements EventDAO {

}
