package com.training.sharevideoversion2.rest_controller;

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
public class AdminRestController {
    @Autowired
    private VideoService videoService;
    @GetMapping("/admin/videos")
    public ResponseEntity<List<Video>> getAllVideos(){
        return ResponseEntity.ok(videoService.getAllVideo());
    }
    //
    @PostMapping("/admin/videos")
    public ResponseEntity create(@RequestBody Video video) {
        videoService.save(video);
        return ResponseEntity.ok().body(video);
    }
    //
    @PutMapping("/admin/videos/{id}")
    public ResponseEntity updateVideo(@PathVariable(name = "id")Long id,@RequestBody Video video){
        Video oldVideo=videoService.findById(id);
        if(oldVideo==null)
            return (ResponseEntity) ResponseEntity.status(HttpStatus.NOT_FOUND);
        oldVideo.setTitle(video.getTitle());
        oldVideo.setUrl(video.getUrl());
        oldVideo.setThumbnail(video.getThumbnail());
        videoService.save(oldVideo);
        return ResponseEntity.ok().body(video);
    }
    @DeleteMapping("/admin/videos/{id}")
    public ResponseEntity deleteVideo(@PathVariable(name = "id")Long id){
        Video oldVideo=videoService.findById(id);
        if(oldVideo==null)
            return (ResponseEntity) ResponseEntity.status(HttpStatus.NOT_FOUND);
        videoService.delete(oldVideo);
        return ResponseEntity.ok().build();
    }
}
