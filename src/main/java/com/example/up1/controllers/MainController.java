package com.example.up1.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    @GetMapping("/")
    public String greeting(Model model) {
        return "home";
    }
    @PostMapping("/posts")
    public String Posts(@RequestParam(value = "first", required = false, defaultValue = "1") double firsts,
                          @RequestParam(value = "sym", required = false, defaultValue = "2") String syms,
                          @RequestParam(value = "second", required = false, defaultValue = "3") double seconds, Model model) {
        double thr;

        try {
            if (syms.equals("+")) {
                thr = firsts + seconds;
                model.addAttribute("res", thr);
            }
            if (syms.equals("-")) {
                thr = firsts- seconds;
                model.addAttribute("res", thr);
            }
            if (syms.equals("*")) {
                thr = firsts * seconds;
                model.addAttribute("res", thr);
            }
            if (syms.equals("/") && !(seconds==0)) {
                thr = firsts / seconds;
                model.addAttribute("res", thr);
            }
        } catch (NumberFormatException e) {

        }
        return "result";
    }
    @GetMapping("/gets")
    public String Gets(@RequestParam(value = "first", required = false, defaultValue = "1") double firsts,
                         @RequestParam(value = "sym", required = false, defaultValue = "2") String syms,
                         @RequestParam(value = "second", required = false, defaultValue = "3") double seconds, Model model) {
        double thr;

        try {
            if (syms.equals("+")) {
                thr = firsts + seconds;
                model.addAttribute("res", thr);
            }
            if (syms.equals("-")) {
                thr = firsts- seconds;
                model.addAttribute("res", thr);
            }
            if (syms.equals("*")) {
                thr = firsts * seconds;
                model.addAttribute("res", thr);
            }
            if (syms.equals("/") && !(seconds==0)) {
                thr = firsts / seconds;
                model.addAttribute("res", thr);
            }
        } catch (NumberFormatException e) {

        }
        return "posts";
    }
}