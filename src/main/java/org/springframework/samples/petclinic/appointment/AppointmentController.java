package org.springframework.samples.petclinic.appointment;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppointmentController {
    @GetMapping("/apcontroller")
    public String welcome() {
        return "appointment";
    }
}
