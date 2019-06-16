package com.rakucari.aki.common;

/**
 * URLを扱うクラス。
 * @author Akihiro Yamada
 *
 */
public class Url {
    private String url;

    public Url(String url) {
        // TODO: urlのバリデーションを行う。
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

}
