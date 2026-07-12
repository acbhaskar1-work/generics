package com.chitkara.customexceptions;

// 1. Definition
public class RateLimitExceededException extends RuntimeException {
    private final String apiKey;
    private final long retryAfterSeconds;

    public RateLimitExceededException(String apiKey, long retryAfterSeconds) {
        super("API rate limit exceeded for key: " + apiKey + ". Please retry later.");
        this.apiKey = apiKey;
        this.retryAfterSeconds = retryAfterSeconds;
    }

    public String getApiKey() { return apiKey; }
    public long getRetryAfterSeconds() { return retryAfterSeconds; }
}

