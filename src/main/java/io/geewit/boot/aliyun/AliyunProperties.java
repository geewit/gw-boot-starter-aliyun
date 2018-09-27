package io.geewit.boot.aliyun;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * aliyun properties
 *
 * @author geewit
 */
@SuppressWarnings({"unused"})
@ConfigurationProperties(prefix = "aliyun")
public class AliyunProperties {
    /**
     * aliyun access key
     */
    private String key;
    /**
     * aliyun access secret
     */
    private String secret;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }
}
