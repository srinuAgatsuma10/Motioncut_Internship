package com.CoreJava.Practice;

import java.util.HashMap;
import java.util.Map;

public class LinkShortener {
    private Map<String, String> shortToLongMap;
    private Map<String, String> longToShortMap;

    public LinkShortener() {
        this.shortToLongMap = new HashMap<>();
        this.longToShortMap = new HashMap<>();
    }

    public String shorten(String longUrl) {
        if (longToShortMap.containsKey(longUrl)) {
            return longToShortMap.get(longUrl);
        }

        String shortUrl = generateShortUrl();
        shortToLongMap.put(shortUrl, longUrl);
        longToShortMap.put(longUrl, shortUrl);
        return shortUrl;
    }

    public String expand(String shortUrl) {
        return shortToLongMap.getOrDefault(shortUrl, "Invalid short URL");
    }

    private String generateShortUrl() {
        // Basic implementation of a hash function to generate short URLs
        // In real-world scenarios, a more robust hash function would be used
        return "short/" + Math.random(); // Example: Using random number as short URL
    }

    public static void main(String[] args) {
        LinkShortener linkShortener = new LinkShortener();

        // Example usage
        String longUrl = "https://chat.openai.com/c/9658a212-1039-4e0f-b31e-e5285213e00a";
        String shortUrl = linkShortener.shorten(longUrl);
        System.out.println("Shortened URL: " + shortUrl);

        String expandedUrl = linkShortener.expand(shortUrl);
        System.out.println("Expanded URL: " + expandedUrl);
    }
}
