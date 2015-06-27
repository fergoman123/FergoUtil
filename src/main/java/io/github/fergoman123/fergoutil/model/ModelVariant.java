/*
 * Fergoman123's Util
 * Copyright (c) 2014 fergoman123.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Lesser Public License v2.1
 * which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/gpl-3.0.html
 */

package io.github.fergoman123.fergoutil.model;

import net.minecraft.block.Block;
import net.minecraft.item.Item;

public class ModelVariant
{
    private Item item;
    private String variant;

    public ModelVariant(Item item, String variant)
    {
        this.item = item;
        this.variant = variant;
    }

    public ModelVariant(Block block, String variant)
    {
        this(Item.getItemFromBlock(block), variant);
    }

    public Item getItem()
    {
        return item;
    }

    public String getVariant() {
        return variant;
    }
}
