package com.training.sharevideoversion2.service;

import com.training.sharevideoversion2.entity.Video;

import java.util.List;

public interface VideoService {
    List<Video> getAllVideo();
    Video findById(Long id);
    void save(Video video);
    void delete(Video video);
}
