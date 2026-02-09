package tasty.pommes.sizer;

import net.minecraftforge.common.ForgeConfigSpec;

public class Config {
    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();

    public static final ForgeConfigSpec.DoubleValue PLAYER_SCALE = BUILDER
            .comment("Player visual size scale (1.0 = normal)")
            .defineInRange("playerScale", 1.0, 0.1, 10.0);

    public static final ForgeConfigSpec SPEC = BUILDER.build();
}
