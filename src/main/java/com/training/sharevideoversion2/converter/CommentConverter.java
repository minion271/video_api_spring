package com.training.sharevideoversion2.converter;

import com.training.sharevideoversion2.dto.CommentDTO;
import com.training.sharevideoversion2.entity.Comment;

public class CommentConverter {
    public static CommentDTO convertCommentDTO(Comment comment){
        CommentDTO commentDTO=new CommentDTO();
        commentDTO.setId(comment.getId());
        commentDTO.setMessage(comment.getMessage());
        commentDTO.setGen_time(comment.getGen_time());
        commentDTO.setUser_username(comment.getUser().getUsername());
        return commentDTO;
    }
}
