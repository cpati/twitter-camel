package com.backBenchers.twitter;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import com.backBenchers.twitter.service.TwitterAPIService;

/**
 * 
 * @author gyaneshpandey
 *
 */
@RunWith(MockitoJUnitRunner.class)
public class TwitterAPIGetFollowersBeanTest {
	
	@Mock
	TwitterAPIService twitterAPIServiceMock;
	
	@InjectMocks
	TwitterAPIGetFollowersBean twitterAPIGetFollowersBean;
	
	@Test
	public void test() {
		
		when(twitterAPIServiceMock.getFollowers()).thenReturn("followers-list");
		
		assertEquals("followers-list",twitterAPIGetFollowersBean.getFollowers());
	}

}

