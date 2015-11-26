package lv.javaguru.java3.core.database.user.contact;

import lv.javaguru.java3.core.database.CRUDOperationDAOImpl;
import lv.javaguru.java3.core.domain.Contact;
import org.springframework.stereotype.Component;

/**
 * Created by Edgar on 09-Nov-15.
 */
@Component
public class ContactDAOImpl extends CRUDOperationDAOImpl<Contact, Long> implements ContactDAO {

}
