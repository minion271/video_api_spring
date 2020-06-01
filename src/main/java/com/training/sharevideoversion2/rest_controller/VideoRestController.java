package com.training.sharevideoversion2.rest_controller;

import com.training.sharevideoversion2.converter.VideoConverter;
import com.training.sharevideoversion2.dto.VideoDTO;
import com.training.sharevideoversion2.entity.Comment;
import com.training.sharevideoversion2.entity.Video;
import com.training.sharevideoversion2.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class VideoRestController {
    @Autowired
    private VideoService videoService;
    //
    @GetMapping("/videos")
    public ResponseEntity<List<Video>> getAllVideo(){
        return ResponseEntity.ok(videoService.getAllVideo());
    }
    //
    @GetMapping("/videos/{id}")
    public ResponseEntity findVideoById(@PathVariable(name = "id")Long id) {
        Video video=videoService.findById(id);
        video.setTotal_view(video.getTotal_view()+1);
        videoService.save(video);
        VideoDTO videoDTO= VideoConverter.convertToVideoDTO(video);
        return ResponseEntity.ok().body(videoDTO);
    }
}
