package com.training.sharevideoversion2.service.implement;

import com.training.sharevideoversion2.entity.Video;
import com.training.sharevideoversion2.repository.VideoRepository;
import com.training.sharevideoversion2.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class VideoServiceImpl implements VideoService {
    @Autowired
    private VideoRepository videoRepository;
    @Override
    public List<Video> getAllVideo() {
        return videoRepository.findAll();
    }

    @Override
    public Video findById(Long id) {
        return videoRepository.findById(id);
    }

    @Override
    public void save(Video video) {
        videoRepository.save(video);
    }

    @Override
    public void delete(Video video) {
        videoRepository.delete(video);
    }
}
