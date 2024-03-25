package backend.proyect.global.proyect_global.Player;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("http://localhost:5173")
@RestController
@RequestMapping(path = "/api/v1/players")
public class PlayerController {

    @Autowired
    private PlayerService servicePl;

    @GetMapping
    public List<Player> ListAll() {
        return servicePl.getAllPlayers();
    }

    @PostMapping
    public Player create(@RequestBody Player player) {
        return servicePl.createPlay(player);
    }

    @PostMapping("edit/{id}")
    public Player update(@RequestBody Player player, @PathVariable Long id) {
        player.setIdPlayer(id);
        return servicePl.updateplay(player);
    }

    @DeleteMapping("eliminate/{id}")
    public void delete(@PathVariable Long id) {
        servicePl.deletePlay(id);
    }
}