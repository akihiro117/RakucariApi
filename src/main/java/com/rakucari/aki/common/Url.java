package com.rakucari.aki.common;

/**
 * URLを扱うクラス。
 * immutableにする。
 * @author Akihiro Yamada
 *
 */
public class Url {
    private String url;

    public Url() {

    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

}
