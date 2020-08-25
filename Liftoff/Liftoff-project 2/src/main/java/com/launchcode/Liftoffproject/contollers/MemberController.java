package com.launchcode.Liftoffproject.contollers;
import com.launchcode.Liftoffproject.data.MemberData;
import com.launchcode.Liftoffproject.models.Member;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("members")
public class MemberController {

   /* @GetMapping
    public String listMembers(Model model) {
        model.addAttribute("members", members);
        return "members/listMembers";*
   /* }*/
    @RequestMapping(method={RequestMethod.GET, RequestMethod.POST}, value = "listMembers")
    public String displayAllMembers(@RequestParam(required = false) String name,
                                    @RequestParam(required = false, defaultValue = "0") int age, Model model){
       model.addAttribute("members", MemberData.getAll());
        MemberData.add(new Member(name, age));
        return"members/listMembers";
    }
    @GetMapping("addMembers")
    public String renderAddMemberForm(){
        return "members/addMembers";
    }

}

