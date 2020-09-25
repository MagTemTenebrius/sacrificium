package ru.sacrificium.core;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeManager;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import ru.sacrificium.util.Constants;

public class ObjectRegistration {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Constants.MODID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Constants.MODID);
    public static final DeferredRegister<Biome> BIOMES = DeferredRegister.create(ForgeRegistries.BIOMES, Constants.MODID);

//    public static final RegistryObject<Biome> TEST_BIOME = BIOMES.register("test_biome", TestBiome::new);

    public static void register() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        BLOCKS.register(modEventBus);
        ITEMS.register(modEventBus);
        BIOMES.register(modEventBus);


        SacrificiumItems.itemRegister();
        SacrificiumBlocks.blockRegistry();
    }

    public static void setupBiomes() {
//        BiomeManager.addBiome(BiomeManager.BiomeType.COOL, new BiomeManager.BiomeEntry(TEST_BIOME.get(), 10));
//
//        BiomeDictionary.addTypes(TEST_BIOME.get(), Type.PLAINS, Type.OVERWORLD);
    }
}
