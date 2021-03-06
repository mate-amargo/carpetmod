package carpet.logging.logHelpers;

import carpet.logging.LoggerRegistry;
import carpet.utils.Messenger;
import net.minecraft.util.text.ITextComponent;

public class KillLogHelper {

    public static void onSweep(String name, int count)
    {
        LoggerRegistry.getLogger("kills").log( () -> new ITextComponent[]{
                Messenger.m(null, "g "+name+" smacked ","r "+count,"g  entities with sweeping")});
    }

    public static void onNonSweepAttack(String name)
    {
        LoggerRegistry.getLogger("kills").log( () -> new ITextComponent[]{
                Messenger.m(null, "g "+name+" smacked ","r 1","g  (no sweeping)")});
    }

    public static void onDudHit(String name)
    {
        LoggerRegistry.getLogger("kills").log( () -> new ITextComponent[]{
                Messenger.m(null, "g "+name+" dud hot = no one affected")});
    }
}
