package com.backBenchers.twitter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.backBenchers.twitter.service.TwitterAPIService;

/**
 * 
 * @author pujakawale
 *
 */
public class TwitterAPIPostTweetBean extends TwitterAPIConfig {
	
	private static final Logger LOG = LoggerFactory.getLogger(TwitterAPIPostTweetBean.class);
	
	private TwitterAPIService twitterAPIService;
	
	public TwitterAPIPostTweetBean() {
		
	}
	
	public TwitterAPIPostTweetBean(TwitterAPIService twitterAPIService) {
		this.twitterAPIService=twitterAPIService;
	}
	 
	public String postTweet(String param) {
		return twitterAPIService.postTweet(param);
	}
	
	/*
	public static void main(String args[]) {
			TwitterAPIPostTweetBean o = new TwitterAPIPostTweetBean();
			System.out.println(o.postTweet("Testing "));
		}
	*/	
//	
}
