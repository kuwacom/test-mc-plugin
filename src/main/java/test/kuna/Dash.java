package test.kuna;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerToggleSneakEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class Dash extends JavaPlugin implements Listener {
    private void timer(long m){
        try {
            Thread.sleep(m);
        }catch(InterruptedException e){}
    }
    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(this, this);
        System.out.println("Plugin is enable");
    }
    @EventHandler
    public void onEnable(PlayerToggleSneakEvent e) {
        System.out.print("test");
        Player player = e.getPlayer();
        player.setSneaking(false);
        player.setWalkSpeed(1);
        this.timer(5000);
        player.setWalkSpeed(-1);
        player.chat("I'm shift now!!");
    }
}