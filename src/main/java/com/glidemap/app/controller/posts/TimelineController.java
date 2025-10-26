package com.glidemap.app.controller.posts;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/posts")
public class TimelineController {

    @GetMapping("/timeline")
    public String timeline() {
        return "posts/timeline";
    }
}
