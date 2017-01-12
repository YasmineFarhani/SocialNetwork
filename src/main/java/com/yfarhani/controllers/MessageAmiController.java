package com.yfarhani.controllers;

import com.yfarhani.models.Message;
import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.persistence.EntityManager;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Map;

@Controller
public class MessageAmiController {

    @Autowired EntityManager em;

    @GetMapping("/murAmi")
    public String mur(Map<String, Object> model) {
        List<Message> messages = em.createQuery("select m from Message m", Message.class).getResultList();
        // System.out.println(messages);
        // TODO : fetch data from db
        model.put("messages", messages);
        model.put("nomAmi", "Billy");
        model.put("messageAmi", "Salut Billy !");
        return "murAmi";
    }

    @PostMapping("/murAmi")
    public String handleFriendPost(HttpServletRequest request, HttpServletResponse response) throws Exception {
        // TODO : insert message in db
        response.sendRedirect("/murAmi");
        return null;
    }
}

