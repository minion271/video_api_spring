package com.training.sharevideoversion2.service.implement;

import com.training.sharevideoversion2.entity.Comment;
import com.training.sharevideoversion2.entity.Video;
import com.training.sharevideoversion2.repository.CommentRepository;
import com.training.sharevideoversion2.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentServiceImpl implements CommentService {
    @Autowired
    private CommentRepository commentRepository;
    @Override
    public List<Comment> getAllCommentByVideo(Video video) {
        return commentRepository.findAllByVideo(video);
    }

    @Override
    public void save(Comment comment) {
        commentRepository.save(comment);
    }

    @Override
    public void delete(Comment comment) {
        commentRepository.delete(comment);
    }
}
