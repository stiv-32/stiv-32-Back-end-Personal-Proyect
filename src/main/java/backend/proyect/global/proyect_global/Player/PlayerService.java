package backend.proyect.global.proyect_global.Player;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlayerService {

    @Autowired
    private PlayerRepository playerRepository;

    // mostrar
    public List<Player> getAllPlayers() {
        return playerRepository.findAll();
    }

    public Player createPlay(Player player) {
        return playerRepository.save(player);
    }

    public Player updateplay(Player player) {
        return playerRepository.save(player);
    }

    public void deletePlay(Long id) {
        playerRepository.deleteById(id);
    }
}