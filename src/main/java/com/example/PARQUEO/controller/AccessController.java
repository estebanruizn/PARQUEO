    package com.example.PARQUEO.controller;

    import com.example.PARQUEO.Model.Admin;
    import com.example.PARQUEO.impservice.IAdminService;
    import com.example.PARQUEO.interfaces.Iadmin;
    import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.stereotype.Controller;
    import org.springframework.web.bind.annotation.PostMapping;
    import org.springframework.web.bind.annotation.RequestMapping;
    import org.springframework.web.bind.annotation.RequestParam;
    import org.springframework.web.servlet.ModelAndView;

    import java.util.Optional;

    @Controller
    @RequestMapping
    public class AccessController {

        @Autowired
        private IAdminService datas;


    }