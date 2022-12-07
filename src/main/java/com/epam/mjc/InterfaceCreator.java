package com.epam.mjc;

import java.util.ArrayList;
import java.util.List;

public class InterfaceCreator {

    public Operation<Integer> divideBy(Integer divider) {
        Operation<Integer> op = (List<Integer> arg) -> {
            List<Integer> l = new ArrayList<>();
            for (Integer i : arg) {
                l.add(i / divider);
            }
            return l;
        };
        return op;
    }
}
