package rtg.world.biome.realistic.biomesoplenty;

import net.minecraft.init.Biomes;
import net.minecraft.world.biome.Biome;

import biomesoplenty.api.biome.BOPBiomes;

import rtg.api.biome.BiomeConfig;
import rtg.world.biome.deco.DecoBaseBiomeDecorations;
import rtg.world.gen.surface.biomesoplenty.SurfaceBOPMeadow;
import rtg.world.gen.terrain.biomesoplenty.TerrainBOPMeadow;

public class RealisticBiomeBOPMeadow extends RealisticBiomeBOPBase {

    public static Biome biome = BOPBiomes.meadow.get();
    public static Biome river = Biomes.RIVER;

    public RealisticBiomeBOPMeadow(BiomeConfig config) {

        super(config, biome, river,
            new TerrainBOPMeadow(),
            new SurfaceBOPMeadow(config, biome.topBlock, biome.fillerBlock)
        );

        DecoBaseBiomeDecorations decoBaseBiomeDecorations = new DecoBaseBiomeDecorations();
        this.addDeco(decoBaseBiomeDecorations);
    }
}
