package com.shinowit.web;

import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;

/**
 * Created by Administrator on 2014/12/22.
 */
@Controller
@RequestMapping(value = "/upload")
public class UploadController {

    @RequestMapping(value="/upload")
    public String upload(@RequestParam("tupian") MultipartFile upFile, HttpServletRequest request) {
        if (upFile.isEmpty() == true) {
            return "redirect:/upload.jsp";
        }
        String realPath = request.getServletContext().getRealPath("/upload") + "/" + upFile.getOriginalFilename();

        try {
            FileUtils.copyInputStreamToFile(upFile.getInputStream(), new File(realPath));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "success";

    }

}
