
package com.wandrell.tabletop.pendragon.model.character.stats;

public interface DerivedAttributesHolder {

    public Integer getDamage();

    public Integer getDexterityRoll();

    public Integer getHealingRate();

    public Integer getHitPoints();

    public Integer getKnockdown();

    public Integer getMajorWoundTreshold();

    public Integer getMoveRate();

    public Integer getUnconciousTreshold();

    public Integer getWeight();

    public void setAttributesHolder(final AttributesHolder attributes);

}
