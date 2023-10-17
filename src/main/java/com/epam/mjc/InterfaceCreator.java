package com.epam.mjc;

import java.util.ArrayList;
import java.util.List;

public class InterfaceCreator {

    public Operation<Integer> divideBy(Integer divider) {
        return list -> {
            List<Integer> result = new ArrayList<>();
            list.forEach(x -> result.add(x / divider));
            return result;
        };
    }
}
