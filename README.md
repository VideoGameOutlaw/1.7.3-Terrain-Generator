# 173generator (Minecraft Beta 1.7.3 terrain for Spigot/PaperSpigot 1.8.8-1.8.9)

`173generator` recreates Minecraft Beta 1.7.3-style overworld terrain on legacy Bukkit-family servers.

## Target platform

- **Minecraft server API:** Spigot/PaperSpigot `1.8.8-1.8.9`
- **Java runtime:** **Java 8**
- **Build tool:** Maven

## Build

```bash
mvn clean package
```

The plugin jar is produced in `target/` as:

- `b173gen-2.5-MC1.8.9.jar`

## Tests

Regression tests compare generated chunks against saved Beta 1.7.3 terrain fixtures. Initialize the fixture submodule, then run tests with the `run-tests` Maven profile:

```bash
git submodule update --init src/test/resources
mvn test -Prun-tests
```

The default `mvn package` build skips tests for a faster packaging pipeline.

## Install and use

1. Copy the jar into your server `plugins/` directory.
2. Start the server once to generate default configs.
3. Configure world generator usage in `bukkit.yml`:

```yaml
worlds:
  world_name:
    generator: 173generator
```

Or use your multiworld plugin's custom-generator syntax.

## Notes on behavior

- Terrain, caves, ores, vegetation, and biome mapping are intentionally kept close to the Beta 1.7.3 behavior implemented by this project.
- The generator is designed for legacy world height (`128`) and legacy material names/API used in 1.8-era servers.

## Requirements

- Spigot or Paper **1.8.8–1.8.9**
- **Java 8** for the server process
- Do **not** use `/reload` after installing or changing generator settings (full restart required)

## Known limitations

- This project targets legacy API behavior and is **not** intended for 1.13+ flattened-material servers.
- `/reload` is still unsupported (full restart recommended) due to generator lifecycle assumptions.
- Regression tests are skipped by default (`maven.test.skip=true`); use `-Prun-tests` to run them (see **Tests** above).
