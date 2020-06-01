package com.training.sharevideoversion2.dto;

import com.training.sharevideoversion2.entity.Comment;

import java.sql.Timestamp;
import java.util.List;

public class VideoDTO {
    private String url;
    private String title;
    private String description;
    private String thumbnail;
    private List<CommentDTO> commentDTOS;
    private Long total_like;
    private Long total_view;
    private Timestamp date_public;
    public VideoDTO(){}

    public VideoDTO(String url, String title, String description,
                    String thumbnail, List<CommentDTO> commentDTOS, Long total_like, Long total_view,Timestamp date_public) {
        this.url = url;
        this.title = title;
        this.description = description;
        this.thumbnail = thumbnail;
        this.commentDTOS = commentDTOS;
        this.total_like = total_like;
        this.total_view = total_view;
        this.date_public=date_public;
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

    public List<CommentDTO> getCommentDTOS() {
        return commentDTOS;
    }

    public void setCommentDTOS(List<CommentDTO> commentDTOS) {
        this.commentDTOS = commentDTOS;
    }

    public Long getTotal_like() {
        return total_like;
    }

    public void setTotal_like(Long total_like) {
        this.total_like = total_like;
    }

    public Long getTotal_view() {
        return total_view;
    }

    public void setTotal_view(Long total_view) {
        this.total_view = total_view;
    }

    public Timestamp getDate_public() {
        return date_public;
    }

    public void setDate_public(Timestamp date_public) {
        this.date_public = date_public;
    }
}
