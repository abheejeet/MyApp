package me.Tweet.Procedure;

import java.util.List;

import twitter4j.Query;
import twitter4j.QueryResult;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;


public class SearchForTweets {
	public void getHomeTweets(){
	Twitter twitter=ConfigBuilder.getConfiguration().getInstance();
	List<Status> status;
	try {
		status = twitter.getHomeTimeline();
		for(Status st: status)
		{
			System.out.println(st.getUser().getName()+"-------------------"+st.getUser().getScreenName());
		}
	} catch (TwitterException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	public void getTweetsByaUser(String key){
		Twitter twitter=ConfigBuilder.getConfiguration().getInstance();
		Query query = new Query(key);
	    QueryResult result;
		try {
			result = twitter.search(query);
			for (Status status : result.getTweets()) {
		        System.out.println("@" + status.getUser().getScreenName() + ":" + status.getText());
		    }
		} catch (TwitterException e) {
			// TODO Auto-generated catch block
			 System.out.println("here");
			e.printStackTrace();
		}
	    
	
	
	}
    
    
}