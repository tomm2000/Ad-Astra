package earth.terrarium.ad_astra.datagen.provider.client;

import earth.terrarium.ad_astra.AdAstra;
import earth.terrarium.ad_astra.common.registry.ModBlocks;
import earth.terrarium.ad_astra.common.registry.ModEntityTypes;
import earth.terrarium.ad_astra.common.registry.ModItems;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.WallSignBlock;
import net.minecraftforge.common.data.LanguageProvider;
import net.minecraftforge.registries.ForgeRegistries;
import org.codehaus.plexus.util.StringUtils;

import java.util.function.Supplier;

public class ModLangProvider extends LanguageProvider {
    public ModLangProvider(DataGenerator pGenerator) {
        super(pGenerator, AdAstra.MOD_ID, "en_us");
    }

    @Override
    protected void addTranslations() {
        add("itemGroup.ad_astra.main", "Ad Astra");

        for (Supplier<Block> block : ModBlocks.BLOCKS.getRegistries()) {
            ResourceLocation id = ForgeRegistries.BLOCKS.getKey(block.get());
            if (block.get() instanceof WallSignBlock) continue;
            addBlock(block, StringUtils.capitaliseAllWords(id.getPath().replace("_", " ")));
        }

        ModItems.ITEMS.getRegistries().forEach(reg -> {
            if (!(reg.get() instanceof BlockItem)) {
                ResourceLocation id = ForgeRegistries.ITEMS.getKey(reg.get());
                addItem(reg, StringUtils.capitaliseAllWords(id.getPath().replace("_", " ")));
            }
        });

        ModEntityTypes.ENTITY_TYPES.getRegistries().forEach(reg -> {
            ResourceLocation id = ForgeRegistries.ENTITY_TYPES.getKey(reg.get());
            addEntityType(reg, StringUtils.capitaliseAllWords(id.getPath().replace("_", " ")));
        });

        add("advancements.ad_astra.ad_astra.description", "§bConstruct a NASA Workbench, allowing you to craft rockets");
        add("advancements.ad_astra.ad_astra.title", "Ad Astra");
        add("advancements.ad_astra.astro_cuisine.description", "§bThrow raw food into the atmosphere while in orbit, causing it to cook.");
        add("advancements.ad_astra.astro_cuisine.title", "§bAstro Cuisine");
        add("advancements.ad_astra.challenger.description", "§bCollect every globe");
        add("advancements.ad_astra.challenger.title", "Challenger");
        add("advancements.ad_astra.glacio_dungeon.description", "§bEnter a Glacio dungeon");
        add("advancements.ad_astra.glacio_dungeon.title", "Down in the Depths");
        add("advancements.ad_astra.interstellar.description", "§bEnter a new Star System");
        add("advancements.ad_astra.interstellar.title", "Interstellar");
        add("advancements.ad_astra.jet_suit.description", "§bEquip a jet suit, allowing for unimaginable flight capabilities");
        add("advancements.ad_astra.jet_suit.title", "Now that's an upgrade!");
        add("advancements.ad_astra.mars.description", "§bLand on Mars");
        add("advancements.ad_astra.mars.title", "The Red Planet");
        add("advancements.ad_astra.mars_dungeon.description", "§bEnter a Mars dungeon");
        add("advancements.ad_astra.mars_dungeon.title", "What lies below the dust?");
        add("advancements.ad_astra.mercury.description", "§bLand on Mercury");
        add("advancements.ad_astra.mercury.title", "Quite the Sun Tan");
        add("advancements.ad_astra.mercury_dungeon.description", "§bEnter a Mercury dungeon");
        add("advancements.ad_astra.mercury_dungeon.title", "Back to the Future");
        add("advancements.ad_astra.moon.description", "§bLand on the Moon");
        add("advancements.ad_astra.moon.title", "One Small Step");
        add("advancements.ad_astra.moon_dungeon.description", "§bEnter a Moon dungeon");
        add("advancements.ad_astra.moon_dungeon.title", "Secrets Beneath");
        add("advancements.ad_astra.netherite_space_suit.description", "§bEquip a netherite space suit, allowing you to survive the most dangerous conditions.");
        add("advancements.ad_astra.netherite_space_suit.title", "Beat the Heat");
        add("advancements.ad_astra.rocket_destroyed.description", "§bLaunch a rocket with no passenger, causing it to explode in the sky.");
        add("advancements.ad_astra.rocket_destroyed.title", "§bChasing Voyager 1.... or not...");
        add("advancements.ad_astra.space_suit.description", "§bEquip your first space suit");
        add("advancements.ad_astra.space_suit.title", "Astronaut");
        add("advancements.ad_astra.tier_1_rocket.description", "§bConstruct a Tier 1 Rocket");
        add("advancements.ad_astra.tier_1_rocket.title", "Humble Beginnings");
        add("advancements.ad_astra.tier_2_rocket.description", "§bConstruct a Tier 2 Rocket");
        add("advancements.ad_astra.tier_2_rocket.title", "Ready for Mars");
        add("advancements.ad_astra.tier_3_rocket.description", "§bConstruct a Tier 3 Rocket");
        add("advancements.ad_astra.tier_3_rocket.title", "Prepared for Danger");
        add("advancements.ad_astra.tier_4_rocket.description", "§bConstruct a Tier 4 Rocket");
        add("advancements.ad_astra.tier_4_rocket.title", "The Sky is the Limit");
        add("advancements.ad_astra.venus.description", "§bLand on Venus");
        add("advancements.ad_astra.venus.title", "Hell away from Home");
        add("advancements.ad_astra.venus_dungeon.description", "§bEnter a Venus dungeon");
        add("advancements.ad_astra.venus_dungeon.title", "Hellish Treasures");
        add("biome.ad_astra.glacio_ice_peaks", "Glacio Ice Peaks");
        add("biome.ad_astra.glacio_snowy_barrens", "Glacio Snowy Barrens");
        add("biome.ad_astra.infernal_venus_barrens", "Infernal Venus Barrens");
        add("biome.ad_astra.lunar_wastelands", "Lunar Wastelands");
        add("biome.ad_astra.martian_canyon_creek", "Martian Canyon Creek");
        add("biome.ad_astra.martian_polar_caps", "Martian Polar Caps");
        add("biome.ad_astra.martian_wastelands", "Martian Wastelands");
        add("biome.ad_astra.mercury_deltas", "Mercury Deltas");
        add("biome.ad_astra.orbit", "Orbit");
        add("biome.ad_astra.venus_wastelands", "Venus Wastelands");
        add("death.attack.acid_rain", "%1$s was a sacrifice to the acid");
        add("death.attack.cryo_fuel", "%1$s became an ice cube");
        add("death.attack.oxygen", "%1$s couldn't breathe anymore");
        add("death.attack.oxygen.player", "%1$s couldn't breathe anymore");
        add("death.attack.rocket_flames", "%1$s melted under an active rocket");
        add("death.attack.rocket_flames.player", "%1$s melted under an active rocket");
        add("emi.category.ad_astra.coal_generator", "Coal Generator");
        add("emi.category.ad_astra.compressor", "Compressor");
        add("emi.category.ad_astra.cryo_freezer_conversion", "Cryo Freezer Conversion");
        add("emi.category.ad_astra.fuel_conversion", "Fuel Conversion");
        add("emi.category.ad_astra.nasa_workbench", "NASA Workbench");
        add("emi.category.ad_astra.oxygen_conversion", "Oxygen Conversion");
        add("emi.category.ad_astra.space_station", "Space Station");
        add("gauge.ad_astra.burn_time", "Burn Time: %s / %d");
        add("gauge.ad_astra.cook_time", "Cook Time: %s / %d");
        add("gauge.ad_astra.cooktime", "Cook Time");
        add("gauge.ad_astra.energy", "Energy");
        add("gauge.ad_astra.fluid", "Fluid");
        add("gauge.ad_astra.fuel", "Fuel");
        add("gauge.ad_astra.oxygen", "Oxygen");
        add("gauge_text.ad_astra.blocked_warning[0]", "§4No Oxygen is Being Generated!");
        add("gauge_text.ad_astra.blocked_warning[1]", "Ensure that there is no block above the distributor");
        add("gauge_text.ad_astra.blocked_warning[2]", "and enough oxygen and power is being supplied.");
        add("gauge_text.ad_astra.energy_per_tick", "%s ⚡ / tick");
        add("gauge_text.ad_astra.fluid_per_tick", "%s 🪣 / sec");
        add("gauge_text.ad_astra.liquid_storage", "%s 🪣 / %d 🪣");
        add("gauge_text.ad_astra.max_generation", "Max. Energy Generation");
        add("gauge_text.ad_astra.oxygen_blocks", "Oxygen Blocks:");
        add("gauge_text.ad_astra.oxygen_leak_warning[0]", "§4Oxygen Leak Detected! §fThis could mean that");
        add("gauge_text.ad_astra.oxygen_leak_warning[1]", "there is a hole somewhere in the structure or");
        add("gauge_text.ad_astra.oxygen_leak_warning[2]", "the structure is too large for this distributor");
        add("gauge_text.ad_astra.oxygen_leak_warning[3]", "to handle. Ensure that the entire structure is");
        add("gauge_text.ad_astra.oxygen_leak_warning[4]", "completely sealed.");
        add("gauge_text.ad_astra.storage", "§eEnergy: %s ⚡ / %d ⚡");
        add("gui.ad_astra.text.back", "Back");
        add("gui.ad_astra.text.catalog", "CATALOG");
        add("gui.ad_astra.text.category", "Category");
        add("gui.ad_astra.text.confirm", "Confirm Selection");
        add("gui.ad_astra.text.earth", "Earth");
        add("gui.ad_astra.text.flag_url", "Flag Url (https://i.imgur.com/urURL.png)");
        add("gui.ad_astra.text.galaxy", "Galaxy");
        add("gui.ad_astra.text.glacio", "Glacio");
        add("gui.ad_astra.text.gravity", "Gravity");
        add("gui.ad_astra.text.hide", "Hide");
        add("gui.ad_astra.text.item_requirement", "Item Requirement");
        add("gui.ad_astra.text.mars", "Mars");
        add("gui.ad_astra.text.mercury", "Mercury");
        add("gui.ad_astra.text.milky_way", "Milky Way");
        add("gui.ad_astra.text.moon", "Moon");
        add("gui.ad_astra.text.name", "Planet Selection");
        add("gui.ad_astra.text.no_gravity", "No Gravity");
        add("gui.ad_astra.text.orbit", "Orbit");
        add("gui.ad_astra.text.oxygen", "Oxygen");
        add("gui.ad_astra.text.oxygen.false", "false");
        add("gui.ad_astra.text.oxygen.true", "true");
        add("gui.ad_astra.text.planet", "Planet");
        add("gui.ad_astra.text.provided", "Provided");
        add("gui.ad_astra.text.proxima_centauri", "Proxima Centauri");
        add("gui.ad_astra.text.show", "Show");
        add("gui.ad_astra.text.solar_system", "Solar System");
        add("gui.ad_astra.text.space_station", "Space Station");
        add("gui.ad_astra.text.temperature", "Temperature");
        add("gui.ad_astra.text.type", "Type");
        add("gui.ad_astra.text.venus", "Venus");
        add("gui.ad_astra.text.warning", " §e⚠ §cWarning §e⚠");
        add("info.ad_astra.extract", "Extract");
        add("info.ad_astra.insert", "Insert");
        add("info.ad_astra.install_patchouli", "Install Patchouli!");
        add("info.ad_astra.none", "None");
        add("info.ad_astra.normal", "Normal");
        add("message.ad_astra.flag.not_owner", "§cYou do not own this flag!");
        add("message.ad_astra.hold_space", "§7Hold §cSpace!");
        add("message.ad_astra.no_fuel", "§cNO FUEL! §7Fill the Rocket with §cFuel§7. (§6Sneak and Right Click§7)");
        add("message.ad_astra.speed", "%s m/s");
        add("rei.category.ad_astra.space_station", "Space Station");
        add("rei.text.ad_astra.amount", "Amount: %s 🪣");
        add("rei.text.ad_astra.conversion_ratio", "Conversion Ratio: %s%%");
        add("rei.text.ad_astra.generates", "Generates %s ⚡");
        add("rei.text.ad_astra.oil.body", "Oil is located on the ocean surface.");
        add("rei.text.ad_astra.oil.title", "Finding Oil");
        add("rei.text.ad_astra.seconds", "%s Seconds");
        add("rei.tooltip.ad_astra.energy_generating", "Generating %s ⚡ / tick");
        add("rei.tooltip.ad_astra.energy_using", "Using %s ⚡ / tick");
        add("subtitles.ad_astra.alien_watcher", "Alien Watching");
        add("subtitles.ad_astra.drone_fly_by", "Drone Flying By");
        add("subtitles.ad_astra.flying_saucer", "Flying Saucer");
        add("subtitles.ad_astra.imminent_doom", "Imminent Doom");
        add("subtitles.ad_astra.large_door_close", "Space Door Closing");
        add("subtitles.ad_astra.large_door_open", "Space Door Opening");
        add("subtitles.ad_astra.light_speed_travel", "Light Speed Spaceship");
        add("subtitles.ad_astra.passing_spaceship", "Passing Spaceship");
        add("subtitles.ad_astra.rocket_fly", "Rocket Flying");
        add("subtitles.ad_astra.small_door_open", "Glass Door Opening");
        add("subtitles.ad_astra.space_laser", "Space Laser");
        add("subtitles.ad_astra.wormhole", "Wormhole");
        add("subtitles.ad_astra.wrench", "Wrench Twisting");
        add("tag.c.calorite_blocks", "Calorite Blocks");
        add("tag.c.calorite_ingots", "Calorite Ingots");
        add("tag.c.calorite_nuggets", "Calorite Nuggets");
        add("tag.c.calorite_ores", "Calorite Ores");
        add("tag.c.calorite_plate", "Calorite Plate");
        add("tag.c.calorite_plates", "Calorite Plates");
        add("tag.c.cheese_ores", "Cheese Ores");
        add("tag.c.cheeses", "Cheeses");
        add("tag.c.desh_blocks", "Desh Blocks");
        add("tag.c.desh_ingots", "Desh Ingots");
        add("tag.c.desh_nuggets", "Desh Nuggets");
        add("tag.c.desh_ores", "Desh Ores");
        add("tag.c.desh_plate", "Desh Plate");
        add("tag.c.desh_plates", "Desh Plates");
        add("tag.c.ice_shard_ores", "Ice Shard Ores");
        add("tag.c.iron_plates", "Iron Plates");
        add("tag.c.iron_rods", "Iron Rods");
        add("tag.c.ostrum_blocks", "Ostrum Blocks");
        add("tag.c.ostrum_ingots", "Ostrum Ingots");
        add("tag.c.ostrum_nuggets", "Ostrum Nuggets");
        add("tag.c.ostrum_ores", "Ostrum Ores");
        add("tag.c.ostrum_plate", "Ostrum Plate");
        add("tag.c.ostrum_plates", "Ostrum Plates");
        add("tag.c.raw_calorite_ores", "Raw Calorite Ores");
        add("tag.c.raw_desh_ores", "Raw Desh Ores");
        add("tag.c.raw_ostrum_ores", "Raw Ostrum Ores");
        add("tag.c.steel_blocks", "Steel Blocks");
        add("tag.c.steel_ingots", "Steel Ingots");
        add("tag.c.steel_nuggets", "Steel Nuggets");
        add("tag.c.steel_plate", "Steel Plate");
        add("tag.c.steel_plates", "Steel Plates");
        add("text.resourcefulconfig.ad_astra.category.Main", "Main");
        add("text.resourcefulconfig.ad_astra.option.spawning", "Spawning");
        add("text.resourcefulconfig.ad_astra.option.coalGenerator", "Coal Generator");
        add("text.resourcefulconfig.ad_astra.option.coalGenerator.energyPerTick", "Energy Per Tick");
        add("text.resourcefulconfig.ad_astra.option.coalGenerator.maxEnergy", "Max Energy");
        add("text.resourcefulconfig.ad_astra.option.compressor", "Compressor");
        add("text.resourcefulconfig.ad_astra.option.compressor.energyPerTick", "Energy Per Tick");
        add("text.resourcefulconfig.ad_astra.option.compressor.maxEnergy", "Max Energy");
        add("text.resourcefulconfig.ad_astra.option.cryoFreezer", "Cryo Freezer");
        add("text.resourcefulconfig.ad_astra.option.cryoFreezer.energyPerTick", "Energy Per Tick");
        add("text.resourcefulconfig.ad_astra.option.cryoFreezer.maxEnergy", "Max Energy");
        add("text.resourcefulconfig.ad_astra.option.cryoFreezer.tankSize", "Tank Size");
        add("text.resourcefulconfig.ad_astra.option.energizer", "Energizer");
        add("text.resourcefulconfig.ad_astra.option.energizer.energyPerTick", "Energy Per Tick");
        add("text.resourcefulconfig.ad_astra.option.energizer.maxEnergy", "Max Energy");
        add("text.resourcefulconfig.ad_astra.option.fuelRefinery", "Fuel Refinery");
        add("text.resourcefulconfig.ad_astra.option.fuelRefinery.energyPerTick", "Energy Per Tick");
        add("text.resourcefulconfig.ad_astra.option.fuelRefinery.maxEnergy", "Max Energy");
        add("text.resourcefulconfig.ad_astra.option.fuelRefinery.tankSize", "Tank Size");
        add("text.resourcefulconfig.ad_astra.option.general", "General");
        add("text.resourcefulconfig.ad_astra.option.general.acidRainBurns", "Acid Rain Burns");
        add("text.resourcefulconfig.ad_astra.option.general.acidRainDamage", "Acid Rain Damage");
        add("text.resourcefulconfig.ad_astra.option.general.allowFlagImages", "Allow Images on Flags");
        add("text.resourcefulconfig.ad_astra.option.general.disabledPlanets", "Disabled Planets");
        add("text.resourcefulconfig.ad_astra.option.general.doEntityGravity", "Do Entity Gravity");
        add("text.resourcefulconfig.ad_astra.option.general.doEntityGravity.tooltip", "Do gravity for items, boats, arrows etc.");
        add("text.resourcefulconfig.ad_astra.option.general.doLivingEntityGravity", "Do Living Entity Gravity");
        add("text.resourcefulconfig.ad_astra.option.general.doLivingEntityGravity.tooltip", "Do gravity for mobs, players etc.");
        add("text.resourcefulconfig.ad_astra.option.general.doOxygen", "Do Oxygen");
        add("text.resourcefulconfig.ad_astra.option.general.doSpaceMuffler", "Do Space Muffler");
        add("text.resourcefulconfig.ad_astra.option.general.doSpaceMuffler.tooltip", "Do sound suppression in orbit dimensions. If it gets annoying, you can turn it off.");
        add("text.resourcefulconfig.ad_astra.option.general.energyBarXOffset", "Energy Bar X Offset");
        add("text.resourcefulconfig.ad_astra.option.general.energyBarYOffset", "Energy Bar Y Offset");
        add("text.resourcefulconfig.ad_astra.option.general.freezeDamage", "Freeze Damage");
        add("text.resourcefulconfig.ad_astra.option.general.giveAstroduxAtSpawn", "Give Astrodux At Spawn");
        add("text.resourcefulconfig.ad_astra.option.general.hammerDurability", "Hammer Durability");
        add("text.resourcefulconfig.ad_astra.option.general.heatDamage", "Heat Damage");
        add("text.resourcefulconfig.ad_astra.option.general.orbitGravity", "Orbit Gravity");
        add("text.resourcefulconfig.ad_astra.option.general.oxygenBarXOffset", "Oxygen Bar X Offset");
        add("text.resourcefulconfig.ad_astra.option.general.oxygenBarYOffset", "Oxygen Bar Y Offset");
        add("text.resourcefulconfig.ad_astra.option.general.oxygenDamage", "Oxygen Damage");
        add("text.resourcefulconfig.ad_astra.option.general.oxygenTankSize", "Oxygen Tank Size");
        add("text.resourcefulconfig.ad_astra.option.general.spawnCorruptedLunarians", "Spawn Corrupted Lunarians");
        add("text.resourcefulconfig.ad_astra.option.general.spawnLunarianWanderingTrader", "Spawn Lunarian Wandering Trader");
        add("text.resourcefulconfig.ad_astra.option.general.spawnMartianRaptors", "Spawn Martian Raptors");
        add("text.resourcefulconfig.ad_astra.option.general.spawnMoglers", "Spawn Moglers");
        add("text.resourcefulconfig.ad_astra.option.general.spawnStarCrawlers", "Spawn Star Crawlers");
        add("text.resourcefulconfig.ad_astra.option.general.spawnSulfurCreepers", "Spawn Sulfur Creepers");
        add("text.resourcefulconfig.ad_astra.option.lander", "Lander");
        add("text.resourcefulconfig.ad_astra.option.lander.boosterSpeed", "Booster Speed");
        add("text.resourcefulconfig.ad_astra.option.lander.boosterThreshold", "Booster Threshold");
        add("text.resourcefulconfig.ad_astra.option.lander.boosterThreshold.tooltip", "The maximum amount that the lander boosters can boost. If you put this above 0, the lander can fly up.");
        add("text.resourcefulconfig.ad_astra.option.oxygenDistributor", "Oxygen Distributor");
        add("text.resourcefulconfig.ad_astra.option.oxygenDistributor.energyMultiplier", "Energy Multiplier");
        add("text.resourcefulconfig.ad_astra.option.oxygenDistributor.energyMultiplier.tooltip", "Increases the energy requirements as the distributor covers more blocks.");
        add("text.resourcefulconfig.ad_astra.option.oxygenDistributor.fluidConversionEnergyPerTick", "Energy Per Tick");
        add("text.resourcefulconfig.ad_astra.option.oxygenDistributor.maxBlockChecks", "Max Block Checks");
        add("text.resourcefulconfig.ad_astra.option.oxygenDistributor.maxBlockChecks.tooltip", "How many blocks the distributor can distribute oxygen in. Be careful increasing this number, as it can reduce server performance significantly. If you are adamant about increasing this value, consider increasing the Oxygen Loader refresh ticks so the server is not constantly checking thousands of blocks.");
        add("text.resourcefulconfig.ad_astra.option.oxygenDistributor.maxEnergy", "Max Energy");
        add("text.resourcefulconfig.ad_astra.option.oxygenDistributor.oxygenMultiplier", "Oxygen Multiplier");
        add("text.resourcefulconfig.ad_astra.option.oxygenDistributor.oxygenMultiplier.@Tooltip", "Increases the oxygen requirements as the distributor covers more blocks.");
        add("text.resourcefulconfig.ad_astra.option.oxygenDistributor.refreshTicks", "Refresh Ticks");
        add("text.resourcefulconfig.ad_astra.option.oxygenDistributor.refreshTicks.tooltip", "How often the oxygen loader checks if the structure is sealed. Performing this operation too often can kill server TPS, so be wary.");
        add("text.resourcefulconfig.ad_astra.option.oxygenDistributor.tankSize", "Tank Size");
        add("text.resourcefulconfig.ad_astra.option.oxygenLoader", "Oxygen Loader");
        add("text.resourcefulconfig.ad_astra.option.oxygenLoader.energyPerTick", "Energy Per Tick");
        add("text.resourcefulconfig.ad_astra.option.oxygenLoader.maxEnergy", "Max Energy");
        add("text.resourcefulconfig.ad_astra.option.oxygenLoader.tankSize", "Tank Size");
        add("text.resourcefulconfig.ad_astra.option.rocket", "Rocket");
        add("text.resourcefulconfig.ad_astra.option.rocket.acceleration", "Acceleration");
        add("text.resourcefulconfig.ad_astra.option.rocket.atmosphereLeave", "Atmosphere Leave");
        add("text.resourcefulconfig.ad_astra.option.rocket.atmosphereLeave.@Tooltip", "When the rocket should open the Planet Selection GUI.");
        add("text.resourcefulconfig.ad_astra.option.rocket.countDownTicks", "Count Down Ticks");
        add("text.resourcefulconfig.ad_astra.option.rocket.countDownTicks.@Tooltip", "200 ticks = 10 seconds.");
        add("text.resourcefulconfig.ad_astra.option.rocket.efficientFuelLaunchCost", "Efficient Fuel Launch Cost");
        add("text.resourcefulconfig.ad_astra.option.rocket.entitiesBurnUnderRocket", "Entities Burn Under Rocket");
        add("text.resourcefulconfig.ad_astra.option.rocket.entitiesBurnUnderRocket.tooltip", "Should entities that are under the flames of the rocket burn?");
        add("text.resourcefulconfig.ad_astra.option.rocket.fuelLaunchCost", "Fuel Launch Cost");
        add("text.resourcefulconfig.ad_astra.option.rocket.maxSpeed", "Max Speed");
        add("text.resourcefulconfig.ad_astra.option.rocket.tankSize", "Tank Size");
        add("text.resourcefulconfig.ad_astra.option.rover", "Rover");
        add("text.resourcefulconfig.ad_astra.option.rover.deceleration", "Deceleration");
        add("text.resourcefulconfig.ad_astra.option.rover.explodeRoverInLava", "Explode In Lava");
        add("text.resourcefulconfig.ad_astra.option.rover.fuelPerSecond", "Fuel Per Second");
        add("text.resourcefulconfig.ad_astra.option.rover.maxSpeed", "Max Speed");
        add("text.resourcefulconfig.ad_astra.option.rover.maxTurnSpeed", "Max Turn Speed");
        add("text.resourcefulconfig.ad_astra.option.rover.minSpeed", "Min Speed");
        add("text.resourcefulconfig.ad_astra.option.rover.tankSize", "Tank Size");
        add("text.resourcefulconfig.ad_astra.option.rover.turnSpeed", "Turn Speed");
        add("text.resourcefulconfig.ad_astra.option.solarPanel", "Solar Panel");
        add("text.resourcefulconfig.ad_astra.option.solarPanel.energyMultiplier", "Energy Multiplier");
        add("text.resourcefulconfig.ad_astra.option.solarPanel.maxEnergy", "Max Energy");
        add("text.resourcefulconfig.ad_astra.option.spaceSuit", "Space Suit");
        add("text.resourcefulconfig.ad_astra.option.spaceSuit.enableJetSuitFlight", "Enable Jet Suit Flight");
        add("text.resourcefulconfig.ad_astra.option.spaceSuit.jetSuitArmorToughness", "Jet Suit Armor Toughness");
        add("text.resourcefulconfig.ad_astra.option.spaceSuit.jetSuitEnergyPerTick", "Jet Suit Energy Per Tick");
        add("text.resourcefulconfig.ad_astra.option.spaceSuit.jetSuitMaxEnergy", "Jet Suit Max Energy");
        add("text.resourcefulconfig.ad_astra.option.spaceSuit.jetSuitProtectionMultiplier", "Jet Suit Protection Multiplier");
        add("text.resourcefulconfig.ad_astra.option.spaceSuit.jetSuitSpeed", "Jet Suit Speed");
        add("text.resourcefulconfig.ad_astra.option.spaceSuit.jetSuitSpeed.tooltip", "The speed when flying forward.");
        add("text.resourcefulconfig.ad_astra.option.spaceSuit.jetSuitTankSize", "Jet Suit Tank Size");
        add("text.resourcefulconfig.ad_astra.option.spaceSuit.jetSuitUpwardsSpeed", "Jet Suit Upwards Speed");
        add("text.resourcefulconfig.ad_astra.option.spaceSuit.jetSuitUpwardsSpeed.tooltip", "The speed when idle flying up.");
        add("text.resourcefulconfig.ad_astra.option.spaceSuit.netheriteSpaceSuitHasFireResistance", "Netherite Space Suit Has Fire Resistance");
        add("text.resourcefulconfig.ad_astra.option.spaceSuit.netheriteSpaceSuitTankSize", "Netherite Space Suit Tank Size");
        add("text.resourcefulconfig.ad_astra.option.spaceSuit.spaceSuitTankSize", "Space Suit Tank Size");
        add("text.resourcefulconfig.ad_astra.option.spaceSuit.spawnJetSuitParticles", "Spawn Jet Suit Particles");
        add("text.resourcefulconfig.ad_astra.option.vehicles", "Vehicles");
        add("text.resourcefulconfig.ad_astra.option.vehicles.fallingExplosionMultiplier", "Vehicle Falling Explosion Multiplier");
        add("text.resourcefulconfig.ad_astra.option.vehicles.fallingExplosionMultiplier.tooltip", "How powerful the explosion should be when the vehicle has fallen.");
        add("text.resourcefulconfig.ad_astra.option.vehicles.fallingExplosionThreshold", "Vehicle Falling Explosion Threshold");
        add("text.resourcefulconfig.ad_astra.option.vehicles.fallingExplosionThreshold.tooltip", "The velocity to trigger a vehicle explosion while falling.");
        add("text.resourcefulconfig.ad_astra.option.vehicles.gravity", "Gravity");
        add("text.resourcefulconfig.ad_astra.option.vehicles.moveCameraInVehicle", "Move Camera In Vehicle");
        add("text.resourcefulconfig.ad_astra.option.vehicles.moveCameraInVehicle.tooltip", "Should the camera move in 3rd person in the rocket and lander for a better view?");
        add("text.resourcefulconfig.ad_astra.option.waterPump", "Water Pump");
        add("text.resourcefulconfig.ad_astra.option.waterPump.deleteWaterBelowWaterPump", "Delete Water Below Water Pump");
        add("text.resourcefulconfig.ad_astra.option.waterPump.energyPerTick", "Energy Per Tick");
        add("text.resourcefulconfig.ad_astra.option.waterPump.maxEnergy", "Max Energy");
        add("text.resourcefulconfig.ad_astra.option.waterPump.tankSize", "Tank Size");
        add("text.resourcefulconfig.ad_astra.option.waterPump.transferPerTick", "Transfer Per Tick");
        add("tooltip.ad_astra.consumable", "§2Consumable");
        add("tooltip.ad_astra.hold_shift", "Hold shift for more info");
        add("tooltip.ad_astra.space_suit", "§bOxygen: §%s/%d 🪣");
        add("tooltip.ad_astra.vehicle_fuel", "§bFuel: §%s/%d 🪣");
        add("item.ad_astra.coal_generator.tooltip", "Burns coal into energy.");
        add("item.ad_astra.compressor.tooltip", "Presses ingots into plates.");
        add("item.ad_astra.cryo_freezer.tooltip", "Converts ice shards into cryo fuel.");
        add("item.ad_astra.energizer.tooltip[0]", "Charges items and powers");
        add("item.ad_astra.energizer.tooltip[1]", "nearby machines.");
        add("item.ad_astra.flag.tooltip", "Right-click the block to set an image URL");
        add("item.ad_astra.energy_transfer_rate.tooltip", "Energy Transfer: %s ⚡/t");
        add("item.ad_astra.fluid_transfer_rate.tooltip", "Fluid Transfer: %s 🪣/t");
        add("item.ad_astra.fuel_refinery.tooltip", "Converts oil into fuel.");
        add("item.ad_astra.generator_energy.tooltip", "Generates %s ⚡ / tick");
        add("item.ad_astra.nasa_workbench.tooltip", "A crafting bench for rockets.");
        add("item.ad_astra.oxygen_distributor.tooltip[0]", "Distributes oxygen into");
        add("item.ad_astra.oxygen_distributor.tooltip[1]", "the air.");
        add("item.ad_astra.oxygen_loader.tooltip[0]", "Converts water into oxygen, to");
        add("item.ad_astra.oxygen_loader.tooltip[1]", "transfer into a tank or space suit.");
        add("item.ad_astra.oxygen_sensor.tooltip[0]", "Produces a redstone signal when");
        add("item.ad_astra.oxygen_sensor.tooltip[1]", "oxygen is detected.");
        add("item.ad_astra.solar_panel.tooltip[0]", "Generates energy while in");
        add("item.ad_astra.solar_panel.tooltip[1]", "direct sunlight.");
        add("item.ad_astra.water_pump.tooltip[0]", "Extracts water from a source and distributes");
        add("item.ad_astra.water_pump.tooltip[1]", "it to nearby machines.");

        add("entity.ad_astra.lunarian.armorer", "Lunarian Armorer");
        add("entity.ad_astra.lunarian.butcher", "Lunarian Butcher");
        add("entity.ad_astra.lunarian.cartographer", "Lunarian Cartographer");
        add("entity.ad_astra.lunarian.cleric", "Lunarian Cleric");
        add("entity.ad_astra.lunarian.farmer", "Lunarian Farmer");
        add("entity.ad_astra.lunarian.fisherman", "Lunarian Fisherman");
        add("entity.ad_astra.lunarian.fletcher", "Lunarian Fletcher");
        add("entity.ad_astra.lunarian.leatherworker", "Lunarian Leatherworker");
        add("entity.ad_astra.lunarian.librarian", "Lunarian Librarian");
        add("entity.ad_astra.lunarian.mason", "Lunarian Mason");
        add("entity.ad_astra.lunarian.none", "Lunarian");
        add("entity.ad_astra.lunarian.shepherd", "Lunarian Shepherd");
        add("entity.ad_astra.lunarian.toolsmith", "Lunarian Toolsmith");
        add("entity.ad_astra.lunarian.weaponsmith", "Lunarian Weaponsmith");

        add("item.ad_astra_empty_tank", "Empty");
    }
}
