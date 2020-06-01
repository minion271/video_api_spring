package com.training.sharevideoversion2.converter;

import com.training.sharevideoversion2.dto.CommentDTO;
import com.training.sharevideoversion2.dto.VideoDTO;
import com.training.sharevideoversion2.entity.Video;

import java.util.ArrayList;
import java.util.List;

public class VideoConverter {
    public static VideoDTO convertToVideoDTO(Video video){
        VideoDTO videoDTO=new VideoDTO();
        videoDTO.setUrl(video.getUrl());
        videoDTO.setDescription(video.getDescription());
        videoDTO.setThumbnail(video.getThumbnail());
        videoDTO.setTitle(video.getTitle());
        videoDTO.setTotal_like(video.getTotal_like());
        videoDTO.setTotal_view(video.getTotal_view());
        videoDTO.setDate_public(video.getDate_public());
        List<CommentDTO> commentDTOS=new ArrayList<>();
        for(int i=0;i<video.getComment().size();i++){
            commentDTOS.add(CommentConverter.convertCommentDTO(video.getComment().get(i)));
        }
        videoDTO.setCommentDTOS(commentDTOS);
        return videoDTO;
    }
}
