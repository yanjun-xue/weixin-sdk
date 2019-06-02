package com.riversoft.weixin.common.media;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by exizhai on 9/26/2015.
 */
@Setter
@Getter
public class MpNews implements Serializable {

    private List<MpArticle> articles = new ArrayList<>();

    @JsonProperty("news_item")
    public void setItems(List<MpArticle> articles) {
        this.articles = articles;
    }

    public void add(MpArticle mpArticle) {
        this.getArticles().add(mpArticle);
    }

    public MpNews article(MpArticle article) {
        this.getArticles().add(article);
        return this;
    }
}
