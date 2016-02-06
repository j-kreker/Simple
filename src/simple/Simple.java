package simple;
import net.canarymod.plugin.Plugin;
import net.canarymod.logger.Logman;
import net.canarymod.Canary;
import net.canarymod.commandsys.*;
import net.canarymod.chat.MessageReceiver;
import net.canarymod.api.entity.living.humanoid.Player;
import com.pragprog.ahmine.ez.EZPlugin;
import net.canarymod.api.world.effects.SoundEffect;
import net.canarymod.api.world.position.Location;

public class Simple extends EZPlugin {
    @Command(aliases = {"simple"},
             description = "simple plugin",
             permissions = {""},
             toolTip = "/simple")

    public void simpleCommand(MessageReceiver caller, String[] parameters) {
        if (caller instanceof Player) {
            Player me = (Player) caller;
            int myAge = 12;
            int twicemyAge = myAge * 2;
            float volume = 0.1f;
            float pitch = 1.0f;
            double dayOnIo = 152853.5047;
            String myName = "Jan Kreker";

            me.chat("My Name is " + myName);
        }
    }
}
