package com.example.lib;

import java.util.Random;

public class MyClass {
    static String j[]={"Girl: You would be a good dancer except for two things. \n" +
            "Boy: What are the two things? \n" +
            "Girl: Your feet.",
            "A family of mice were surprised by a big cat. Father Mouse jumped and and said, "+"Bow-wow!"+" The cat ran away. "+"What was that, Father?" +"asked Baby Mouse. "+"Well, son, that's why it's important to learn a second language.",
            "My friend said he knew a man with a wooden leg named Smith. \n" +
            "So I asked him \"What was the name of his other leg?\"\n",
            "Two goldfish in a bowl talking: \n" + "Goldfish 1: Do you believe in God? \n" +
            "Goldfish 2: Of course, I do! Who do you think changes the water?"};
    public static String randomJokes() {
        int length = j.length;
        String selected_random_jokes = (j[new Random().nextInt(length)]);
        return selected_random_jokes;
    }
}
