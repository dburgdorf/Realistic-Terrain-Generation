package rtg.world.biome.realistic.enhancedbiomes;

import rtg.config.enhancedbiomes.ConfigEB;
import rtg.world.biome.BiomeBase;
import rtg.world.gen.surface.enhancedbiomes.SurfaceEBBasin;
import rtg.world.gen.terrain.enhancedbiomes.TerrainEBBasin;
import enhancedbiomes.EnhancedBiomesMod;

import net.minecraft.block.Block;
import net.minecraft.world.biome.BiomeGenBase;

public class RealisticBiomeEBBasin extends RealisticBiomeEBBase
{
    public static Block ebDominantStoneBlock;
    public static byte ebDominantStoneMeta;
    public static Block ebDominantCobblestoneBlock;
    public static byte ebDominantCobblestoneMeta;
    
	public RealisticBiomeEBBasin(BiomeGenBase ebBiome)
	{
		super(
			ebBiome, BiomeBase.climatizedBiome(BiomeGenBase.river, Climate.TEMPERATE),
			new TerrainEBBasin(false, -15f, 0f, 0f, 0f, 63f),
			new SurfaceEBBasin(
                getDominantEBGrass(ebBiome), //Block top 
                getDominantEBSoilMeta(ebBiome), //byte topByte
                getDominantEBDirt(ebBiome), //Block filler, 
                getDominantEBSoilMeta(ebBiome), //byte fillerByte
                getDominantEBGrass(ebBiome), //Block mixTop, 
                getDominantEBSoilMeta(ebBiome), //byte mixTopByte, 
                getDominantEBDirt(ebBiome), //Block mixFill, 
                getDominantEBSoilMeta(ebBiome), //byte mixFillByte, 
                EnhancedBiomesMod.getDominantStone(ebBiome.biomeID), //Block cliff1, 
                EnhancedBiomesMod.getDominantStoneMeta(ebBiome.biomeID), //byte cliff1Byte, 
                EnhancedBiomesMod.getCobbleFromStone(EnhancedBiomesMod.getDominantStone(ebBiome.biomeID)), //Block cliff2, 
                EnhancedBiomesMod.getDominantStoneMeta(ebBiome.biomeID), //byte cliff2Byte, 
                80f, //float mixWidth, 
                -0.15f, //float mixHeight, 
                10f, //float smallWidth, 
                0.5f //float smallStrength
            )
		);
		
		this.setRealisticBiomeName("EB Basin");
		this.biomeSize = BiomeSize.NORMAL;
		this.biomeWeight = ConfigEB.weightEBBasin;
		this.generateVillages = ConfigEB.villageEBBasin;
        
        this.ebDominantStoneBlock = EnhancedBiomesMod.getDominantStone(ebBiome.biomeID);
        this.ebDominantStoneMeta = EnhancedBiomesMod.getDominantStoneMeta(ebBiome.biomeID);
        this.ebDominantCobblestoneBlock = EnhancedBiomesMod.getCobbleFromStone(ebDominantStoneBlock);
        this.ebDominantCobblestoneMeta = ebDominantStoneMeta;
    }
}
