package com.example.urlshortener;

import java.util.Scanner;

public class Main {
    private static URLShortenerService urlShortener;

	public static void main(String[] args) {
		  urlShortener = new URLShortenerService();
		        Scanner scanner = new Scanner(System.in);
		        
		        while (true) {
		            System.out.println("URL Shortener");
		            System.out.println("1. Shorten URL");
		            System.out.println("2. Retrieve Original URL");
		            System.out.println("0. Exit");
		            System.out.print("Enter your choice: ");
		            int choice = scanner.nextInt();
		            
		            switch (choice) {
		                case 1:
		                    shortenURL(scanner);
		                    break;
		                case 2:
		                    retrieveURL(scanner);
		                    break;
		                case 0:
		                    System.out.println("Exiting...");
		                    scanner.close();
		                    System.exit(0);
		                default:
		                    System.out.println("Invalid choice. Please try again.");
		                    break;
		            }
		        }
		    }
		    
		    private static void shortenURL(Scanner scanner) {
		        System.out.print("Enter the original URL: ");
		        String originalURL = scanner.next();
		        String shortenedURL = urlShortener.shortenURL(originalURL);
		        System.out.println("Shortened URL: " + shortenedURL);
		        System.out.println();
		    }
		    
		    private static void retrieveURL(Scanner scanner) {
		        System.out.print("Enter the shortened URL: ");
		        String shortURL = scanner.next();
		        String originalURL = urlShortener.getOriginalURL(shortURL);
		        
		        if (originalURL != null) {
		            System.out.println("Original URL: " + originalURL);
		        } else {
		            System.out.println("URL not found.");
		        }
		        
		        System.out.println();
		    }
		

	}


