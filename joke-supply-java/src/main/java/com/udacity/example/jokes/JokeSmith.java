package com.udacity.example.jokes;

import java.lang.String;

public class JokeSmith {
	String[] jokes = {
		"Scientists have discovered a food that diminishes a woman's sex drive by 90%. It's called a wedding cake.",
		"Why isn't the turkey hungry at Thanksgiving? Because he's already stuffed!",
		"What happens to a frog's car when it breaks down? It gets toad away.",
		"School is like a boner. It's long and hard unless you're Asian.",
		"A husband and wife are trying to set up a new password for their computer. The husband puts, \"Mypenis,\" and the wife falls on the ground laughing because on the screen it says, \"Error. Not long enough.\"",
		"Wife: \"I look fat. Can you give me a compliment?\" Husband: \"You have perfect eyesight.\"",
		"The energizer bunny was arrested on a charge of battery.",
		"I had a broken vacuum, then I put a One Direction sticker on it and it suddenly sucked again."
	};

    public String tellAHandCraftedJoke(){
        return jokes[(int) (Math.random() * 7)];
    }
}

