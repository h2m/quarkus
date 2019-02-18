package org.jboss.shamrock.extest;

import org.jboss.shamrock.runtime.annotations.ConfigGroup;
import org.jboss.shamrock.runtime.annotations.ConfigItem;

@ConfigGroup
public class NestedConfig {
    /** A nested string value */
    @ConfigItem
    public String nestedValue;
    /** A nested ObjectOfValue value */
    @ConfigItem
    public ObjectOfValue oov;

}
