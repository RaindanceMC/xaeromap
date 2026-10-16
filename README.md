# RaindanceMC/xaeromap

- **`xaeromap-module`** — Rain's Flexible Modules — Xaero's Map support: Server-side support for Xaero's Minimap and Xaero's World Map: every world gets its own map cache instead of one shared with every other world, a player's homes and warps can be handed over as waypoints to add, and claims are drawn on the client's own map — that last one over Open Parties and Claims' wire format, which is what those two mods read claims out of, so it needs OPAC installed client-side beside the minimap.
- **`xaeromap-standalone`** — Rain's Xaero's Map support: Rain's Xaero's Map support, as a plugin of its own. Nothing here but a build file and a descriptor: the xaeromap module and the standard wrapper are shaded together, and that is the whole plugin.

Part of [RaindanceMC](https://github.com/RaindanceMC); built on [RainsCore](https://github.com/RaindanceMC/RainsCore) and the shared parent in [framework](https://github.com/RaindanceMC/framework). Split out of `rains-flexible-modules` on 16.10.2026, history kept.

## Build

```
mvn install
```

Needs Java 25 and read access to `packages.tstieh.de` (server ids `packages-releases` / `packages-snapshots` in `~/.m2/settings.xml`).

## Plugins

- `xaeromap-standalone/target/RainsXaeroMap-1.3.1.jar` — also published as `de.raindancer.modules:xaeromap-standalone:1.3.1`

## Versions

A module's version is a property in this repository's root `pom.xml`, a plugin's is `plugin.version` in its own pom. CI publishes every version that is not in the registry yet on the next push to master.
