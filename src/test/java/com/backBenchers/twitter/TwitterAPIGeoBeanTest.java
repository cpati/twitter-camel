package com.backBenchers.twitter;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import com.backBenchers.twitter.service.TwitterAPIService;

/**
 * 
 * @author shalininarang
 *
 */
@RunWith(MockitoJUnitRunner.class)
public class TwitterAPIGeoBeanTest {
	
	@Mock
	TwitterAPIService twitterAPIServiceMock;
	
	@InjectMocks
	TwitterAPIGeoBean twitterAPIGeoBean;
	
	@Test
	public void test() {
		
		when(twitterAPIServiceMock.getGeoCode(anyString())).thenReturn("message posted");
		
		assertEquals("message posted",twitterAPIGeoBean.getGeo("37.279518: -121.867905"));
	}

}

