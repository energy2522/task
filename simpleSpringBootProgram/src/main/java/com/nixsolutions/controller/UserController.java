package com.nixsolutions.controller;

import com.nixsolutions.domain.User;
import com.nixsolutions.dto.UserDto;
import com.nixsolutions.service.interfaces.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Володимир Майборода on 12.11.2017.
 */
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/")
    private ModelAndView getAllUser() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index");
        modelAndView.addObject("users", userService.getAllUser());
        return modelAndView;
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    private String delete(@PathVariable("id") Integer id) {
        userService.deleteUser(id);

        return "redirect:/";
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    private String goToAdd(Model model) {
        model.addAttribute("action", "add");
        model.addAttribute("method", "POST");
        model.addAttribute("userDto", new UserDto());

        return "add_user";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    private String createUser(UserDto userDto) {
        userService.createUpdateUser(userDto.getUser());

        return "redirect:/";
    }

    @RequestMapping(value = "/update", method = RequestMethod.PUT)
    private String updateUser(UserDto userDto) {
        userService.createUpdateUser(userDto.getUser());

        return "redirect:/";
    }


    @RequestMapping(value = "/update", method = RequestMethod.POST)
    private String goToUpdate(@RequestParam Integer id, Model model) {
        User user = userService.findById(id);

        model.addAttribute("action", "update");
        model.addAttribute("method", "PUT");
        model.addAttribute("userDto", new UserDto(user.getId(), user.getName(), user.getBirthDate()));

        return "add_user";
    }


}
