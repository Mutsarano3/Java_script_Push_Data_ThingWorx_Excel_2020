package com.actemium.console.Object;

import java.io.Serializable;

import com.fasterxml.jackson.core.SerializableString;

/**
 * SimpleThing
 */

public class SimpleThing implements Serializable {

    public String name;
    public String thingTemplateName;

    public SimpleThing(String name,String template)
    {
        this.name = name;
        this.thingTemplateName = template;
    }

   
    
    
}