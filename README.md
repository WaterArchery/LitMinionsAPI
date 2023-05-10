# LitMinionsAPI

[![spigot](https://github.com/WaterArchery/LitMinionsAPI/assets/64959220/c8b97da0-c4f2-4103-beb6-af2d8c46873c)](https://www.spigotmc.org/resources/%E2%AD%90-litminions-%E2%AD%90-10-minions-%E2%9C%85-migrate-data-command-levels-%E2%9C%85-minion-inventories-1-8-1-19.108876/)


Latest version: ![Release](https://jitpack.io/v/WaterArchery/LitMinionsAPI.svg)

LitMinionsAPI is WIP. Please contact with me about your suggestions and bug reports.

## Integrating

  Integrating is very easy. Just add LitMinions to local dependency or import it with Maven. After that you should softdepend LitMinions to your in your plugin.yml. It should be like this ```softdepend: [ LitMinions ]```

  Maven Repository
  
	<repository>
	    <id>jitpack.io</id>
	    <url>https://jitpack.io</url>
	</repository>

  Dependency

	<dependency>
	    <groupId>com.github.WaterArchery</groupId>
	    <artifactId>LitMinionsAPI</artifactId>
	    <version>2.06</version>
	</dependency>
  
  
## Usage

  After migrating you can access API methods with ```LitMinionsAPI.helloMethod();```
  
  Examples for getting player limits:
  
  ```
  int maxMinions = LitMinionsAPI.getMaxPlaceableMinion(offlinePlayer);
  returns amount of the placeable minions by player.
  
  int maxMinionsPerType = LitMinionsAPI.getMaxPerType(offlinePlayer, "miner");
  returns amount of the placeable minions by player but it checks for the maximum type paramater.
  
  int maxMinionsPerIsland = LitMinionsAPI.getMaxPerIsland(offlinePlayer);
  returns amount of the placeable minions by player but it checks for the maximum per island paramater
  ```
