package com.wenhao.ssh.controller;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {
    private static final Logger LOGGER = LoggerFactory.getLogger(IndexController.class);

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home() {
        return "index";
    }

    @RequestMapping(value = "/page/{path}", method = RequestMethod.GET)
    public String index(@PathVariable(value = "path")  String path) {
        LOGGER.info("path:{}", path);
        return StringUtils.isNotBlank(path) ? path : "index";
    }


    @RequestMapping(value = "/data/{path}", method = RequestMethod.GET)
    @ResponseBody
    public String json(@PathVariable(value = "path")  String path) {
        LOGGER.info("path:{}", path);
        return "{\"a\":1}";
    }

}
