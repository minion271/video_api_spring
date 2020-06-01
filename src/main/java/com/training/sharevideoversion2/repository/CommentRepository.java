package com.training.sharevideoversion2.repository;

import com.training.sharevideoversion2.entity.Comment;
import com.training.sharevideoversion2.entity.Video;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentRepository extends JpaRepository<Comment,Integer> {
    List<Comment> findAllByVideo(Video video);
}
