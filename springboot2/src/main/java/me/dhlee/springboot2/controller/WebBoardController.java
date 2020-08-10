package me.dhlee.springboot2.controller;

import me.dhlee.springboot2.domain.WebBoard;
import me.dhlee.springboot2.persistence.CustomCrudRepository;
import me.dhlee.springboot2.vo.PageMaker;
import me.dhlee.springboot2.vo.PageVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/boards/")
public class WebBoardController {
    @Autowired
    // private WebBoardRepository repository;
    private CustomCrudRepository repository;

    /*
    @GetMapping("/list")
    public void list(@PageableDefault(
            direction = Sort.Direction.DESC,
            sort = "bno",
            size = 10,
            page = 0) Pageable page) {
        System.out.println("list() called..." + page);

    }

    @GetMapping("/list")
    public void list(PageVO vo, Model model) {
        Pageable page = vo.makePageable(0, "bno");
        Page<WebBoard> result = webBoardRepository.findAll(webBoardRepository.makePredicate(null, null), page);

        System.out.println(page);
        System.out.println(result);

        System.out.println("TOTAL PAGE NUMBER : " + result.getTotalPages());

        // model.addAttribute("result", result);
        model.addAttribute("result", new PageMaker(result));
    }
    */


    @GetMapping("/list")
    public void list(@ModelAttribute("pageVO") PageVO vo, Model model) {

        Pageable page = vo.makePageable(0, "bno");

        Page<Object[]> result = repository.getCustomPage(vo.getType(), vo.getKeyword(), page);

        System.out.println(page);
        System.out.println(result);
        System.out.println("TOTAL PAGE NUMBER: " + result.getTotalPages());

        model.addAttribute("result", new PageMaker(result));

    }

    @GetMapping("/register")
    public void registerGet(@ModelAttribute("vo") WebBoard vo) {
        System.out.println("register get...");
    }

    @PostMapping("/register")
    public String registerPOST(@ModelAttribute("vo") WebBoard vo, RedirectAttributes rttr) {
        System.out.println("register post");
        System.out.println(vo);

        repository.save(vo);
        rttr.addFlashAttribute("msg", "success");

        return "redirect:/boards/list";
    }

    @GetMapping("/view")
    public void view(Long bno, @ModelAttribute("pageVO") PageVO vo, Model model) {
        System.out.println("BNO : " + bno);
        repository.findById(bno).ifPresent(board -> model.addAttribute("vo", board));
    }


    @GetMapping("/modify")
    public void modify(Long bno, @ModelAttribute("pageVO") PageVO vo, Model model) {
        System.out.println("MODIFY BNO : " + bno);
        repository.findById(bno).ifPresent(board -> model.addAttribute("vo", board));
    }

    @PostMapping("/modify")
    public String modifyPOST(WebBoard board, PageVO vo, RedirectAttributes rttr) {
        System.out.println("Modify WebBoard : " + board);

        repository.findById(board.getBno()).ifPresent(origin -> {
            origin.setTitle(board.getTitle());
            origin.setContent(board.getContent());

            repository.save(origin);
            rttr.addFlashAttribute("msb", "success");
            rttr.addAttribute("bno", origin.getBno());
        });

        rttr.addAttribute("page", vo.getPage());
        rttr.addAttribute("size", vo.getSize());
        rttr.addAttribute("type", vo.getType());
        rttr.addAttribute("keyword", vo.getKeyword());

        return "redirect:/boards/list";
    }

    @PostMapping("/delete")
    public String delete(Long bno, PageVO vo, RedirectAttributes rttr) {
        System.out.println("DELETE BNO : " + bno);

        repository.deleteById(bno);

        rttr.addFlashAttribute("mgs", "success");
        rttr.addAttribute("page", vo.getPage());
        rttr.addAttribute("size", vo.getSize());
        rttr.addAttribute("type", vo.getType());
        rttr.addAttribute("keyword", vo.getKeyword());

        return "redirect:/boards/list";
    }
}

