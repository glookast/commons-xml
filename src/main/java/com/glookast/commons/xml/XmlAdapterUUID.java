package com.glookast.commons.xml;

import java.util.UUID;
import javax.xml.bind.annotation.adapters.XmlAdapter;

public class XmlAdapterUUID extends XmlAdapter<String, UUID>
{

    @Override
    public UUID unmarshal(String value) throws Exception
    {
        try {
            return (java.util.UUID.fromString(value));
        } catch (Exception ex) {
        }
        return null;
    }

    @Override
    public String marshal(UUID value) throws Exception
    {
        return (java.lang.String.valueOf(value));
    }

}
