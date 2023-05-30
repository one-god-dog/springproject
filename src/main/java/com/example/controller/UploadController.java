package com.example.controller;

import com.example.Service.UpLoadFile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;

/**
 * @author 罗霖荃
 * @version 1.0
 */
@RestController
public class UploadController {
    @Autowired
    UpLoadFile upLoadFile;

    @PostMapping("/upload/file")
    public String upload(@RequestParam("file") MultipartFile multipartFile, HttpServletRequest req){
        //判断文件是否为空
        if (multipartFile.isEmpty()){
            return "文件为空！";
        }
        String dir = req.getParameter("dir");
        return upLoadFile.uploadfile(multipartFile,dir);
    }
}

