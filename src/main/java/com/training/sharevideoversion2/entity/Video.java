package com.training.sharevideoversion2.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;

@Entity
@Table(name = "video")
public class Video{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "video_id")
    private Long id;
    private String url;
    private String title;
    private String description;
    private String thumbnail;
    private Timestamp date_public;
    private Long total_view;
    private Long total_like;
    @OneToMany(mappedBy = "video", fetch = FetchType.LAZY)
    private List<Comment> comment;

    public Video() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Timestamp getDate_public() {
        return date_public;
    }

    public void setDate_public(Timestamp date_public) {
        this.date_public = date_public;
    }

    public Long getTotal_view() {
        return total_view;
    }

    public void setTotal_view(Long total_view) {
        this.total_view = total_view;
    }

    public Long getTotal_like() {
        return total_like;
    }

    public void setTotal_like(Long total_like) {
        this.total_like = total_like;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public List<Comment> getComment() {
        return comment;
    }

    public void setComment(List<Comment> comment) {
        this.comment = comment;
    }

    @Override
    public String toString() {
        return "";
    }
}
