package br.com.bdg.afundometro.Player;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class PlayerController {
    @GetMapping("/players")
    public String players() {
        return "Fufu";
    }
}
