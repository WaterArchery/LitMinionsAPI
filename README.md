# LitMinionsAPI

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
