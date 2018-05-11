package com.sifu.sericefeign.service.impl;

import com.sifu.sericefeign.service.SchedualServiceHi;
import org.springframework.stereotype.Component;

/**
 * @author sifu
 * @version 1.0
 * @date 2018/5/12
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }
}
