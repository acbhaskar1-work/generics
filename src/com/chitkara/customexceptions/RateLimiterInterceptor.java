package com.chitkara.customexceptions;

// 2. Production Usage
class RateLimiterInterceptor {
    public void preHandle(String apiKey) {
        boolean isAllowed = redisTracker.checkLimit(apiKey); // Assume Redis check

        if (!isAllowed) {
            long waitTime = redisTracker.getTimeToExpiry(apiKey);
            throw new RateLimitExceededException(apiKey, waitTime);
        }
    }
}
