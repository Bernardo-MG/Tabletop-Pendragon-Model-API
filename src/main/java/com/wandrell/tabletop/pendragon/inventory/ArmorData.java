package com.wandrell.tabletop.pendragon.inventory;

import java.util.Collection;

import com.wandrell.tabletop.valuehandler.ValueHandler;
import com.wandrell.util.tag.NewInstantiable;

public interface ArmorData extends NewInstantiable {

    @Override
    public ArmorData createNewInstance();

    public ValueHandler<Integer> getArmorValue(final String name);

    public Collection<ValueHandler<Integer>> getArmorValues();

    public Boolean hasArmorValue(final String name);

}