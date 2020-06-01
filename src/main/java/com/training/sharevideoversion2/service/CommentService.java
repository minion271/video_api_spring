package com.training.sharevideoversion2.service;

import com.training.sharevideoversion2.entity.Comment;
import com.training.sharevideoversion2.entity.Video;

import java.util.List;

public interface CommentService {
    List<Comment> getAllCommentByVideo(Video video);
    void save(Comment comment);
    void delete(Comment comment);
}
