package com.example.Service;

import org.springframework.web.multipart.MultipartFile;

/**
 * @author 罗霖荃
 * @version 1.0
 */
public interface UpLoadFile {
    public String uploadfile(MultipartFile multipartFile,String dir);
}
