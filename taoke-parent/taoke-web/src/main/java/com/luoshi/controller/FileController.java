package com.luoshi.controller;

import entity.Result;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

/**
 * @Auther: 无聊的人
 * @Date: 2019/10/17
 * @Description: com.luoshi.controller
 */
@RestController
@RequestMapping("file")
public class FileController {

    private String FILEUPLOADPATH = "D:\\upload";

    @RequestMapping(value = "/upload", method = RequestMethod.POST)
    @ResponseBody
    public Result upload(@RequestParam("file") MultipartFile file, HttpServletRequest request) throws Exception {
        System.out.println("上传图片");
        String realtivePath = upload(file);
        return new Result(true, realtivePath);
    }

    private String upload(MultipartFile file) throws Exception {
        String contentType = file.getContentType();
        String fileName = file.getOriginalFilename();


        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyyMMdd");
        String profixTime = sdf1.format(new Date());
        String absolutePath = FILEUPLOADPATH + File.separator + profixTime;
        String fileExtension = getExtensionNameByName(fileName);
        String randomName = UUID.randomUUID().toString().replace("-", "").substring(0, 8) + fileExtension;

        save(file.getBytes(), absolutePath, randomName);
        String realtivePath = "/upload/" + profixTime + "/" + randomName;
        return realtivePath;
    }

    public static String getExtensionNameByName(String fileName) {
        String fileTyle = fileName.substring(fileName.lastIndexOf("."), fileName.length());
        return fileTyle;
    }

    public static void save(byte[] file, String filePath, String fileName) throws Exception {
        File targetFile = makeFileFolder(filePath);
        if (filePath.endsWith(File.separator)) {
            filePath = filePath.substring(0, filePath.length() - 2);
        }

        FileOutputStream out = new FileOutputStream(filePath + File.separator + fileName);
        out.write(file);
        out.flush();
        out.close();
    }

    public static File makeFileFolder(String path) {
        File targetFile = new File(path);
        if (!targetFile.exists()) {
            targetFile.mkdirs();
        }

        return targetFile;
    }
}
