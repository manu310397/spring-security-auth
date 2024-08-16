package com.manoj.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/")
public class NoticeController {

    @GetMapping("notice")
    public String getNoticeDetails() {
        return "Notice details";
    }
}
