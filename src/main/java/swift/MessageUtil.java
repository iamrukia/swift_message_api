package swift;

import com.prowidesoftware.swift.model.field.*;
import com.prowidesoftware.swift.model.mt.mt1xx.MT103;

import java.util.Calendar;

public class MessageUtil {
    public String getMT103(){
        final MT103 mt103 = new MT103();
        mt103.setSender("LUKEJAKEAXXX");
        mt103.setReceiver("LUKEJAKEXXXX");


        mt103.addField(new Field20("reference"));
        mt103.addField(new Field23B("CRED"));

        Field32A field32A = new Field32A()
                .setDate(Calendar.getInstance())
                .setCurrency("EUR")
                .setAmount("1234567,89");
        mt103.addField(field32A);

        Field50A field50A = new Field50A()
                .setAccount("31324485")
                .setBIC("LUKEJAKEXXXX");
        mt103.addField(field50A);

        Field59 field59 = new Field59()
                .setAccount("31324485")
                .setNameAndAddress("Jake London");
        mt103.addField(field59);

        mt103.addField(new Field71A("OUR"));

        System.out.println(mt103.message());
        return  mt103.message();
    }
}
