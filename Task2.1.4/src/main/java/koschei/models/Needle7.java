package koschei.models;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;

@Component
public class Needle7 {

    @Autowired
    private Deth8 deth8;


    @Override
    public String toString() {
        return ", смерть Кощея на игле :(" + deth8.toString();
    }
}