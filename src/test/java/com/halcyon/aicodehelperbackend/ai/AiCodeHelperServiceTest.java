package com.halcyon.aicodehelperbackend.ai;

import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AiCodeHelperServiceTest {

    @Resource
    private AiCodeHelperService aiCodeHelperService;

    @Test
    void chat() {
        String userMessage = aiCodeHelperService.chat("你好，我是程序员小张");
        System.out.println(userMessage);
    }

    @Test
    void chatWithMemory() {
        String result = aiCodeHelperService.chat("你好，我是职业选手Faker");
        System.out.println(result);
        result = aiCodeHelperService.chat("你好，我是谁来着？");
        System.out.println(result);
    }

    @Test
    void chatForReport() {
        String userMessage = "你好，我是程序员小张，学编程两年半，请帮我制定学习报告，不超过100字";
        AiCodeHelperService.Report report = aiCodeHelperService.chatForReport(userMessage);
        System.out.println(report);
    }

}