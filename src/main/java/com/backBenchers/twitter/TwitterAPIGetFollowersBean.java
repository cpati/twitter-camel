package com.backBenchers.twitter;
import com.backBenchers.twitter.service.TwitterAPIService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/**
 * 
 * @author gyaneshpandey
 *
 */
public class TwitterAPIGetFollowersBean {
		private static final Logger LOG = LoggerFactory.getLogger(TwitterAPIGetFollowersBean.class);
		private TwitterAPIService twitterAPIService;
		
		public TwitterAPIGetFollowersBean() {
			
		}
		
		public TwitterAPIGetFollowersBean(TwitterAPIService twitterAPIService) {
			this.twitterAPIService=twitterAPIService;
		}
		 
		public String getFollowers() {
//			LOG.info("TwitterAPIGetFollowersBean:getFollowers");
			return twitterAPIService.getFollowers();
		}
}
