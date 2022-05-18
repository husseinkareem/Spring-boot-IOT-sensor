package com.assignment.sensor.Controllers;

import java.sql.SQLException;

import com.assignment.sensor.DAO.Dao;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ThymeleafController {

    Dao dao = new Dao();

    @RequestMapping("/websocket")
    public String websocket(Model model) throws SQLException {

        model.addAttribute("temps", dao.getAllHistory());

        return "websocket";
    }

    @RequestMapping("/graph")
    public String graph(Model model) throws SQLException {

        model.addAttribute("temps", dao.getAllHistory());

        return "graph";
    }
}
