/*
package me.dhlee.studyspringboot1.exam;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

    @RequestMapping("/")
    public String index() {
        return "ExamIndex";
    }

    @RequestMapping("/redirect")
    public String redirect() {
        return "redirect:/";
    }

    @RequestMapping("/forward")
    public ModelAndView forward() {
        return new ModelAndView("forward:/");
    }

    */
/*
    // Model 사용
    @RequestMapping("/{num}")
    public String index(@PathVariable int num, Model model) {
        int res = 0;
        for (int i = 1; i <= num; i++) {
            res += i;
        }
        model.addAttribute("msg", "total : " + res);
        return "index";
    }
    *//*


    // ModelAndView 사용
    @RequestMapping("/{num}")
    public ModelAndView index(@PathVariable int num, ModelAndView mav) {

        int res = 0;
        for (int i = 1; i <= num; i++) {
            res += i;
        }
        mav.addObject("msg", "total : " + res);
        mav.setViewName("ExamIndex");
        return mav;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView index(ModelAndView mav) {
        mav.setViewName("ExamIndex");
        mav.addObject("message", "폼을 전송해주세요.");
        return mav;
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public ModelAndView send(
            @RequestParam("text1") String name,
            @RequestParam(value = "check1", required = false) boolean check1,
            @RequestParam(value = "radio1", required = false) String radio1,
            @RequestParam(value = "select1", required = false) String select1,
            @RequestParam(value = "select2", required = false) String[] select2,
            ModelAndView mav) {

        String res = "";
        try {
            res = "check : " + check1 + " radio : " + radio1 + " select : " + select1 + "\nselect2 : ";
        } catch (NullPointerException e) {}
        try {
            res += select2[0];
            for (int i = 1; i < select2.length; i++) {
                res += ", " + select2[i];
            }
        } catch (NullPointerException e) {
            res += "null";
        }
        mav.setViewName("ExamIndex");
        mav.addObject("message", "안녕하세요! " + name + "님! " + res);
        mav.addObject("value", name);
        return mav;
    }
}
*/
