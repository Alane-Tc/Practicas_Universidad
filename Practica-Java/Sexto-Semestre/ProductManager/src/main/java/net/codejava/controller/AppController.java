package net.codejava.controller;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import net.codejava.services.ProductService;
import net.codejava.Usuario;
import net.codejava.entity.Product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AppController {

    @Autowired
    private ProductService service;

    @RequestMapping("/")
    public String viewHomePage(HttpSession session, Model model) {

        if (session.getAttribute("mySessionAttribute") != null) {
            List<Product> listProducts = service.listAll();
            model.addAttribute("listProducts", listProducts);
            return "index";
        } else {
            model.addAttribute("usuario", new Usuario());
            return "login";
        }
        //model.addAttribute("listProducts", listProducts);
    }

    @RequestMapping("/login")
    public String login(HttpSession session) {
        session.setAttribute("mySessionAttribute", "sasas");

        // model.addAttribute("listProducts", listProducts);
        return "redirect:/";
    }

    @RequestMapping("/new")
    public String showNewProductPage(Model model) {
        Product product = new Product();
        model.addAttribute("product", product);
        return "new_product";
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String saveProduct(@ModelAttribute("product") Product product) {
        product.calcularArea();
        product.calcularPerimetro();
        service.save(product);
        return "redirect:/";
    }

    @RequestMapping("/edit/{id}")
    public ModelAndView showEditProductPage(@PathVariable(name = "id") int id) {
        ModelAndView mav = new ModelAndView("edit_product");
        Product product = service.get(id);
        mav.addObject("product", product);

        return mav;
    }

    @RequestMapping("/delete/{id}")
    public String deleteProduct(@PathVariable(name = "id") int id) {
        service.delete(id);
        return "redirect:/";
    }
}
