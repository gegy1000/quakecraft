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

package me.lambdaurora.quakecraft.weapon;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import org.jetbrains.annotations.NotNull;
import xyz.nucleoid.plasmid.game.GameWorld;
import xyz.nucleoid.plasmid.util.ItemStackBuilder;

/**
 * Represents a weapon.
 *
 * @author LambdAurora
 * @version 1.0.0
 * @since 1.0.0
 */
public class Weapon
{
    public final Item item;
    public final int  cooldown;

    public Weapon(@NotNull Item item, int cooldown)
    {
        this.item = item;
        this.cooldown = cooldown;
    }

    public boolean matchesStack(@NotNull ItemStack stack)
    {
        return !stack.isEmpty()
                && this.item == stack.getItem();
    }

    public @NotNull ActionResult onUse(@NotNull GameWorld world, @NotNull ServerPlayerEntity player, @NotNull Hand hand)
    {
        return ActionResult.PASS;
    }

    public @NotNull ItemStackBuilder stackBuilder()
    {
        return ItemStackBuilder.of(this.item)
                .setUnbreakable();
    }

    public final @NotNull ItemStack build()
    {
        return this.stackBuilder().build();
    }
}
