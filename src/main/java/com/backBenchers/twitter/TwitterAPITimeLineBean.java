package com.backBenchers.twitter;

import com.backBenchers.twitter.service.TwitterAPIService;

/**
 * 
 * @author pujakawale
 *
 */
public class TwitterAPITimeLineBean extends TwitterAPIConfig {
	
	//private static final Logger LOG = LoggerFactory.getLogger(TwitterAPIBean.class);
	private TwitterAPIService twitterAPIService;
	
	public TwitterAPITimeLineBean() {
		
	}
	
	public TwitterAPITimeLineBean(TwitterAPIService twitterAPIService) {
		this.twitterAPIService=twitterAPIService;
	}
	 
	public String getTimeline(String param) {
		//System.out.println("timeline:"+param);
		return twitterAPIService.getTimeline(param);
	}
	
//		public static void main(String args[]) {
//			TwitterAPIBean o = new TwitterAPIBean();
//			System.out.println(o.getTweet("Trump"));
//		}
//	
}
