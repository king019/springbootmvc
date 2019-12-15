package com.k.spring.boot.control;

import com.k.spring.boot.util.GCUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/")
public class BootControl {
    private String ret = "ok";

    @GetMapping("/")
    public Object home() {
        return retObj();
    }

    @GetMapping("/index")
    public Object index() {
        new Object();
        return retObj();
    }

    @GetMapping("/gc")
    public Object gc() {
        GCUtil.xm();
        return retObj();
    }

    @GetMapping("/whiletrue")
    public Object whiletrue() {
        GCUtil.whiletrue();
        return retObj();
    }

    @GetMapping("/timedWaiting")
    public Object timedWaiting() throws InterruptedException {
        GCUtil.timedWaiting();
        return retObj();
    }

    @GetMapping("/waiting")
    public Object waiting() {
        GCUtil.waiting();
        return retObj();
    }

    @GetMapping("/blocked")
    public Object blocked() {
        GCUtil.blocked();
        return retObj();
    }

    @GetMapping("/runnable")
    public Object runnable() {
        GCUtil.runnable();
        return retObj();
    }

    private Object retObj() {
        return ret;
    }

}