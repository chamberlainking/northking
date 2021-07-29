package net.northking.springboot.controller;

import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

/**
 * author Chamberalin
 * version V1.0
 * 2021/7/29 15:57
 * Description:
 */
@RestController
@RequestMapping("user")
public class LoginController {

    @PostMapping("login")
    @ResponseBody
    public String login(HttpSession session, @RequestParam String username, @RequestParam String password) {
        if ((!StringUtils.isBlank(username)) && (!StringUtils.isBlank(username))) {
            //Map<String, String> map = new HashMap<>();
            //map.put("username", username);
            //map.put("password", password);
            //String userId = userService.verifyLogin(map);
            //if (userId != null) {
            //    session.setAttribute("loginUser", username);
            //    return "login success";
            //}
            return "login success";
        }
        return "username or password is wrong";
    }
}
