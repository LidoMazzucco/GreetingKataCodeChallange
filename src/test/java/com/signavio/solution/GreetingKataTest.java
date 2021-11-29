package com.signavio.solution;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GreetingKataTest {

    @Test
        public void greet_bob_returnHelloBob(){

        String name = "Bob";
        Assertions.assertEquals("Hello, Bob.", GreetingKata.greet(name));
    }

    @Test
    public void greet_null_returnHelloMyFriend(){

        String name = null;
        Assertions.assertEquals("Hello, my friend.", GreetingKata.greet(name));
    }

    @Test
    public void greet_allUpperCase_returnHELLO(){

        String name = "BOB";
        Assertions.assertEquals("HELLO BOB!", GreetingKata.greet(name));
    }

    @Test
    public void greet_twoNames_returnHelloToBoth(){

        String[] names = {"Bob", "Jane"};
        Assertions.assertEquals("Hello, Bob and Jane.", GreetingKata.greet(names));
    }

    @Test
    public void greet_multiplesNames_returnHelloToAll(){

        String[] names = {"Bob", "Jane", "Mark", "Lisa"};
        Assertions.assertEquals("Hello, Bob, Jane, Mark and Lisa.", GreetingKata.greet(names));
    }

    @Test
    public void greet_mixedMultiplesNames_returnHelloToAllSeparately(){

        String[] names = {"Bob", "JANE", "Mark", "LISA", "Natalie", "OTTO"};
        Assertions.assertEquals("Hello, Bob, Mark and Natalie. AND HELLO JANE, LISA AND OTTO!", GreetingKata.greet(names));
    }

}
