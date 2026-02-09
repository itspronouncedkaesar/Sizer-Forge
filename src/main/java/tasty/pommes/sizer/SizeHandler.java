package tasty.pommes.sizer;

import net.minecraft.world.entity.player.Player;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class SizeHandler {

    @SubscribeEvent
    public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
        Player player = event.player;

        if (player.level().isClientSide) return;

        float scale = Config.PLAYER_SCALE.get().floatValue();
        player.getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.SCALE)
                .setBaseValue(scale);
    }
}
