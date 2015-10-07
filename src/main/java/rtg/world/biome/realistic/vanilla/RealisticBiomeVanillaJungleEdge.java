package rtg.world.biome.realistic.vanilla;

import net.minecraft.block.Block;
import net.minecraft.world.biome.BiomeGenBase;
import rtg.config.ConfigRTG;
import rtg.world.biome.BiomeBase;
import rtg.world.gen.surface.vanilla.SurfaceVanillaJungleEdge;
import rtg.world.gen.terrain.vanilla.TerrainVanillaJungleEdge;

public class RealisticBiomeVanillaJungleEdge extends RealisticBiomeVanillaBase
{	
	public static Block topBlock = BiomeGenBase.jungleEdge.topBlock;
	public static Block fillerBlock = BiomeGenBase.jungleEdge.fillerBlock;
	
	public RealisticBiomeVanillaJungleEdge()
	{
		super(
			BiomeGenBase.jungleEdge,
			BiomeBase.climatizedBiome(BiomeGenBase.river, Climate.WET),
			new TerrainVanillaJungleEdge(),
			new SurfaceVanillaJungleEdge(topBlock, fillerBlock, false, null, 1.3f)
		);
		
		this.setRealisticBiomeName("Vanilla Jungle Edge");
		this.biomeCategory = BiomeCategory.WET;
		this.biomeWeight = ConfigRTG.weightVanillaJungleEdge;
	}	
}
