package koschei.models;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;

@Component
public class Wood3 {

    @Autowired
    private Rabbit4 rabbit;

    @Override
    public String toString() {
        return ", на дереве заяц " + rabbit.toString();
    }
}
