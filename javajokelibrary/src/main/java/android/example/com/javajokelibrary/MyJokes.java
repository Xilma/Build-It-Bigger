package android.example.com.javajokelibrary;

import java.util.Random;

public class MyJokes {
    private String jokes[]={
            "How do you keep a wild elephant from charging?\nTake away his credit card.",
            "What kind of pet makes the loudest noise? \n The alpha-pet",
            "Why did the computer geek sell his cat? \n He was afraid it would eat his mouse.",
            "What do computer geeks eat for dessert? \n Apple pie a la modem.",
            "Did you hear about the geek who almost drowned? \n He was surfing the Web and got bumped off.",
            "The Diest Virus: \n The computer quits after just one byte",
            "Of course I know how to copy disks ... Where's the Xerox machine?",
            "If at first you don't succeed ... call it version 1.0",
            "Teacher: You need to study harder, Alex. Why, when I was your age, I could recite all the presidents' names by heart." +
                    "\n Alex: Yeah, but there were only two or three back then",
            "Teacher: Give me a sentence using the word gladiator." +
                    "\n Alex: The lion ate my bossy Aunt Mimi, and I'm glad he ate her!",
            "Teacher: Can you use the word 'fascinate' in a sentence?\n Alex:" +
                    " Yeah. My jacket has ten buttons, but I can only fasten eight.",
            "Mother: Your teacher tells me you're at the bottom of the class. \n Angie: " +
                    "Yeah, but they teach the same thing at both ends.",
            "What's the hardest thing about falling out of bed? \n The floor.",
            "What did the princess say while she waited for her photos to come back from the store? \n" +
                    "'Some day my prints will come!'",
            "Terry: Why is the Mississippi River so rich? \n Nick: " +
                    "Because it has two banks and it makes deposits all day long",
            "Karl: Boy, am I mad at my brother! \n Trent: What did he do? \n Karl: I let him ride my new " +
                    "bicycle, and I told him to treat it as if it were his own. \n Trent: So? \n Karl: " +
                    "He sold it.",
            "What's the hottest day of the week? \n Fry day",
            "Why are astronauts always so clean? \n Because they take meteor showers",
            "Which tastes better, a comet or an asteroid? \n An asteroid, because it's meteor",
            "What is at the center of Jupiter? \n The letter 'i'.",
            "Why couldn't the astronauts land on the moon? \n Because it was full.",
            "Scientist: Your mission is to land on the Sun. \n Astronaut: Are you nuts? I'll burn up!" +
                    "\n Scientist: That's why you're going at night.",
            "What do you call the first man who discovered fire? \n Toast",
            "How do you keep a rooster from crowing on Sunday morning? \n Make rooster stew Saturday night.",
            "First Fisher: Is this a good lake for fish? \n Second Fisher: It must be. I can't get any of them to come out.",

    };

    public String getJoke(){
        int joke = new Random().nextInt(jokes.length);
        return jokes[joke];
    }
}
