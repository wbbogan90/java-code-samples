package net.blueensign.jackson;

import java.time.Instant;

public class SamplePojo {
    
    private String label;
    private Instant expiration;
    
    public String getLabel() {
        return label;
    }
    public void setLabel(String label) {
        this.label = label;
    }
    public Instant getExpiration() {
        return expiration;
    }
    public void setExpiration(Instant expiration) {
        this.expiration = expiration;
    }
}
