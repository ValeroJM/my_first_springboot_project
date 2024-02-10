package com.myfirst.springboot.learnspringboot;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/*This class is created and use to handle complex configuration profiles

We are trying to define below values that we already have set in "application.properties"
currency-service.url=
currency-service.username=
currency-service.key=

1. We need to use @ConfigurationProperties()
2. Inside of the parenthesis, we will use a prefix with the name of the object of our configuration. For our example: "prefix="currency-service""
3. Inside of the class, we will create the different properties as private. For our example: url, username and key
4. We generate the getters and setter for our properties.
5. we add the annotation @Component in between our @ConfigurationProperties(prefix="currency-service") and the class
6. Now we can come back to our src/main/java/resources/application.properties file and add the values to the properties we created for this complex configuration
 */
@ConfigurationProperties(prefix="currency-service")
@Component
public class CurrencyServiceConfiguration {
    private String url;
    private String username;
    private String key;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}
