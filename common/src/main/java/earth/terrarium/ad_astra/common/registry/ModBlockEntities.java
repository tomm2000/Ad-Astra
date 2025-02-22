package earth.terrarium.ad_astra.common.registry;

import earth.terrarium.ad_astra.AdAstra;
import earth.terrarium.ad_astra.common.block.door.SlidingDoorBlockEntity;
import earth.terrarium.ad_astra.common.block.flag.FlagBlockEntity;
import earth.terrarium.ad_astra.common.block.globe.GlobeBlockEntity;
import earth.terrarium.ad_astra.common.block.machine.entity.*;
import earth.terrarium.ad_astra.common.block.pipe.CableBlockEntity;
import earth.terrarium.ad_astra.common.block.pipe.FluidPipeBlockEntity;
import earth.terrarium.ad_astra.mixin.BlockEntityTypeAccessor;
import earth.terrarium.botarium.api.registry.RegistryHelpers;
import earth.terrarium.botarium.api.registry.RegistryHolder;
import net.minecraft.core.Registry;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntityType;

import java.util.HashSet;
import java.util.Set;
import java.util.function.Supplier;

public class ModBlockEntities {
    public static final RegistryHolder<BlockEntityType<?>> BLOCK_ENTITIES = new RegistryHolder<>(Registry.BLOCK_ENTITY_TYPE, AdAstra.MOD_ID);

