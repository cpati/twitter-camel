package com.backBenchers.twitter;

import com.backBenchers.twitter.service.TwitterAPIService;

/**
 * 
 * @author chidanandapati
 *
 */
public class TwitterAPIDirectMessageBean extends TwitterAPIConfig {
	
	//private static final Logger LOG = LoggerFactory.getLogger(TwitterAPIBean.class);
	private TwitterAPIService twitterAPIService;
	
	public TwitterAPIDirectMessageBean() {
		
	}
	
	public TwitterAPIDirectMessageBean(TwitterAPIService twitterAPIService) {
		this.twitterAPIService=twitterAPIService;
	}
	 
	public String directMessage(String param) {
		System.out.println("directMessage:"+param);
		return twitterAPIService.directMessage(param);
	}
	
//		public static void main(String args[]) {
//			TwitterAPIBean o = new TwitterAPIBean();
//			System.out.println(o.getTweet("Trump"));
//		}
//	
}
