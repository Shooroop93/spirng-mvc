//package com.sergeev.mvc.obsolete;
//
//import com.sergeev.mvc.calculator.constant.Action;
//import com.sergeev.mvc.calculator.logic.Calculate;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//
//import javax.servlet.http.HttpServletRequest;
//
//@Controller
//@RequestMapping("/first")
//public class FirstController {
//
//    @GetMapping("/calculator")
//    public String calculator(@RequestParam(value = "numOne") String numOne,
//                             @RequestParam(value = "numTwo") String numTwo,
//                             @RequestParam(value = "action") String action,
//                             Model model) {
//        Calculate calculate = new Calculate();
//
//        Double numOneCalculate = null;
//        Double numTwoCalculate = null;
//        Action actionEnum = null;
//
//        try {
//            numOneCalculate = calculate.returnDoubleNum(numOne);
//            numTwoCalculate = calculate.returnDoubleNum(numTwo);
//        } catch (NumberFormatException numberFormatException) {
//            model.addAttribute("messageErrorNum", "Enter data that is a fraction or an integer");
//        }
//
//        try {
//            actionEnum = Action.valueOf(action.toUpperCase());
//        } catch (IllegalArgumentException illegalArgumentException) {
//            model.addAttribute("messageErrorAction", "Arithmetic operation passed incorrectly");
//        }
//
//        if (model.getAttribute("messageErrorNum") == null && model.getAttribute("messageErrorAction") == null) {
//            Double result = calculate.calculateHTML(numOneCalculate, numTwoCalculate, actionEnum);
//            model.addAttribute("resultCalculate",
//                    "Result calculator: " + numOneCalculate + " " + actionEnum.getAction() + " " + numTwoCalculate + " = " + result);
//        }
//
//        return "first/calculate";
//    }
//
//    @GetMapping("/hello")
//    public String helloPage(HttpServletRequest request) {
//        String name = request.getParameter("name");
//        String surname = request.getParameter("surname");
//
//        System.out.println(name + " " + surname);
//
//        return "first/hello";
//    }
//
//    @GetMapping("/goodbye")
//    public String goodByePage(@RequestParam(value = "name", required = false) String name,
//                              @RequestParam(value = "surname", required = false) String surname,
//                              Model model) {
//
//        model.addAttribute("message", "Hello " + name + " " + surname);
//        System.out.println(name + " " + surname);
//        return "first/goodbye";
//    }
//}