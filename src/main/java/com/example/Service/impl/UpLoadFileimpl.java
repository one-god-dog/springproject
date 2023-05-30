package com.example.Service.impl;

import com.example.Service.UpLoadFile;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

/**
 * @author 罗霖荃
 * @version 1.0
 */
@Service
public class UpLoadFileimpl implements UpLoadFile {

    @Override
    public String uploadfile( MultipartFile multipartFile, String dir) {
        //上传文件的保存目录
        File file = new File("D://temp/" + dir);
        //判断文件夹是否存在，如果不存在创建文件夹
        if (!file.exists()){
            file.mkdirs();
        }

        //判断文件是否上传到服务器中
        try {
            multipartFile.transferTo(file);
            return "ok!";
        } catch (IOException e) {
            e.printStackTrace();
            return "上传文件失败！";
        }

    }
}
