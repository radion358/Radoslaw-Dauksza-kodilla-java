package com.kodilla.rsp;

import java.util.List;
import java.util.Random;

class RandomMoveGenerator {

    static String generateMove(List<String> moves) {

        Random randomInt = new Random();


        return  moves.get(randomInt.nextInt(moves.size()));
    }
}
