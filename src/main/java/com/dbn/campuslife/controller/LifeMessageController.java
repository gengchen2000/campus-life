package com.dbn.campuslife.controller;

import com.dbn.campuslife.entity.message.AddMessageDTO;
import com.dbn.campuslife.entity.user.UserInfoPO;
import com.dbn.campuslife.service.ILifeMessageService;
import com.dbn.campuslife.util.JsonResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * 消息控制层
 */
@RestController
@RequestMapping("/lifeMessage")
public class LifeMessageController {

    private static final Logger LOGGER = LoggerFactory.getLogger(LifeMessageController.class);

    @Resource
    ILifeMessageService iLifeMessageService;

    @RequestMapping("/addLifeMessage")
    public JsonResult<Void> addLifeMessage(@RequestBody AddMessageDTO addMessageDTO, HttpServletRequest request){
        try {
            /*获取当前登录人信息*/
            UserInfoPO userInfo = (UserInfoPO) request.getSession().getAttribute("userInfo");
            iLifeMessageService.addLifeMessage(addMessageDTO, userInfo.getId());
            return JsonResult.success();
        } catch (Exception e) {
            return JsonResult.fail(LOGGER, "新增消息", e);
        }
    }

}
