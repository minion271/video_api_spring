package com.training.sharevideoversion2.rest_controller;

import com.training.sharevideoversion2.dto.CommentDTO;
import com.training.sharevideoversion2.dto.VideoDTO;
import com.training.sharevideoversion2.entity.Comment;
import com.training.sharevideoversion2.entity.Video;
import com.training.sharevideoversion2.service.CommentService;
import com.training.sharevideoversion2.service.UserService;
import com.training.sharevideoversion2.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.sql.Date;
import java.sql.Timestamp;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class CommentRestController {
    @Autowired
    private CommentService commentService;
    @Autowired
    private VideoService videoService;
    @Autowired
    private UserService userService;
    @PostMapping("/videos/{id}/comment")
    public ResponseEntity postComment(@RequestBody CommentDTO commentDTO,
                                      @PathVariable(name = "id")Long id){
        Video video=videoService.findById(id);
        Comment comment=new Comment();
        comment.setVideo(video);
        comment.setUser(userService.findUserByUsername(commentDTO.getUser_username()));
        comment.setMessage(commentDTO.getMessage());
        comment.setGen_time(commentDTO.getGen_time());
        commentService.save(comment);
        return ResponseEntity.ok().body(commentDTO);
    }
}
