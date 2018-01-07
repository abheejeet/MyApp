package me.Tweet.Procedure;

import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;

public class ConfigBuilder {

	protected static TwitterFactory getConfiguration()
	{
		ConfigurationBuilder cb = new ConfigurationBuilder();
		cb.setDebugEnabled(true).setOAuthConsumerKey("dec5mz2610kp6blmbNnEAjgmi")
				.setOAuthConsumerSecret("O8eU6GgzhTPLqTn680sdLVN4at01Q8jtep7rRC7ywurELAlhWZ")
				.setOAuthAccessToken("2605425841-UBesP0Ptosc7SuoJade08qeGSeMWJVPKahtu366")
				.setOAuthAccessTokenSecret("N9hj4kW16GqCuaoa2WTb8mNjjSJHmr2JvewccIDygq3gZ");
		TwitterFactory tf=new TwitterFactory( cb.build());
		return tf;
	}
}
