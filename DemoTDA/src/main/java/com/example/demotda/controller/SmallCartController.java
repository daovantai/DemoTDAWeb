package com.example.demotda.controller;

import com.example.demotda.model.Cart;
import com.example.demotda.repositorie.CartRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.security.Principal;
import java.util.List;

@Controller
@RequestMapping("smallcart")
public class SmallCartController {
    private CartRepo cartRepo;
    @Autowired
    public SmallCartController(CartRepo cartRepo){
        this.cartRepo=cartRepo;
    }

    @GetMapping
    public String smallcart(Principal principal, Model model){
        String username= principal.getName();
        List<Cart> listsmall= cartRepo.getCartByUsername(username);
        model.addAttribute("listsmall", listsmall);

        return "fragments/headeruser";
    }
}