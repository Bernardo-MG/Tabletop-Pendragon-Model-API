package com.wandrell.tabletop.pendragon.model.character.follower;

import com.wandrell.tabletop.character.Gender;

public interface Child {

    public Gender getGender();

    public String getName();

    public Integer getYearBorn();

    public Integer getYearDeath();

}