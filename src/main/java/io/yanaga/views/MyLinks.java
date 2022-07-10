package io.yanaga.views;

public enum MyLinks {

    TWITTER("https://twitter.com/felipeyanaga");

    private final String url;

    private MyLinks(String url) {
        this.url = url;
    }

    public String getUrl() {
        return this.url;
    }

}
