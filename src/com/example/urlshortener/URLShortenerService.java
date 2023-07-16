package com.example.urlshortener;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class URLShortenerService {
	
	    private Map<String, String> urlMap;
	    private static final String BASE_URL = "http://example.com/";
	    
	    public URLShortenerService() {
	        this.urlMap = new HashMap<>();
	    }
	    
	    public String shortenURL(String originalURL) {
	        String shortURL = generateShortURL();
	        urlMap.put(shortURL, originalURL);
	        return BASE_URL + shortURL;
	    }
	    
	    public String getOriginalURL(String shortURL) {
	        return urlMap.get(shortURL);
	    }
	    
	    private String generateShortURL() {
	        // Generate a random alphanumeric string of length 6
	        String characters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
	        StringBuilder sb = new StringBuilder();
	        Random random = new Random();
	        
	        for (int i = 0; i < 6; i++) {
	            int index = random.nextInt(characters.length());
	            sb.append(characters.charAt(index));
	        }
	        
	        return sb.toString();
	    }
	}


