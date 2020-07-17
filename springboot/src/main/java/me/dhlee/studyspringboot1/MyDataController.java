package me.dhlee.studyspringboot1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.PostConstruct;
import java.util.Optional;

@Controller
public class MyDataController {
    private final MyDataRepository myDataRepository;

    @Autowired
    public MyDataController(MyDataRepository myDataRepository) {
        this.myDataRepository = myDataRepository;
    }

    @PostConstruct
    public void init() {
        MyData d1 = new MyData("kim", 23, "kim@kim.com", "this is data1");
        myDataRepository.saveAndFlush(d1);
        MyData d2 = new MyData("lee", 29, "lee@lee.com", "this is data2");
        myDataRepository.saveAndFlush(d2);
        MyData d3 = new MyData("park", 35, "park@park.com", "this is data3");
        myDataRepository.saveAndFlush(d3);
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView index(@ModelAttribute("formModel") MyData myData, ModelAndView mav) {
        mav.setViewName("index");
        mav.addObject("msg", "this is sample content");

        Iterable<MyData> list = myDataRepository.findAll();
        mav.addObject("dataList", list);
        return mav;
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    @Transactional(readOnly = false)
    public ModelAndView form(@ModelAttribute("formModel") MyData myData, ModelAndView mav) {
        myDataRepository.saveAndFlush(myData);
        return new ModelAndView("redirect:/");
    }

    @RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
    public ModelAndView edit(@ModelAttribute MyData myData, @PathVariable int id, ModelAndView mav) {
        mav.setViewName("edit");
        mav.addObject("title", "edit mydata");
        Optional<MyData> data = myDataRepository.findById((long)id);
        if (data.isPresent())
            mav.addObject("formModel", data);
        return mav;
    }

    @RequestMapping(value = "/edit", method = RequestMethod.POST)
    @Transactional(readOnly = false)
    public ModelAndView update(@ModelAttribute MyData myData, ModelAndView mav) {
        myDataRepository.saveAndFlush(myData);
        return new ModelAndView("redirect:/");
    }
}
