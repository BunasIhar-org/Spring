package koschei.models;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;

@Component
public class Ocean1 {

    private final Island2 island;

    @Autowired
    public Ocean1(Island2 island) {
        this.island = island;
    }

    @Override
    public String toString() {
        return "на океане остров " + island.toString();
    }
}