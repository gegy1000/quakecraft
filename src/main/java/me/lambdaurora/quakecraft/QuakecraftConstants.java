/*
 *  Copyright (c) 2020 LambdAurora <aurora42lambda@gmail.com>
 *
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU Lesser General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU Lesser General Public License for more details.
 *
 *  You should have received a copy of the GNU Lesser General Public License
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package me.lambdaurora.quakecraft;

import net.minecraft.entity.Entity;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.world.GameMode;

import java.util.function.Predicate;

/**
 * Represents constants used in Quakecraft.
 *
 * @author LambdAurora
 * @version 1.0.0
 * @since 1.0.0
 */
public class QuakecraftConstants
{
    public static int RESPAWN_SECONDS = 5;
    public static int RESPAWN_TICKS   = RESPAWN_SECONDS * 20;

    public static final Predicate<Entity> PLAYER_PREDICATE = entity -> entity instanceof ServerPlayerEntity
            && ((ServerPlayerEntity) entity).interactionManager.getGameMode() != GameMode.SPECTATOR;
}
