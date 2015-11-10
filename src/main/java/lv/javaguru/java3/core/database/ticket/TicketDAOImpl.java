package lv.javaguru.java3.core.database.ticket;

import lv.javaguru.java3.core.database.CRUDOperationDAOImpl;
import lv.javaguru.java3.core.domain.Ticket;
import org.springframework.stereotype.Component;

/**
 * Created by User on 10.11.2015..
 */
@Component
class TicketDAOImpl extends CRUDOperationDAOImpl<Ticket, Long> implements TicketDAO {
}
