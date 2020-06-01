package com.training.sharevideoversion2.repository;

import com.training.sharevideoversion2.entity.Video;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VideoRepository extends JpaRepository<Video,Integer> {
   Video findById(Long id);
}
