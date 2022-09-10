package net.blueensign.regex;

public class Tag {
    
    private String name;
    private Integer index;

    public Tag() {

    }

    public Tag(String name, Integer index) {
        this.name = name;
        this.index = index;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Integer getIndex() {
        return index;
    }
    public void setIndex(Integer index) {
        this.index = index;
    }

}
