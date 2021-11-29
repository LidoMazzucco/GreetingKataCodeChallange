package com.signavio.solution;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GreetingKataTest {

    @Test
        public void greet_bob_returnHelloBob(){

        String name = "Bob";
        Assertions.assertEquals("Hello, Bob.", GreetingKata.greet(name));
    }

}
