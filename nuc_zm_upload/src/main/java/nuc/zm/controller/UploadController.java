package nuc.zm.controller;

import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.UUID;

/**
 * 上传控制器
 *
 * @author zm
 * @date 2022/10/26
 */
@RestController
@RequestMapping("/upload")
public class UploadController {

//    存放文件目录
    private static String UPLOAD_PATH =  "image";


    @PostMapping("/single")
    public String uploadSingle(@RequestParam(value = "up-file",required = false) MultipartFile multipartFile) {
        if (multipartFile.isEmpty()) return  "error 文件为空";
//        文件原始名
        String filename = multipartFile.getOriginalFilename();
        String substring = filename.substring(filename.lastIndexOf("."));
//        生成 唯一 文件名，
        String newFileName = UUID.randomUUID() + substring;
        File file = new File(UPLOAD_PATH);
//        目录不存在 创建目录
        if (!file.exists()) {
            file.mkdirs();
        }
//        生成 新 文件地址
        String newFilePath = file.getAbsolutePath() + File.separator + newFileName;
        System.out.println(newFilePath);
        File newFile = new File(newFilePath);
        System.out.println("新文件路径" +  newFile.getAbsolutePath());
        try {
            multipartFile.transferTo(newFile);
        } catch (IOException e) {
            System.out.println(e.getMessage());
            return "上传文件出错 ！";
        }
        return "success";
    }

    @PostMapping("/multi")
    public String uploadMulti(@RequestParam Map<String,MultipartFile> map) {
        if (map.isEmpty()) return "error 请选择你要上传的文件";
        for (String s : map.keySet()) {

            MultipartFile multipartFile = map.get(s);
            String filename = multipartFile.getOriginalFilename();
//            获取文件的 类型
            String substring = filename.substring(filename.lastIndexOf("."));
            String newFileName = UUID.randomUUID() + substring;
            File file = new File(UPLOAD_PATH);
            if (!file.exists()) {
                file.mkdirs();
            }
            String newFilePath = file.getAbsolutePath() + File.separator + newFileName;
            File newFile = new File(newFilePath);
            try {
                multipartFile.transferTo(newFile);
            } catch (IOException e) {
                System.out.println("上传文件出错");
            }
        }

        return "success";
    }

}
