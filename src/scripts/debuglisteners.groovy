import org.bukkit.event.Event


def locstr = { String.format('Loc[xyz=%.2f:%.2f:%.2f]', it.x, it.y, it.z) }
def blkstr = { "Blk[xyz=$it.x:$it.y:$it.z $it.type:$it.data ($it.typeId)]" }
def entstr = { "Ent[$it(${locstr(it.location)})]" }

listen "debug", [

    (Event.Type.BLOCK_BREAK): { log "$it.eventName ($it.player.name): ${blkstr(it.block)}" },
    (Event.Type.BLOCK_BURN): { log "$it.eventName: ${blkstr(it.block)}" },
    (Event.Type.BLOCK_CANBUILD): { log "$it.eventName: ${blkstr(it.block)} ($it.material)" },
    (Event.Type.BLOCK_DAMAGED): { log "$it.eventName ($it.player.name): ${blkstr(it.block)} ($it.damageLevel)" },
    (Event.Type.BLOCK_FLOW): { log "$it.eventName: ${blkstr(it.block)} to ${blkstr(it.toBlock)} ($it.face)" },
    (Event.Type.BLOCK_IGNITE): { log "$it.eventName ($it.player): ${blkstr(it.block)} due to $it.cause" },
    (Event.Type.BLOCK_INTERACT): { log "$it.eventName: ${blkstr(it.block)} by ${entstr(it.entity)}" },
    (Event.Type.BLOCK_PHYSICS): { log "$it.eventName: ${blkstr(it.block)} to $it.changedType" },
    (Event.Type.BLOCK_PLACED): { log "$it.eventName ($it.player.name): ${blkstr(it.block)} on ${blkstr(it.blockAgainst)} ($it.itemInHand)" },
    (Event.Type.BLOCK_RIGHTCLICKED): { log "$it.eventName ($it.player.name): ${blkstr(it.block)} $it.direction ($it.itemInHand)" },
    (Event.Type.LEAVES_DECAY): { log "$it.eventName: ${blkstr(it.block)}" },
    (Event.Type.REDSTONE_CHANGE): { log "$it.eventName: ${blkstr(it.block)} $it.oldCurrent->$it.newCurrent" },

	(Event.Type.PLAYER_ANIMATION): { log "$it.eventName ($it.player.name): $it.animationType" },
	(Event.Type.PLAYER_CHAT): { log "$it.eventName ($it.player.name): $it.message" },
	(Event.Type.PLAYER_COMMAND): { log "$it.eventName ($it.player.name): " },
	(Event.Type.PLAYER_DROP_ITEM): { log "$it.eventName ($it.player.name): $it.itemDrop.itemStack" },
	(Event.Type.PLAYER_EGG_THROW): { log "$it.eventName ($it.player.name): " },
	(Event.Type.PLAYER_ITEM): { log "$it.eventName ($it.player.name): $it.item" },
	(Event.Type.PLAYER_ITEM_HELD): { log "$it.eventName ($it.player.name): $it.newSlot (was $it.previousSlot)" },
	(Event.Type.PLAYER_JOIN): { log "$it.eventName ($it.player.name): " },
	(Event.Type.PLAYER_KICK): { log "$it.eventName ($it.player.name): " },
	(Event.Type.PLAYER_LOGIN): { log "$it.eventName ($it.player.name): " },
//	(Event.Type.PLAYER_MOVE): { log "$it.eventName ($it.player.name): " },
	(Event.Type.PLAYER_QUIT): { log "$it.eventName ($it.player.name): " },
	(Event.Type.PLAYER_RESPAWN): { log "$it.eventName ($it.player.name): ${locstr(it.respawnLocation)}" },
	(Event.Type.PLAYER_TELEPORT): { log "$it.eventName ($it.player.name): ${locstr(it.from)} to ${locstr(it.to)}" },
	(Event.Type.PLAYER_TOGGLE_SNEAK): { log "$it.eventName ($it.player.name): " },

	(Event.Type.INVENTORY_OPEN): { log "$it.eventName ($it.player.name): " },

	(Event.Type.CREATURE_SPAWN): { log "$it.eventName (${entstr(it.entity)}): " },
	(Event.Type.ENTITY_COMBUST): { log "$it.eventName (${entstr(it.entity)}): " },
//	(Event.Type.ENTITY_DAMAGED): { log "$it.eventName (${entstr(it.entity)}): $it.cause ($it.damage)" },
//	(Event.Type.ENTITY_DAMAGEDBY_BLOCK): { log "$it.eventName (${entstr(it.entity)}): $it.cause ($it.damage)" },
	(Event.Type.ENTITY_DAMAGEDBY_ENTITY): { log "$it.eventName (${entstr(it.entity)}): $it.cause ($it.damage)" },
	(Event.Type.ENTITY_DAMAGEDBY_PROJECTILE): { log "$it.eventName (${entstr(it.entity)}): $it.cause ($it.damage)" },
	(Event.Type.ENTITY_DEATH): { log "$it.eventName (${entstr(it.entity)}): " },
	(Event.Type.ENTITY_EXPLODE): { log "$it.eventName (${entstr(it.entity)}): " },
	(Event.Type.ENTITY_TARGET): { log "$it.eventName (${entstr(it.entity)}): $it.target ($it.reason)" },

	(Event.Type.CHUNK_LOADED): { log "$it.eventName: $it.chunk" },
	(Event.Type.CHUNK_UNLOADED): { log "$it.eventName: $it.chunk" },
	(Event.Type.CHUNK_GENERATION): { log "$it.eventName: " },
	(Event.Type.ITEM_SPAWN): { log "$it.eventName: " },
	(Event.Type.WORLD_SAVED): { log "$it.eventName: " },
	(Event.Type.WORLD_LOADED): { log "$it.eventName: " },
	(Event.Type.SERVER_COMMAND): { log "$it.eventName: " },
	(Event.Type.PLUGIN_ENABLE): { log "$it.eventName: $it.plugin.description.name" },
	(Event.Type.PLUGIN_DISABLE): { log "$it.eventName: $it.plugin.description.name" }

]