package com.dbn.campuslife.controller;

import com.dbn.campuslife.entity.message.AddMessageDTO;
import com.dbn.campuslife.entity.message.LifeMessageDTO;
import com.dbn.campuslife.entity.message.LifeMessagePO;
import com.dbn.campuslife.entity.user.UserInfoPO;
import com.dbn.campuslife.service.ILifeMessageService;
import com.dbn.campuslife.util.JsonResult;
import com.dbn.campuslife.util.Result;
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
    public JsonResult<Void> addLifeMessage(@RequestBody AddMessageDTO addMessageDTO, HttpServletRequest request) {
        try {
            /*获取当前登录人信息*/
            UserInfoPO userInfo = (UserInfoPO) request.getSession().getAttribute("userInfo");
            iLifeMessageService.addLifeMessage(addMessageDTO, userInfo.getId());
            return JsonResult.success();
        } catch (Exception e) {
            return JsonResult.fail(LOGGER, "新增消息", e);
        }
    }

    /**
     * 公开信息查询
     *
     * @param lifeMessageDTO 查询条件
     * @return 公开分享的信息
     */
    @RequestMapping("/listLifeMessage")
    public JsonResult<Result<LifeMessagePO>> listLifeMessage(@RequestBody LifeMessageDTO lifeMessageDTO) {
        try {
            return JsonResult.success(iLifeMessageService.listLifeMessage(lifeMessageDTO));
        } catch (Exception e) {
            return JsonResult.fail(LOGGER, "公开信息查询", e);
        }
    }
}
