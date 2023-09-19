package koschei;

import koschei.models.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;

@Component
public class KoscheiTheDeathless {

    private Ocean1 ocean;

    public String getRulesByDeth() {
        return "На свете есть океан , " + ocean.toString();
    }

    @Autowired
    public void setOcean(Ocean1 ocean) {
        this.ocean = ocean;
    }
}