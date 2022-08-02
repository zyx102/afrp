package com.afrp.api;

import com.afrp.api.in.TranCheckIn;
import com.afrp.api.out.TranCheckOut;

public interface TranCheckService {

    TranCheckOut checkRule(TranCheckIn tranCheckIn);

}