    public static final Supplier<BlockEntityType<FlagBlockEntity>> FLAG_BLOCK_ENTITY = BLOCK_ENTITIES.register("flag", () -> RegistryHelpers.createBlockEntityType(FlagBlockEntity::new, ModBlocks.WHITE_FLAG.get(), ModBlocks.BLACK_FLAG.get(), ModBlocks.BLUE_FLAG.get(), ModBlocks.BROWN_FLAG.get(), ModBlocks.CYAN_FLAG.get(), ModBlocks.GRAY_FLAG.get(), ModBlocks.GREEN_FLAG.get(), ModBlocks.LIGHT_BLUE_FLAG.get(), ModBlocks.LIGHT_GRAY_FLAG.get(), ModBlocks.LIME_FLAG.get(), ModBlocks.MAGENTA_FLAG.get(), ModBlocks.ORANGE_FLAG.get(), ModBlocks.PINK_FLAG.get(), ModBlocks.PURPLE_FLAG.get(), ModBlocks.RED_FLAG.get(), ModBlocks.YELLOW_FLAG.get()));
    public static final Supplier<BlockEntityType<GlobeBlockEntity>> GLOBE_BLOCK_ENTITY = BLOCK_ENTITIES.register("globe", () -> RegistryHelpers.createBlockEntityType(GlobeBlockEntity::new, ModBlocks.EARTH_GLOBE.get(), ModBlocks.MOON_GLOBE.get(), ModBlocks.MARS_GLOBE.get(), ModBlocks.MERCURY_GLOBE.get(), ModBlocks.VENUS_GLOBE.get(), ModBlocks.GLACIO_GLOBE.get()));
    public static final Supplier<BlockEntityType<FuelRefineryBlockEntity>> FUEL_REFINERY = BLOCK_ENTITIES.register("fuel_refinery", () -> RegistryHelpers.createBlockEntityType(FuelRefineryBlockEntity::new, ModBlocks.FUEL_REFINERY.get()));
    public static final Supplier<BlockEntityType<CompressorBlockEntity>> COMPRESSOR = BLOCK_ENTITIES.register("compressor", () -> RegistryHelpers.createBlockEntityType(CompressorBlockEntity::new, ModBlocks.COMPRESSOR.get()));
    public static final Supplier<BlockEntityType<CoalGeneratorBlockEntity>> COAL_GENERATOR = BLOCK_ENTITIES.register("coal_generator", () -> RegistryHelpers.createBlockEntityType(CoalGeneratorBlockEntity::new, ModBlocks.COAL_GENERATOR.get()));
    public static final Supplier<BlockEntityType<OxygenLoaderBlockEntity>> OXYGEN_LOADER = BLOCK_ENTITIES.register("oxygen_loader", () -> RegistryHelpers.createBlockEntityType(OxygenLoaderBlockEntity::new, ModBlocks.OXYGEN_LOADER.get()));
    public static final Supplier<BlockEntityType<SolarPanelBlockEntity>> SOLAR_PANEL = BLOCK_ENTITIES.register("solar_panel", () -> RegistryHelpers.createBlockEntityType(SolarPanelBlockEntity::new, ModBlocks.SOLAR_PANEL.get()));
    public static final Supplier<BlockEntityType<NasaWorkbenchBlockEntity>> NASA_WORKBENCH = BLOCK_ENTITIES.register("nasa_workbench", () -> RegistryHelpers.createBlockEntityType(NasaWorkbenchBlockEntity::new, ModBlocks.NASA_WORKBENCH.get()));
    public static final Supplier<BlockEntityType<OxygenDistributorBlockEntity>> OXYGEN_DISTRIBUTOR = BLOCK_ENTITIES.register("oxygen_distributor", () -> RegistryHelpers.createBlockEntityType(OxygenDistributorBlockEntity::new, ModBlocks.OXYGEN_DISTRIBUTOR.get()));
    public static final Supplier<BlockEntityType<WaterPumpBlockEntity>> WATER_PUMP = BLOCK_ENTITIES.register("water_pump", () -> RegistryHelpers.createBlockEntityType(WaterPumpBlockEntity::new, ModBlocks.WATER_PUMP.get()));
    public static final Supplier<BlockEntityType<EnergizerBlockEntity>> ENERGIZER = BLOCK_ENTITIES.register("energizer", () -> RegistryHelpers.createBlockEntityType(EnergizerBlockEntity::new, ModBlocks.ENERGIZER.get()));
    public static final Supplier<BlockEntityType<CryoFreezerBlockEntity>> CRYO_FREEZER = BLOCK_ENTITIES.register("cryo_freezer", () -> RegistryHelpers.createBlockEntityType(CryoFreezerBlockEntity::new, ModBlocks.CRYO_FREEZER.get()));
    public static final Supplier<BlockEntityType<OxygenSensorBlockEntity>> OXYGEN_SENSOR = BLOCK_ENTITIES.register("oxygen_sensor", () -> RegistryHelpers.createBlockEntityType(OxygenSensorBlockEntity::new, ModBlocks.OXYGEN_SENSOR.get()));
    public static final Supplier<BlockEntityType<SlidingDoorBlockEntity>> SLIDING_DOOR = BLOCK_ENTITIES.register("sliding_door", () -> RegistryHelpers.createBlockEntityType(SlidingDoorBlockEntity::new, ModBlocks.IRON_SLIDING_DOOR.get(), ModBlocks.STEEL_SLIDING_DOOR.get(), ModBlocks.DESH_SLIDING_DOOR.get(), ModBlocks.OSTRUM_SLIDING_DOOR.get(), ModBlocks.CALORITE_SLIDING_DOOR.get(), ModBlocks.AIRLOCK.get(), ModBlocks.REINFORCED_DOOR.get()));
    public static final Supplier<BlockEntityType<CableBlockEntity>> CABLE = BLOCK_ENTITIES.register("cable", () -> RegistryHelpers.createBlockEntityType(CableBlockEntity::new, ModBlocks.STEEL_CABLE.get(), ModBlocks.DESH_CABLE.get()));
    public static final Supplier<BlockEntityType<FluidPipeBlockEntity>> FLUID_PIPE = BLOCK_ENTITIES.register("fluid_pipe", () -> RegistryHelpers.createBlockEntityType(FluidPipeBlockEntity::new, ModBlocks.DESH_FLUID_PIPE.get(), ModBlocks.OSTRUM_FLUID_PIPE.get()));

    public static void postInit() {
        // Add custom signs to the sign block entity registry
        BlockEntityTypeAccessor signRegistry = ((BlockEntityTypeAccessor) BlockEntityType.SIGN);
        Set<Block> signBlocks = new HashSet<>(signRegistry.getValidBlocks());
        signBlocks.add(ModBlocks.GLACIAN_SIGN.get());
        signBlocks.add(ModBlocks.GLACIAN_WALL_SIGN.get());
        signRegistry.setValidBlocks(signBlocks);

        // Add custom chests to the chest block entity registry
        BlockEntityTypeAccessor chestRegistry = ((BlockEntityTypeAccessor) BlockEntityType.CHEST);
        Set<Block> chestBlocks = new HashSet<>(chestRegistry.getValidBlocks());
        chestBlocks.add(ModBlocks.AERONOS_CHEST.get());
        chestBlocks.add(ModBlocks.STROPHAR_CHEST.get());
        chestRegistry.setValidBlocks(chestBlocks);
        ModEntityTypes.registerSpawnPlacements();
    }
}